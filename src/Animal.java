public class Animal {
    private String name;
    private int age;
    private int weight;
    private String species;
    private String gender;

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


    public void setName(String name) {
        this.name = name;
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

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void info() {
        System.out.println(
                "Animal name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Gender: " + gender + "\n" +
                        "Weight in KG: " + weight + "\n" +
                        "Species: " + species
        );
    }
}
