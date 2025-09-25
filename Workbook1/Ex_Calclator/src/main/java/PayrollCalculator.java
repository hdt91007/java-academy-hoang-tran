import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type out your Firstname and Lastname");
        String Name = scanner.nextLine();
        System.out.println("Type out how many hours you worked as a number");
        float hours = scanner.nextFloat();
        System.out.println("Typ out your how much you make hourly");
        float wage = scanner.nextFloat();
        float pay;
        if (hours > 40) {
            System.out.println("Typ out your how much you make for overtime");
            float Otpay = scanner.nextFloat();
             pay = ((hours - 40) * Otpay) + (40 * wage);
            System.out.println(Name + " worked for " + hours + " hours and at base wage of $" + wage + " an hour, plus an overtime rate of $" + Otpay + " an hour, they made a gross income of $" + pay);

        } else {
             pay = (hours * wage);
            System.out.println(Name + " worked for " + hours + " hours and at base wage of $" + wage + " an hour they made $" + pay);

        }



        }

    }
