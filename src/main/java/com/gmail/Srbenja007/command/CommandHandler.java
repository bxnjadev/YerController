package com.gmail.Srbenja007.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandHandler {

    private List<Command> commands;
    public CommandHandler(){
        commands = new ArrayList<>();
    }

    public void registerCommand(Command command){
        commands.add(command);
    }

    public void unregisterCommand(Command command){
        commands.remove(command);
    }

    public List<Command> getCommands(){
        return commands;
    }

}
