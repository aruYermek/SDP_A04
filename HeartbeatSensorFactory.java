public class HeartbeatSensorFactory implements MedicalSensorFactory{
    @Override
    public MedicalSensor createSensor() {
        return new HeartbeatSensor();
    }
}
