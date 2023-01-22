package selfpractices.selfpractice_mixedtopics;

import java.util.Scanner;

public class Practice_NestedIfElseStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter please!");
        char ch = input.next().charAt(0);

        //1.Way:
        if(ch>='A' && ch<='Z'){
            if(ch<'F'){
                System.out.println("Big before F");
            }else{
                System.out.println("Big after F");
            }
        }else if(ch>='a' && ch<='z'){
            if(ch<'h'){
                System.out.println("Small before h");
            }else{
                System.out.println("Small after h");
            }
        }else{
            System.out.println("Invalid character");
        }

        //2.Way:

        String result = ch>='A' && ch<='Z' ? (ch<'F' ? "Big before F" : "Big after F") : (ch>='a' && ch<='z') ?
                (ch<'h' ? "Small before h" : "Small after h") : "Invalid Character";
        System.out.println(result);


    }
}
