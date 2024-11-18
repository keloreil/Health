// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "GP", "123 Main St");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "GP", "456 Elm St");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Brown", "GP", "789 Oak St");

        Specialist sp1 = new Specialist(4, "Dr. Davis", "Cardiologist", "City Hospital");
        Specialist sp2 = new Specialist(5, "Dr. Wilson", "Dermatologist", "County Hospital");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        sp1.printDetails();
        sp2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        List<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, gp1, "Alice", "1234567890", "10:00");
        createAppointment(appointments, gp2, "Bob", "0987654321", "11:00");
        createAppointment(appointments, sp1, "Charlie", "1122334455", "12:00");
        createAppointment(appointments, sp2, "David", "6677889900", "13:00");

        printExistingAppointments(appointments);

        cancelBooking(appointments, "1122334455");

        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    // 创建预约的方法
    public static void createAppointment(List<Appointment> appointments, HealthProfessional doctor, String patientName, String mobilePhone, String timeSlot) {
        Appointment appointment = new Appointment(doctor, patientName, mobilePhone, timeSlot);
        appointments.add(appointment);
    }

    // 打印现有预约的方法
    public static void printExistingAppointments(List<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
            }
        }
    }

    // 取消预约的方法
    public static void cancelBooking(List<Appointment> appointments, String mobilePhone) {
        appointments.removeIf(appointment -> appointment.getMobilePhone().equals(mobilePhone));
    }
}