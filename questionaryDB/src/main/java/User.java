public class User {
    private int id;
    private String name;
    private int age;
    private String car;
    private String color;

    public User(int id, String name, int age, String car, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.car = car;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", car='" + car + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
