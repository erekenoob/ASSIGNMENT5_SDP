package strategy;


public interface StudyStrategy {
    String studyTopic(String topic, int availableMinutes);
    int calculateMasteryPoints(int availableMinutes);
}