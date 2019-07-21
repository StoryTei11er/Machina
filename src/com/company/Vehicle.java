package com.company;

public class Vehicle {
    public String mark ="BMW";
    public int maxSpeed = 190;
    public int eaualOfWheel = 4;

    public  String giveInforamtion(String aWord){
        String vehicleResponse = "Краткая информация: " + aWord;
        return vehicleResponse;
    }
}
