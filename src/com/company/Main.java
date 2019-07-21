package com.company;

public class Main {

    public static void main (String [] args){

        String information;

        Vehicle car = new Vehicle();
            car.giveInforamtion(  " ");
            information = car.giveInforamtion("ваша марка: " + car.mark + ", ваша максимальная скорость: " +  car.maxSpeed + ", у вас столько колёс: " +  car.eaualOfWheel);
            System.out.println(information);

        Vehicle truck = new Vehicle();
            String structure = "Кузов";
            information = truck.giveInforamtion("ваша марка: " + truck.mark + ", ваша максимальная скорость: " +  truck.maxSpeed + ", у вас столько колёс: " +  truck.eaualOfWheel);
            System.out.println(information + ", а ещё у вас есть: " + structure);

        Vehicle boat = new Vehicle();
            boat.eaualOfWheel = 0;
            information = boat.giveInforamtion("ваша марка: " + boat.mark + ", ваша максимальная скорость: " +  boat.maxSpeed + ", у вас столько колёс: " +  boat.eaualOfWheel);
            System.out.println(information);
    }


}
