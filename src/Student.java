public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void introduce(){
        System.out.println("I'm a student");
    }
}
