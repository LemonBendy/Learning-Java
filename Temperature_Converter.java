import java.util.Scanner;

// learnt on Warwick University Open Day 8/10/22

public class Temperature_Converter {
    public static void main(String args[]) {
    double iFdeg, iCdeg;
    System.out.print("Enter Fahrenheit temperature: ");
    Scanner scanner = new Scanner(System.in);
    iFdeg = scanner.nextInt();
    iCdeg = (iFdeg*9/5)-32;
    System.out.println("The Centigrade value is: " +iCdeg);
    if (iCdeg < 0){
        System.out.println("That's below the freezing point of water");
    else if (iCdeg == 100){
        System.out.println("That's boiling!!!");
    else
    }
    }
    }
}