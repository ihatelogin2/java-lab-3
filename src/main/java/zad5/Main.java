package zad5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Niemcy",1980,15000);
        Samochod samochod2 = new Samochod("USA",1960,100000);
        Samochod samochod3 = new Samochod("Niemcy",2010,60000);
        samochod1.setMarka("Audi");
        samochod2.setMarka("Lincoln");
        samochod3.setMarka("BMW");
        Samolot samolot1 = new Samolot("Polska",2000, 350000);
        Samolot samolot2 = new Samolot("USA",2021, 65000000);
        Samolot samolot3 = new Samolot("Portugalia",1950, 3000);
        samolot1.setIleOsobPrzewiezie(50);
        samolot2.setIleOsobPrzewiezie(1000);
        samolot3.setIleOsobPrzewiezie(4);
        Pociag pociag1 = new Pociag("Kanada",1954,400000);
        Pociag pociag2 = new Pociag("Rosja",1987,500000);
        Pociag pociag3 = new Pociag("Brazylia",1932,600000);
        pociag1.setIleOsobPrzewiezie(2000);
        pociag2.setIleOsobPrzewiezie(5000);
        pociag3.setIleOsobPrzewiezie(12000);
        List<Pojazd> listaPojazdow = new ArrayList<>();
        listaPojazdow.add(samochod1);
        listaPojazdow.add(samochod2);
        listaPojazdow.add(samochod3);
        listaPojazdow.add(pociag1);
        listaPojazdow.add(pociag2);
        listaPojazdow.add(pociag3);
        listaPojazdow.add(samolot1);
        listaPojazdow.add(samolot2);
        listaPojazdow.add(samolot3);
        for (Pojazd pojazd:listaPojazdow) {
            System.out.println(pojazd.toString());
        }
    }
}
