import java.util.Scanner;

public class TienDien {
    public static void main( String[] agrs ) {
        int tongTienDien = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Tổng số điện tháng này: ");
        int soDien = sc.nextInt();
        if ( soDien <= 50 ) {
            tongTienDien = soDien * 1678;
        } else {
            tongTienDien = 50 * 1678 + ( soDien - 50 ) * 2014;
        }
        System.out.println("Số tiền bạn phải đóng là: " + tongTienDien);
    }
}