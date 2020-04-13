package Person;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student s3 = new Student(734782L, "Shuhei Hisagi", 7);
        Boolean test = s3 instanceof ILearner;
        Assert.assertTrue(test);
    }
    @Test
    public void testInheritance(){
        Student s3 = new Student(734782L, "Shuhei Hisagi", 7);
        Boolean test = s3 instanceof Person;
        Assert.assertTrue(test);
    }
    @Test
    public void testLearn(){
        Student s3 = new Student(734782L, "Shuhei Hisagi", 7);
        s3.learn(7);
        Assert.assertEquals(7, s3.getTotalStudyTime(), 1400);
    }


}
