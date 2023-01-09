package Coursework1;

public class Main
{
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args)
    {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addNewEmployee("FirstName1", "MiddleName1", "LastName1", 0, 111);
        employeeBook.addNewEmployee("FirstName2", "MiddleName2", "LastName2", 1, 222);
        employeeBook.addNewEmployee("FirstName3", "MiddleName3", "LastName3", 0, 333);
        employeeBook.printEmployeesData();
        employeeBook.printLowestSalary();
        employeeBook.printHighestSalary();
        employeeBook.printAverageSalary();
        employeeBook.printAverageSalaryInDepartment(0);
        employeeBook.changeSalary(150);
        employeeBook.printLowestSalaryInDepartment(0);
        employeeBook.printEmployeesWithSalaryLowerThan(335);
//        employeeBook.removeEmployee(1);
        System.out.println("count " + Employee.getCount());
//        employeeBook.printEmployeesData();
        employeeBook.printDepartmentsWithEmployees();
    }

    public static void printEmployeesData()
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            System.out.println(employees[i].toString());
        }
    }

    public static void printMonthlySalaryTotal()
    {
        int total = 0;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            total += employees[i].getSalary();
        }
        System.out.println("Total monthly salary: " + total);
    }

    public static void printLowestSalary()
    {
        int lowest = (int)Double.POSITIVE_INFINITY;
        int employee = -1;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getSalary() < lowest)
            {
                lowest = employees[i].getSalary();
                employee = i;
            }
        }
        System.out.println(employees[employee].getFullName() + " is on the lowest monthly salary of " + lowest);
    }

    public static void printHighestSalary()
    {
        int highest = 0;
        int employee = -1;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getSalary() > highest)
            {
                highest = employees[i].getSalary();
                employee = i;
            }
        }
        System.out.println(employees[employee].getFullName() + " is on the highest monthly salary of " + highest);
    }

    public static void printAverageSalary()
    {
        int sum = 0;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            sum += employees[i].getSalary();
        }
        float average = (float)sum / (float)employees.length;
        System.out.println("Average monthly salary is " + average);
    }

    public static void printEmployeesNames()
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            System.out.println(employees[i].getFullName());
        }
    }

    public static void changeSalary(float percent)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            int newSalary = (int)(employees[i].getSalary() * percent * .01f);
            employees[i].setSalary(newSalary);
        }
    }

    public static void printLowestSalaryInDepartment(int department)
    {
        int lowest = (int)Double.POSITIVE_INFINITY;
        int employee = -1;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getDepartment() == department && employees[i].getSalary() < lowest)
            {
                lowest = employees[i].getSalary();
                employee = i;
            }
        }
        if (employee == -1)
        {
            System.out.println("No employees in department " + department);
            return;
        }
        System.out.println(employees[employee].getFullName() + " from " + employees[employee].getDepartment() + " department is on the lowest monthly salary of " + lowest);
    }

    public static void printHighestSalaryInDepartment(int department)
    {
        int highest = 0;
        int employee = -1;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getDepartment() == department && employees[i].getSalary() > highest)
            {
                highest = employees[i].getSalary();
                employee = i;
            }
        }
        if (employee == -1)
        {
            System.out.println("No employees in department " + department);
            return;
        }
        System.out.println(employees[employee].getFullName() + " from " + employees[employee].getDepartment() + " department is on the lowest monthly salary of " + highest);
    }

    public static void printMonthlySalaryTotalInDepartment(int department)
    {
        int total = 0;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getDepartment() == department)
                total += employees[i].getSalary();
        }
        if (total == 0)
        {
            System.out.println("No employees in department " + department);
            return;
        }
        System.out.println("Total monthly salary in " + department + " department is " + total);
    }

    public static void printAverageSalaryInDepartment(int department)
    {
        int sum = 0;
        int employeesInDepartment = 0;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getDepartment() == department)
            {
                employeesInDepartment ++;
                sum += employees[i].getSalary();
            }
        }
        if (employeesInDepartment == 0)
        {
            System.out.println("No employees in department " + department);
            return;
        }
        float average = (float)sum / (float)employeesInDepartment;
        System.out.println("Average monthly salary in department " + department + " is " + average);
    }

    public static void changeSalaryInDepartment(float percent, int department)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getDepartment() == department)
            {
                int newSalary = (int)(employees[i].getSalary() * percent * .01f);
                employees[i].setSalary(newSalary);
            }
        }
    }

    public static void printEmployeesDataInDepartment(int department)
    {
        System.out.println("Employees from department " + department);
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getDepartment() == department)
                System.out.println(employees[i].toString());
        }
    }

    public static void printEmployeesWithSalaryLowerThan(int salary)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getSalary() < salary)
                System.out.println(employees[i].getFullName() + "'s salary is lower than " + salary);
        }
    }

    public static void printEmployeesWithSalaryHigherThan(int salary)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getSalary() > salary)
                System.out.println(employees[i].getFullName() + "'s salary is higher than " + salary);
        }
    }


}
