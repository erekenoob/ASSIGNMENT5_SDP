package strategy;


public class SmokeBreakPacedStudyStrategy implements StudyStrategy {

    private static final int SMOKE_BREAK_MINUTES = 12;

    @Override
    public int calculateMasteryPoints(int availableMinutes) {
        int activeMinutes = Math.max(5, availableMinutes - SMOKE_BREAK_MINUTES);
        return activeMinutes * 2 + 15;
    }

    @Override
    public String studyTopic(String topic, int availableMinutes) {
        int points = calculateMasteryPoints(availableMinutes);
        return String.format(
                "[Smoke & Breathe Strategy] Stepped outside for %d min (10-15 min fresh-air reset), " +
                        "cleared the mind, and studied '%s' -> Earned %d mastery points.",
                SMOKE_BREAK_MINUTES, topic, points
        );
    }
}