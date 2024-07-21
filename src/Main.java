import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int leapyear;
        Scanner inp = new Scanner(System.in);
        System.out.println("**************Artık Yıl Hesaplama************");
        System.out.print("Yıl Giriniz: ");
        leapyear = inp.nextInt();

        if(leapyear % 4 == 0){
            System.out.println( leapyear+ " Artık Yıldır!");
        }
        else if(leapyear % 100 == 0){
          if(leapyear % 400 == 0) {
              System.out.println(leapyear + " Artık Yıldır!");
          }
        }
        else{
            System.out.println(leapyear +" Artık Yıl Değildir!");
        }
    }
}