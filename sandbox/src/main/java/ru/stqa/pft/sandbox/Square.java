package ru.stqa.pft.sandbox;

/**
 * Created by dteterkin on 19.01.2017. Класс квадрат
 */
public class Square {
  public double l;

  public Square (double l) {
    this.l = l;
  }
  public double area () {
    return this.l * this.l;
  }
}
