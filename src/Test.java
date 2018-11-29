public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Freshman("Bob", 17);
        students[2] = new Sophomore("Alice", 18);
        students[1] = new Junior("Jack", 19);
        for (Student student : students){
            student.introduce();
        }
    }
}
