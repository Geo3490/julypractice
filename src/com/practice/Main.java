package com.practice;

//STRINGS ARE REFERENCE TYPE IN JAVA//
//STRINGS ARE IMMUTABLE AS ANY REFERENCE TYPE IT WILL STORE DATA IN OBJECT//

//PRIMITIVE VALUES ARE COMPLETELY INDEPENDENT WHERE REFERENCE IS DATA STORED TO THAT CLASS//

//public class Main {
//    public static void main (String[] args){
//        byte georgeAge = 32;
//        String ownerName = "George";
//
//        System.out.println(georgeAge + "\n"+ ownerName);
//    }
//}

                //EXAMPLE PRACTICE JULY 2022//
//Use Primitive Types As Listed Below To Store Simple Values.

//
//public class Main {
//    public static void main (String[] args){
//        byte age = 32;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;
//
//        System.out.println(letter+"\n" + price);
//    }
//}

//REFERENCE TYPE IS TO STORE COMPLEX OBJECTS WHERE PRIMITIVE IS SIMPLE VALUES//

//import java.util.Date;

//public class Main {
//    public static void main (String[] args){

//        //REFERENCE TYPE EXAMPLE DATE//
//        Date now = new Date();
//        System.out.println(now);
//    }
//}

//IN DEPTH REFERENCE EXAMPLE OF ALLOCATING MEMORY USING POINT CLASS//
//import java.awt.*;
//
//public class Main{
//    public static void main(String[] args){
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//
//        System.out.println(point1);
//
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        String message = "Hello world my name is George";
//
//            //EVEN WITH CHANGE TO METHOD IT STILL REMAINS ORIGINAL IN MEMORY//
//        System.out.println(message.toUpperCase());
//        System.out.println(message.length());
//
//        //EXAMPLE OF REMAINS A STORAGE OF ORIGINAL DATA//
//        System.out.println(message);
//
//    }
//}

//import java.util.Arrays;

//ARRAYS PRACTICE []//
//public class Main {
//    public static void main(String[] args){
        //EX 1

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(Arrays.toString(numbers));

        //EX 2
//ARRAYS HAVE A FIXED LENGTH CANNOT ADD OR REMOVE TO IT//
//        int[] numbers = {3,2,1,5,4};
//        Arrays.sort(numbers);

//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//    }
//}

//MULTI DIMENSIONAL ARRAY [][] CAN ALSO ADD ONE TO MAKE THREE DIMENSIONAL ARRAY[][][]//
//public class Main{
//    public static void main (String[] args){
        //[][] IS A ROW AND COLUMN EXAMPLE [1,0,0], [0,0,0] THIS HAS 2 ROWS AND IN EACH ROW 3 COLUMNS//
//        int[][] numbers = new int[2][3];
//        numbers[0][0]= 1;

        //EXAMPLE BELOW WILL NOT WORK FOR MULTI DIM ARRAYS YOU CAN USE deepToString//
//        System.out.println(Arrays.toString(numbers));

        //PREFERRED WAY TO COMPLETE
//        int[][] numbers = {{2,4,3,5,1},{7,6,9,8,10}};
//        System.out.println(Arrays.deepToString(numbers));
//    }
//}

//public class Main {
//    public static void main(String[] args){

        //EXAMPLE BELOW IS AN EXPRESSION BECAUSE IT PRODUCES A VALUE//

//        float result = (float)10 / (float)3;
//        System.out.println(result);


//        int x = 3;
//        x++;

//        int x = 3;
//        int y = x++;
//
//        System.out.println(x);
//        System.out.println(y);


//    }
//}

// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args){
//        String name = "susan";
////        System.out.println(name.toUpperCase());
//        addExclamationPoint(name.toUpperCase());
//
//    }
//    public static void addExclamationPoint(String s){
//        System.out.println(s + "!");
//    }
//}

//public class Main {
//
//    public static void main(String[] args){
//
//
//
//Scanner scanner = new Scanner(System.in);
//        System.out.print("Name ");
//
//        String response = scanner.nextLine().trim();
//        System.out.println("You are " + response);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int ofAge = 18;
//        boolean isOfAge = true;
//        boolean notOfAge = false;
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What's your name ? ");
//
//        String response = scanner.nextLine().trim();
//        System.out.println("Hello, " + response + " " + "nice to meet you!!");
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("What's your age ? ");
//
//
//        String response2 = scanner.nextLine().trim();
//        System.out.println("Ahhh You're " + response2 + " Years old.");
//
//
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        for (int i = 10; i >= 1; i--){
//            System.out.println(i);
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Note with the for each loop you can only move forward in iteration not back, otherwise use a for loop//
        //For loops will allow you to access index [i] of an array.

        String[] names = {"George, Greg, Pinky"};
        int ageRequired = 18;


        for (String name: names ) {
            System.out.println(name);
        }


    }
        }