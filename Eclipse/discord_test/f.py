import json

data = json.load(open("Emotes.json"))
for i in data:
    print(i)