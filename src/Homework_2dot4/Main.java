package Homework_2dot4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("checkLogin " + check("qqq", "123", null));
        System.out.println(" power " + Math.pow(2,0.5));


    }


    public static boolean check(String login, String password, String confirmPassword)
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
//        String.valueOf(arr).matches("^\\w*$")
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
