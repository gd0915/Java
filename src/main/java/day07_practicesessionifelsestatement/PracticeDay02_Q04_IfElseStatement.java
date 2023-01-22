package day07_practicesessionifelsestatement;

import java.util.Scanner;

public class PracticeDay02_Q04_IfElseStatement {
    /*
        Ask user to enter a character. If it is vowel, print "Vowel", and if
        it is not vowel, print "Not vowel!".
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character, please!");
//        char c1 = input.next().toLowerCase().charAt(0);
//
//        switch (c1) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println("vowel");
//                break;
//            case 'b':
//            case 'c':
//            case 'd':
//            case 'f':
//            case 'g':
//            case 'h':
//            case 'j':
//            case 'k':
//            case 'l':
//            case 'm':
//            case 'n':
//            case 'p':
//            case 'q':
//            case 'r':
//            case 's':
//            case 't':
//            case 'v':
//            case 'w':
//            case 'x':
//            case 'y':
//            case 'z':
//                System.out.println("Not vowel");
//                break;
//            default:
//                System.out.println("Enter a letter,not the other characters, please!");

            //2.Way: Do not use need to be added Invalid character part at the end

                String str = input.next().toLowerCase().substring(0,1);

                if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
                    System.out.println("vowel");
                }else if(str.equals("b") || str.equals("c") || str.equals("d") ||
                str.equals("f") || str.equals("g") || str.equals("h") || str.equals("j") ||
                str.equals("r") || str.equals("s") || str.equals("t") || str.equals("v") || str.equals("w") || str.equals("x") ||
                str.equals("y") || str.equals("z")){
                    System.out.println("Not vowel");
                }else{
                    System.out.println("Invalid character");
                }


        }
    }

