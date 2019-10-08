package com.epam.courses.java.fundamentals.intro.practice.task4;

import static java.lang.System.out;
/**
 * MaxFinder.
 */
public class MaxFinder {

  private double[] as;

  public MaxFinder(double... as) {
    this.as = as;
  }

  public double getMaximum() {

    double max = 0;
   for (int i = 1; i <= as.length; i++) {
     double temp = as[i]+as[i-1];
     out.println(temp);
     if (max < temp) {
       max = temp;
     }
   }
    return max;
  }
}
