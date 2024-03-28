import java.util.ArrayList;

public class Machine {
    private String name;

    private Casino casino;
    private ArrayList<Bet> betsList;
    private ArrayList<Player> players;
    private int betsAmount;

    public Machine(String name) {
        this.name = name;
    }

    public void deposit(Player player, int amount) {
        if (amount == 0) {
            throw new RuntimeException("Cannot deposit 0");
        }

        this.betsAmount += amount;
    }

    public void setCasino(Casino casino) {
        this.casino = casino;
    }
}
