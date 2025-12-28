public class Hippopotamus extends Animal {

    public Hippopotamus(String name, int age, int weight, String gender) {
        super(name, age, weight, "Hippopotamus", gender);
    }
    @Override
    public void makeSound() {
        System.out.println("Hippopotamus makes a loud sound");
    }
}
