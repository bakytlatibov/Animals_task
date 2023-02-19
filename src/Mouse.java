public class Mouse extends Animal{
    public Mouse(String name, int age) {
        super(name, age);
     } @Override
public String toString() {
    return "Mouse{" +
            "name='" + getName()+ '\'' +
            ", age='" + getAge() + '\'' +
            '}';
}}
