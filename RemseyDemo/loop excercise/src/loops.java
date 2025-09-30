import java.util.Scanner;

public class loops {
    public static void main(String[]args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);



        for (int i= 1; i <= 10;i++) {
            System.out.println(i +". I'm a good developer");}


        for (int i= 81; i > 0;i--){
        System.out.println();
        }


    // 1. FOR LOOP
    // Use when you know how many times you want to repeat
        System.out.println("For Loop: Counting from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0)
            { System.out.println("Iteration " + i);}
    }

    // 2. WHILE LOOP
    // Use when you don't know how many times in advance
        System.out.println("\nWhile Loop: Counting down from 5");
    int j = 5;
        while (j > 0) {
            Thread.sleep (1000);
        System.out.println("Countdown: " + j);
        j--;
    }

    // 3. DO...WHILE LOOP
    // Always runs at least once, even if condition is false
        System.out.println("Do...While Loop: Run at least once");
        String p = "exit" ;
        String input;
        do {
        System.out.println("please type " + p);
        input = scanner.next();
    } while ( !input.equals(p));
        System.out.println("Exit entered bye bye");


     }
}