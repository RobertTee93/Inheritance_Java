import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    public Director director;


    @Before
    public void setUp(){
        director = new Director("Martin", "JX1111C", 90000, "Sales", 200000);
    }

    @Test
    public void hasName(){
        assertEquals("Martin", director.getName());
    }

    @Test
    public void canChangeName(){
        director.setName("Jim");
        assertEquals("Jim", director.getName());
    }

    @Test
    public void shouldNotChangeName__ifNullValueEntered(){
        director.setName("");
        assertEquals("Martin", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JX1111C", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(90000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(200000, director.getBudget(), 2);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1);
        assertEquals(90900, director.getSalary());
    }

    @Test
    public void shouldNotRaiseSalary__ifNegativeNumber(){
        director.raiseSalary(-1);
        assertEquals(90000, director.getSalary());
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(1800, director.payBonus());
    }

}
