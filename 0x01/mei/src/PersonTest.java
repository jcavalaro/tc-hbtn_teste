import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;

    @BeforeEach
    public void setup(){
        Year year = Year.of(2000);
        Date date = Date.from(year.atDay(1).atStartOfDay(ZoneId.systemDefault()).toInstant());

        person = new Person("Paul", "McCartney", date, true, true, true);
    }

    @Test
    public void show_full_name(){
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary(){
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI(){
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI(){
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);
        assertFalse(person.isMEI());
    }


}
