import java.util.ArrayList;

public class Gamble {
    private final ArrayList<Cell> cellsList;

    private int currentAmount;

    public Gamble() {
        this.cellsList = new ArrayList<>(37);

        cellsList.add(new Cell(0, "Green"));

        for (int i = 1; i < 36; i += 2) {
            cellsList.add(new Cell(i, "Black"));
        }

        for (int i = 2; i <= 36; i += 2) {
            cellsList.add(new Cell(i, "Red"));
        }
    }

    public void spin(Player player) {
        Bet currentBet = player.generateBet();
        player.deposit(currentBet.getAmount());

        currentAmount += currentBet.getAmount();

        int spinResult = (int) (Math.random() * 37);

        if (currentBet.getNumber() == spinResult) {
            withdraw(player, currentBet.getAmount() * 2);
            printWin(player, currentBet);
        } else {
            printLose(player);
        }
    }

    private static void printLose(Player player) {
        System.out.println(player.getName() + " lose!");
    }

    private static void printWin(Player player, Bet currentBet) {
        System.out.println(player.getName() + " win! Your prize: " + currentBet.getAmount() * 2);
    }

    private void withdraw(Player player, int amount) {
        player.takeMoney(amount);
    }
}
