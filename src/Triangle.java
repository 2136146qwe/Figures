public class Triangle extends Figure {
    private double b;
    private double c;
    private String colour = "blue";

public Triangle(double a, double b, double c){
    super(a);
    this.b=b;
    this.c=c;
}
    public Triangle(double size){
    super(size);
    this.b=size;
    this.c=size;
    }
    public double perimeter(){
    double p= (getA()+b+c)/2;
    return p;
}
    @Override
    public double area() {
    double s= perimeter()*(perimeter() - getA()) * (perimeter() - b)*(perimeter()-c);
        return Math.sqrt(s);
    }
    @Override
    public String colour() {
        return "голубой";
}

    @Override
    public String showInfo() {
        String result = "Фигура: треугольник, площадь: " + area()+ "ед.кв. Периметр = "  + perimeter()  + ". Цвет: " + colour() + "." ;
        return result;
    }
   // @Override
   // public String random() {
      //  int random = (int) (Math.random() * 5 + 1);
        //String result = String.format("Количество единиц %s ", random);
        //return result;
}
