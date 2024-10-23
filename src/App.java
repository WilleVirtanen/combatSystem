import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    int currentValue = 0;
    int amountOfSides=6;
    Random random =new Random();
    int amountOfHits=0;
    int enemieAmountOfHits=0;
    int playerStrength=3;
    int playerHealth=10;
    int enemieStrength=2;
    int enemieHealth=6;
    boolean combatOngoing=true;
    int anybutton;
    Scanner scan = new Scanner(System.in);

    while(combatOngoing==true)
                {
                    System.out.println("Your health: ");
                    for(int i=1; i<=playerHealth; i++)
                    {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.println("foe health: ");
                    for(int i=1; i<=enemieHealth; i++)
                    {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.println("to attack press 1, to end combat press 2");
                    anybutton=scan.nextInt();
                    if(anybutton==1)
                    {
                        for(int i=0; i>=playerStrength; i++)
                        {
                            currentValue=random.nextInt(amountOfSides)+1;
                            System.out.println(currentValue);
                            if(currentValue>=4)
                            {
                                amountOfHits++;
                            }
                        }
                        for(int i=0; i>=enemieStrength; i++)
                        {
                            currentValue=random.nextInt(amountOfSides)+1;
                            System.out.println(currentValue);
                            if(currentValue>=4)
                            {
                                enemieAmountOfHits++;
                            }
                        }
                    }
                    if(enemieHealth<=0)
                    {
                        System.out.println("Victory!");
                        combatOngoing=false;
                    }

        
        
    }
    }
}
