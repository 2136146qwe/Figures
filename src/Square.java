public class Square extends Figure {

    public Square(double a){
     super(a);
    }

    @Override
    public double area() {
        return getA()*getA();
    }

    @Override
    public String colour() {
        return "красный";

    }

    @Override
    public String showInfo() {
        String result = "Фигура: квадрат, площадь: " + area()+ "ед.кв. Цвет " + colour() + ".";
        return result;
    }
}
