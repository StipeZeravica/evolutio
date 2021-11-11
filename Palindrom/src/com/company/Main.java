package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        System.out.println("Unesite izraz: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Unijeli ste: " + str);
        String str2 = "";
        char reverse;
        str = str.replaceAll("[^a-zA-zčćžđšČĆŽĐŠ]", "");


        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
             reverse = str.charAt(i);
             str2 = reverse + str2;
        }

        System.out.println("prvi string; " + str);
        System.out.println("drugi string; " + str2);
        if(str.equalsIgnoreCase(str2))
            System.out.println("Unijeli ste palindrom");
        else
            System.out.println("niste unijeli palindrom");
    }
}
