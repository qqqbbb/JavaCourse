package Homework_2dot2part1;

class Ravenclaw extends Hogwarts
{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int transfiguration, int intelligence, int wisdom, int wit, int creativity)
    {
        super.setName(name);
        super.setMagic(magic);
        super.setTransfiguration(transfiguration);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence()
    {
        return intelligence;
    }

    public int getWisdom()
    {
        return wisdom;
    }

    public int getWit()
    {
        return wit;
    }

    public int getCreativity()
    {
        return creativity;
    }

    @Override
    public String toString()
    {
        return "Ravenclaw " + getName() + ", magic " + getMagic() + ", transfiguration " + getTransfiguration()
                + ", intelligence " + intelligence + ", wisdom " + wisdom + ", wit " + wit + ", creativity " + creativity;
    }
    public void printBest(Ravenclaw[] arr)
    {
        int bestSum = 0;
        Ravenclaw best = null;
        for (int i = 0; i < arr.length; i++)
        {
            Ravenclaw r = arr[i];
            int sum = r.getCreativity() + r.getIntelligence() + r.getWisdom() + r.getWit();
            if (sum > bestSum)
            {
                bestSum = sum;
                best = r;
            }
        }
        if (best == null)
            return;
        System.out.println("Best Ravenclaw is " + best.getName());
    }
}
