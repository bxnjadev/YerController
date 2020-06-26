package com.gmail.Srbenja007.annotations;

import net.dv8tion.jda.api.Permission;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface APermission {

    String message() default "You don't have permission";

    Permission permission() default Permission.UNKNOWN;

}
