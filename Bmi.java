import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
		for(int w = 1; w <= 2; w++){
                Scanner sc1 = new Scanner(System.in);
                System.out.println("身長:");
                double a = sc1.nextDouble();
                Scanner sc2 = new Scanner(System.in);
                System.out.println("体重:");
                double b = sc2.nextDouble();
                double bmi=(b/(a*a));
                System.out.println(String.format("%.2f",bmi));
        }
}
}
