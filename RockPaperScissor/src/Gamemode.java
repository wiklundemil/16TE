
    import java.util.Scanner;
    public class Gamemode{


    public static void main(String args[]){
    
    
    startgame();
    
   }
    
    static void startgame(){
    int spelare;
    Scanner Tangentbord = new Scanner(System.in);
    System.out.println("Välj ett Gamemode.\nTryck [1] för En runda av Sten Sax Påse.\nTryck [2] för Sten Sax Påse bäst av tre.");
    spelare = Tangentbord.nextInt();
    if(spelare == 1){
    new RockPaperScissor();
    }
    else 
    if(spelare == 2){
    new StenSaxPåseX3();
    }
    else{
    startgame();
    System.out.println("Invalid input"); 
    }
    }
}