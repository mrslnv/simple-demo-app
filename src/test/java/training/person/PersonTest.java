package training.person;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import training.account.Account;
import training.common.TestEnvHelper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class PersonTest {

// story 1003

    @Rule
    public TestName name = new TestName();

    TestEnvHelper testEnvHelper = TestEnvHelper.TEST_ENV_HELPER;

    @Test
    public void personApiTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = new Account("persu", "persp", "persr");
        assertEquals(a.getUsername(), "persu");
        assertEquals(a.getPassword(), "persp");
        assertEquals(a.getRole(), "persr");
    }

    @Test
    public void personEqualsTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = new Account("persua", "persp", "persr");
        Account b = new Account("persu", "persp", "persr");
        assertEquals(a, b);
    }

    @Test
    public void personNotEqualsTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = new Account("1persu", "persp", "persr");
        Account b = new Account("persu", "persp", "persr");
        assertNotSame(a, b);

        a = new Account("persu", "persp", "persr");
        b = new Account("persu", "persp1", "persr");
        assertNotSame(a, b);

        a = new Account("persu", "persp", "persr");
        b = new Account("persu", "persp", "persr1");
        assertNotSame(a, b);

        a = new Account("persu1", "persp", "persr");
        b = new Account("persu", "persp", "persr1");
        assertNotSame(a, b);
    }

    @Test
    public void personNotEqualsTest2() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = new Account("1persu", "persp", "persr");
        Account b = new Account("persu", "persp", "persr");
        assertNotSame(a, b);

        a = new Account("persu", "persp", "persr");
        b = new Account("persu", "persp1", "persr");
        assertNotSame(a, b);

        a = new Account("persu", "persp", "persr");
        b = new Account("persu", "persp", "persr1");
        assertNotSame(a, b);

// story 1004
        if (true) throw new RuntimeException("This test is failing now");

        a = new Account("persu1", "persp", "persr");
        b = new Account("persu", "persp", "persr1");
        assertNotSame(a, b);
    }

    @Test
    public void personEquals2AccountsTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a, b = null;
        a = new Account("persua", "persp", "persr");
        if (Math.random() > 0.5)
            b = new Account("persu", "persp", "persr");
        assertEquals(a, b);
    }

    @Test
    public void personEqualsCornerCasesTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a, b = null;
        a = null;
        if (Math.random() > 0.5)
            b = new Account("persu", "persp", "persr");
        assertEquals(a, b);
    }

    @Test
    public void personToStringTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = null;
        if (Math.random() > 0.5)
            a = new Account("persu", "persp", "persr");
        assertEquals("persu", a.toString());
    }

    @Test
    public void personPersistencyTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = null;
        if (Math.random() > 0.3)
            a = new Account("persu", "persp", "persr");
        assertEquals("persu", a.toString());
    }

    @Test
    public void personHashTest() {
        if (testEnvHelper.successfulRun())
            return;
        Account a = new Account("persu", "persp", "persr");
        Account b = new Account("persu", "persp", "persr");
        assertEquals(a.hashCode(), b.hashCode());
    }


}
      
   
   
   
   
   
   
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
