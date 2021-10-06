package se.filip;

public class Lab5 {
    public void Execute(){
        
        System.out.println("Mata in nummer 1: ");

        int num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Mata in nummer 2: ");
        int num2 = Integer.parseInt(System.console().readLine());

        int result = num1 * num2;
        System.out.println(result);

        int pow = (int)Math.pow(num1 , num2);
        System.out.println(pow);

        float div = (float)num1 / (float)num2;
        System.out.println(div);

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);

    }
}
