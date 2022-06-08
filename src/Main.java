import org.w3c.dom.css.Rect;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Figure [] figures = new Figure[4];
        figures[0]= new Triangle(7);
        figures[1]=new Square(8);
        figures[2]=new Circle(5);
        figures[3]=new Trapeze(9,7,4,4);
        for (int i = 0; i<4; i++) {
            int n = (int) Math.floor(Math.random() * figures.length);
            System.out.println(figures[n].showInfo());

    }
    }
}
