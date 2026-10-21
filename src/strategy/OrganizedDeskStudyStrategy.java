package strategy;

public class OrganizedDeskStudyStrategy implements StudyStrategy {

    private static final int SETUP_MINUTES = 10;

    @Override
    public int calculateMasteryPoints(int availableMinutes) {
        int activeMinutes = Math.max(5, availableMinutes - SETUP_MINUTES);
        return activeMinutes * 2 + 25;
    }

    @Override
    public String studyTopic(String topic, int availableMinutes) {
        int points = calculateMasteryPoints(availableMinutes);
        return String.format(
                "Workspace Prep Strategy Spent %d min sitting at the desk, plugging in the laptop charger, " +
                        "and preparing the notebook for '%s' -> Earned %d mastery points.",
                SETUP_MINUTES, topic, points
        );
    }
}