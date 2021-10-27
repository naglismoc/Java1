package com.company;


public class Paskaita7 {

    public static void main(String[] args) {
	    String[] masyvas = {"labas","jonas","medus"};
//        Main.printStringArray(masyvas);
//        Main.printStringArray(masyvas);
//        Main.printStringArray(masyvas);

//        ArrayList<Integer> betterArray = new ArrayList<>();
//        betterArray.add(7);
//        betterArray.add(7);
//        betterArray.add(7);
//        betterArray.add(8);
//
//        System.out.println(betterArray.get(3));
//
//        System.out.println(betterArray.size());
//        betterArray.remove(2);
//        System.out.println(betterArray.size());
//        System.out.println(   betterArray.contains(7)  );

    /*
    1. sukurti array lista kuris saugo tekstus.
    2. ideti tris kolegu vardus
    3. prasukti cikla ir atspausdinti kolegu vardus
    4. extra: surasti trumpiausia varda ir ji pasalinti
     */

//    ArrayList<String> txtList = new ArrayList<>();
//    txtList.add("Vytautas");
//    txtList.add("Gediminas");
//    txtList.add("Vaida");
//
//    txtList.set(0,"Agne");
//    txtList.remove(1);
//        for (int i = 0; i < txtList.size(); i++) {
//            System.out.println(txtList.get(i));
//        }

/*
C - create
R - read
U - update
D - delete
 */

     Paskaita7.sayHi();
     double myPi = Paskaita7.giveMePi();
    System.out.println(myPi);

    Paskaita7.printWord("labas");
    String zodis = "saldainis";
    Paskaita7.printWord(zodis);
    String reverseName = Paskaita7.sectretName("Naglis");
    System.out.println(reverseName);
    }

    public static String sectretName(String name){
        String reverseName = "";
        for (int i = name.length()-1; i >= 0; i--) {
            reverseName += name.charAt(i);
        }
        return reverseName;
    }
    
    public static void printWord(String word){
        System.out.println(word);
    }

    public static void sayHi(){
        System.out.println("hi");
    }

    public static double giveMePi(){
        return 3.14;
    }



    public static void printStringArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i= "+i+" arr[i]= "+arr[i]);
        }
    }

}
