import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj prędkość w m/s: ");
        double predkoscMS = scanner.nextDouble();

        double predkoscKMH = predkoscMS * 3.6;

        
        System.out.println("Prędkość w km/h: " + predkoscKMH);
        
    
    }
}
