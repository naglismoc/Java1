package com.company;

public class Paskaita5 {
    public static void main(String[] args) {
        //scanner
        //i++
//        int skaicius = 17;
//        skaicius = skaicius + 1;
//        skaicius += 1;
//        skaicius += 20;
//        skaicius -= 20;
//        skaicius++;
//        skaicius--;
//        ++skaicius;
//        --skaicius;
//        int a = 10;
                        //10 + 10  jau po laiko
//        System.out.println(a + a++);
                        //10 + padidinam(11)
//        System.out.println(a + ++a);
//        for (int i = 1; i < 10;i++) { //i=1
//            System.out.println(i);
//            if(i % 5 == 0) {
//                break;
//            }
//            System.out.println(i);
//        }
        int[] randomNumbers = {618,5,57,51,586,498,489,9,948,49,49,49,94384,816,16};

//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.print(randomNumbers[i]+ " ");
//        }
//        System.out.println();
//        for (int i = 0; i < randomNumbers.length; i++) {
//            randomNumbers[i] = 17;
//        }
//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.print(randomNumbers[i]+ " ");
//        }
//        System.out.println();
//        int[] newArr = new int[5];
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i]+ " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 5; i++) {
//            newArr[i] = (int) (Math.random() * 16) + 5;
//        }
//
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i]+ " ");
//        }
//        System.out.println();


         for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+ " ");
        }

         int count = 0;
        for (int a = 0; a < randomNumbers.length; a++) {
            for (int i = 0; i < randomNumbers.length - 1; i++) {
                if (randomNumbers[i] > randomNumbers[ i + 1 ]) {
                    int tmp = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[i + 1];
                    randomNumbers[i + 1] = tmp;
                }
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+ " ");
        }


         count = 0;
        for (int a = 0; a < randomNumbers.length; a++) {//10
            for (int i = a+1; i < randomNumbers.length; i++) { //11-15
                if (randomNumbers[a] > randomNumbers[ i  ]) {
                    int tmp = randomNumbers[a];
                    randomNumbers[a] = randomNumbers[i];
                    randomNumbers[i ] = tmp;
                }
                count++;
            }
        }

        System.out.println();
        System.out.println(count);
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i]+ " ");
        }
    }
}
