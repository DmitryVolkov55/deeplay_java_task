import java.util.List;

public  class AnimalCounter {
    public static int amountOfHerbivores(List<Animal> animals){
        int count = 0;
        for(Animal a : animals){
            if(a.getType().equals("ТРАВОЯДНОЕ")){
                count++;
            }
        }
        return count;
    }

    public static int amountOfHerbOrCarnAndSmall(List<Animal> animals){
        int count = 0;
        for(Animal a : animals){
            if(!a.getType().equals("ВСЕЯДНОЕ") && a.getHeight().equals("МАЛЕНЬКОЕ")){
                count++;
            }
        }
        return count;
    }

    public static int amountOfOmniAndLow(List<Animal> animals){
        int count = 0;
        for(Animal a : animals){
            if(!a.getHeight().equals("ВЫСОКОЕ") && a.getType().equals("ВСЕЯДНОЕ")){
                count++;
            }
        }
        return count;
    }

}
