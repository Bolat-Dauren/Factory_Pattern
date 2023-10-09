package com.journaldev.design.factory;

import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

public class ComputerFactory {//класс отвечает за создание объектов типа Computer на основе переданных параметров
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;

        //если type равен Server то он создает объект класса Server с такими же параметрами
        //если type не соответствует ни PC, ни Server то метод возвращает null
    }
}