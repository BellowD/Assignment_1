public class Zoo {
    private String name;
    private String location;
    private int area;
    private String address;

    public Zoo(String name, String location, int area, String address){
        this.name = name;
        this.location = location;
        this.area = area;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getArea() {
        return area;
    }
    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setArea(int area) {
        if (area > 0) {
            this.area = area;
        }
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void info() {
        System.out.println(
                "Zoo name: " + name + "\n" +
                        "Location: " + location + "\n" +
                        "Address: " + address + "\n" +
                        "Area size: " + area
        );
    }
}
