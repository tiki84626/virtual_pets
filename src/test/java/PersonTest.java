import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;

public class PersonTest {

  @Test
  public void person_instantiatesCorrectly_true() {
    Person testPerson = new Person("Henry", "henry@henry.com");
    assertEquals(true, testPerson instanceof Person);
  }

  @Test
  public void save_insertsObjectIntoDatabase_Person() {
    Person testPerson = new Person("Henry", "henry@henry.com");
    testPerson.save();
    assertTrue(Person.all().get(0).equals(testPerson));
  }

  @Test
  public void equals_returnsTrueIfNameAndEmailAreSame_true() {
    Person firstPerson = new Person("Henry", "henry@henry.com");
    Person anotherPerson = new Person("Henry", "henry@henry.com");
    assertTrue(firstPerson.equals(anotherPerson));
  }


}
