package secondExercise;

/**
 * Created by dteterkin on 19.01.2017.
 * исполняемый файл
 */
public class segmentLength {

  public static void main(String[] args) {
// пункт 2 - 3  задания
    Point p1 = new Point(); // создаем точку 1
    Point p2 = new Point(); // создаем точку 2
    p1.x = 2.0;
    p1.y = 12.0;
    p2.x = -15.0;
    p2.y = -90.0;

    System.out.println("Расстояние между точками А(" + p1.x + "," + p1.y + ") и B(" + p2.x + "," + p2.y + ") = "+ Point.distance(p1, p2));
  // окончание пунктов 2 - 3

  }
 // */
/** раскоментарить для проверки пункта 4
// задаем координаты точек для метода
    Point p1 = new Point(0.0, 0.0);
    Point p2 = new Point(9.0, 0.0);

// вывод результата вычисления длины отрезка
    System.out.println("Расстояние между точками А("+ p1.x + "," + p1.y + ") и B(" + p2.x + "," + p2.y +") = " + Point.distance(p1, p2));
  }
*/
}
