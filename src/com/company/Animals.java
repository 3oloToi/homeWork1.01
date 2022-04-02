package com.company;

public class Animals {
    private String color;
    private Weather weather;


    public Weather getWeather() {
        return weather;
    }

    public Animals(String color, Weather weather) {
        this.color = color;
        this.weather = weather;
    }

    public String getColor() {
        return color;
    }
}
