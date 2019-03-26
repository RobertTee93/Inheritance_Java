import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    public Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Bob", "JC2435C", 27000, "Sales");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Jim");
        assertEquals("Jim", manager.getName());
    }

    @Test
    public void shouldNotChangeName__ifNullValueEntered(){
        manager.setName("");
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JC2435C", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(27000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.2);
        assertEquals(27324, manager.getSalary());
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(270, manager.payBonus());
    }

}
