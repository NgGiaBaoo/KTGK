public class NhapHang {
    String ten;
    int soLuong;
    int giaNhap;
    String ngayNhap;

    public NhapHang(String ten, int soLuong, int giaNhap, String ngayNhap) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.ngayNhap = ngayNhap;
    }

    public int tinhTongTien() {
        return soLuong * giaNhap;
    }

    public void hienThiThongTin() {
        System.out.println("Tên hàng hóa: " + ten);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Giá nhập:  " + giaNhap + "VND");
        System.out.println("Ngày nhập: " + ngayNhap);
        System.out.println("Tổng tiền:  " + tinhTongTien() + "VND");
    }
}