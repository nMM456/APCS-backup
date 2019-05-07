import discord
from discord.ext import commands
import asyncio
import random
import json

bot = commands.Bot(command_prefix="??", description="Full time cheater")
f = open("tokens.json", "r")
tokens = json.load(f)


@bot.event
async def on_ready():
    print("Logged in")
    await bot.change_presence(activity=discord.Streaming(name='xQc', url="http://twitch.tv/xQcOW"))
    
    
    
bot.run(tokens["discord"])