package Person;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    void add(){
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person(3239839L, "Kalin");
        personList.add(p1);
        Assert.assertTrue(personList.contains(p1));

    }
    @Test
    void findById(){
        List<Person> pList = new ArrayList<>();
        Person p1 = new Person(3239839L, "Kalin");
        Person p2 = new Person(748924L, "Tokiya");

        People peopleTest = new People();
        Person p3 = new Person(4979347L, "Kairi");
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        Person find = peopleTest.findById(3L);

        boolean testing = false;
        Assert.assertEquals(p3, find);
    }
    @Test
    void removeObject(){
        List<Person> pList = new ArrayList<>();
        Person p3 = new Person(4979347L, "Kairi");
        pList.add(p3);
        pList.remove(p3);
        Assert.assertFalse(pList.contains(p3));
    }

}
