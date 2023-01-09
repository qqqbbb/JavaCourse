package Homework_2dot2part1;

class Hufflepuff extends Hogwarts
{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transfiguration, int diligence, int loyalty, int honesty)
    {
        super.setName(name);
        super.setMagic(magic);
        super.setTransfiguration(transfiguration);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence()
    {
        return diligence;
    }

    public int getLoyalty()
    {
        return loyalty;
    }

    public int getHonesty()
    {
        return honesty;
    }

    @Override
    public String toString()
    {
        return "Hufflepuff " + getName() + ", magic " + getMagic() + ", transfiguration " + getTransfiguration()
                + ", diligence=" + diligence + ", loyalty " + loyalty + ", honesty " + honesty;
    }

    public void printBest(Hufflepuff[] arr)
    {
        int bestSum = 0;
        Hufflepuff best = null;
        for (int i = 0; i < arr.length; i++)
        {
            Hufflepuff h = arr[i];
            int sum = h.getDiligence() + h.getHonesty() + h.getLoyalty();
            if (sum > bestSum)
            {
                bestSum = sum;
                best = h;
            }
        }
        if (best == null)
            return;
        System.out.println("Best Hufflepuff is " + best.getName());
    }
}
