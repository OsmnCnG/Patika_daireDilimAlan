import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        int r;
        int alfa;double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap: ");
        r = input.nextInt();
        System.out.println("merkez açısı: ");
        alfa = input.nextInt();

        double Alan;
        Alan = (PI * (r^2) * alfa)/360;

        System.out.println("daireDilimininAlanı:" + Alan);





    }
}