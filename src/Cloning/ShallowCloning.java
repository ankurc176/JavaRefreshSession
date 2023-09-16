package Cloning;

class Courses {

    private String course_name;

    public Courses(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "course_name='" + course_name + '\'' +
                '}';
    }
}

class Student implements Cloneable{

    private int student_id;
    private String student_name;

    private Courses courses;

    public Student(int student_id, String student_name, Courses courses) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.courses = courses;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        Courses courses = new Courses("Math");
        Student student = new Student(1, "Himmat", courses);

        Student student1= null;

        student1 = (Student) student.clone();

        System.out.println("Original Object - "+student.getStudent_id()+" "+student.getStudent_name()+" "+student.getCourses());
        System.out.println("Clonable Object - "+student1.getStudent_id()+" "+student1.getStudent_name()+" "+student1.getCourses());

        System.out.println("------------------------------------");


        student1.getCourses().setCourse_name("MOM");
        student1.setStudent_id(4);
        student1.setStudent_name("OKO");

//        student.getCourses().setCourse_name("OKN");

        System.out.println("Original Object - "+student.getStudent_id()+" "+student.getStudent_name()+" "+student.getCourses());
        System.out.println("Clonable Object - "+student1.getStudent_id()+" "+student1.getStudent_name()+" "+student1.getCourses());

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

    }

}
