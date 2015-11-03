package dicegame.players;

public abstract class Player {

    public abstract int guess();
    private String name = "Anonim";

    public Player() {
    }

    public Player(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }

    }
}