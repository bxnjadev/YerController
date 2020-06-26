package com.gmail.Srbenja007;

import com.gmail.Srbenja007.annotations.APermission;

import java.lang.reflect.Method;

public class ReflectionAnnotations {

    public static APermission getAnnotationAPermission(Method[] methods, String methodName){
          for(Method method : methods){
              if(method.getName().equals(methodName)){
                  APermission aPermission = method.getAnnotation(APermission.class);
                  return aPermission;
              }
          }
          return null;
    }

}
