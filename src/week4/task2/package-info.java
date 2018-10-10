/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;

class HoaQuan{
    int soLuong;
    String nguonGocXuatXu;

    public static void main(String[] args){
        Cam a = new Cam();
        a.soLuong = 300;
        Tao b = new Tao();
        b.soLuong = 100;
        System.out.print("So luong cam: " + a.soLuong);
    }
}

class Cam extends HoaQuan{
    int giaBan;

}

class Tao extends HoaQuan{

}

class CamThanhPhong extends  Cam{

}

class CamSanh extends Cam{

}