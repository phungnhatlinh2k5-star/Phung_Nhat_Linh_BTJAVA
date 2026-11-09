import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nhanvien> ds = new ArrayList<>();

        System.out.print("Nhap so luong nhan vien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap nhan vien thu " + (i + 1));
            Nhanvien nv = new Nhanvien();
            nv.nhap(sc);
            ds.add(nv);
        }

        if (ds.isEmpty()) {
            System.out.println("Danh sach nhan vien rong!");
            sc.close();
            return;
        }

        int max = ds.get(0).getSnct();
        for (Nhanvien nv : ds) {
            if (nv.getSnct() > max) {
                max = nv.getSnct();
            }
        }

        System.out.println("\n=== NHAN VIEN CONG TAC LAU NHAT ===");
        for (Nhanvien nv : ds) {
            if (nv.getSnct() == max) {
                nv.xuat();
                System.out.println("------------------");
            }
        }

        ds.sort(Comparator.comparingDouble(Nhanvien::tinhLuong).reversed());

        System.out.println("\n=== DANH SACH LUONG GIAM DAN ===");
        for (Nhanvien nv : ds) {
            nv.xuat();
            System.out.println("------------------");
        }

        sc.close();
    }
}
