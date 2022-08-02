package Homework_2dot2part1;

class Slytherin extends Hogwarts
{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int willpower;

    public Slytherin(String name, int magic, int transfiguration, int cunning, int determination, int ambition, int resourcefulness, int willpower)
    {
        super.setName(name);
        super.setMagic(magic);
        super.setTransfiguration(transfiguration);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.willpower = willpower;
    }

    public int getCunning()
    {
        return cunning;
    }

    public int getDetermination()
    {
        return determination;
    }

    public int getAmbition()
    {
        return ambition;
    }

    public int getResourcefulness()
    {
        return resourcefulness;
    }

    public int getWillpower()
    {
        return willpower;
    }

    @Override
    public String toString()
    {
        return "Slytherin " + getName() + ", magic " + getMagic() + ", transfiguration " + getTransfiguration()
               + ",cunning " + cunning + ", determination " + determination + ", ambition " + ambition +
                ", resourcefulness " + resourcefulness + ", willpower " + willpower;
    }

    public void printBest(Slytherin[] arr)
    {
        int bestSum = 0;
        Slytherin best = null;
        for (int i = 0; i < arr.length; i++)
        {
            Slytherin s = arr[i];
            int sum = s.getAmbition() + s.getCunning() + s.getDetermination() + s.getResourcefulness() + s.getWillpower();
            if (sum > bestSum)
            {
                bestSum = sum;
                best = s;
            }
        }
        if (best == null)
            return;
        System.out.println("Best Slytherin is " + best.getName());
    }
}
