package Person;


import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test

    public void testConstructor() {
        Person p1 = new Person(7438748L, "Kyosuke Kiryu");
        Assert.assertEquals(7438748, "Kyosuke Kiryu");
        Person p2 = new Person(723949L, "Dick Grayson");
        Assert.assertEquals(723949, "Dick Grayson");
        Person p3 = new Person( 734782L, "Shuhei Hisagi");
        Assert.assertEquals(734782, "Shuhei Hisagi");

    }
        @Test
        public void testSetName (){
        Person p3 = new Person(734782L, "Shuhei Hisagi");
        p3.setName("Shuu");
        Assert.assertEquals("Shuu", p3.getName());



        }


    }






