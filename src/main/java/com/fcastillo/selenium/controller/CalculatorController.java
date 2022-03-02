/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.selenium.controller;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author fcastillo
 */
@Named(value = "calculatorController")
@RequestScoped
public class CalculatorController implements Serializable {

  public int sumar(int numero1, int numero2) {
    return numero1 + numero2;
  }
}
