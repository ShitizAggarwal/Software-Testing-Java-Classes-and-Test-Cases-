

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {
  
    @Test
    @FileParameters("src/Problem1TestCaseTable.csv")
    public void specialOrder(int testcase, boolean deepdish, double ordAmount, int numPizzas, boolean specialOrderStatus, double total, String comments) {
        Problem1Class p1 = new Problem1Class();
        p1.specialOrder(deepdish, ordAmount, numPizzas);
        Assert.assertEquals(total,p1.getTotal(),2);
        Assert.assertEquals(specialOrderStatus,p1.isSpecialOrderStatus());
    }
}
