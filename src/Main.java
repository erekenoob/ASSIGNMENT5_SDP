import context.StudySessionContext;
import strategy.CoffeeFueledStudyStrategy;
import strategy.DeepFocusStudyStrategy;
import strategy.OrganizedDeskStudyStrategy;
import strategy.PowerNapStudyStrategy;
import strategy.SmokeBreakPacedStudyStrategy;
import strategy.StudyStrategy;


public class Main {

    public static void main(String[] args) {
        String topic = "Strategy Pattern and Clean Code ";

        StudyStrategy smokeAndBreathe = new SmokeBreakPacedStudyStrategy();
        StudyStrategy brewCoffee = new CoffeeFueledStudyStrategy();
        StudyStrategy prepareDesk = new OrganizedDeskStudyStrategy();
        StudyStrategy deepFocus = new DeepFocusStudyStrategy();
        StudyStrategy sleepOneHour = new PowerNapStudyStrategy();

        System.out.println("MY LEARNING SESSION: SWITCHING RUNTIME STRATEGIES");

        StudySessionContext session = new StudySessionContext(smokeAndBreathe);
        System.out.println("1. " + session.executeStudySession(topic, 30));

        session.setStrategy(brewCoffee);
        System.out.println("2. " + session.executeStudySession(topic, 30));

        session.setStrategy(prepareDesk);
        System.out.println("3. " + session.executeStudySession(topic, 35));

        session.setStrategy(deepFocus);
        System.out.println("4. " + session.executeStudySession(topic, 45));

        session.setStrategy(sleepOneHour);
        System.out.println("5. " + session.executeStudySession(topic, 90));

        session.setStrategy(smokeAndBreathe);
        System.out.println("6. " + session.executeStudySession(topic, 25));

        System.out.println("SESSION COMPLETE");
    }
}