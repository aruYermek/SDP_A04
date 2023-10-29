public class HeartbeatSensor implements MedicalSensor{
    @Override
    public void readData() {
        System.out.println("Heartbeat sensor reads data.");
    }
}
