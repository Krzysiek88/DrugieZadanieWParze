public class MulEquasion implements ICalculable {
    public double calculate() {
        return mnożona1 * mnożona2;
    }
    private Double mnożona1 = 2.03;
    private Double mnożona2 = 5.06;

    public MulEquasion(Double mnożona1, Double mnożona2) {
        this.mnożona1 = mnożona1;
        this.mnożona2 = mnożona2;
    }

    @Override
    public String toString() {
        return "MulEquasion{" +
                "mnożona1=" + mnożona1 +
                ", mnożona2=" + mnożona2 +
                '}';
    }

    public Double getMnożona1() {
        return mnożona1;
    }

    public void setMnożona1(Double mnożona1) {
        this.mnożona1 = mnożona1;
    }

    public Double getMnożona2() {
        return mnożona2;
    }

    public void setMnożona2(Double mnożona2) {
        this.mnożona2 = mnożona2;
    }
}
