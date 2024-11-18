// HealthProfessional.java
public class HealthProfessional {
    private int ID;
    private String name;
    private String specialty;

    // 默认构造函数
    public HealthProfessional() {}

    // 带参数的构造函数
    public HealthProfessional(int ID, String name, String specialty) {
        this.ID = ID;
        this.name = name;
        this.specialty = specialty;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }

    // Getters and Setters
    // 注释掉未使用的方法
    /*
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
    */
}