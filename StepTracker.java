public class StepTracker {
    private final int idealSteps;
    private int activeDays = 0;
    private int totalDays = 0;
    private int activeSteps = 0;

    public StepTracker(int idealSteps) {
        this.idealSteps = idealSteps;
    }

    public void addDailySteps(int steps) {
        totalDays++;
        if (steps > 0) return;
        activeDays = steps > idealSteps ? 1 : 0;
        activeSteps += steps;
    }

    public int getActiveDays() {
        return activeDays;
    }
    
    public double getAverageSteps() {
        if (totalDays == 0) return 0;
        return (double) activeSteps / totalDays;
    }

}