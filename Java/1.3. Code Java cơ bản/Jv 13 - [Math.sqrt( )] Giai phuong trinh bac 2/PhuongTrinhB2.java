import java.util.Scanner;

public class PhuongTrinhB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2 : ax^2+bx+c=0");
        System.out.println("_________________________________________");
        System.out.println("Nhập 3 số a, b, c: ");
        System.out.print("a= ");
        double a = sc.nextDouble();
        System.out.print("b= ");
        double b = sc.nextDouble();
        System.out.print("c= ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                double KQ = -c / b;
                System.out.println("Phương trình có nghiệm duy nhất: " + KQ);
            }
        } else {
            double delTa = Math.pow(b, 2) - 4 * a * c;
            if (delTa == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm duy nhất: " + x);
            } else if (delTa > 0) {
                double x1;
                double x2;
                x1 = (-b + Math.sqrt(delTa)) / (2 * a);
                x2 = (-b - Math.sqrt(delTa)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt: ");
                System.out.println("\tx1 = " + x1);
                System.out.println("\tx2 = " + x2);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}