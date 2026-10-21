package context;

import strategy.StudyStrategy;

public class StudySessionContext {

    private StudyStrategy strategy;

    public StudySessionContext(StudyStrategy initialStrategy) {
        setStrategy(initialStrategy);
    }

    public void setStrategy(StudyStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("StudyStrategy cannot be null.");
        }
        this.strategy = strategy;
    }

    public String executeStudySession(String topic, int availableMinutes) {
        if (topic == null || topic.isBlank()) {
            throw new IllegalArgumentException("Study topic cannot be null or blank.");
        }
        if (availableMinutes <= 0) {
            throw new IllegalArgumentException("Available study time must be greater than 0 minutes.");
        }
        return strategy.studyTopic(topic, availableMinutes);
    }

    public int estimatePoints(int availableMinutes) {
        if (availableMinutes <= 0) {
            throw new IllegalArgumentException("Available study time must be greater than 0 minutes.");
        }
        return strategy.calculateMasteryPoints(availableMinutes);
    }
}