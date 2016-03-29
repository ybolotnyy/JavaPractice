package com.byn.practice.ComplexNumbers;

/**
 * Created by BYN on 3/27/16.
 */
public class Complex {
  private final double re; // real part of complex number
  private final double im; // imaginary part of complex number

  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public void display() {
    String s;
    if (re == 0) s = String.format("%+.1fi", im);
    else s = String.format("%.1f%+.1fi", re, im);

    System.out.print(s);
  }
}
