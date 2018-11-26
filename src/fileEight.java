import java.util.Scanner;

public class fileEight {

    public static void main(String[] args) {

        double principle,rate,period,answer;

        Scanner chukua;
        chukua = new Scanner(System.in);
        System.out.println("Enter the principle");
        principle = chukua.nextDouble();

        Scanner weka;
        weka = new Scanner(System.in);
        System.out.println("Enter the rate");
        rate = weka.nextDouble();

        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter the period");
        period = in.nextDouble();

        answer = principle *rate/100 *period;
        System.out.println("Simple Interest = "+answer);

    }

}
