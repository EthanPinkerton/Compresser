package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type some letters: ");
        String userString = input.next();

        int count = 1;
        String compressedString = "";

        for(int i = 0;i < userString.length()-1;i++){
            if(userString.charAt(i) == userString.charAt(i+1)){
                count++;
            }
            else {
                compressedString += userString.charAt(i) + Integer.toString(count);
                count = 1;
            }
        }
        if(userString.charAt(userString.length()-1) == userString.charAt(userString.length()-2)){
            compressedString += userString.charAt(userString.length()-1) + Integer.toString(count);
        }
        else{
            compressedString += userString.charAt(userString.length()-1) + "1";
        }
        System.out.println(compressedString);
    }
}
