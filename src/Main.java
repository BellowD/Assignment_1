import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Zoo shymzoo = new Zoo("Zoo Shymkent", "Shymkent", 54, "Baidibek bi, 113/A");
        Zookeeper askhat = new Zookeeper(1, "Askhat", "Breadwinner", 18, "Male");
        Animal aidos = new Hippopotamus("Aidos", 17, 1700, "Male");
        Animal archi = new Hippopotamus("Archi", 20, 2000, "Male");

        System.out.println("=== ABOUT ZOO ===");
        shymzoo.info();

        System.out.println("\n=== EMPLOYEES ===");
        askhat.info();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(aidos);
        animals.add(archi);

        System.out.println("\n=== ANIMALS ===");
        System.out.println(aidos);
        aidos.makeSound();
        System.out.println(archi);
        archi.makeSound();

        System.out.println("\n=== FILTER: weight > 1800 ===");
        for (Animal a : animals) {
            if (a.getWeight() > 1800) {
                System.out.println(a.getName() + " is heavier than 1800 kg");
            }
        }
        for (Animal a : animals) {
            if (a.getAge() >= 18) {
                System.out.println(a.getName() + " is over 18 years old");
            }
        }

        animals.sort(Comparator.comparingInt(Animal::getAge));

        System.out.println("\n=== SORTED BY AGE ===");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
