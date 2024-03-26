import board.Board;
import player.Player;
import game.Game;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project -> Tic Tac Toe");
        Board b=new Board(3,'-');
        b.printboardconfig();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the name of player: ");
        String name=sc.nextLine();
        System.out.println("Please enter the symbol of player: ");
        char symbol=sc.nextLine().charAt(0);
        
        Player p1=new Player();
        p1.setPlayerNameandSymbol(name,symbol);
        p1.getPlayerNameAndSymbol();

        System.out.println("Please enter the name of player: ");
        String name1=sc.nextLine();
        System.out.println("Please enter the symbol of player: ");
        char symbol1=sc.nextLine().charAt(0);
        Player p2=new Player();

        p2.setPlayerNameandSymbol(name1, symbol1);
        p2.getPlayerNameAndSymbol();
        
        Game game=new Game(new Player[] {p1,p2}, b);
        game.play();
        sc.close();
    }
}
