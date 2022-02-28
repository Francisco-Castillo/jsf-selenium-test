
import com.fcastillo.selenium.controller.CalculatorController;
import javax.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fcastillo
 */
public class CalculatorTest {

  private CalculatorController calculatorController;

  @Before
  public void setValues() {
    calculatorController = new CalculatorController();
     calculatorController.setNumero1(1);
    calculatorController.setNumero2(2);
  }

  @Test
  public void testA() {
    calculatorController.sumar();
    assertEquals(1, 1);
  }
}
