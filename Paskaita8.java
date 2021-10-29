package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Paskaita8 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    //1. uzduotis
//        System.out.println("ivesk varda ir pavarde");
//        String input = scanner.nextLine();
//        String initials = Main.initials(input);
//        System.out.println(initials);


        //2. uzduotis
        ArrayList<String> notebook = new ArrayList<>();
        while(true){
            System.out.println("Įveskite užduotį");
            String input = scanner.nextLine();
            notebook.add(input);
            Paskaita8.printArr(notebook);
            System.out.println("--------------------");
            if(notebook.size() > 9){
                break;
            }
        }
        System.out.println("Perpildėte užrašų knygutę");
    }

    public static void printArr(ArrayList<String> arr){
        System.out.println("=====NOTEBOOK=====");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("nr"+(i+1)+". "+arr.get(i));
        }
        System.out.println();
    }

//    public static void doMath(String input){
//        System.out.println(input);
//    }

public static String initials (String input){
        if (input.equals("")){
            return "";
        }
    String[] arr = input.strip()
            .replaceAll("[ ]+"," ")
            .split(" ");
    String result = "";
    for (int i = 0; i < arr.length; i++) {
        result +=  arr[i].charAt(0);
    }

        return Paskaita8.upper(result);
}
    public static String upper (String input) {
    return   input.toUpperCase();
    }
}

/*padaryti zaidima sulinys zirkles popierius
1. 5 zaidimai, gale atspausdina kas daugiau kartu laimejo, zmogus ar kompas
2. zaidimu kiekis neribotas. kompas turi predictinti ka zaidejas pasirinks.
ziurima procentaliai ka zmogus dazniau renkasi.
3.  VISADA laimeti pries kompa.
4. kompas kaupia info ka jis rode ir ka rodei tu. tada ziuri patternus ir predictina tavo ejima.
4.b kai analizuoji duomenis maximaliai placiai visais skerspjuviais
*/