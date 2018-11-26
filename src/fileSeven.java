import java.util.Scanner;

public class fileSeven {

    public static void main(String[] args) {

        double radius,height,answer;

        Scanner chukua;
        chukua = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = chukua.nextDouble();

        Scanner weka;
        weka = new Scanner(System.in);
        System.out.println("Enter the height");
        height = weka.nextDouble();

        answer = Math.PI * Math.pow(radius,2) * height;
        System.out.println("Volume = " +answer);
    }

}
