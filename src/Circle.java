public class Circle extends Figure {

    private static final double PI = 3.14;

    public Circle(double a) {
        super(a);
    }

       public double radius() {
               double r = (getA() / 2);
               return r;
       }

        @Override
        public double area() {
            double s = (radius() * radius()) * PI;
            return s;
        }

        @Override
        public String colour () {
            return "оранжевый";
        }

        @Override
        public String showInfo () {
            String result = "Фигура: круг, площадь: " + area() + "ед.кв. " + " Радиус = " + radius() + ". Цвет: " + colour() + ".";
            return result;

        }
    }
