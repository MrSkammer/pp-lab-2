import java.util.Scanner;

public class zad1 {
    public static void main(String[] ars){
        Scanner scanner = new Scanner(System.in);
        
        double math, physics, history, english, chemistry;
        
        System.out.println("Podaj ocene z matematyki:");
        math = scanner.nextDouble();

        System.out.println("Podaj ocene z fizyki:");
        physics = scanner.nextDouble();

        System.out.println("Podaj ocene z historii:");
        history = scanner.nextDouble();

        System.out.println("Podaj ocene z angielskiego:");
        english = scanner.nextDouble();

        System.out.println("Podaj ocene z chemii:");
        chemistry = scanner.nextDouble();

        double average = (math + physics + history + english + chemistry)/5;
        System.out.println(average);
    }    
}