public class OooQuest {
//    public static void main(String[] args) {
//        String heroname = "Finn";
//        int herohp = 80;
//        int coins = 25;
//        System.out.println(heroname + " has " + herohp + " Hp and " + coins + " coins");
//        punch(23);
//        ;
//
//        for (int room = 1; room <= 3; room++)
//        {
//            coins += 5;
//            System.out.println("In room " + room + ". +5 gold for " + coins + "gold");
//        }
//        System.out.println("left train with " + coins + "coins");
//
//
//    }
//    public static void cheer() {
//        System.out.println("Yaaaa LETS GOO!!!");
//    }
//    public static void punch (int hp) {
//        hp -= 10;
//        System.out.println("hp = " + hp);
//    }

    public static class MethodsExercise {

        // TODO: write punch method here
        public static int punch(int hp) {

            hp -= 10;
            System.out.println(" -10 hp, hp ="+ hp);
            return hp;
        }

        // TODO: write cheer method here
         public static void cheer(int hp) {
             System.out.println("Lets goo!!!");
             hp += 10;
             System.out.println("+10 hp. hp total = " + hp);
         }

        public static void main(String[] args) {
            int enemy = 30;
            int hero = 30;
            enemy = punch(enemy);

            // print enemy HP
             System.out.println("Enemy HP: " + enemy);

            // call cheer
             cheer(hero);
        }
    }

}