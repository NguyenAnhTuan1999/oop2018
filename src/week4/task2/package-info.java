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

    // Thuoc tinh:
    int soLuong;
    int giaBan;
    String nguonGocXuatXu;

    // Getter/Setter:


    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNguonGocXuatXu() {
        return nguonGocXuatXu;
    }

    public void setNguonGocXuatXu(String nguonGocXuatXu) {
        this.nguonGocXuatXu = nguonGocXuatXu;
    }

    public static void main(String[] args){
        Cam a = new Cam();
        a.soLuong = 300;
        Tao b = new Tao();
        b.soLuong = 100;
        System.out.println("So luong cam: " + a.soLuong);
        System.out.println("So luong tao: " + b.soLuong);
    }
}

class Cam extends HoaQuan{

    // Thuoc tinh:
    boolean coHat;
    String mauSac;

    // Getter/Setter:


    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setCoHat(boolean coHat) {
        this.coHat = coHat;
    }

    // Phuong thuc kiem tra xem qua co hat hay k:
    public boolean isCoHat() {
        return coHat;
    }
}

class Tao extends HoaQuan{

    // Thuoc tinh:
    int trongLuongTBMoiQua;
    String mauSac;

    // Getter/Setter:

    public int getTrongLuongTBMoiQua() {
        return trongLuongTBMoiQua;
    }

    public void setTrongLuongTBMoiQua(int trongLuongTBMoiQua) {
        this.trongLuongTBMoiQua = trongLuongTBMoiQua;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
}

class CamThanhPhong extends  Cam{

    // Thuoc tinh:
    String trangThai;
    String hinhDang;

    // Getter/ Setter:

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhDang() {
        return hinhDang;
    }

    public void setHinhDang(String hinhDang) {
        this.hinhDang = hinhDang;
    }
}

class CamSanh extends Cam{

    // Thuoc tinh:
    boolean isFake;
    String vi;

    // Getter/Setter:

    public void setFake(boolean fake) {
        isFake = fake;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    // Phuong thuc kiem tra xem co phai qua fake hay k
    public boolean isFake() {
        return isFake;
    }
}