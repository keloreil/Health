// Specialist.java
public class Specialist extends HealthProfessional {
    private String hospitalName;

    // 带参数的构造函数
    public Specialist(int ID, String name, String specialty, String hospitalName) {
        super(ID, name, specialty);
        this.hospitalName = hospitalName;
    }

    // 打印健康专业人员详细信息的方法
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Hospital Name: " + hospitalName);
    }
}