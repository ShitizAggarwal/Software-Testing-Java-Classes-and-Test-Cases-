
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {

    @Test
    @FileParameters("src/Problem2TestCaseTable.csv")
    public void calcTotal(int tc, boolean existingMember, boolean validDiscount, int memberPoints, double total, 
    		double expTotal) {
        Problem2Class problem2Class = new Problem2Class();
        double actual = problem2Class.calcTotal(total, existingMember,validDiscount, memberPoints);
        Assert.assertEquals(expTotal,actual,2);
    }
}