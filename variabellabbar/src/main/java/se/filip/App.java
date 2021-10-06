package se.filip;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Lab1 labben = new Lab1();
        labben.Execute();

        Lab2 lab2 = new Lab2();
        lab2.Execute();

        Lab3 lab3 = new Lab3();
        lab3.Execute();

        Lab4 lab4 = new Lab4();
        lab4.Execute();

        
        Lab5 lab5 = new Lab5();
        lab5.Execute();

        System.out.println("Hello worlds");
    }
}
