import java.util.ArrayList;

public class Casino {
    private int money;
    private ArrayList<Machine> machines = new ArrayList<>(0);

    public Casino() {   }

    public Casino(ArrayList<Machine> machines) {
        this.machines = machines;
    }

    public ArrayList<Machine> getMachines() {
        return machines;
    }

    public void addMachine(Machine machine) {
        if(machine == null) {
            throw new NullPointerException("machine is null");
        }
        machine.setCasino(this);
        this.machines.add(machine);
    }

    public void takeMoney(int amount) {
        this.money += amount;
    }
}
