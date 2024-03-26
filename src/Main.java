import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gamble gb = new Gamble();

        Player player = new Player("Michael", 600);

        for(int i = 0; i < 100; i++) {
            gb.spin(player);
            System.out.println(player.getMoney());
        }
    }
}