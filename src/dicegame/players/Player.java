package dicegame.players;

public abstract class Player {

    public abstract int guess();
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
}
