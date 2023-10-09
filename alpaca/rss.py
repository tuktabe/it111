# Load Packages
#feedparser is RSS feed library
import feedparser
#json is JSON utility library
import json

# Elasticsearch Imports
#-------------------------------------------
from elasticsearch import AsyncElasticsearch
from elasticsearch.helpers import async_bulk

# General Imports
import asyncio

# Elastic Global Variables
#-------------------------------------------
CLOUD_USERNAME = "elastic"
CLOUD_PASSWORD = "pHZJRUSKxwiPjgiIdN9V3pjV"
CLOUD_ID = "elastic-stonks:dXMtd2VzdDEuZ2NwLmNsb3VkLmVzLmlvOjQ0MyQ2N2IyZWVmNmI2NGU0NzFhYTFlMTBhY2MzYmU5NzFiNiQ2MWQyODJhYmQ2MWE0ZmRhOTljZmNjYWUzNDcyMGIzYQ=="

# Define Index Mappings
#-------------------------------------------

#FIXME
#RSS_MAPPING = '{"properties":{"conditions":{"type":"text","fields":{"keyword":{"type":"keyword","ignore_above":256}}},"exchange":{"type":"text","fields":{"keyword":{"type":"keyword","ignore_above":256}}},"id":{"type":"long"},"price":{"type":"float"},"size":{"type":"long"},"symbol":{"type":"text","fields":{"keyword":{"type":"keyword","ignore_above":256}}},"tape":{"type":"text","fields":{"keyword":{"type":"keyword","ignore_above":256}}},"timestamp":{"type":"date"}}}'

#result['title'] = entry.title
#result['link'] = entry.link
#result['description'] = entry.description
#result['published'] = entry.published
#result['id'] = entry.id

RSS_MAPPING = '\
    {\
      "properties": {\
        "title": {\
          "type": "text",\
          "fields": {\
            "keyword": {\
              "type": "keyword",\
              "ignore_above": 256\
            }\
          }\
        },\
        "link": {\
          "type": "text",\
          "fields": {\
            "keyword": {\
              "type": "keyword",\
              "ignore_above": 256\
            }\
          }\
        },\
        "description": {\
          "type": "text",\
          "fields": {\
            "keyword": {\
              "type": "keyword",\
              "ignore_above": 256\
            }\
          }\
        },\
        "published": {\
          "type": "text",\
          "fields": {\
            "keyword": {\
              "type": "keyword",\
              "ignore_above": 256\
            }\
          }\
        },\
        "id": {\
          "type": "text",\
          "fields": {\
            "keyword": {\
              "type": "keyword",\
              "ignore_above": 256\
            }\
          }\
        }\
      }\
    }'\

# for an RSS feed entry, map it to JSON and return the JSON as a string
def mapJSON(entry):
    # create empty JSON structure (dictionary)
    result = {}

    print(entry)
    #map the entry into the JSON structure
    result['title'] = entry.title
    result['link'] = entry.link
    if hasattr(entry,'description'):
        result['description'] = entry.description
    if hasattr(entry,'published'):
            result['published'] = entry.published
    result['id'] = entry.id
    

    #return the JSON structure as a JSON string
    return json.dumps(result)


#-------------------------------------------
# Async Elastic Functions
#-------------------------------------------
async def create_index(es, index_name, mapping):
  if not await es.indices.exists(index=index_name):
    await es.indices.create(index=index_name,mappings=json.loads(mapping))

# for a URL, connect to the URL, get the RSS feed, and produce JSON strings for each entry
async def readRSStoJSON(es,rss_url,index_name):

    print('connecting to RSS feed: '+rss_url)
    #connect to the RSS feed URL and get the feed result into "f" variable
    f = feedparser.parse(rss_url)
    print('got RSS results, processing...')

    #initialize counter
    i=0

    #for each entry in the feed result
    
    for entry in f.entries:
        #increment counter 
        i=i+1
        #print the entry
        print("entry "+str(i)) 

        #call the function to map the entry into JSON formatted string
        result=mapJSON(entry)
        
        #print out the JSON string and a divider line
        print(result)
        print("calling the elastic index")
        
        
        await es.index(index=index_name, id=entry.id, document=result)
        print("called the elastic index")
        print('-----------------------')

#main program starts here:
#-------------------------------------------
# Main Function
#-------------------------------------------
async def main():
    index_name="rss-index"
    #url = "https://hnrss.org/frontpage"
    url = "http://rss.cnn.com/rss/cnn_topstories.rss"
    #url = "https://www.seattletimes.com/seattle-news/feed/"
    
    # Connect to Elasticsearch
    print("connecting to Elastic")
    es = AsyncElasticsearch(
        cloud_id=CLOUD_ID,
        basic_auth=(CLOUD_USERNAME, CLOUD_PASSWORD)
        )
    print("connected to Elastic")
    # Create Elasticsearch indices if they don't already exist

    print("creating the index")
    await create_index(es, index_name, RSS_MAPPING)
    print("created the index")
    
    print("calling the readRSStoJSON")
    await readRSStoJSON(es,url,index_name)
    print("finished the readRSStoJSON")

    await es.close()

asyncio.run(main())
