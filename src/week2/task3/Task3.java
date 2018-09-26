
package week2.task3;

public class Task3 {
    public static void main(String[] args){
        XeMay a = new XeMay("Honda", "Wave Alpha", 110);
        a.thongTinXe();
        System.out.println(a.canBangA2());

        HocPhan b = new HocPhan("Lap trinh huong doi tuong", "Nguyen Van A", 4);
        b.thongTinHocPhan();
        System.out.println("Hoc phi: " + b.tienHocPhi() + ", Tien hoc cai thien: " + b.tienHocCaiThien());

        DiemThiTHPTQGKhoiA c = new DiemThiTHPTQGKhoiA(7, 8, 9);
        c.inDiem();
        System.out.println(c.tongDiem());
        c.monDiemCaoNhat();
    }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
// Class 1:
class XeMay{

    // Cac thuoc tinh:
    String HangXe, TenXe;
    int DungTichXiLanh;
    // Constructor:
    public XeMay(String hangxe, String tenxe, int dungtichxilanh){
        HangXe = hangxe;
        TenXe = tenxe;
        DungTichXiLanh = dungtichxilanh;
    }

    // Getter/Setter:
    public String getHangXe() {
        return HangXe;
    }

    public void setHangXe(String hangXe) {
        HangXe = hangXe;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String tenXe) {
        TenXe = tenXe;
    }

    public int getDungTichXiLanh() {
        return DungTichXiLanh;
    }

    public void setDungTichXiLanh(int dungTichXiLanh) {
        DungTichXiLanh = dungTichXiLanh;
    }

    // In ra thong tin xe
    public void thongTinXe(){
        System.out.println(HangXe + " " + TenXe + " " +DungTichXiLanh + "cc");
    }

    // Kiem tra xem xe co can bang A2 k(Neu dung tich xi lanh >150cc thi can bang A2)
    public boolean canBangA2(){
        return DungTichXiLanh > 150;
    }
}

// Class 2:
class HocPhan{

    // Cac thuoc tinh:
    String TenHocPhan, TenGiangVien;
    int SoTinChi;

    // Constructor:
    public HocPhan(String tenHocPhan, String tenGiangVien, int soTinChi){
        TenHocPhan = tenHocPhan;
        TenGiangVien = tenGiangVien;
        SoTinChi = soTinChi;
    }

    // Getter/Setter:
    public String getTenHocPhan() {
        return TenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        TenHocPhan = tenHocPhan;
    }

    public String getTenGiangVien() {
        return TenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        TenGiangVien = tenGiangVien;
    }

    public int getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        SoTinChi = soTinChi;
    }

    // In ra thong tin hoc phan
    public void thongTinHocPhan(){
        System.out.println("Ten hoc phan: " + TenHocPhan + " ,Ten giang vien: " + TenGiangVien + " ,So tin chi: " + SoTinChi);
    }

    // Tra lai so tien hoc phi
    public int tienHocPhi(){
        return SoTinChi*260000;
    }

    // Tra lai so tien hoc cai thien
    public int tienHocCaiThien(){
        return tienHocPhi() + tienHocPhi()/2;
    }
}

// Class 3:
class DiemThiTHPTQGKhoiA{
    // Cac thuoc tinh:
    int DiemToan, DiemLi, DiemHoa;

    // Constructor:
    public DiemThiTHPTQGKhoiA(int t, int l, int h){
        DiemToan = t;
        DiemLi = l;
        DiemHoa = h;
    }

    // Getter/Setter:

    public int getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(int diemToan) {
        DiemToan = diemToan;
    }

    public int getDiemLi() {
        return DiemLi;
    }

    public void setDiemLi(int diemLi) {
        DiemLi = diemLi;
    }

    public int getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(int diemHoa) {
        DiemHoa = diemHoa;
    }

    // In ra diem cac mon khoi A
    public void inDiem(){
        System.out.println("Diem toan: " + DiemToan + " ,Diem li: " + DiemLi +", Diem hoa: " + DiemHoa);
    }

    // Tra lai tong diem 3 mon
    public int tongDiem(){
        return DiemToan + DiemLi + DiemHoa;
    }
    // In ra ten mon diem cao nhat va so diem gia su 3 mon diem k bang nhau
    public void monDiemCaoNhat(){
        if(DiemToan > DiemLi && DiemLi > DiemHoa){
            System.out.println("Mon toan diem cao nhat: " + DiemToan + " diem.");
        }
        else if(DiemLi > DiemHoa){
            System.out.println("Mon li diem cao nhat: " + DiemLi + " diem.");
        }
        else{
            System.out.println("Mon hoa diem cao nhat: " + DiemHoa + " diem.");
        }
    }
}

