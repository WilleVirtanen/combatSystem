import java.util.Random;
public class Combat {
    int currentValue = 0;
    int amountOfSides=6;
    private int amountOfHits=0;
    private int enemieAmountOfHits=0;
    int playerStrength=3;
    int enemieStrength=2;
    int successValue =4;
    int critValue=6;
    //boolean combatOngoing=true;
    //int anybutton;
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    Random random =new Random();
    PrintHealth hp=new PrintHealth();
    int foeHp=hp.getEnemieHealth();
    int heroHp=hp.getPlayerHealth();

    public void Combat(){}

    public void playerStrike()
    {
        for(int i=0; i<playerStrength; i++)
                        {
                            currentValue=random.nextInt(amountOfSides)+1;
                            System.out.print(GREEN +"["+currentValue+"]"+RESET);
                            if(currentValue>=successValue)
                            {
                                if(currentValue==critValue)
                                {
                                 i--;   
                                }
                                amountOfHits++;
                            }
                        }
                        System.out.println();
    }
    public void foeStrike()
    {
        for(int i=0; i<enemieStrength; i++)
                        {
                            currentValue=random.nextInt(amountOfSides)+1;
                            System.out.print(RED+"["+currentValue+"]"+RESET);
                            if(currentValue>=successValue)
                            {
                                if(currentValue==critValue)
                                {
                                 i--;   
                                }
                                enemieAmountOfHits++;
                            }
                        }
                        System.out.println();
    }
    public void printPlayerHits()
    {
        System.out.println("You got "+amountOfHits+" hits!");
    }

    public  void printFoeHits()
    {
        System.out.println("Your enemie got "+enemieAmountOfHits+" hits!");
    } 
    public void calcFoeHP()
    {
        foeHp=foeHp-amountOfHits;
        hp.setEnemieHealth(foeHp);
        enemieAmountOfHits=0;
    }
    public void calcHeroHP()
    {
        System.out.println(heroHp-enemieAmountOfHits);
        heroHp=heroHp-enemieAmountOfHits;
        hp.setPlayerHealth(heroHp);
        int xhp=hp.getPlayerHealth();
        System.out.println("should be this: "+xhp);
        amountOfHits=0;
    }   
    
    public int getAmountOfHits() {
        return amountOfHits;
    }

    public void setAmountOfHits(int amountOfHits) {
        this.amountOfHits = amountOfHits;
    }

    public int getEnemieAmountOfHits() {
        return enemieAmountOfHits;
    }

    public void setEnemieAmountOfHits(int enemieAmountOfHits) {
        this.enemieAmountOfHits = enemieAmountOfHits;
    }
    

}
