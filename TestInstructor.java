package Person;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void Implementation() {
        Instructor i1 = new Instructor(859649, "Ren Jinguji");
        Boolean test = i1 instanceof ITeacher;
        Assert.assertTrue(test);
    }

    @Test
    public void  testInheritance(){
        Instructor i1 = new Instructor(859649, "Ren Jinguji");
        Boolean test = i1 instanceof Person;
        Assert.assertTrue(test);


}
    @Test
    public void testTeach(){
        Instructor i1 = new Instructor(859649, "Ren Jinguji");
        Student s3 = new Student(734782L, "Shuhei Hisagi", 7);
        i1.teach(s3, 7);
        Assert.assertEquals(7, s3.getTotalStudyTime(), 1400);

    }
    @Test
    public void testLecture(){
        Instructor i1 = new Instructor(859649, "Ren Jinguji");
        Student s3 = new Student(734782L, "Shuhei Hisagi", 7);
        Student s1 = new Student(7438748L, "Kyosuke Kiryu", 5);
        Student[]classroom = {s3,s1};
        i1.lecture(classroom,9);
        Assert.assertEquals(4, s1.getTotalStudyTime(), 14000 );
    }








}
