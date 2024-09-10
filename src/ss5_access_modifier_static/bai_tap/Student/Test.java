package ss5_access_modifier_static.bai_tap.Student;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        s.setName("Ariel");
        s.setClasses("C05");
        System.out.println(s);
    }
}
