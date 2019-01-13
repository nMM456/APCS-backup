import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter
{
    public static void main(String[] args)
            throws LoginException
    {
        JDA jda = new JDABuilder("NDQ4MTA1MjUyMjUyODExMzA0.DwLD4g.i8H1imfguezA679R32pZBmG7AEs").build();
        jda.addEventListener(new MessageListener());
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
    	MessageChannel channel = event.getChannel();
    	if (event.getMessage().getContentRaw().startsWith("Pog")) {
    		channel.sendMessage("Hi");
    	}
    }
}