package Animals;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal (String name, int age, double weight) {
        this(0, 0, 0, 0);
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // partial constructor
    public Animal(String name) {
        this(name, 0, 0. 0, 0);
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // abstract methods
    public abstract void eat();
    public abstract String getVoice();

    @Override
    public String toString() {
        return String.format("%s{name='%s', age=%d, weight=%.2f}",
                getClass().getSimpleName(), name, age, weight);
    }
}
