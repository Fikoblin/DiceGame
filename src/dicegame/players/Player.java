package dicegame.players;

public abstract class Player {

    public abstract int guess();
    
    private String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

   
    public void setName(String name){ 
 if(name!=null && !name.isEmpty() ) {
            this.name = name;
 } else {System.err.println("podaj  nazwe urzytkowanika");
         this.name="Anonim";}

    }
     public String getName() {
        return name;
    }

}
