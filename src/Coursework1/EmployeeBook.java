package Coursework1;

public class EmployeeBook
{
    private static Employee[] employees = new Employee[10];

    public void addNewEmployee(String firstName, String middleName, String lastName, int department, int salary)
    {
        Employee newEmployee = new Employee(firstName, middleName, lastName, department, salary);
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
            {
                employees[i] = newEmployee;
                break;
            }
        }
    }

    public void removeEmployee(String firstName, String middleName, String lastName)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getFirstName().equals(firstName) && employees[i].getMiddleName().equals(middleName) && employees[i].getLastName().equals(lastName))
            {
                employees[i] = null;
                employees[i].count--;
                break;
            }
        }
    }

    public void removeEmployee(int id)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getId() == id)
            {
                employees[i] = null;
                employees[i].count--;
                break;
            }
        }
    }

    public void modifyEmployeeData(String firstName, String middleName, String lastName, int newDepartment, int newSalary)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getFirstName().equals( firstName) && employees[i].getMiddleName().equals(middleName) && employees[i].getLastName().equals(lastName))
            {
                employees[i].setDepartment(newDepartment);
                employees[i].setSalary(newSalary);
                break;
            }
        }
    }

    public void printDepartmentsWithEmployees()
    {
        int[] departments = new int[employees.length];
        for (int i = 0; i < departments.length; i++)
            departments[i] = -1;
        // assuming department value cant be negative
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            boolean alreadyIn = false;
            for (int j = 0; j < departments.length; j++)
            {
                if (departments[j] == employees[i].getDepartment())
                    alreadyIn = true;
            }
            if (alreadyIn == true)
                continue;

            for (int j = 0; j < departments.length; j++)
            {
                if (departments[j] == -1)
                {
                    departments[j] = employees[i].getDepartment();
                    break;
                }
            }
        }
        for (int j = 0; j < departments.length; j++)
        {
            if (departments[j] == -1)
                continue;

            System.out.println("Employees from department " + departments[j]);
            for (int i = 0; i < employees.length; i++)
            {
                if (employees[i] == null)
                    continue;

                if (departments[j] == employees[i].getDepartment())
                    System.out.println(employees[i].getFullName());
            }
        }
    }

    public void printEmployeesData()
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            System.out.println(employees[i].toString());
        }
    }

    public void printMonthlySalaryTotal()
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

    public void printLowestSalary()
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

    public void printHighestSalary()
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

    public void printAverageSalary()
    {
        int sum = 0;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            sum += employees[i].getSalary();
        }
        float average = sum / employees.length;
        System.out.println("Average monthly salary is " + average);
    }

    public void printEmployeesNames()
    {
        int sum = 0;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            System.out.println(employees[i].getFullName());
        }
    }

    public void changeSalary(float percent)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            int newSalary = (int)(employees[i].getSalary() * percent * .01f);
            employees[i].setSalary(newSalary);
        }
    }

    public void printLowestSalaryInDepartment(int department)
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

    public void printHighestSalaryInDepartment(int department)
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

    public void printMonthlySalaryTotalInDepartment(int department)
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

    public void printAverageSalaryInDepartment(int department)
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
        float average = sum / employeesInDepartment;
        System.out.println("Average monthly salary in department " + department + " is " + average);
    }

    public void changeSalaryInDepartment(float percent, int department)
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

    public void printEmployeesDataInDepartment(int department)
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

    public void printEmployeesWithSalaryLowerThan(int salary)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getSalary() < salary)
            {
                System.out.println(employees[i].getFullName()  + "'s salary is lower than " + salary);
            }
        }
    }

    public void printEmployeesWithSalaryHigherThan(int salary)
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i] == null)
                continue;

            if (employees[i].getSalary() > salary)
            {
                System.out.println(employees[i].getFullName() + "'s salary is higher than " + salary);
            }
        }
    }

}
