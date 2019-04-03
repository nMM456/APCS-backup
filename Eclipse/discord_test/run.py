import discord
from discord.ext import commands
import asyncio
import time
import requests


bot = commands.Bot(command_prefix="??", description="Full time cheater")
@bot.event
async def on_ready():
    print("Logged in")
    await bot.change_presence(activity=discord.Streaming(name='xQc', url="http://twitch.tv/xQcOW"))
    channel1 = bot.get_channel(562013063931232272)
    channel2 = bot.get_channel(562013071304818693)
    try:
        url = 'https://api.overwatchleague.com/live-match'
        url_get = requests.get(url)
        data = url_get.json()
        team1 = data["data"]["liveMatch"]["competitors"][0]["abbreviatedName"]
        team2 = data["data"]["liveMatch"]["competitors"][1]["abbreviatedName"]
        score1 = str(data["data"]["liveMatch"]["scores"][0]["value"])
        score2 = str(data["data"]["liveMatch"]["scores"][1]["value"])
        await channel1.edit(name=team1+": "+str(score1))
        await channel2.edit(name=team2+": "+str(score2))
    except:
        url = 'https://api.overwatchleague.com/schedule'
        url_get = requests.get(url)
        data = url_get.json()
        current = int(time.time())
        found=False
        for x in range(len(data["data"]["stages"])):        
            for i in range(len(data["data"]["stages"][x]["matches"])):
                if data["data"]["stages"][x]["matches"][i]["startDateTS"]/1000 > current:
                    gametime = data["data"]["stages"][x]["matches"][i]["startDateTS"]/1000
                    atime = time.strftime('%Y-%m-%d %I:%M:%S', time.localtime(gametime-18000))
                    team1 = data["data"]["stages"][x]["matches"][i]["competitors"][0]["abbreviatedName"]
                    team2 = data["data"]["stages"][x]["matches"][i]["competitors"][1]["abbreviatedName"]
                    if not(channel1.name == team1 and channel2.name == atime):
                        await channel1.edit(name=team1+" VS. "+team2)
                        await channel2.edit(name=atime)
                    found=True
                    break
            if found:
                break
            
bot.run("")