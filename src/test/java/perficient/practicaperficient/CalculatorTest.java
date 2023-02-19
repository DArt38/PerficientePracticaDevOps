package perficient.practicaperficient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculadora = new Calculator();

    @Test
    public void pruebaMultiplicacion(){
        int esperado = 20;
        int obtenido  = calculadora.multiplicacion(4,5);
        assertEquals(esperado,obtenido);
    }

    @Test
    public void pruebaDivision(){
        int obtenido = calculadora.division(10,5);
        assertEquals(2,obtenido);
    }
}
