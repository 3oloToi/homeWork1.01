package com.company;

public final class Puppy extends Dog{
    private int age;

    public int getAge() {
        return age;
    }

    public Puppy(String color, Weather weather, String breed, int age) {
        super(color, weather, breed);
        this.age = age;
    }
    public void voice(){
        System.out.println("gaf");

    }
}
