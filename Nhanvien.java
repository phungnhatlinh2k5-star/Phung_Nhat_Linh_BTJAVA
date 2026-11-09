import java.util.Scanner;

public class Nhanvien extends Nguoi {
    private int snct;
    private double hsl;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap so nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap he so luong: ");
        hsl = Double.parseDouble(sc.nextLine());
    }

    public double tinhLuong() {
        double lcb = 1500000;
        double phuCap = 200000 * snct;
        return lcb * hsl + phuCap;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So nam cong tac: " + snct);
        System.out.println("He so luong: " + hsl);
        System.out.printf("Tien luong: %,.0f VND%n", tinhLuong());
    }

    public int getSnct() {
        return snct;
    }
}
