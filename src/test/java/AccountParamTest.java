import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountParamTest {
    private final String testNameToEmboss;
    private final boolean verficatiobResultExpected;

    public AccountParamTest(String testNameToEmboss, boolean verficatiobResultExpected) {
        this.testNameToEmboss = testNameToEmboss;
        this.verficatiobResultExpected = verficatiobResultExpected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Арина Андриевская", true},
                {"Ив ан Петров", false},
                {"Иван Пет ров", false},
                {"Ив ан Пет ров", false},
                {" Иван Петров", false},
                {"Иван Петров ", false},
                {"ИванПетров", false},
                {" ИванПетров", false},
                {"ИванПетров ", false},
                {"Антон Коробков-Землянский", false},
                {"Анна-Мария Датская", true},
                {"И П", true},
                {"ИП", false},
                {"И ", false},
                {" П", false},
                {"П", false},
                {"", false},
                {"Timati", false},
                {"James Bond", true},
                {"Erich-Paul Remark", true}
        };
    }

    @Test
    public void nameToEmbossVerificationTest() {
        assertEquals(verficatiobResultExpected, new Account(testNameToEmboss).checkNameToEmboss());
        System.out.println("\"" + testNameToEmboss + "\" >> " + verficatiobResultExpected + " >> PASSED");
    }
}