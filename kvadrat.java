import java.util.Scanner;

public class kvadrat {

    public static void main(String[] args) {
        System.out.print("Kvadrat tomonini kiriting");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double p=4*a;
        double s=a*a;
        System.out.println("Yuza="+s);
        System.out.println("perimetr="+p);
    }
}
