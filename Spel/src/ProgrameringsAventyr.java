

import java.util.Scanner;

public class ProgrameringsAventyr {

    static String förnamn = "";
    static String efternamn = "";
    static String användarnamn = "";
    static int ålder;
    static String kommando = "";
    static char riktning;
    static int posX = 0;
    static int posY = 0;
    static float hälsa = 10;

    public static void spelStory() {
        System.out.println("Detta är ett uppdrag på liv och död!");
        System.out.println("Du kommer dö!");
    }

    static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }

    }

    public static void main(String[] args) {

        spelStory();

        Scanner sc = new Scanner(System.in);

        System.out.println("Vad är ditt förnamn?");
        förnamn = sc.nextLine();
        System.out.println("Vad är ditt efternamn?");
        efternamn = sc.nextLine();
        System.out.println("Hur gammal är du?");
        ålder = sc.nextInt();

        do {
            String håll;
            
            System.out.println("vad ska du göra?");
            kommando = sc.nextLine();

           riktning = kommando.charAt(0);
            switch (riktning) {
                case 'N':
                case 'n': {
                    System.out.println("norr!");
                    break;
                }

                case 'S':
                case 's': {
                    System.out.println("Söder!");
                    break;
                }
                case 'W':
                case 'w': {
                    System.out.println("Väst!");
                    break;

                }
                case 'E':
                case 'e': {
                    {
                        System.out.println("Öst!");
                        break;
                    }
                }
            }
                delay(1000);

            }
            while (!(kommando.equalsIgnoreCase("Patrask")));
            System.out.println("Hej då");
        }

        
    }
