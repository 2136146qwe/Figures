public abstract class Figure {
    private double a;

    public Figure(double a) {
        this.a = a;
    }

    public final double getA() {
        return a;
    }
    public abstract double area();
    public abstract String colour();
    public abstract String showInfo();

}

