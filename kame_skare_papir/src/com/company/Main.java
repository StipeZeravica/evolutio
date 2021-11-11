package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    //Igra se odvija u 3 dobivene

    static Scanner scanner = new Scanner(System.in);
    public static String Bot_alat = null;
    public static String user_alat = null;
    public static int Bot_num;
    public static int bot_score=0;
    public static int user_score=0;
    public static void setuser_alat(){
        System.out.println("Molim vas izaberite jedan od alata za igru : kamen , skare , papir");
        user_alat= scanner.nextLine();
        unittest(user_alat);
    }
    public static void setBot_alat(){
        Bot_num=(int) ((Math.random() * (3)));
        bot(Bot_num);
    }
    public static void bot(int Bot_num){
        switch(Bot_num) {
            case 0:
                Bot_alat = "kamen";
                break;
            case 1:
                Bot_alat = "papir";
                break;
            case 2:
                Bot_alat = "skare";
                break;
        }
        System.out.println("Botov alat je : " + Bot_alat);
    }
    public static void unittest(String user_alat){

        while (user_alat.equalsIgnoreCase("kamen")==false || user_alat.equalsIgnoreCase("skare")==false || user_alat.equalsIgnoreCase("papir")==false || user_alat.equalsIgnoreCase("škare")) {
            if (user_alat.equalsIgnoreCase("kamen") || user_alat.equalsIgnoreCase("skare") || user_alat.equalsIgnoreCase("papir") || user_alat.equalsIgnoreCase("škare")) {
                System.out.println("izabrali ste :" + user_alat);
                break;
            }
            else {
                System.out.println("Molim Vas da izaberete pripadajuci alat: kamen , skare , ili papir");
                user_alat = scanner.nextLine();
            }
        }
    }
    public static void TheGame(){
        while(bot_score<3 && user_score<3){
            setuser_alat();
            setBot_alat();

            if(Bot_alat.equalsIgnoreCase("kamen") && user_alat.equalsIgnoreCase("papir"))
                user_score++;
            else if((Bot_alat.equalsIgnoreCase("skare") || user_alat.equalsIgnoreCase("škare"))  && user_alat.equalsIgnoreCase("papir"))
                bot_score++;
            else if((Bot_alat.equalsIgnoreCase("skare")|| user_alat.equalsIgnoreCase("škare")) && user_alat.equals("kamen"))
                user_score++;
            else if(Bot_alat.equalsIgnoreCase("papir") && (user_alat.equalsIgnoreCase("skare")|| user_alat.equalsIgnoreCase("škare")))
                user_score++;
            else if(Bot_alat.equalsIgnoreCase("papir") && user_alat.equalsIgnoreCase("kamen"))
                bot_score++;
            else if(Bot_alat.equalsIgnoreCase("kamen") && (user_alat.equalsIgnoreCase("skare")|| user_alat.equalsIgnoreCase("škare")))
                bot_score++;
            else if(((Bot_alat.equalsIgnoreCase("skare")|| user_alat.equalsIgnoreCase("škare"))&& (user_alat.equalsIgnoreCase("skare")|| user_alat.equalsIgnoreCase("škare"))))
                continue;
            System.out.println("botov trenutni rezultat je: " + bot_score);
            System.out.println("vas trenutni rezultat je : " + user_score);


        }
    }
    public static void pobjednik(){
        if(user_score==3)
            System.out.println("Cestitam pobjedili ste vas rezultat je: " + user_score +".");
        else
            System.out.println("Zao nam je izgubili ste vas rezultat je: " + user_score+".");
    }

    public static void main(String[] args) {
        System.out.println("Dobrodosli u igru kamen,skare,papir igra se odvija u 3 dobivene. \n Zelimo vam srecu protiv naseg bota." );
        TheGame();
        bot(Bot_num);
        unittest(user_alat);
        pobjednik();
    }
}


