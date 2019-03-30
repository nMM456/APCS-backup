import discord
from discord.ext import commands
import asyncio
import datetime


bot = commands.Bot(command_prefix="??", description="Full time cheater")
@bot.event
async def on_ready():
    print("Logged in")
    await bot.change_presence(activity=discord.Game(name='GO AGANE'))

async def background_task():
    await bot.wait_until_ready()
    time = bot.get_channel(561686318501986314)
    while (not bot.is_closed()):
        cd = datetime.datetime.now()
        await time.edit(name=str(cd.strftime("%I:%M:%S %p")))
        await asyncio.sleep(.9)

        
bot.loop.create_task(background_task())
bot.run("")