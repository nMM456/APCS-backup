import discord
from discord.ext import commands
import asyncio
import os
import requests


bot = commands.Bot(command_prefix="??", description="Full time cheater")
@bot.event
async def on_ready():
    print("Logged in")
    await bot.change_presence(activity=discord.Game(name='STUPID FUCKING MISTAKES MAN'))

            
    
bot.run("")