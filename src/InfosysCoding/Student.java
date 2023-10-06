package InfosysCoding;

class Stu {

    int rollNo;
    String name;

    public Stu(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return getRollNo();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass()!= obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Stu s = (Stu) obj;
        return ((s.getRollNo() == this.getRollNo()) && (s.getName().equals(this.getName())));
    }

}

public class Student {

    public static void main(String[] args) {

        Stu stu = new Stu(1, "Himmat");
        Stu stu1 = new Stu(2, "Himmat");
        Stu stu2 = new Stu(1, "Himmat");

        boolean flag = stu.equals(stu2);

        System.out.println("First Object Equal "+flag);

        boolean flag1 = stu.equals(stu1);
        System.out.println("Second Object Equal "+flag1);

        System.out.println("Stu Object Hascode "+stu.hashCode());
        System.out.println("Stu1 Object Hascode "+stu1.hashCode());
        System.out.println("Stu2 Object Hascode "+stu2.hashCode());

    }
}
