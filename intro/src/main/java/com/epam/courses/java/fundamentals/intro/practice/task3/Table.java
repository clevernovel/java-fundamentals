package com.epam.courses.java.fundamentals.intro.practice.task3;

import java.util.Arrays;

import static java.lang.Math.tan;
import static java.lang.System.out;

public class Table {

  private double start; //a
  private double end; // b
  private double step; // h

  public Table(double start, double end, double step) {

    if (end <= start)
      throw new RuntimeException("End value should be bigger than start, but it's not.");

    this.start = start;
    this.end = end;
    this.step = step;
  }

  static double[] getDataAndResultPair(double x) {
    return new double[]{x, function(x)};
  }

  static double function(double x) {
    return tan(2 * x) - 3;
  }

  public double[][] getTable() {
    return new double[0][0];
  }

  public static double[][] getTable(double start, double end, double step) {
    int size = 0;
    for (double temp = start; temp <= end; temp += step) {
      size++;
    }
    double[][] table = new double[size][2];
    double x = start;
    for (int i = 0; i < table.length; i++) {
      table[i][0] = x;
      table[i][1] = function(x);
      out.println(" " + Arrays.deepToString(table) + " ");
      out.println();
      x += step;
    }
    return table;
  }

  public static void main(String... __) {
    getTable(1, 4, 0.5);
  }
}
