import java.util.Scanner;

public class ChuViDienTichHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài (cm): ");
        Float CD = sc.nextFloat();
        System.out.print("Nhập chiều rộng (cm): ");
        Float CR = sc.nextFloat();
        Float CV = 2 * (CR + CD);
        System.out.println("Chu vi HCN là (cm): " + CV);
        Float DT = CD * CR;
        System.out.println("Diện tích HCN là (cm^2): " + DT);
        System.out.print("Cạnh nhỏ nhất là: " + Math.min(CD, CR));
    }
}