import java.util.Scanner;
import java.util.StringJoiner;


public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
// \n for new line
       // Shippinginformation Information = new Shippinginformation();
        StringBuilder Shippinginfo = new StringBuilder();
        //StringBuilder Billinginfo = new StringBuilder();

        System.out.println("Please provide your Name");
        Shippinginfo.append(scan.nextLine()+"\n \n");
        System.out.println("Please provide your Shipping Street");
        Shippinginfo.append("Shipping Address: \n"+ scan.nextLine() + "\n");

        System.out.println("Please provide your Shipping City");
           Shippinginfo.append(scan.nextLine()+", ");

        System.out.println("Please provide your Shipping State");
            Shippinginfo.append( scan.nextLine()+" ");

        System.out.println("Please provide your Shipping Zip");
            Shippinginfo.append( scan.nextLine());

        System.out.println(Shippinginfo);

//        System.out.println("Is the billing address the same as the shipping address| Yes or No");
//        String BillingQuestion = scan.nextLine();
//        String billinginfo = "";
//        if (BillingQuestion.equalsIgnoreCase("Yes")) {
//            billinginfo = String.valueOf(Shippinginfo.replace(0,7,"Billing"));
//            Shippinginfo.append ("\n" +billinginfo);
//            System.out.println(Shippinginfo);
//        }
//       else if (Billing.equalsIgnoreCase("No")) {
//         }
//        //while else
//       System.out.println("invalid response");

//
        System.out.println("Please provide your Billing Street");
        Shippinginfo.append("\n\nBilling Address: \n"+ scan.nextLine() + "\n");
//
        System.out.println("Please provide your Billing City");
        Shippinginfo.append(scan.nextLine()+", ");
//
      System.out.println("Please provide your Billing State");
        Shippinginfo.append( scan.nextLine()+" ");
//
       System.out.println("Please provide your Billing Zip");
        Shippinginfo.append( scan.nextLine());

        System.out.println(Shippinginfo);

//

    }
    }