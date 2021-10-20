package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class paskaita3 {

    public static void main(String[] args) {
//        System.out.println("sveiki");
//        int h = 12;
//        int m = 24;
//        int s = 50;
//        int xTtime = 259;
//
//
//        System.out.println("random sugeneruotas laikas - "+h+":"+m+":"+s);
//        System.out.println("random sugeneruotos sekundes kurias reikes prideti "+xTtime);
////        s = (s+xTtime) % 60;
//        System.out.println("susumavus s + xTime, gautame laike telpa minuciu: "+((s+xTtime) / 60));
//
//        System.out.println("ir sekundziu "+(s+xTtime) % 60);
//        s = (s+xTtime) % 60;

        /*1. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.*/

//    String name = "Leonardas";
//    String surname = "DiCaprio";
//    if (name.length() > surname.length()){
//        System.out.println(surname);
//    }
//
//    if (name.length() < surname.length()){
//        System.out.println(name);
//    }
//
//        System.out.println( ""+ "Labas".charAt(0)+ "Labas".charAt(1) );
//
//     name = "Kiaune";
//        System.out.println(name.substring(name.length()-3, name.length() ));
//        System.out.print(" labas ");
//        System.out.print(" vakaras ");

//        System.out.println("labas \n rytas");

        /*2. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms. (LEONARDO dicaprio) */
//        System.out.println(name.toUpperCase() + " " + surname.toLowerCase());

        /* 3. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.*/
//        String ns = name.charAt(0)+""+surname.charAt(0);
//        System.out.println(ns);
//        System.out.println(name.charAt(0));
//        System.out.println((int)name.charAt(0));

        /*4. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.*/

//        System.out.println( name.substring( name.length()-3) + surname.substring( surname.length()-3));


/* 5. Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti. */
//      "An American in Paris".replace("a","*").replace("A","*");

        /* 6 . Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space Odyssey” ir “It's a Wonderful Life”.*/

//        String str = "An American in Paris";
//        System.out.println("An American in Paris".replaceAll("[AEIOUaeiou]",""));
//        System.out.println("An American in Paris".replaceAll("[AEIOUaeiou]",""));
/* 7. Stringe, kurį generuoja toks kodas: ""Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope" Surasti ir atspausdinti epizodo numerį.
*/
//String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        System.out.println(starWars.substring(starWars.length()-14,starWars.length()-13));
//
//
//        String gen = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        System.out.println(gen);
//        gen = gen.replaceAll("[^0-9]+", " ");
//        System.out.println(Arrays.asList(gen.trim()));


        Scanner scanner = new Scanner(System.in);
//        System.out.println("kuo tu vardu?");
//        String name = scanner.nextLine();
//        System.out.println("oba, mano vardas irgi "+name);
//        System.out.println( "Jusu slapto agento vardas yra "+ new StringBuilder(name).reverse().toString());

//        surinkti studento duomenis. Vardas, Pavarde, amzius, ar mokosi programuoti. surinktus duomenis atspausdinti


//        try{
//            scanner.nextInt();
//            System.out.println("pavyko gauti skaiciu");
//        }catch (Exception e){
//            System.out.println("nepavyko gauti skaiciaus");
//
//        }

        long currentTime = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
        System.out.println(new java.sql.Timestamp(System.currentTimeMillis()).getTime());
//        System.out.println(currentTime/1000/60/60/24/365);
        long t2 = new java.sql.Timestamp(System.currentTimeMillis()).getTime();

        System.out.println("parasyk savo varda");
        scanner.nextLine();

        long t1 = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
        System.out.println("prasyti savo varda uztrukai " +(t2-t1)+ " milisekundziu");
        for (int i = 0; i < 1000000000; i++) {

        }
    }
}
