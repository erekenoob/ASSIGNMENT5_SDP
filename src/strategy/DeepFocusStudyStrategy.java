package strategy;

public class DeepFocusStudyStrategy implements StudyStrategy {

    @Override
    public int calculateMasteryPoints(int availableMinutes) {
        return availableMinutes * 3;
    }

    @Override
    public String studyTopic(String topic, int availableMinutes) {
        int points = calculateMasteryPoints(availableMinutes);
        return String.format(
                "Deep Focus Strategy Locked in immediately for %d min with zero distractions " +
                        "and worked intensely on '%s' -> Earned %d mastery points.",
                availableMinutes, topic, points
        );
    }
}