package core.week_2.oop.animal_farm;

public class Dog extends Animal implements Canine
{

    public Dog(int legs) {
        super(legs);
    }

    @Override
    public String eat() {
        return null;
    }
}
