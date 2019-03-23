import requests

url = 'https://api.overwatchleague.com/stats/players'
url_get = requests.get(url)
data = url_get.json()
f = open("stats.csv", "w")
for i in data["data"][0]:
    if str(i) != "time_played_total":
        f.write(str(i)+", ")
    else:
        f.write(str(i))
f.write("\n")
for x in data["data"]:
    for i in x:
        if str(i) != "time_played_total":
            f.write(str(x[i])+", ")
        else:
            f.write(str(x[i]))
    f.write("\n")