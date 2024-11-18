// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private String clinicAddress;

    // 带参数的构造函数
    public GeneralPractitioner(int ID, String name, String specialty, String clinicAddress) {
        super(ID, name, specialty);
        this.clinicAddress = clinicAddress;
    }

    // 打印健康专业人员详细信息的方法
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Clinic Address: " + clinicAddress);
    }
}