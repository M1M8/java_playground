package core.week_2.oop.animal_farm;

public abstract class Animal
{
    private int legs;

    public Animal(int legs)
    {
        this.legs = legs;
    }

    public abstract String eat();

    public void sleep()
    {
        System.out.println("I'm asleep");
    }

}
