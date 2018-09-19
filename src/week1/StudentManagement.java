package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup().equals(s2.getGroup()));
        //return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup(){
        // TODO:
        // Tao mang chua ten cua cac lop
        String[] a = new String[100];
        int k=0;
        for(int i=0; i<100; i++){
            if(students[i] != null) {
                int s = 0;
                for (int j = 0; j < k; j++) {
                    if (!(students[i].getGroup().equals(a[j]))) {
                        s++;
                    }
                }
                if (s == k) {
                    a[k] = students[i].getGroup();
                    k++;
                }
            }
        }
        // In danh sach sinh vien theo lop
        for(int j=0; j<k; j++) {
            System.out.println("Lop " + a[j] + " gom cac sinh vien: ");
            for (int i = 0; i < 100; i++) {
                if(students[i] != null) {
                    if (students[i].getGroup().equals(a[j])) {
                        System.out.println("Ten: " + students[i].getName());
                        System.out.println("MSSV: " + students[i].getId());
                        System.out.println("Email: " + students[i].getEmail());
                    }
                }
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        Student[] a = new Student[100];
        int j = 0;
        for (int i = 0; i < 100; i++) {
            if(students[i] != null ) {
                if ( !(students[i].getId().equals(id)) ){
                    a[j] = students[i];
                    j++;
                }
            }
        }
        students = a;
    }

    void addtolist(Student a, int i){
            students[i] = a;
    }

    public static void main(String[] args) {
        // TODO:
        //Bai2
        Student one = new Student();
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

        h.addtolist(g, 0);
        h.addtolist(e, 1);
        h.addtolist(c, 2);
        h.addtolist(f, 3);

        h.removeStudent("789");
        h.studentsByGroup();

    }
}
