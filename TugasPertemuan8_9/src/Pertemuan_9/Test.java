package Pertemuan_9;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@example.com");
        Student student = new Student("Jane Doe", "456 Maple St", "555-5678", "jane@example.com", Student.SENIOR);
        Employee employee = new Employee("Jim Smith", "789 Oak St", "555-8765", "jim@example.com", "A123", 50000, new MyDate(2020, 1, 15));
        Faculty faculty = new Faculty("Dr. Tom", "101 Pine St", "555-3456", "tom@example.com", "B456", 70000, new MyDate(2018, 6, 20), 10, "Professor");
        Staff staff = new Staff("Mary Johnson", "202 Cedar St", "555-7890", "mary@example.com", "C789", 45000, new MyDate(2019, 3, 10), "Secretary");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
