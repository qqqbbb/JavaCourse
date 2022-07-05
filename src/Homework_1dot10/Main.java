package Homework_1dot10;

public class Main
{
    public static void main(String[] args)
    {
        Author author1 = new Author("Author1FirstName", "Author1LastName");
        Book book1 = new Book("Book1Name", author1, 2020 );
        Author author2 = new Author("Author2FirstName", "Author2LastName");
        Book book2 = new Book("Book2Name", author1, 2020 );
        book2.setPublishYear(2022);
        System.out.println( book2);
    }
}
