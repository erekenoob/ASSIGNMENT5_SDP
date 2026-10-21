package strategy;

public class PowerNapStudyStrategy implements StudyStrategy {

    private static final int SLEEP_DURATION_MINUTES = 60;

    @Override
    public int calculateMasteryPoints(int availableMinutes) {
        int remainingStudyMinutes = Math.max(10, availableMinutes - SLEEP_DURATION_MINUTES);
        return remainingStudyMinutes * 3 + 40;
    }

    @Override
    public String studyTopic(String topic, int availableMinutes) {
        int points = calculateMasteryPoints(availableMinutes);
        return String.format(
                "Sleep 1 Hour Strategy Slept for %d min (1 hour) to restore brain energy, " +
                        "then studied '%s' with peak memory retention -> Earned %d mastery points.",
                SLEEP_DURATION_MINUTES, topic, points
        );
    }
}