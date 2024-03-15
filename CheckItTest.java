import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CheckItTest {

    /**
     * PREDICATE
     */
    @Test
    public void test1(){
        assertTrue("P is true".equals(CheckIt.checkIt(true, true, true)));
    }
    @Test
    public void test2(){
        assertTrue("P isn't true".equals(CheckIt.checkIt(false, false, false)));
    }

    /**
     * Clause Coverage
     */
    @Test
    public void test3(){
        assertTrue("P is true".equals(CheckIt.checkIt(true, true, true)));
    }
    @Test
    public void test4(){
        assertTrue("P isn't true".equals(CheckIt.checkIt(false, false, false)));
    }

    /**
     * CACC
     */
    //major clause a
    @Test
    public void test5(){
        assertTrue("P is true".equals(CheckIt.checkIt(true, true, true)));
    }
    @Test
    public void test6(){
        assertTrue("P is true".equals(CheckIt.checkIt(true, true, false)));
    }
    @Test
    public void test7(){
        assertTrue("P is true".equals(CheckIt.checkIt(true, false, true)));
    }
    @Test
    public void test8(){
        assertTrue("P is true".equals(CheckIt.checkIt(true, false, false)));
    }
    //major clause b
    @Test
    public void test9(){
        assertTrue("P is true".equals(CheckIt.checkIt(false, true, true)));
    }
    //major clause c
    @Test
    public void test10(){
        assertTrue("P is true".equals(CheckIt.checkIt(false, true, true)));
    }

    /**
     * RACC
     */
    //major clause a
    @Test
    public void test11(){
        assertTrue("P is true".equals(CheckIt.checkIt(true, true, false)));
    }
    //major clause b
    @Test
    public void test12(){
        assertTrue("P isn't true".equals(CheckIt.checkIt(false, false, true)));
    }
    //major clause c
    @Test
    public void test13(){
        assertTrue("P isn't true".equals(CheckIt.checkIt(false, true, false)));
    }
} //end of test CheckIt
