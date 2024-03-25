package player;

public class Player {
    private String name;
    private int age;
    private String address;
    private String contact;
    private String mailid;
     private char symbol;

    public void setPlayerDetails(String name, int age, String address, String contact, String mailid, char symbol){
        this.name=name;
        this.age=age;
        this.address=address;
        this.contact=contact;
        this.mailid=mailid;
        this.symbol=symbol;
    }
    public void setPlayerNameandAge(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void changeSymbol(char symbol){
        this.symbol=symbol;
    }
    public void setPlayerNameSymbolMailidAge(String name, char symbol, String mailid, int age){
        this.name=name;
        this.symbol=symbol;
        this.mailid=mailid;
        this.age=age;

    }
    public void setPlayerNameandSymbol(String name, char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public String getPlayerName(){
        return this.name;
    }
    public char getPlayerSymbol(){
        return this.symbol;
    }
    public void getPlayerNameAndAge(){
        System.out.println("The player's name: "+this.name);
        System.out.println("The player's age: "+this.age);
    }
    public void getPlayerNameAndSymbol(){
        System.out.println("The player's name: "+this.name);
        System.out.println("The player's symbol: "+this.symbol);
    }
    public void getPlayerDetails(){
        System.out.println("The player's name: "+this.name);
        System.out.println("The player's symbol: "+this.symbol);
        System.out.println("The player's email id: "+this.mailid);
        System.out.println("The player's age: "+this.age);
        System.out.println("The player's contact number: "+this.contact);
        System.out.println("The player's address: "+this.address);
    }

}
