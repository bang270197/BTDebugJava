import java.util.Scanner;

public class debug {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhap a :");
        double a=scanner.nextDouble();

        System.out.println("Nhap b :");
        double b=scanner.nextDouble();
        if (a!=0){
            double x =-b/a;
            System.out.println("Nghiem cua phuong trinh la"+x);
        }else {
            if (b==0){
                System.out.println("phuong trinh vo so nghiem");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
