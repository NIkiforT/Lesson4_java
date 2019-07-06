package com.company;

public abstract class Animal {
    public void run(int maxDistantionRun){
        System.out.println("Бежит " + maxDistantionRun);
    }
    public abstract void swim();
    public void jump(int height){
        System.out.println("Прыгает " + height);
    }
}
