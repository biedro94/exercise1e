package wdsr.exercise1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Matchers.anyInt;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilSubtractionTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}

	@Test
	public void test3minus1() {
		
		doReturn(2).when(calculator).subtract(3,1);		
		String output = calcUtil.getSubstractionText(3, 1);
		assertEquals("3 - 1 = 2",output);
		verify(calculator).subtract(anyInt(),anyInt());
		
	}
}
