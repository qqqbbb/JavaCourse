package Homework_2dot2part1;

class Gryffindor extends Hogwarts
{

    private int nobility;
    private int honour;
    private int bravery;

    public int getNobility()
    {
        return nobility;
    }

    public int getHonour()
    {
        return honour;
    }

    public int getBravery()
    {
        return bravery;
    }

    public Gryffindor(String name, int magic, int transfiguration, int nobility, int honour, int bravery)
    {
        super.setName(name);
        super.setMagic(magic);
        super.setTransfiguration(transfiguration);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public String toString()
    {
        return "Gryffindor " + getName() + ", magic " + getMagic() + ", transfiguration " + getTransfiguration()
                + ", nobility " + nobility + ", honour " + honour + ", bravery " + bravery;
    }

    public void printBest(Gryffindor[] arr)
    {
        int bestSum = 0;
        Gryffindor best = null;
        for (int i = 0; i < arr.length; i++)
        {
            Gryffindor g = arr[i];
            int sum = g.getBravery() + g.getHonour() + g.getNobility();
            if (sum > bestSum)
            {
                bestSum = sum;
                best = g;
            }
        }
        if (best == null)
            return;
        System.out.println("Best Gryffindor is " + best.getName());
    }

}
