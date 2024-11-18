// Appointment.java
public class Appointment {
    private HealthProfessional doctor;
    private String patientName;
    private String mobilePhone;
    private String timeSlot;

    // 带参数的构造函数
    public Appointment(HealthProfessional doctor, String patientName, String mobilePhone, String timeSlot) {
        this.doctor = doctor;
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        doctor.printDetails();
    }

    // Getters
    public String getMobilePhone() {
        return mobilePhone;
    }
}