
import java.util.Scanner;

public class ProgrameringAventyr2 {

    int p = 0;
    static String förnamn = "";
    static String efternamn = "";
    static String spelarnamn = "";
    static int ålder;
    static char riktning;
    static String kommando = "";
    static int posX = 0;
    static int posY = 0;
    static float hälsa = 100;

    static void gameStory() {
        System.out.println("This is a quest to find life or death!");
        System.out.println("You will probably die!");
    }

    static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }

    public void traps() {

    }

    static int probability() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        gameStory();

        Scanner sc = new Scanner(System.in);

        System.out.print("What is thy given name, peasant? ");
        förnamn = sc.nextLine();
        System.out.print("and thy family name? ");
        efternamn = sc.nextLine();
        System.out.print("With what name shalt we call thee? ");
        spelarnamn = sc.nextLine();
        System.out.println("Darest you tell us thy age, please. ");
        ålder = sc.nextInt();
        sc.nextLine();
        do {

            System.out.print("What to do? ");
            kommando = sc.nextLine();
          
            riktning = kommando.charAt(0);

            switch (riktning) {
                case 'N':
                case 'n': {
                    System.out.println("We head north!");
                    posY += 1;
                    break;
                }
                case 'S':
                case 's': {
                    System.out.println("We head south!");
                    posY -= 1;
                    break;
                }
                case 'W':
                case 'w': {
                    System.out.println("We head west!");
                    posX += 1;
                    break;
                }
                case 'E':
                case 'e': {
                    System.out.println("We head east!");
                    posX -= 1;
                    break;
                }
            }

            System.out.println("You are at (" + posX + "," + posY + ") with health " + hälsa);

            int action = probability();

            if (action <= 20) { //Monster
                System.out.println("Du stötte på ett monster, " + "monstret skadade dig för 5 HP");
                hälsa -= 5;
                System.out.println(hälsa);

            } else if (action == 20) { //potion
                hälsa += 1;                          
                System.out.println("Du hittade en potion + 100 HP" + "Du ligger nu på " +hälsa+ "HP" );
            } else if (action >= 80) { //grop
                hälsa -= 15;
                System.out.println("Du ramlade ner i en grop och förlorade 15 hp och " + "lgger nu på " +hälsa+ " HP");
            }
            if (hälsa <= 0) {
            System.out.println("Du dog.");
            sc.close();
            }
            delay(1000);
        
        
       
        sc.close();
    

