package game;
import player.Player;
import board.Board;
public class Game {

    Player [] players;
    Board board;
    int turn;
    int moves;
    boolean gameOver;

    public Game(Player [] players, Board board){
        this.players=players;
        this.board=board;
        this.turn=0;
        this.moves=0;
        this.gameOver=false;
    }
}
