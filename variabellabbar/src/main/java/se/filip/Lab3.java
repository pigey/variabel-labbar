package se.filip;

public class Lab3 {
    public void Execute(){
        
        System.out.println("Vad heter du i förnamn?");

        String fnamn = System.console().readLine();
        System.out.println("Vad heter du i efternamn?");
        String enamn = System.console().readLine();

        System.out.println(enamn + " " + fnamn);
       
    }
}
