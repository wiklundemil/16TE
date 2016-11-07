    
    import java.util.Scanner; 
    public class RockPaperScissor{

    public RockPaperScissor() {
    System.out.println("Vällkomen till Sten Sax Påse.");
    System.out.println("Skriv [0] för Sten\nSkriv [1] för Sax\nSkriv [2] för Påse");    
        
    int dator, spelare;
    String[] alternativ = {"Sten", "Sax", "Påse"};

    Scanner Tangentbord = new Scanner(System.in);
    System.out.print("Välj en siffra: ");
    spelare = Tangentbord.nextInt();
  
    dator = 0 + (int)(Math.random() * 3); 
    
    System.out.println("Du valde " + alternativ[spelare]);
    System.out.println("Datorn valde " + alternativ[dator]);
    
    if (dator == spelare){
    System.out.println("Ingen vinner");
    }else if (spelare == dator-1){
    System.out.println("Grattis du vann");
    }else{
    System.out.println("Grattis du förlorade");
    }  
    } 
    }