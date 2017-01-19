package secondExercise;

/**
 * Created by dteterkin on 19.01.2017.
 *
 * Создаем класс Point для задания двух точек и функцию, которая будет его вычислять.
 */
public class Point {

  public double x; // координата точки по оси Х;
  public double y; // координата точки по оси Y;

  public static double distance(Point p1, Point p2) {

    return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
  }

/** раскоментарить для проверки пункта 4
 //  Конструктор для создания точек
  Point(double x, double y) {
    this.x = x;
    this.y = y;
 }
*/
}
