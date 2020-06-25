package com.gmail.Srbenja007.api;

import com.gmail.Srbenja007.command.CommandHandler;
import com.gmail.Srbenja007.command.CommandMain;
import net.dv8tion.jda.api.JDA;

public class API implements YerAPI {

    private JDA jda;
    private CommandHandler commandHandler;

    public API(JDA jda){
        this.jda = jda;
        commandHandler = new CommandHandler();
        registerCommandMain();
    }


    @Override
    public CommandHandler getCommandHandler() {
        return commandHandler;
    }

    private void registerCommandMain(){
        jda.addEventListener(new CommandMain(commandHandler));
    }

}
