package com.journaldev.design.model;
public class Server extends Computer {//Server наследует свойства и методы из класса Computer
    //должен предоставить реализацию абстрактных методов getRAM(), getHDD() и getCPU() из класса Computer

    private String ram;
    private String hdd;
    private String cpu;
    public Server(String ram, String hdd, String cpu){
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