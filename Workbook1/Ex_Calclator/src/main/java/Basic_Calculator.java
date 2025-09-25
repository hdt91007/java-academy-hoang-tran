import java.util.Objects;
import java.util.Scanner;

public class Basic_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ one number and press enter");
        float number1 = scanner.nextFloat();
        System.out.println("Typ another number and press enter");
        float number2 = scanner.nextFloat();
        System.out.println("Type function and press enter");
        String proccess = scanner.next();
            if (Objects.equals(proccess, "Add")) System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
            else if (Objects.equals(proccess, "Subtract")) {
                System.out.println( number1 + " - " + number2 + " = " + (number1-number2));
                System.out.println("If you want the inverse type 'Yes' ");
                String inverse = scanner.next();
                if (Objects.equals(inverse, "Yes"));
            }
            else if (Objects.equals(proccess, "Multiply")) System.out.println( number1 + " * " + number2 + " = " + (number1*number2));
            else if (Objects.equals(proccess, "Divide")) {
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                System.out.println("If you want the inverse type 'Yes' ");
                String inverse = scanner.next();
                if (Objects.equals(inverse, "Yes")) System.out.println(number2 + " + " + number1 + " = " + (number2/number1));


                }



            }





    }
