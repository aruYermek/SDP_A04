public class BloodPressureSensorFactory implements MedicalSensorFactory{
    @Override
    public MedicalSensor createSensor() {
        return new BloodPressureSensor();
    }
}
