public class CombinedTable {
    private final SingleTable t1;
    private final  SingleTable t2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public boolean canSeat(int people) {
        return ((t1.getNumSeats() + t2.getNumSeats()) >= people);
    }

    public double getDesireability() {
        return (t1.getHeight() == t2.getHeight()) ? (t1.getDesireability() + t2.getDesireability()) / 2 : (t1.getDesireability() + t2.getDesireability() - 20) / 2;
    }
}
