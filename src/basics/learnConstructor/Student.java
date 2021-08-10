package basics.learnConstructor;

public class Student {
    String student_id;
    String first_name;
    String last_name;
    char gender;
    int age;

    public Student(String student_id, String first_name, String last_name){
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Student(String student_id, String first_name, String last_name, char gender){
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
    }
}
