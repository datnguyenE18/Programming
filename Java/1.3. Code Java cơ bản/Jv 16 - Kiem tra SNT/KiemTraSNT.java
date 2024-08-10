import java.util.Scanner;

public class KiemTraSNT {
    public static void main( String[] args ) {
        System.out.println("CHƯƠNG TRÌNH KIỂM TRA SNT");
        System.out.println("================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên X cần kiểm tra: ");
        int X = sc.nextInt();
        if ( X <= 0 ) {
            System.out.println( X + " không phải SNT");
            System.exit(0);
        } else if ( X != 0 ) {
            for ( int i = 2; i < X; i++ ) {
                if ( X % i == 0 ) {
                    System.out.print( X + " không phải là SNT");
                    System.exit(0);
                }
            }
        }
        System.out.print( X + " là SNT");
    }
}
