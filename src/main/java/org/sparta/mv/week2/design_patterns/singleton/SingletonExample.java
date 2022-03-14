package org.sparta.mv.week2.design_patterns.singleton;

public class SingletonExample {
    private static final SingletonExample singleton = new SingletonExample();
    private SingletonExample(){

    }
    public static SingletonExample getSingleton(){
        return singleton;
    }
}
