public class HealthcareProvider implements HealthDataObserver{
    private String providerName;

    public HealthcareProvider(String name) {
        this.providerName = name;
    }

    @Override
    public void update(double temperature, int heartbeat, int bloodPressure) {
        System.out.println(providerName + " received updated patient data - Temperature: " + temperature +
                "C, Heartbeat: " + heartbeat + "bpm, Blood Pressure: " + bloodPressure + "mmHg");
    }
}
