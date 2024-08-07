package EmployeeManagement;

import java.util.ArrayList;

public class EmployeeManagement {

    ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee emp)
    {
        list.add(emp);
    }

    public void removeEmployee(int empId)
    {
        list.removeIf(emp -> emp.getId() == empId);
        
    }

    public void updateEmployee(int empId, String newAddress)
    {
        for(Employee a: list)
        {
            if(a.getId() == empId)
            {
                a.setAddress(newAddress);
                break;
            }
        }
    }

    public void displayEmployees()
   {
    for(Employee b: list)
    {
        System.out.println(b);
    }
   }

}


class Employee{
    int id;
    String name;
    String address;

    public Employee(int id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId(){

        return id;

    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee id = " + id + ", name = " + name + ", address = " + address;
    }

}


class EmployeeManagementTest
{
    public static void main(String[] args) {
        EmployeeManagement emp = new EmployeeManagement();

        emp.addEmployee(new Employee(101, "asdf", "asdf1"));
        emp.addEmployee(new Employee(102, "Rsdff", "asdfa1"));
        emp.addEmployee(new Employee(103, "asdf3", "asdff556"));

        emp.displayEmployees();
        System.out.println();

        emp.removeEmployee(102);
        emp.displayEmployees();
        System.out.println();

        emp.updateEmployee(103, "Gajuwaka");
        emp.displayEmployees();
        
    }
}
