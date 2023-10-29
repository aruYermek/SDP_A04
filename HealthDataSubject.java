public interface HealthDataSubject {
    void registerObserver(HealthDataObserver observer);
    void removeObserver(HealthDataObserver observer);
    void notifyObservers();
    void setHealthData(double temperature, int heartbeat, int bloodPressure);
}
