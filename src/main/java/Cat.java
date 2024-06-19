import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    public Cat() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return Objects.toString(name, String.valueOf(age));
    }
    public void setAge(String Age) {
    }
}

/* переменные класса private и имеют геттеры и сеттеры для доступа к ним.
Также класс имеет пустой конструктор, методы toString(), equals() и hashCode().
Класс также не наследуется от других классов или не реализует интерфейсы,
которые не являются POJO.
 */
