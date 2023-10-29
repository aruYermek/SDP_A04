import java.util.ArrayList;
import java.util.List;

public class PatientHealthData implements HealthDataSubject{
    private List<HealthDataObserver> observers = new ArrayList<>();
    private double temperature;
    private int heartbeat;
    private int bloodPressure;
    @Override
    public void registerObserver(HealthDataObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(HealthDataObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (HealthDataObserver observer : observers) {
            observer.update(temperature, heartbeat, bloodPressure);
        }
    }

    @Override
    public void setHealthData(double temperature, int heartbeat, int bloodPressure) {
        this.temperature = temperature;
        this.heartbeat = heartbeat;
        this.bloodPressure = bloodPressure;
        notifyObservers();
    }
}
