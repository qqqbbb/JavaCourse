package Homework_2dot7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EmployeeBook
{
    private static HashMap<String, Employee> employees = new HashMap<>();

    public void addNewEmployee(String firstName, String middleName, String lastName, int department, int salary)
    {
        Employee newEmployee = new Employee(firstName, middleName, lastName, department, salary);
        employees.put(newEmployee.getFullName(), newEmployee);
        Employee.count ++;
    }

    public void removeEmployee(String firstName, String middleName, String lastName)
    {
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        Employee employee = employees.get(fullName);
        if (employee != null)
        {
            employees.put(fullName, null);
            Employee.count --;
        }
    }

    public void removeEmployee(int id)
    {
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
            Employee employee = entry.getValue();
            if (employee != null && employee.id == id)
            {
                employees.put(entry.getKey(), null);
                Employee.count --;
                return;
            }
        }
//        for (String key : employees.keySet())
//            System.out.println(key + ":" + employees.get(key));
//
//        for (Employee value : employees.values())
//            System.out.println(value);
    }

    public void modifyEmployeeData(String firstName, String middleName, String lastName, int newDepartment, int newSalary)
    {
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        Employee employee = employees.get(fullName);
        if (employee != null)
        {
            employee.setDepartment(newDepartment);
            employee.setSalary(newSalary);
        }
    }

    public void printEmployeesByDepartment()
    {
        HashMap<Integer, HashSet<Employee>> departmentEmployees = new HashMap<>();
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee != null)
            {
                HashSet<Employee> foundEmployees = departmentEmployees.get(employee.id);
                if (foundEmployees != null)
                    foundEmployees.add(employee);
                else
                    foundEmployees = new HashSet<>();

                foundEmployees.add(employee);
                departmentEmployees.put(employee.id, foundEmployees);
            }
        }
        for (Map.Entry<Integer, HashSet<Employee>> entry : departmentEmployees.entrySet())
        {
            System.out.println("Employees from department " + entry.getKey());
            for (Employee employee: entry.getValue())
                System.out.println(employee.getFullName());
        }
    }

    public void printEmployeesData()
    {
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            System.out.println(employee.toString());
        }
    }

    public void printMonthlySalaryTotal()
    {
        int total = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            total += employee.getSalary();
        }
        System.out.println("Total monthly salary: " + total);
    }

    public void printLowestSalary()
    {
        int lowest = (int)Double.POSITIVE_INFINITY;
        Employee lowestEmployee = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getSalary() < lowest)
            {
                lowest = employee.getSalary();
                lowestEmployee = employee;
            }
        }
        System.out.println(lowestEmployee.getFullName() + " is on the lowest monthly salary of " + lowest);
    }

    public void printHighestSalary()
    {
        int highest = 0;
        Employee highestEmployee = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getSalary() > highest)
            {
                highest = employee.getSalary();
                highestEmployee = employee;
            }
        }
        System.out.println(highestEmployee.getFullName() + " is on the highest monthly salary of " + highest);
    }

    public void printAverageSalary()
    {
        int sum = 0;
        int totalEmployees = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            sum += employee.getSalary();
            totalEmployees ++;
        }
        float average = sum / totalEmployees;
        System.out.println("Average monthly salary is " + average);
    }

    public void printEmployeesNames()
    {
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            System.out.println(employee.getFullName());
        }
    }

    public void changeSalary(float percent)
    {
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            int newSalary = (int)(employee.getSalary() * percent * .01f);
            employee.setSalary(newSalary);
        }
    }

    public void printLowestSalaryInDepartment(int department)
    {
        int lowest = (int)Double.POSITIVE_INFINITY;
        Employee lowestEmployee = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getDepartment() == department && employee.getSalary() < lowest)
            {
                lowest = employee.getSalary();
                lowestEmployee = employee;
            }
        }
        if (lowestEmployee == null)
        {
            System.out.println("No employees in department " + department);
            return;
        }
        System.out.println(lowestEmployee.getFullName() + " from " + department + " department is on the lowest monthly salary of " + lowest);
    }

    public void printHighestSalaryInDepartment(int department)
    {
        int highest = 0;
        Employee highestEmployee = null;
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getDepartment() == department && employee.getSalary() > highest)
            {
                highest = employee.getSalary();
                highestEmployee = employee;
            }
        }
        if (highestEmployee == null)
        {
            System.out.println("No employees in department " + department);
            return;
        }
        System.out.println(highestEmployee.getFullName() + " from " + department + " department is on the highest monthly salary of " + highest);
    }

    public void printSalaryTotalInDepartment(int department)
    {
        int total = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getDepartment() == department)
                total += employee.getSalary();
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
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getDepartment() == department)
            {
                employeesInDepartment ++;
                sum += employee.getSalary();
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
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getDepartment() == department)
            {
                int newSalary = (int)(employee.getSalary() * percent * .01f);
                employee.setSalary(newSalary);
            }
        }
    }

    public void printEmployeesDataInDepartment(int department)
    {
        System.out.println("Employees from department " + department);
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getDepartment() == department)
                System.out.println(employee.toString());
        }
    }

    public void printEmployeesWithSalaryLowerThan(int salary)
    {
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getSalary() < salary)
                System.out.println(employee.getFullName()  + "'s salary is lower than " + salary);
        }
    }

    public void printEmployeesWithSalaryHigherThan(int salary)
    {
        for (Map.Entry<String, Employee> entry : employees.entrySet())
        {
            Employee employee = entry.getValue();
            if (employee == null)
                continue;

            if (employee.getSalary() > salary)
                System.out.println(employee.getFullName() + "'s salary is higher than " + salary);
        }
    }

}
