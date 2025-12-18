public class Main {
    public static void main(String[] args) {
        Zoo shymzoo = new Zoo("zoopark Shymkent", "Shymkent", 54, "Baidibek bi, 113/a");
        Zookeeper askhat = new Zookeeper(1, "Askhat", "Breadwinner", 18, "Male");
        Animal aidos = new Animal("Aidos", 17, 1700, "Hippopotamus", "Male");
        Animal archi = new Animal("Archi", 18, 2000, "Hippopotamus", "Male");

        System.out.println("     About Zoo");
        shymzoo.info();

        System.out.println("     Employees");
        askhat.info();

        System.out.println("     Animals");
        aidos.info();
        archi.info();

        System.out.println();

        System.out.println("     Comparison");
        if(aidos.getAge() > archi.getAge()) {
            System.out.println(aidos.getName() + "(" + aidos.getAge() + ") is older than " + archi.getName() + "(" + archi.getAge() + ")");
        } else if (aidos.getAge() < archi.getAge()) {
            System.out.println(archi.getName() + "(" + archi.getAge() + ") is older than " + aidos.getName() + "(" + aidos.getAge() + ")");
        } else {
            System.out.println("Both animals have the same age");
        }

        if(aidos.getWeight() > archi.getWeight()) {
            System.out.println(aidos.getName() + "(" + aidos.getWeight() + " kg) is heavier than " + archi.getName() + "(" + archi.getWeight() + " kg)");
        } else if (aidos.getWeight() < archi.getWeight()) {
            System.out.println(archi.getName() + "(" + archi.getWeight() + " kg) is heavier than " + aidos.getName() + "(" + aidos.getWeight() + " kg)");
        } else {
            System.out.println("Both animals have the same weight");
        }
    }
}