import requests

url = 'https://api.overwatchleague.com/stats/players'
url_get = requests.get(url)
data = url_get.json()
f = open("stats.csv", "w")
for x in data["data"]:
    for i in x:
        f.write(str(x[i])+", ")
    f.write("\n")