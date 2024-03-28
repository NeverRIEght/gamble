public class Bet {
    private int amount;
    private int number;

    public Bet(int number, int amount) {
        this.number = number;
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public int getAmount() {
        return amount;
    }
}
