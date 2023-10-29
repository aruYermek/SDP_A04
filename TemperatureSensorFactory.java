public class TemperatureSensorFactory implements MedicalSensorFactory{
    @Override
    public MedicalSensor createSensor() {
        return new TemperatureSensor();
    }
}
