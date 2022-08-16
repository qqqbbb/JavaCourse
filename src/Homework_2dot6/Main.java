package Homework_2dot6;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 6, 3, 5, 4, 2, 4));
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("cat" , "dog", "cat", "duck"));
//        printOddNumbers(list);
//        printEvenNumbers(list);
//        printUniqueWords(wordList);
        printRepeatingWords(wordList);
    }

    public static void printOddNumbers(ArrayList<Integer> list)
    {
        for (Integer integer : list)
        {
            if (integer % 2 != 0)
                System.out.println(integer + " is odd ");
        }
    }

    public static void printUniqueWods(ArrayList<Integer> list)
    {
        Collections.sort(list);
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : list)
        {
            if (integer % 2 == 0 && !set.contains(integer))
            {
                System.out.println(integer + " is even ") ;
                set.add(integer);
            }
        }
    }

    public static void printUniqueWords(ArrayList<String> list)
    {
        HashSet<String> set = new HashSet<>();
        for (String s : list)
        {
            if (!set.contains(s))
            {
                System.out.println(s) ;
                set.add(s);
            }
        }
    }

    public static void printRepeatingWords(ArrayList<String> list)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : list)
        {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        for (String s: map.keySet())
        {
            int count = map.get(s);
            if (count > 1)
                System.out.println("\"" + s + "\""+ " repeats " + count + " times");
        }
    }
}
