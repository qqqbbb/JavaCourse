public class Homework_1dot9
{
    public static void main(String[] args)
    {
        Author author1 = new Author("Author1FirstName", "Author1LastName");
        Book book1 = new Book("Book1Name", author1, 2020 );
        Author author2 = new Author("Author2FirstName", "Author2LastName");
        Book book2 = new Book("Book2Name", author1, 2020 );
        book2.setPublishYear(2022);
    }
}
class Book
{
    String name;
    Author author;
    int publishYear;

    public Book(String name, Author author, int publishYear)
    {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName()
    {
        return name;
    }

    public Author getAuthor()
    {
        return author;
    }

    public int getPublishYear()
    {
        return publishYear;
    }

    public void setPublishYear(int publishYear)
    {
        this.publishYear = publishYear;
    }
}


class Author
{
    String firstName;
    String lastName;

    public Author(String firstName,  String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
}