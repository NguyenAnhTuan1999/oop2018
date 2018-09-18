package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name, id, group, email;

    // TODO: khai báo các phương thức getter, setter cho Student

    //get/set Name Method
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    //get/set Id Method
    public String getId(){
        return id;
    }
    public void setId(String i){
        id = i;
    }

    //get/set Group Method
    public String getGroup(){
        return group;
    }
    public void setGroup(String g){
        group = g;
    }

    //get/set Email Method
    public String getEmail(){
        return email;
    }
    public void setEmail(String e){
        email = e;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet.vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    String getInfo() {
        // TODO:
        return "Ten: " + getName() + "\n" +
               "MSSV: " + getId() + "\n" +
               "Lop: " + getGroup() + "\n" +
               "Email: " + getEmail();
        //return null; // xóa dòng này sau khi cài đặt
    }
}
