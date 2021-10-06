package se.filip;

public class Lab4 {
    public void Execute(){
        
        System.out.println("Hur många grader Fahr är det? ");
        float fahren = Float.parseFloat(System.console().readLine());
        float celcius = (fahren - 32) * 5/9;

        System.out.println(fahren + " grader fahrenheit är " + celcius + " grader celcius");
        
    }
}
