package com.company;

import java.util.Scanner;

public class paskaita4 {
    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("labas");
//
//            for (int j = 0; j < 3; j++) {
//                System.out.print(" rytas");
//                count++;
//            }
//            System.out.println();
//        }
//        System.out.println(count);

//        Scanner scanner = new Scanner(System.in);
//
//        boolean badNumber = true;
//        System.out.println("prasau iveskite skaiciu");
//        while(badNumber){
//            int input = scanner.nextInt();
//            if(input >0 && input < 5){
//                badNumber = false;
//                System.out.println("pagaliau, aciu");
//            }else{
//                System.out.println("Ivesk skaiciu teisingai. TARP 0 ir 5");
//            }
//        }
//        System.out.println("skaicius priimtas");
//        String tekstas = "labas rytas";
//        String text = "";
//        for (int i = 0; i < 100; i++) {
////            if(i != 99) {
////                System.out.print(i + ",");
////            }else{
////                System.out.println(i);
////            }
//            text += i+",";
//        }
//        System.out.println(text.substring(0,text.length()-1));
//
//
//
//        double randomNumber = Math.random();
//
//        System.out.println(randomNumber);

//        String soutLine = "";
//        for (int i = 1; i < 3001; i++) {
//           // int num = 1 + (int) (Math.random() * 3001); 2999,  14
//            if (i % 77 == 0) {
//                if (i == 2999){
//                    soutLine += i ;
//                } else {
//                    soutLine += i+",";
//                }
//
//            }
//
//        }
//        System.out.println(soutLine);
//
//        // nuo 10 iki 20
//        System.out.println((int) (Math.random() * 11) + 10);
//        int min = 0;
//        int max = 20;
//        System.out.println((int) (Math.random() * (max + 1 - min)) + min);
//        System.out.print(max + ", ");
//        System.out.print(max + ", ");
//        System.out.print(max + ", ");
//        System.out.print(max + ", ");
//        System.out.print(max + ", ");
//        System.out.print(max + ", ");
//        System.out.print(max + ", ");
//
//        Scanner scanner = new Scanner(System.in);
//        //nr1
//        boolean goodData = false;
//        while(!goodData){
//            try{
//                int input = scanner.nextInt();
//                goodData = true;
//            }catch (Exception e){
//                System.out.println("blogai suvedei duomenis, vesk is naujo");
//            }
//        }
//
//        //nr2
//        goodData = true;
//        do{
//            try{
//                int input = scanner.nextInt();
//            }catch (Exception e){
//                System.out.println("blogai suvedei duomenis, vesk is naujo");
//                goodData = false;
//            }
//        }while(!goodData);
//
//        if( 7 <= 4){
//
//        }









        Boolean thirdScenario = true;

        int counter = 0;
        while(thirdScenario){
            int flip = (int) (Math.random() * 2);
            if (flip == 1){
                System.out.println("H");
                counter++;
            }else{
                counter = 0;
                System.out.println("T");
            }

            if(counter == 3){
                thirdScenario = false;
            }
        }











    }

}
