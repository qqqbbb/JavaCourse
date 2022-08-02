package Homework_2dot2part1;

public class Main
{
    public static void main(String[] args)
    {
        Gryffindor harry = new Gryffindor("Harry Potter", 77,66, 33,67, 76);
        Gryffindor hemione = new Gryffindor("Hermione Granger", 65,54, 44,56, 57);
        Gryffindor ron = new Gryffindor("Ron Weasley", 63,45, 68,76, 69);
        Slytherin draco = new Slytherin("Draco Malfoy", 53, 46, 88, 78, 83, 64, 68);
        Slytherin graham = new Slytherin("Graham Montague", 47, 42, 74, 63, 64, 57, 57);
        Slytherin gregory = new Slytherin("Gregory Goyle", 48, 41, 68, 61, 55, 63, 52);
        Hufflepuff zac = new Hufflepuff("Zacharias Smith", 52, 63, 74, 67, 64);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 46, 58, 63, 66, 74);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 57, 68, 77, 61, 60);
        Ravenclaw cho = new Ravenclaw("Cho Chang", 64, 42, 66, 53, 75, 69);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 70, 52, 69, 73, 53, 58);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 69, 50, 72, 78, 63, 64);
        System.out.println(harry);
        harry.printBest(new Gryffindor[]{harry,hemione,ron});
        harry.printBest(harry, draco);

    }
}
