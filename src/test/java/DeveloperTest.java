import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    public Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Thomas", "JX2121C", 24000);
    }

    @Test
    public void hasName(){
        assertEquals("Thomas", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName("Jim");
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void shouldNotChangeName__ifNullValueEntered(){
        developer.setName("");
        assertEquals("Thomas", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JX2121C", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10);
        assertEquals(26400, developer.getSalary());
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(240, developer.payBonus());
    }
}
