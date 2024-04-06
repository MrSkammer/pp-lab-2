import java.util.Scanner;
import java.util.Arrays;

public class zad1 {
    public static void main(String[] ars){
        Scanner scanner = new Scanner(System.in);
        
        double math, physics, history, english, chemistry;
        double suma = 0;
        
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

        double[] grades = {math, history, english, chemistry, physics};
        
        
        System.out.println("Czy chcesz dodać kolejną ocene? Y/N");
        scanner.nextLine();
        String answer = scanner.nextLine(); 
        while (answer.contains("Y")) {
            System.out.println("Podaj kolejną ocenę:");
            double newGrade = scanner.nextDouble();
            grades = Arrays.copyOf(grades, grades.length + 1);
            grades[grades.length - 1] = newGrade;
            System.out.println(Arrays.toString(grades));

            System.out.println("Czy chcesz dodać kolejną ocene? Y/N");
            scanner.nextLine();
            answer = scanner.nextLine(); 
        }
        
        for (int i = 0; i < grades.length; i++) {
            suma += grades[i];
        }
        System.out.println(suma);
        System.out.println(suma/grades.length);
    }    

}