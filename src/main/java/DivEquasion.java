public class DivEquasion implements ICalculable {
    public double calculate() {
        return liczba1 / liczba2;
    }

    private Double liczba1 = 5.06;
    private Double liczba2 = 4.02;

    @Override
    public String toString() {
        return "DivEquasion{" +
                "liczba1=" + liczba1 +
                ", liczba2=" + liczba2 +
                '}';
    }

    public Double getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(Double liczba1) {
        this.liczba1 = liczba1;
    }

    public Double getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(Double liczba2) {
        this.liczba2 = liczba2;
    }

    public DivEquasion(Double liczba1, Double liczba2) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
    }


}
