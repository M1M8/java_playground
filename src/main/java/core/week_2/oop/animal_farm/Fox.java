package core.week_2.oop.animal_farm;

public class Fox extends Animal
{
    public Fox(int legs)
    {
        super(legs);
    }

    @Override
    public String eat()
    {
        return "Anything, yum!";
    }
}
