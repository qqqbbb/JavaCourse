package Homework_2dot4;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("checkLogin " + checkLogin("qqq", "123", null));
    }

    public static boolean checkLogin(String login, String password, String confirmPassword)
    {
        try
        {
            checkLogin(login);
            checkPassword(password, confirmPassword);
        }
        catch (WrongLoginException e)
        {
            return false;
        }
        catch (WrongPasswordException e)
        {
            return false;
        }
        return true;
    }

    public static void checkLogin(String login)
    {
        if (login == null || login.isEmpty() || login.length() > 20)
            throw new WrongLoginException();

        char[] charArr = login.toCharArray();
        for (char c: charArr)
        {
            if (Character.isDigit(c) || Character.isAlphabetic(c) || c == '_')
            {}
            else
                throw new WrongLoginException();
        }
    }

    public static void checkPassword(String password, String confirmPassword)
    {
        if (password == null || password.isEmpty() || password.length() >= 20 || !password.equals(confirmPassword))
            throw new WrongPasswordException();

        char[] charArr = password.toCharArray();
        for (char c: charArr)
        {
            if (Character.isDigit(c) || Character.isAlphabetic(c) || c == '_')
            {}
            else
                throw new WrongPasswordException();
        }
    }

}
