package basics.learnConstructor;

public class StudentDriver {

    public static void main(String[] args) {
        Student student1 = new Student("md123", "Md","Aziz");
        System.out.println("ID: " + student1.student_id + "\n" + "First Name: " + student1.first_name + "\n" + "Last Name: " + student1.last_name );

        Student student2 = new Student("mk123", "Mike","Tom", 'M');
        System.out.println("ID: " + student2.student_id + "\n" + "First Name: " + student2.first_name + "\n" + "Last Name: " + student2.last_name + "\n" + "Gender: " + student2.gender);
    }

}
