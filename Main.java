import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double normal;
      Scanner scanner =new Scanner(System.in);
      System.out.println("KDV siz sayıyı giriniz:");
      normal= scanner.nextDouble();
      System.out.println(normal);
      boolean gecer =normal>1000;
      double kdvmiktar= gecer ? 0.08 : 0.18;
      double kdvtutar=normal*kdvmiktar;
      System.out.println("KDV tutarı:"+kdvtutar);
      double kdv=kdvtutar+normal;
      System.out.println("Toplam:"+kdv);

    }
}