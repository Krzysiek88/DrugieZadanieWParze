public class SubstractEquation implements ICalculable {
    private double liczba1;
    private double liczba2;

    public double calculate() {
        return liczba1 - liczba2;
    }

    public SubstractEquation(double liczba1, double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }

    public double getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(double liczba1) {
        this.liczba1 = liczba1;
    }

    public double getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(double liczba2) {
        this.liczba2 = liczba2;
    }
}
