package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup() == s2.getGroup());
        //return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup(){
        // TODO:
        // Tao mang chua ten cua cac lop
        String[] a = new String[100];
        a[0] = students[0].getGroup();
        int k=1;
        for(int i=1; i<100; i++){
            int s=0;
            for(int j=0; j<k; j++){
                if(students[i].getGroup() != a[j]) {
                    s++;
                }
            }
            if(s == k){
                a[k] = students[i].getGroup();
                k++;
            }
        }
        // In danh sach sinh vien theo lop
        for(int j=0; j<k; j++) {
            System.out.println("Lop " + a[j] + " gom cac sinh vien: ");
            for (int i = 0; i < 100; i++) {
                if (students[i].getGroup() == a[j]){
                    System.out.println("Ten: " + students[i].getName());
                    System.out.println("MSSV: " + students[i].getId());
                    System.out.println("Email: " + students[i].getEmail());
                }
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        Student[] a = new Student[100];
        int j=0;
        for(int i=0; i<100; i++){
            if(students[i].getId() != id){
                a[j] = students[i];
                j++;
            }
        }
        students = a;
//        for(int i=0; i<100; i++){
//            if(students[i].getId() == id){
//                students[i].setName(null);
//                students[i].setId(null);
//                students[i].setGroup(null);
//                students[i].setEmail(null);
//            }
//        }
    }

//    void addtolist(Student a, int begin, int end){
//        for(int i=begin; i<=end; i++){
//            students[i] = a;
//        }
//    }
//
//    void geth(int i){
//        System.out.println(students[i].getName() + "\n" + students[i].getId());
//    }

    public static void main(String[] args) {
        // TODO:
        //Bai6
        Student a = new Student();
        a.setName("Tuan");
        a.setId("17021104");
        a.setGroup("K62-C-E");
        a.setEmail("anhtuansn1999@gmail.com");
        System.out.println("Ten sinh vien: " + a.getName());
        System.out.println(a.getInfo());

        //Bai8
        Student b = new Student();
        System.out.println(b.getInfo());

        Student c = new Student("Tuyen", "1508", "ndt@gmail.com");
        System.out.println(c.getInfo());

        Student d = new Student(c);
        System.out.println(d.getInfo());

        //Bai10
        Student e = new Student("Van", "123", "e@gmail.com");
        Student f = new Student("Toan", "456", "f@gmail.com");
        Student g = new Student("Viet", "789", "g@gmail.com");
        g.setGroup("INT22042");
        StudentManagement h = new StudentManagement();
        System.out.println(h.sameGroup(e, f));
        System.out.println(h.sameGroup(f, g));

//        h.addtolist(f, 0, 0);
//        h.addtolist(g, 1, 50);
//        h.addtolist(e, 51, 60);
//        h.addtolist(f, 61, 99);
//        h.studentsByGroup();
//        h.removeStudent("123");
//        for(int i=0; i<60; i++){
//            h.geth(i);
//            System.out.println(i);
//        }

    }
}
