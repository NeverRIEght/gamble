import java.util.ArrayList;

public class Player {
    private String name;
    private int money;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Machine chooseMachine(ArrayList<Machine> machines) {
        int randomMachineIndex = (int) (Math.random() * (machines.size() - 1));
        return machines.get(randomMachineIndex);
    }

    public Bet generateBet() {
        int betAmount = (int) (Math.random() * money) + 1;
        int numberToBetOn = (int) (Math.random() * 37);

        this.money -= betAmount;
        return new Bet(numberToBetOn, betAmount);
    }

    public String getName() {
        return name;
    }

    public void takeMoney(int amount) {
        this.money += amount;
    }

    public int getMoney() {
        return money;
    }
}
