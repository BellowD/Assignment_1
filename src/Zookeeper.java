public class Zookeeper extends Person {
    private int employeeId;
    private String specialty;

    public Zookeeper(int employeeId, String name, String specialty, int age, String gender) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.specialty = specialty;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getSpecialty() {
        return specialty;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        }
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void info() {
        System.out.println(
                "Zookeeper ID: " + employeeId + "\n" +
                        "Name: " + name + "\n" +
                        "Gender: " + gender + "\n" +
                        "Age: " + age + "\n" +
                        "Specialty: " + specialty
        );
    }
}
