import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner ac = new Scanner(file);
         Shape shape = new Shape();


         while (sc.hasNext()) {
             double x = sc.nextDouble();
             double y = sc.nextDouble();
             shape.addPoint(new Point(x , y));

         }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongest());

    }

}