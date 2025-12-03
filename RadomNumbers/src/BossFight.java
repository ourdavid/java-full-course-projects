import java.util.Random;
import java.util.Scanner;

public class BossFight {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random radom = new Random();

        String character = "Bug";


        String boss = "Aracnoboss";
        boolean bossDead = false;
        int lifeBoss = 200;
        int lifeBossFull = lifeBoss;

        while(true){
            int damage = radom.nextInt(10,20);
            if(bossDead){
                System.out.println(character + ", defeat the boss "+ boss+ ".");
                break;
            }
            System.out.print("Atack y ou n: ");
            String atacck = input.nextLine();


            if(atacck.toLowerCase().charAt(0) == 'y'){
                lifeBoss -= damage;

                if (lifeBoss <= 0){
                    bossDead = !bossDead;
                }else{
                    System.out.println(character + " Damage dealt to the boss "+ boss + " : "+damage + " Life boss ( "+ lifeBoss + " / " + lifeBossFull + " )" );

                }
            }



        }

        input.close();
    }

}
