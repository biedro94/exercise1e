package wdsr.exercise1;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doThrow;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilModuloTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testModuloByZero() {
		doThrow(new IllegalArgumentException()).when(calculator).modulo(anyInt(),eq(0));
		
		calcUtil.getModuloText(5, 0);
	}	
}
