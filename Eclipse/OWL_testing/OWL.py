import requests


url = 'http://api.weather.gov/points/42.2695,-71.6161/forecast'
url_get = requests.get(url)
data = url_get.json()
for i in data["properties"]["periods"]:
    for x in i:
        if i["number"] <3:
            if x not in ["number", "startTime", "endTime", "isDaytime", "icon"]:
                print(x+": "+str(i[x]))
        else:
            break