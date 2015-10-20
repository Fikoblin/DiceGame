package dicegame.players;

public abstract class Player {
    
    public abstract int guess();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
