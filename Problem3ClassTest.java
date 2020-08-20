import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

 @RunWith(JUnitParamsRunner.class)

 public class Problem3ClassTest {
	
	 private Problem3Class prb3;

	 @Before
	 public void setUp() throws Exception {
		 prb3 = new Problem3Class();
	}

	
	 @Test
	
	 @FileParameters("src/Problem3TestCaseTable.csv")
	
	 public void test(int boxInCarNum, int rrCarNum, int shipmentNum, int boxSum) {
	

		
		assertEquals(boxSum,prb3.calcPrevBoxNumber(boxInCarNum, rrCarNum, shipmentNum));

	
	}

}
