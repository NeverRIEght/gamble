public class Player {
    private String name;
    private int money;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Bet generateBet() {

        int betAmount = (int) (Math.random() * money);
        int numberToBetOn = (int) (Math.random() * 37);

        if (betAmount == 0) {
            betAmount = 1;
        }

        return new Bet(betAmount, numberToBetOn);
    }

    public void deposit(int amount) {
        if (amount > this.money) {
            throw new RuntimeException("Not enough money!");
        }

        this.money -= amount;
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
