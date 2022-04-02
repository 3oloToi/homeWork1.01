package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("black",Weather.SUNNY,"pitbul");
        dog.voice();
        System.out.println("Цвет"+" "+ dog.getColor() + " " +"погода" +" "+ dog.getWeather()+" "+"порода"+" "+ dog.getBreed());
        Puppy puppy = new Puppy("grey",Weather.CLOUDY,"buldog",2);
        puppy.voice();
        System.out.println("Цвет"+ " "+ puppy.getColor()+ " "+"погода"+" "+puppy.getWeather()+" "+"порода"+" "+ puppy.getAge());
        Puppy rex = new Puppy ("red",Weather.WIND,"avcharka",4);
        rex.voice();
        System.out.println("Цвет"+ " "+ rex.getColor()+ " "+"погода"+" "+rex.getWeather()+" "+"порода"+" "+rex.getBreed()+ rex.getAge());

    }
}
