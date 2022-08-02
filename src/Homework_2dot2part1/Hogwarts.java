package Homework_2dot2part1;

public class Hogwarts
{
    private String name;
    private int magic;
    private int transfiguration;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMagic()
    {
        return magic;
    }

    public void setMagic(int magic)
    {
        this.magic = magic;
    }

    public int getTransfiguration()
    {
        return transfiguration;
    }

    public void setTransfiguration(int transfiguration)
    {
        this.transfiguration = transfiguration;
    }

    public void printBest(Hogwarts h1, Hogwarts h2)
    {
        if (h1.getMagic() > h2.getMagic())
            System.out.println(h1.getName() + "'s magic is better than " + h2.getName() + "'s");
        else
            System.out.println(h2.getName() + "'s magic is better than " + h1.getName() + "'s");

        if (h1.getTransfiguration() > h2.getTransfiguration())
            System.out.println(h1.getName() + "'s transfiguration is better than " + h2.getName() + "'s");
        else
            System.out.println(h2.getName() + "'s transfiguration is better than " + h1.getName() + "'s");
    }
}

