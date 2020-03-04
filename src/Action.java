public class Action {

    private String name = "";
    private String id = "";
    private int age = 10;
    private String Address = "";

    public String showInfo() {
        String res = "ID：" + id + "  姓名：" + name + "  年龄：" + age;
        System.out.println(res);
        return  res;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
