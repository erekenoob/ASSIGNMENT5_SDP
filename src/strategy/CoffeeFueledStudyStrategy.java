package strategy;

public class CoffeeFueledStudyStrategy implements StudyStrategy {

    private static final int BREW_TIME_MINUTES = 5;

    @Override
    public int calculateMasteryPoints(int availableMinutes) {
        int activeMinutes = Math.max(5, availableMinutes - BREW_TIME_MINUTES);
        return (int) (activeMinutes * 2.5);
    }

    @Override
    public String studyTopic(String topic, int availableMinutes) {
        int points = calculateMasteryPoints(availableMinutes);
        return String.format(
                "[Brew Coffee Strategy] Spent %d min brewing hot coffee, boosted alertness, " +
                        "and studied '%s' at high speed -> Earned %d mastery points.",
                BREW_TIME_MINUTES, topic, points
        );
    }
}