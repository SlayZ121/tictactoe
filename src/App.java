import board.Board;
import player.Player;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project -> Tic Tac Toe");
        Board b=new Board(4,'#');
        
        Player p1=new Player();
        p1.setPlayerDetails("Dhana", 23, "karnataka", "9361857808", "meowsi@gmail.com", 'X');
        p1.getPlayerDetails();
        Player p2=new Player();
        p2.setPlayerNameandSymbol("Akash", 'O');
        p2.getPlayerNameAndSymbol();
        
        
    }
}
