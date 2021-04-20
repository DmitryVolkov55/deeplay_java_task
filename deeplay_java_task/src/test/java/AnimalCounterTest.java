import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class AnimalCounterTest  extends TestCase {
    List<Animal> animals = new ArrayList<>();
    @Override
    protected void setUp() throws Exception {

        animals.add(new Animal("ЛЕГКОЕ","МАЛЕНЬКОЕ","ВСЕЯДНОЕ"));
        animals.add(new Animal("ТЯЖЕЛОЕ","НЕВЫСОКОЕ","ТРАВОЯДНОЕ"));
        animals.add(new Animal("СРЕДНЕЕ","ВЫСОКОЕ","ТРАВОЯДНОЕ"));
        animals.add(new Animal("ТЯЖЕЛОЕ","НЕВЫСОКОЕ","ПЛОТОЯДНОЕ"));
        animals.add(new Animal("СРЕДНЕЕ","ВЫСОКОЕ","ВСЕЯДНОЕ"));
        animals.add(new Animal("ЛЕГКОЕ","МАЛЕНЬКОЕ","ПЛОТОЯДНОЕ"));

    }
    public void testAmountOfHerbivores(){
        int actual = AnimalCounter.amountOfHerbivores(animals);
        int expected = 2;
        assertEquals(expected,actual);
    }
    public void testAmountOfHerbOrCarnAndSmall(){
        int actual = AnimalCounter.amountOfHerbOrCarnAndSmall(animals);
        int expected = 1;
        assertEquals(expected,actual);
    }
    public void testAmountOfOmniAndLow(){
        int actual = AnimalCounter.amountOfOmniAndLow(animals);
        int expected = 1;
        assertEquals(expected,actual);
    }
}
