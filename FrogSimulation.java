public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        return (int)((Math.random() * 50) + -10);
    }

    public boolean simulate() {
        int distance = 0;
        for (int i = 0; i < maxHops; i++) {
            distance += hopDistance();
            if (distance >= goalDistance) return true;
        }
        return false;
    }

    public double runSimulations(int num) {
        if (num <= 0) return -1;
        double success = 0;
        for (int i = 0; i < success; i++) success += simulate() ? 1 : 0; 
        return success / num;
    }
}
