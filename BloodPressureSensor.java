public class BloodPressureSensor implements MedicalSensor{
    @Override
    public void readData() {
        System.out.println("Blood pressure sensor reads data.");
    }
}
