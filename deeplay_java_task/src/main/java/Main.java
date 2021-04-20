import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException  {
        final String path = "src/main/resources/animal.txt";
        List<String> file = Files.readAllLines(Paths.get(path));
        List<Animal> allAnimals = new ArrayList<>();
        for(String s : file){
            String[] animalProperties = s.split(",");
            allAnimals.add(new Animal(animalProperties[0],animalProperties[1],animalProperties[2]));
        }
        System.out.println("Количество травоядных животных: " + AnimalCounter.amountOfHerbivores(allAnimals));
        System.out.println("Количество травоядных или плотоядных, маленьких животных: " + AnimalCounter.amountOfHerbOrCarnAndSmall(allAnimals));
        System.out.println("Количество всеядных, не высоких животных: " + AnimalCounter.amountOfOmniAndLow(allAnimals));


    }
}
