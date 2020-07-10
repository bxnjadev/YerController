# YerController
Basic JDA command handler

## Usage
First you need to create an instance of the API class
``` bash
YerAPI yerAPI = new API(jda); 
```

## Register Command 
``` bash
yerAPI.getCommandHandler().registerCommand(new CommandClass("prefix","command")); 
``` 
## Class Command
```
public class CommandClass extends Command {


    public CommandClass(String command, String prefix) {
        super(command, prefix);
    }

    @APermission(Permission = Permission.UNKNOW, Message = "You don't have permissions")
    public void execute(MessageReceivedEvent event) {
        event.getChannel().sendMessage("This is a command").queue();
    }
```
