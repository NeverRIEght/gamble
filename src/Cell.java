public class Cell {

    private final int number;

    private final String color;

    public Cell(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}