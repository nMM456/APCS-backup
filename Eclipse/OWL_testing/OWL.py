import requests


url = 'https://api.overwatchleague.com/stats/matches/21211/maps/3'
url_get = requests.get(url)
data = url_get.json()
print(data["teams"])