   
    import java.util.Scanner; 
    public class StenSaxPåseX3{
    public StenSaxPåseX3() {
    int playerPoints=0;
    int computerPoints=0;
    
    for(int i=0; i<3; i++){
    System.out.println("Vällkomen till Sten Sax Påse.");

    //DINA VAL
    System.out.println("Skriv [0] för Sten\nSkriv [1] för Sax\nSkriv [2] för Påse");   
    
    
    
   
    int dator, spelare;
    String[] alternativ = {"Sten", "Sax", "Påse"};

    //DU VÄLJER DITT SVAR
    
    Scanner Tangentbord = new Scanner(System.in);
    System.out.print("Välj en siffra: ");
    spelare = Tangentbord.nextInt();
  
    
    //SLUMPAR DATORNS SVAR
    
    dator = 0 + (int)(Math.random() * 3); 
    
    //SKRIVER UT SVAREN I CONSOLEN
    
    System.out.println("Du valde " + alternativ[spelare]);
    System.out.println("Datorn valde " + alternativ[dator]);
   
     //REGLER FÖR 0 1 2  
     if (dator == 0 && spelare == 1)
     {
     System.out.println("Ingen vinner");
     }
     else if (dator == 1 && spelare == 2)
     {
     }
     else if (dator == 1 && spelare == 2) {
     System.out.println("Grattis du vann");
     playerPoints++;
     }else if (dator == 1 && spelare == 2) {
     System.out.println("Grattis du förlorade");
     //Poäng
     computerPoints++;
     
     
     
     
     
     
     }
    System.out.println(playerPoints+"-"+computerPoints);
    
     try{ 
     Thread.sleep(1500);
     }
     catch(InterruptedException e){
         
     if (playerPoints == 1){
     System.out.println(playerPoints + 1);
     }else if   (computerPoints == 1){
     System.out.println(computerPoints + 1);
    }
    }
    }
    }
    }

   

    