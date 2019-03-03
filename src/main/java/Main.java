import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę");
        double liczba1 = scanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę");
        double liczba2 = scanner.nextDouble();
        System.out.println("Wpisz komendę");


        switch (scanner.nextLine().toLowerCase()) {
            case "add":
                SumEquation dodawanie = new SumEquation(liczba1, liczba2);
                System.out.println(dodawanie.calculate());

                break;
            case "mul":
                MulEquasion mnozenie = new MulEquasion(liczba1, liczba2);
                System.out.println(mnozenie.calculate());

                break;

            case "div":
                DivEquasion dzielenie = new DivEquasion(liczba1, liczba2);
                System.out.println(dzielenie.calculate());

                break;

            case "sub":
                SubstractEquation odejmowanie = new SubstractEquation(liczba1, liczba2);
                System.out.println(odejmowanie.calculate());
                break;


        }

    }
}
