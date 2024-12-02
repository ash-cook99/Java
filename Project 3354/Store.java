public class Store {
    private String name;
    private String address;
   //constructor
    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }
   //getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    //getter
    public String getAddress() {
        return address;
    }
    //setter
    public void setAddress(String address) {
        this.address = address;
    }
}
