import java.util.Scanner;

public class NhapHangTest {
    public NhapHang nhapHang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Tên hàng hóa: ");
        String ten = input.nextLine();
        System.out.print("Số lượng nhập: ");
        int soLuong = Integer.parseInt(input.nextLine());
        System.out.print("Giá nhập (VND): ");
        int giaNhap = Integer.parseInt(input.nextLine());
         System.out.print("Ngày nhập : ");
        String ngayNhap = input.nextLine();
        input.close();
        return new NhapHang(ten, soLuong, giaNhap, ngayNhap);
    }
}