import java.util.Scanner;

public class TheTichKhoiLapPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh (cm): ");
        Float canh = sc.nextFloat();
        System.out.println("Thể tích khối lập phương là (cm^3): " + Math.pow(canh,3));
    }
}