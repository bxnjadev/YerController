package com.gmail.Srbenja007.command;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public abstract class Command {

    protected String command;
    protected String prefix;

    public Command(String command, String prefix){
        this.command = command;
        this.prefix = prefix;
    }

    public void run(MessageReceivedEvent event){
        if(!event.getMessage().getContentRaw().startsWith(prefix+command)) return;
        execute(event);
    }

    public abstract  void execute(MessageReceivedEvent event);

}
