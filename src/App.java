import board.Board;
import player.Player;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project -> Tic Tac Toe");
        Board b=new Board(4,'#');
        b.printboardconfig();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the name of player: ");
        String name=sc.nextLine();
        System.out.println("Please enter the symbol of player: ");
        char symbol=sc.nextLine().charAt(0);
        
        Player p1=new Player();
        p1.setPlayerNameandSymbol(name,symbol);
        p1.getPlayerNameAndSymbol();
        Player p2=new Player();
        p2.setPlayerNameandSymbol("Akash", 'O');
        p2.getPlayerNameAndSymbol();
        
        sc.close();
    }
}
