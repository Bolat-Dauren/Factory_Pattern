package com.journaldev.design.model;
public class PC extends Computer { //PC наследует свойства и методы из класса Computer

    //должен предоставить реализацию абстрактных методов getRAM(), getHDD() и getCPU() из класса Computer

    private String ram;//поле класса PC для хранения информации об объеме оперативной памяти
    private String hdd;
    private String cpu;
    public PC(String ram, String hdd, String cpu){//этот конструктор устанавливает значения полей ram, hdd и cpu в соответствии с переданными аргументами
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
    @Override
    public String getHDD() {
        return this.hdd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
}