package game;
import player.Player;
import board.Board;
import java.util.*;
public class Game {

    Player [] players;
    Board board;
    int turn;
    int moves;
    boolean gameOver;
    String zero;
    String cross;

    public Game(Player [] players, Board board){
        this.players=players;
        this.board=board;
        this.turn=0;
        this.moves=0;
        this.gameOver=false;

        StringBuilder z=new StringBuilder();
        StringBuilder c=new StringBuilder();
        for(int i=0;i<board.size;i++){
            z.append('O');
            c.append('X');
        }
        this.zero=z.toString();
        this.cross=c.toString();
    }
    public void printboardconfig(){
        int n=board.size;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void play(){
        printboardconfig();
        int n=board.size;
        while(!gameOver){
            moves++;
            int idx=getIndex();
            int row=idx/n;
            int col=idx%n;

            board.matrix[row][col]=players[turn].getPlayerSymbol();

            if(moves>=2*n-1&& CheckCombination()==true){
                gameOver=true;
                printboardconfig();
                System.out.println("Winner is: "+players[turn].getPlayerName());
                break;
            }


            if(moves>=n*n){
                System.out.println("Game draw");
                printboardconfig();
                return;
            }
            
            turn=(turn+1)%2;
            printboardconfig();
        }
    }
    public int getIndex(){
        while(true){
            //Player inputs one position
            Scanner sc=new Scanner(System.in);
            System.out.println("Player: "+players[turn].getPlayerName()+" give an index to play");
            int pos=sc.nextInt()-1;
            int n=board.size;
            int row=pos/n;
            int col=pos%n;
            //Check if index is valid
            if(row<0||row>=n||col<0||col>=n){
                System.out.println("Invalid position");
                continue;
            }
            //check if index already occupied
            if(board.matrix[row][col]!='-'){
                System.out.println("Position Already occupied");
                continue;
            }
            
            return pos;

        }
        
    }
    public boolean CheckCombination(){
        int n=board.size;
        //row-wise
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(board.matrix[i][j]);
            }
            String pattern=sb.toString();
            if(pattern.equals(zero)||pattern.equals(cross)){
                return true;
            }
        }

        //columnwise
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(board.matrix[j][i]);
            }
            String pattern=sb.toString();
            if(pattern.equals(zero)||pattern.equals(cross)){
                return true;
            }
        }

        //Diagonal
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            sb.append(board.matrix[i][j]);
            i++;
            j++;
        }
        String pattern=sb.toString();
            if(pattern.equals(zero)||pattern.equals(cross)){
                return true;
            }

            //Anti-Diagonal
        i=0;
        j=n-1;
        sb=new StringBuilder();
        while(i<n){
            sb.append(board.matrix[i][j]);
            i++;
            j--;
        }
        pattern=sb.toString();
            if(pattern.equals(zero)||pattern.equals(cross)){
                return true;
            }

            return false;


    }
    
}
