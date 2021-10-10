package com.company;

public class QSwitch extends Solid{
    public QSwitch(int efficiency, String typeOfLaser, String mode, int energy){
        super(efficiency, typeOfLaser, mode, energy);
    }
    @Override
    public String description() {
        return  super.description()  + ". Режим работы лазера: " +getMode() +" с максимальной энергией в пике - " +getEnergy() +" Дж.";
    }
}
