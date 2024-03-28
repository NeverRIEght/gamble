import java.util.ArrayList;

public class Roulette extends Machine {
    private Casino casino;
    private ArrayList<Bet> betsList;
    private ArrayList<Player> players;
    private int rouletteBalance;
    private static final double RED_BLACK_MULTIPLIER = 1.2;
    private static final double ZERO_MULTIPLIER = 2.0;

    public Roulette() {
        super("Roulette");
        betsList = new ArrayList<>(2);
        players = new ArrayList<>(2);
    }

    private void spin() {
        int spinResult = (int) (Math.random() * 37);

        for(Bet currentBet : betsList) {
            Player currPlayer = players.get(betsList.indexOf(currentBet));

            if (currentBet.getNumber() == spinResult) {
                double currMultiplier = spinResult == 0 ? ZERO_MULTIPLIER : RED_BLACK_MULTIPLIER;

                withdraw(currPlayer, (int) (currentBet.getAmount() * currMultiplier));
                printWin(currPlayer, currentBet);
            } else {
                printLose(currPlayer);
            }
        }

        if(rouletteBalance != 0) {
            casino.takeMoney(rouletteBalance);
        }
    }

    private static void printLose(Player player) {
        System.out.println(player.getName() + " lose!");
    }

    private static void printWin(Player player, Bet currentBet) {
        System.out.println(player.getName() + " win! Your prize: " + currentBet.getAmount() * 1.4);
    }

    public void placeBet(Player player, Bet bet) {
        players.add(player);
        betsList.add(bet);
        rouletteBalance += bet.getAmount();

        if(players.size() >= 2) {
            spin();
        }
    }

    private void withdraw(Player player, int amount) {
        if(amount > rouletteBalance) {
            throw new RuntimeException("The casino went bankrupt");
        }

        this.rouletteBalance -= amount;
        player.takeMoney(amount);
    }

    public void setCasino(Casino casino) {
        this.casino = casino;
    }
}
