package com.company;

public class Dog extends Animals{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public Dog(String color, Weather weather, String breed) {
        super(color, weather);
        this.breed = breed;
    }
    public void voice(){
        System.out.println("gaf");

    }
    public final void voice(String name){
        System.out.println(name);

    }
}
