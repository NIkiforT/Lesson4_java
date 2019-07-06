package com.company;

public class Dog extends Animal {
    int maxDistantionRun;
    float height;
    int getMaxDistantionSwim;

    @Override
    public void swim() {
        System.out.println("Собака проплалы" + getMaxDistantionSwim);
    }
}
