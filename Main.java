package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("my math");
        /*2. Naudokite funkcija Math.random(). Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 4. Didesnę reikšmę padalinkite iš mažesnės. Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.*/
//        Math.round();
//        Math.floor();
//        Math.ceil()

//        double num = 3.6189165;
//        double rounded = (double) ( (int) (num * 100) ) / 100;
//        double rounded2 =  Math.floor(num*100)/100;
//        int sk = 7;
//        System.out.println(rounded2);
//        int first = (int) (Math.random() * 5);
//        int second = (int)(Math.random() * 5);
//
//        System.out.println("pirmasis skaicius "+first+", antras skaicius "+second);


        //=============== sprendimas nr 1

//        if(first == 0 || second == 0){
//            System.out.println("dalyba is nulio negalima");
//        }else {
//            if (first > second) { // 4/3
//                System.out.println((double) first / second);
//            } else if(first == second){
//                System.out.println("abu skaiciai vienodi");
//            }else{
//                System.out.println((double) second / first);
//            }
//        }

        //=============== sprendimas nr 2


//        if(first == second){
//            System.out.println("abu skaiciai vienodi");
//        }
//
//        if(first == 0 || second == 0){
//            System.out.println("dalyba is nulio negalima");
//        }
//
//        if(first != 0 && second != 0){
//            if (first > second) { // 4/3
//                System.out.println( (double)  Math.round( (double) first / second * 100 ) / 100 );
//            }
//
//            if ( second >  first) { // 4/3
//                System.out.println( (double) Math.round(  (double)  second/ first *100 ) /100   );
//            }
//        }



/* 3. Naudokite funkcija Math.random().

 1. Sukurkite tris kintamuosius +
 2. naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 25. +
 3. Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.*/

//        int a = (int) ( Math.random() * 26);
//        int b = (int) ( Math.random() * 26);
//        int c = (int) ( Math.random() * 26);
//        //16 > 7 ir 7 > 4
//        System.out.println("a = "+a+", b = "+b+", c = "+c);
//
//        // varijantas a - kai reikia scenarijaus kada 3 skaiciai nera vienodi
//        if (a == b || b == c || a == c){
//            System.out.println("neturime triju skirtingu skaiciu.");
//        }else {
//            if ((a > b && b > c) || (c > b && b > a)) {
//                System.out.println("skaicius b yra vidurinis, jo reiksme " + b);
//            }
//
//            if ((a > c && c > b) || (b > c && c > a)) {
//                System.out.println("skaicius c yra vidurinis, jo reiksme " + c);
//            }
//
//            if ((b > a && a > c) || (c > a && a > b)) {
//                System.out.println("skaicius a yra vidurinis, jo reiksme " + a);
//            }
//        }
//
//
////varijantas b -  kai mus domina TIK teisingas scenarijus
//        if (a != b && b != c && a != c){
//            if ((a > b && b > c) || (c > b && b > a)) {
//                System.out.println("skaicius b yra vidurinis, jo reiksme " + b);
//            }
//
//            if ((a > c && c > b) || (b > c && c > a)) {
//                System.out.println("skaicius c yra vidurinis, jo reiksme " + c);
//            }
//
//            if ((b > a && a > c) || (c > a && a > b)) {
//                System.out.println("skaicius a yra vidurinis, jo reiksme " + a);
//            }
//        }


//4. /*
// Įvedami skaičiai -a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int)
// (naudokite Math.random() funkcija nuo 1 iki 10).
// Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų. */


        int a = (int) ( Math.random() * 10) + 1;
        int b = (int) ( Math.random() * 10) + 1;
        int c = (int) ( Math.random() * 10) + 1;
        a = 4;
        b= 4;
                c = 4;
        System.out.println("a = "+a+", b = "+b+", c = "+c);

        if(a + b > c && a + c > b && c + b > a){

            if(a ==b && b == c ){
                System.out.println("trikampio trys sonai lygus"); // visos krastines
            }else if(a ==b || b == c || a ==c){
                System.out.println("trikampio du sonai lygus"); // BENT dvi krastines
            }else{
                System.out.println("belekoks trikampis");
            }

        }else{
            System.out.println("nesamone");
        }


      String str =  "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(str);
    }
}
