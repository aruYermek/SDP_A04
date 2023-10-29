public interface HealthDataObserver {
    void update(double temperature, int heartbeat, int bloodPressure);
}
