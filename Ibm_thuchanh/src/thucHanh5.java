import java.util.Scanner;

public class thucHanh5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Mời bạn nhập số ");
        year = scanner.nextInt();
        if (year != 4) {
            System.out.println(year + " Không phải là năm nhuận");
        } else {
            if (year !=100 ) {
                System.out.println(year + " Là năm nhuận");
            } else {
                if (year !=400) {
                    System.out.println(year + " Không phải là năm nhuận");
                } else {
                    System.out.println(year + " Là năm nhuận");
                }
            }
        }
    }
}
