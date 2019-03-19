import discord
from discord.ext import commands
import asyncio
import os
from urllib.request import urlretrieve
import requests


bot = commands.Bot(command_prefix="??", description="Full time cheater")
@bot.event
async def on_ready():
    print("Logged in")
    await bot.change_presence(activity=discord.Game(name='STUPID FUCKING MISTAKES MAN'))
#     server = bot.get_guild(340656542544035841)
#     gulag = bot.get_guild(557203706118930462)
#     for i in server.emojis:
#         r = requests.get(i.url, allow_redirects=True)
#         await gulag.create_custom_emoji(name=i.name, image=r.content)
        
bot.run("")