public class people {
    private String Name;
    private int Age;

    public people(String name, int age) {
        Name = name;
        Age = age;
    }

    public people() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    @Override
    public String toString() {
        return "people{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
