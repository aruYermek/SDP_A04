public class TemperatureSensor implements MedicalSensor{
    @Override
    public void readData() {
        System.out.println("Temperature sensor reads data.");
    }
}
