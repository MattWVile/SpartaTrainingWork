package org.sparta.mv.week2.design_patterns.singleton;

import org.sparta.mv.week2.design_patterns.singleton.SingletonExample;

public class Main {
    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getSingleton();
        SingletonExample s2 = SingletonExample.getSingleton();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}