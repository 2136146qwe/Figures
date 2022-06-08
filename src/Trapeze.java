public class Trapeze extends Figure {
    private double b;
    private double c;
    private double d;
    private String colour = "зеленый";

    public Trapeze(double a, double b, double c, double d) {
        super(a);
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Trapeze(double size) {
        super(size);
        this.b = size;
        this.c = size;
        this.d = size;
    }
    public double high() {
        double h = Math.sqrt((c * c) - ((((getA() - b) * (getA() - b)) + (c * c) - (d * d)) / (2 * (getA() - b))) * ((((getA() - b) * (getA() - b)) + (c * c) - (d * d)) / (2 * (getA() - b))));
        return h;
    }

    @Override
    public double area() {
        double s = (getA() + b) / 2 * high();
        return s;
    }

    @Override
    public String colour() {
        return "зеленый";
    }

    @Override
    public String showInfo() {
        String result = "Фигура: трапеция, площадь: " + area()+ "ед.кв. Высота =  " + high() + ". Цвет: " + colour() + "." ;
        return result;
    }
}
