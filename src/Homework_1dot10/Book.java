package Homework_1dot10;

import java.util.Objects;

class Book
{
    private String name;
    private Author author;
    private int publishYear;

    public Book(String name, Author author, int publishYear)
    {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    @Override
    public String toString()
    {
        return  '\'' + name + '\'' +
                " was written by " + author +
                " and was published in " + publishYear +
                '.';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, author);
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
