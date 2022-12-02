package Kdvhesapalama;
import java.util.Scanner;

public class Kdvhesapalam {
    public static void main(String[] args) {
    
    double hesap;
    double kdv1= 0.18;
    double kdv2=0.08;
    Scanner inp = new Scanner(System.in);
    System.out.print("Tutarı giriniz");
    hesap =inp.nextDouble();

    double kdvtutar=kdv1*hesap;
    kdvtutar =hesap>0 && hesap<=1000 ? hesap*kdv1:hesap*kdv2 ;
    
    double kdvlitutar= hesap+kdvtutar;
    System.out.println("kdvli tutar : "+ kdvlitutar);


}
}