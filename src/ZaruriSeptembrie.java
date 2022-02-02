import java.util.Random;
import java.util.Scanner;

public class ZaruriSeptembrie {
    public static void main(String[] args) {

        int zar1;
        int zar2;
        int zar1Adv;
        int zar2Adv;
        int victoriileMele = 0;
        int victoriileAdversarului = 0;

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        while (true) {

            if(victoriileMele == 6){
                System.out.println("AI castigat !!!!!!!!!!");
                break;
            }else if(victoriileAdversarului == 6){
                System.out.println("AI PIERDUT :(");
                break;
            }
            System.out.println("Doriti sa jucati? \n Scotul tau: " + victoriileMele + "\n Scorul advestarului: " + victoriileAdversarului);
            String raspuns = sc.nextLine();
            if (raspuns.equals("da")) {
                zar1 = rnd.nextInt(6) + 1;
                zar2 = rnd.nextInt(6) + 1;
                zar1Adv = rnd.nextInt(6) + 1;
                zar2Adv = rnd.nextInt(6) + 1;

                System.out.println("Ai dat " + zar1 + " " + zar2);
                System.out.println("Adversarul a dat " + zar1Adv + " " + zar2Adv);

                int scorulMeu = zar1 + zar2;
                int scorulAdversarului = zar1Adv + zar2Adv;

                if (scorulMeu > scorulAdversarului) {
                    victoriileMele++;
                    System.out.println("AI CASTIGAT!");
                } else if (scorulMeu < scorulAdversarului) {
                    victoriileAdversarului++;
                    System.out.println("AI PIERDUT!");
                } else {
                    System.out.println("REMIZA");
                }
            } else if (raspuns.equals("nu")) {
                System.out.println("Te mai asteptam pe la noi.");
                break;
            } else {
                System.out.println("Nu ai introdus un raspuns corespunzator. Da sau Nu");
            }
        }
    }
}
