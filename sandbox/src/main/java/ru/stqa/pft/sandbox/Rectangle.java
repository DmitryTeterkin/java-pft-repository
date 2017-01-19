package ru.stqa.pft.sandbox;

/**
 * Created by dteterkin on 19.01.2017. класс прямоугольник.
 */
public class Rectangle {
  public double a;
  public double b;

  public Rectangle (double a, double b) {
    this.a = a;
    this.b = b;
  }
  // функция вычисления площади прямоугольника
  public double area () {
    return this.a * this.b;
  }
}
