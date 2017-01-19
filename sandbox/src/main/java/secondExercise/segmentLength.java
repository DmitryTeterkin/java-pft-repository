package secondExercise;

/**
 * Created by dteterkin on 19.01.2017.
 * исполняемый файл
 */
public class segmentLength {

  public static void main(String[] args){

// задаем координаты точек
    Point p1 = new Point(0.0, 0.0);
    Point p2 = new Point(9.0, 0.0);

// вывод результата вычисления длины отрезка
    System.out.println("Расстояние между точками А("+ p1.x + "," + p1.y + ") и B(" + p2.x + "," + p2.y +") = " + Point.distance(p1, p2));
  }
}
