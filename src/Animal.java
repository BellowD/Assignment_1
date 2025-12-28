public class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String species;
    protected String gender;

    public Animal(String name, int age, int weight, String species, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    @Override
    public String toString() {
        return name + " (" + species + ", " + age + " y.o.)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
