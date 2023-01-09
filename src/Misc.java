import java.util.Arrays;
import java.util.Collections;
public class Misc
{
    static String sss ;
    public static void main(String[] args)
    {
        String ss;
        System.out.println("sss " + sss);
        if (sss == null)
            System.out.println("ss null");

//        SolveBackpacpProblem();
    }
    public static void task1()
    {
        /*    Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
    Необходимо найти два числа, сумма которых равна −2.
    Напечатать эти числа в консоль.
            Подсказка
    Может потребоваться отсортировать массив с помощью Arrays.sort(arr).
    Критерии оценки
– Найдены два числа, удовлетворяющие условию задачи.
– При изменении значений массива в консоль выводится корректный результат.
– В консоль выведен результат решения задания.
            :death_star:  Задание 9  Очень сложно.
    Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.
    Критерии оценки
– Найдены все пары чисел, удовлетворяющие условию задачи.
            – При изменении значений массива в консоль выводится корректный результат.
– В консоль выведен результат решения задания.*/
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int j = 0;
        int k = 1;
        for (int i = 0; i < arr.length; ++i)
        {
            for (; j < arr.length; ++j)
            {
                if (i != j && arr[i] + arr[j] == -2){
                    System.out.println(arr[i] + " + " + arr[j] + " = -2");
                }
            }
            j = k;
            k++;
        }
    }
    public static void task2()
    {
 /*       Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка, вывести ping,
            а если число делится на 5 без остатка, вывести pong.
            Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
            Допускается наличие пустых строк в выводе.
        Вывод должен быть следующий:
        1:
        2:
        3: ping
        4:
        5: pong
        6: ping
        7:
        8:
        9: ping
        10: pong
        11:
        12: ping
        13:
        14:
        15: ping pong
        16:
        17:
        18: ping
        19:
        20: pong*/
        for(int i = 0; i <= 30; i++)
        {
            if (i % 3 == 0 && i % 5 == 0 )
                System.out.println(i + " ping pong");
            else if (i % 3 == 0)
                System.out.println(i + " ping");
            else if (i % 5 == 0)
                System.out.println(i + " pong");
        }
    }
    public static void task3()
    {
 /*
Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
– Каждое следующее число равняется сумме двух предыдущих.
Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
Должно получиться следующее:
0 1 1 2 3 5 8 13 21 34
*/
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i <= 8; i++)
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void task4()
    {
 /*
Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
 Постарайтесь заполнить обе диагонали в одном цикле.
*/
        int[][] matrix = new int[3][3];
//        for (int[] row : matrix) {
//            for (int column : row) {
//                row[column] = 1;
//                System.out.println("column " + column);
//            }
//        }
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = 1;
                System.out.println("matrix[" + i + "][" + j + "] = "
                        + matrix[i][j]);
            }
        }
    }
    public static void task5()
    {
 /*
У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
Нам дан массив чисел: {5, 4, 3, 2, 1}
Необходимо привести его к виду: {1, 2, 3, 4, 5}
Решите задачу с использованием дополнительного массива.
Напечатайте массив до преобразования и после с помощью
System.out.println(Arrays.toString(arr));

Решите предыдущее задание, но без использования дополнительного массива.
Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
Выведите результат программы в консоль тем же способом.
Уточнения:
Это задание не на сортировку.
Не использовать Arrays.sort() и другие способы сортировок.
*/
        int[] arr = {5, 4, 3, 2, 1};
//        for (int[] row : matrix) {
//            for (int column : row) {
//                row[column] = 1;
//                System.out.println("column " + column);
//            }
//        }
        for (int i = 0; i < arr.length / 2; i++)
        {
//            System.out.println("i " + i + " " + arr[i]);
            int v = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = v;
//            System.out.println("i " + i + " " + arr[i]);
        }
        for (int i = 0; i < arr.length ; i++)
            System.out.println("i " + i + " " + arr[i]);
    }
    public static void task6()
    {
 /*
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О.
на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
:bulb: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
*/
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = "";
        String middleName = "";
        String lastName = "";
        int space = -1;
        int space1 = -1;
        for (int i = 0; i < fullName.length(); i++)
        {
            char c = fullName.charAt(i);
            if (c == ' ')
            {
                if (space == -1)
                    space = i;
                else if (space1 == -1)
                    space1 = i;
            }
        }
        lastName = fullName.substring(0, space);
        firstName = fullName.substring(space + 1, space1);
        middleName = fullName.substring(space1 + 1);
        System.out.println("lastName " + lastName);
        System.out.println("firstName " + firstName);
        System.out.println("middleName " + middleName);
    }
    public static void task7()
    {
 /*
Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
*/
        String fullName = "ivanov ivan ivanovich";
        String firstName = "";
        String middleName = "";
        String lastName = "";
        int space = -1;
        int space1 = -1;
        for (int i = 0; i < fullName.length(); i++)
        {
            char c = fullName.charAt(i);
            if (c == ' ')
            {
                if (space == -1)
                    space = i;
                else if (space1 == -1)
                    space1 = i;
            }
        }
        char[] fullnameArray = fullName.toCharArray();
        fullnameArray[0] = Character.toUpperCase(fullnameArray[0]);
        fullnameArray[space + 1] = Character.toUpperCase(fullnameArray[space + 1]);
        fullnameArray[space1 + 1] = Character.toUpperCase(fullnameArray[space1 + 1]);
        fullName = new String(fullnameArray);
        System.out.println("fullName " + fullName);
    }
    public static void task8()
    {
 /*
Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль в формате: “Данные строки — ….”
*/
        String str = "135";
        String str1 = "246";
        String target = "123456";
        str += str1;
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < target.length(); j++)
        {
            char c = str.charAt(j);
//            int num = Character.getNumericValue(c);
//            System.out.println("num " + num);
//            for (int i = 0; i < str.length(); i++)
//            {
//                char cc = str.charAt(i);
//                if (c == cc)
//                    sb.append(c);
//            }
        }
        System.out.println("Данные строки — " + sb.toString());
    }
    public static void task9()
    {
 /*
Дана строка из букв английского алфавита "aabccddefgghiijjkk".
Нужно найти и напечатать буквы, которые дублируются в строке.
Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
В итоге в консоль должен быть выведен результат программы: "acdgijk".
*/
        String str = "aabccddefgghiijjkk";
        str.toString();
        char prev = ' ';
        for (int j = 0; j < str.length(); j++)
        {
            char c = str.charAt(j);
            if (c == prev)
                System.out.print("" + c);
            prev = c;
        }
    }


/*
*/

}
