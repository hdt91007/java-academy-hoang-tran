import com.pluralsight.SuperSayin;

import javax.print.attribute.Size2DSyntax;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // A class is a blueprint to create a type of object

        Student s1 = new Student();
        s1.firstname = "Oscar";
        s1.lastname = "Lopez";
        s1.age = 20;
//     s1.pincode = 1234;


        Student s2 = new Student();
        s2.firstname = "Imran";
        s2.lastname = "Ahmed";
        s2.age = 21;

        SuperSayin ss1 = new SuperSayin();
        ss1.name = "Goku";
        ss1.powerlevel = 1000;
        ss1.PowerUp();

        SuperSayin ss2 = new SuperSayin();
        ss2.name = "Vegeta";
        ss2.powerlevel = 998;


        ss2.PowerUp();
        ss2.Attack(ss1);
        ss1.Stats();
        ss2.Attack(ss1);
        ss1.Stats();
        ss2.Bean(ss1);
        ;
    }
}