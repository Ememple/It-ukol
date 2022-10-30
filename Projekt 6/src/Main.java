import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte 1.spodní hodnotu, 2.horní hodnotu, 3. číslo ke kontrole");
    int hranice1 = sc.nextInt();
    int hranice2 = sc.nextInt();
    int cislo1 = sc.nextInt();
    Interval interval = new Interval(hranice1, hranice2, cislo1);

    System.out.println(interval.kontrolaHodnotyIntervalu() +" a "+ interval.kontrolaIntervalu());
    System.out.println("Zadejte 1.stranu A, 2.stranu B, 3.stranu C");
    int stranaA =sc.nextInt();
    int stranaB =sc.nextInt();
    int stranaC =sc.nextInt();


    Trojuhelnik trojuhelnik = new Trojuhelnik(stranaA, stranaB, stranaC);
    System.out.println(trojuhelnik.vypsaniRealnostiTrojuhelniku()+trojuhelnik.urceniTrojuhelniku());


    }
}