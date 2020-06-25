package com.gmail.Srbenja007.command;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.List;

public class CommandMain extends ListenerAdapter {

    private CommandHandler commandHandler;
    public CommandMain(CommandHandler commandHandler){
        this.commandHandler = commandHandler;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        for (Command command : commandHandler.getCommands()) {
            command.execute(event);
        }

    }
}
