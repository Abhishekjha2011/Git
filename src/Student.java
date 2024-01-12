public class Student {
    String first_name;
    String last_name;
    int rollno;

    Student(String name_f,String name_l, int roll_no){
        this.first_name = name_f;
        this.last_name = name_l;
        this.rollno = roll_no;
    }

    public void fetchDetail(){
        System.out.println(first_name+" "+last_name+" "+rollno);
    }


    public static void main(String[] args) {
        Student  a =new Student("Abhishek","Jha",54);
        a.fetchDetail();
    }
}



class Test{

}