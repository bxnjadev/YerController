package com.gmail.Srbenja007.command;

import com.gmail.Srbenja007.ReflectionAnnotations;
import com.gmail.Srbenja007.annotations.APermission;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class Command {

    protected String command;
    protected String prefix;

    protected APermission aPermission;

    public Command(String command, String prefix) {
        this.command = command;
        this.prefix = prefix;

        aPermission = ReflectionAnnotations.getAnnotationAPermission(getClass().getMethods(),"execute");

    }

    public void run(MessageReceivedEvent event) {
        if (!event.getMessage().getContentRaw().startsWith(prefix + command)) return;

        if (aPermission != null && !event.getMember().hasPermission(aPermission.permission())) {
            event.getChannel().sendMessage(aPermission.message()).queue();
            return;
        }

        execute(event);
    }

    @APermission
    public abstract void execute (MessageReceivedEvent event);
}
