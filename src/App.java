
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
            
    boolean combatOngoing=true;
    int anybutton;
    Scanner scan = new Scanner(System.in);  
    PrintHealth hpp=new PrintHealth();
    /*int foeHpp=hp.getEnemieHealth();
    int heroHpp=hp.getPlayerHealth();*/
    Combat cc=new Combat();
   
    while(combatOngoing==true)
                {
                    
                    hpp.PrintPlayerHp();
                    hpp.PrintfoeHp();
                    System.out.println("to attack press 1, to end combat press 2");
                    anybutton=scan.nextInt();
                    System.out.println(anybutton);
                    if(anybutton==1)
                    {
                        
                        cc.playerStrike();
                        cc.foeStrike();
                        cc.printPlayerHits();
                        cc.printFoeHits();
                        cc.calcHeroHP();
                        cc.calcFoeHP();                       
                       
                        
                       /*  if(foeHpp<=0)
                         {
                        System.out.println("Victory!");
                        combatOngoing=false;
                        }
                        if(heroHpp<=0)
                         {
                        System.out.println("lose!");
                        combatOngoing=false;
                        }*/

                    }
                    
        
        
                }
                scan.close();
    }
}
