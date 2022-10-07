class Student{
    static int counter = 0;
    String name;
    int id;
    int age;
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        counter++;
    }

}

public class JavaS11 {
    public static void main(String[] args) {
        Student student1 = new Student("Sonali",101,23);
        Student student2 = new Student("Raghuwanshi",102,23);
        System.out.println(student1);
        System.out.println(student1.age);
        System.out.println(student1.id);
        System.out.println(student1.name);
        System.out.println();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student2));
        System.out.println(Student.counter);

    }
}