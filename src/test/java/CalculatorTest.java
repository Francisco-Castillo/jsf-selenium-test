
import com.fcastillo.selenium.controller.CalculatorController;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fcastillo
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

  @InjectMocks
  CalculatorController calculatorController = new CalculatorController();

  @Test
  @DisplayName("Test Suma")
  public void testSuma() {
    assertEquals(3, calculatorController.sumar(1, 2), 0);
  }
}
