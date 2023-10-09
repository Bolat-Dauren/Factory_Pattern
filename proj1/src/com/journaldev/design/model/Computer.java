package com.journaldev.design.model; //этот пакет используются для организации и структурирования классов в джава
public abstract class Computer {
    public abstract String getRAM(); //абстрактный метод который объявляет что любой подкласс класса компьютер должен предоставить реализацию метода getRAM()
    public abstract String getHDD();
    public abstract String getCPU();
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }

    //метод "toString()" возвращает строку содержащую информацию об оперативной памяти, жестком диске и процессоре
}