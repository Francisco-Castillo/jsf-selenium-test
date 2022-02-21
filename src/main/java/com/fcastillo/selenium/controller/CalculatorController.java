/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.selenium.controller;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author fcastillo
 */
@Named(value = "calculatorController")
@SessionScoped
public class CalculatorController implements Serializable{

  private int numero1, numero2, result;

  public int getNumero1() {
    return numero1;
  }

  public void setNumero1(int numero1) {
    this.numero1 = numero1;
  }

  public int getNumero2() {
    return numero2;
  }

  public void setNumero2(int numero2) {
    this.numero2 = numero2;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sumar() {
    result = numero1 + numero2;
  }
}
