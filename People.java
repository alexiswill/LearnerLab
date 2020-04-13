package Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{

    List<Person>personList = new ArrayList<>();

    public void add(Person r){
        personList.add(r);
    }
    public Person findById(Long id) {
        for (Person person : personList) {
            if (person.getId().equals(id))
                return person;
        }
        return null;

    }
    public boolean contains(Person r){
        return personList.contains(r);
    }
    public void remove(Person r){
            personList.remove(r);
    }
    public void remove(Long id){
        personList.remove(id);
    }
    public void removeAll(List<Person> p){
        personList.removeAll(p);
    }
    public int count(){
        return personList.size();
    }
    public Person[] toArray(){
        Person[] p2 = (Person[]) personList.toArray();
            return p2;
    }





    @Override
    public Iterator iterator() {
        return this.personList.iterator();
    }
}
