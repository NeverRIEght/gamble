import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        Игрок приходит в казино, выбирает в этом казино одну из рулеток
        Игрок придумывает и ставит ставку
        Рулетка принимает деньги на баланс партии и ждет, пока ставки придут как минимум от двух игроков
        Второй игрок придумывает и ставит ставку
        Рулетка принимает деньги на баланс и проверяет ставки игроков
        Рулетка возвращает выигрыши игрокам в порядке, в котором ставки были сделаны
        Остаток денег рулетка возвращает казино
         */

        Casino casino = new Casino();

        casino.addMachine(new Roulette());
        casino.addMachine(new Roulette());

        Player misha = new Player("Misha", 600);
        Player dasha = new Player("Dasha", 600);

        Roulette rl = (Roulette) misha.chooseMachine(casino.getMachines());
        rl.placeBet(misha, misha.generateBet());
        rl.placeBet(dasha, dasha.generateBet());
    }
}