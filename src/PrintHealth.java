public class PrintHealth {

    public PrintHealth() {}
    
    private int playerHealth=10;
    private int enemieHealth=6;
    
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
      
    public int getPlayerHealth() {
        return playerHealth;
    }
    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }
    public int getEnemieHealth() {
        return enemieHealth;
    }
    public void setEnemieHealth(int enemieHealth) {
        this.enemieHealth = enemieHealth;
    }
    public void PrintPlayerHp()
    {
        System.out.println(GREEN+"Your health: "+playerHealth+RESET);
                    for(int i=1; i<=playerHealth; i++)
                    {
                        System.out.print(GREEN+"|"+RESET);
                    }
                    System.out.println();                    
    }
    public void PrintfoeHp()
    {
        System.out.println(RED+"foe health: "+enemieHealth+RESET);
        for(int i=1; i<=enemieHealth; i++)
                    {
                        System.out.print(RED+"|"+RESET);
                    }
                     System.out.println();
    }

    


}
