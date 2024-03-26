import java.util.ArrayList;

public class Gamble {
    private final ArrayList<Cell> cellsList;

    public Gamble() {
        this.cellsList = new ArrayList<>();

        cellsList.add(new Cell(0, "Green"));

        for (int i = 1; i < 36; i += 2) {
            cellsList.add(new Cell(i, "Black"));
        }

        for (int i = 2; i <= 36; i += 2) {
            cellsList.add(new Cell(i, "Red"));
        }
    }

    public Cell spin() {
        int randomValue = (int) (Math.random() * 37);

        return cellsList.get(randomValue);
    }
}
