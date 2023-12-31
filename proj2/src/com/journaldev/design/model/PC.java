package com.journaldev.design.model;
public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;
    public PC(String ram, String hdd, String cpu){ //конструктор инициализирует поля ram, hdd и cpu объекта PC переданными значениями
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