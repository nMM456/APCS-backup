import requests
import json

f = open("tokens.json", "r")
key = json.load(f)["youtube"]
name="PewDiePie"
URL = "https://www.googleapis.com/youtube/v3/channels?part=statistics&forUsername="+name+"&key="+key
data = requests.get(URL).json()
print(name+": "+data["items"][0]["statistics"]["subscriberCount"])
