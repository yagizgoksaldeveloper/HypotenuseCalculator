import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        int ilkKenar, ikinciKenar;
        double hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.println("Üçgenin ilk kenar ölçüsünü giriniz. ");
        ilkKenar = input.nextInt();

        System.out.println("Üçgenin ikinci kenar ölçüsünü giriniz. ");
        ikinciKenar = input.nextInt();

        hipotenus = Math.sqrt((ilkKenar * ilkKenar) + (ikinciKenar * ikinciKenar));
        System.out.println(hipotenus);
    }
}
