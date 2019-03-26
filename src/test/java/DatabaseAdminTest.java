import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    public DatabaseAdmin dbAdmin;

    @Before
    public void setUp() {
        dbAdmin = new DatabaseAdmin("Thomas", "JX2121C", 24000);
    }

    @Test
    public void hasName() {
        assertEquals("Thomas", dbAdmin.getName());
    }

    @Test
    public void canChangeName(){
        dbAdmin.setName("Jim");
        assertEquals("Jim", dbAdmin.getName());
    }

    @Test
    public void shouldNotChangeName__ifNullValueEntered(){
        dbAdmin.setName("");
        assertEquals("Thomas", dbAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JX2121C", dbAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(24000, dbAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(10);
        assertEquals(26400, dbAdmin.getSalary());
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(240, dbAdmin.payBonus());
    }
}