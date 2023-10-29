public class Main {
    public static void main(String[] args) {

        PatientHealthData patientData = new PatientHealthData();

        // Create healthcare providers (observers)
        HealthDataObserver provider1 = new HealthcareProvider("Dr. Smith");
        HealthDataObserver provider2 = new HealthcareProvider("Nurse Johnson");

        // Register observers to the subject
        patientData.registerObserver(provider1);
        patientData.registerObserver(provider2);

        // Create factories to produce medical sensors
        MedicalSensorFactory temperatureFactory = new TemperatureSensorFactory();
        MedicalSensorFactory heartbeatFactory = new HeartbeatSensorFactory();
        MedicalSensorFactory bloodPressureFactory = new BloodPressureSensorFactory();

        // Simulate setting patient health data
        patientData.setHealthData(37.5, 80, 120);

        // Simulate reading sensor data
        temperatureFactory.createSensor().readData();
        heartbeatFactory.createSensor().readData();
        bloodPressureFactory.createSensor().readData();
    }
}