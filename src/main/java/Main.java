import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Wprowadź tekst: ");
    String tekst = scanner.nextLine();
    System.out.print("Tekst po zamianie: ");

    for( int i = 0; i < tekst.length(); i++){
      char znak = tekst.charAt(i);

      if(Character.isLowerCase(znak)){
        znak = Character.toUpperCase(znak);
      }else if(Character.isUpperCase(znak)){
        znak = Character.toLowerCase(znak);
      }
    System.out.print(znak);
    }
  System.out.println();
  }
}
