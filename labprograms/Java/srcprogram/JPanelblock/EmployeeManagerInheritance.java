package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;


import javax.swing.JOptionPane;

public class EmployeeManagerInheritance {
    public void EmployeeManagerDetails() {
        EmployeeDetails emp = new EmployeeDetails();
        emp.Name = "John Doe";
        emp.Salary = 75000.0;
        emp.Age = 30;
        emp.Place = "New York";
        emp.PNO = "123-456-7890";
        emp.Specializations = "Software Development, Project Management";
        emp.display();

        ManagerDetails mgr = new ManagerDetails();
        mgr.Name = "Jane Smith";
        mgr.Salary = 90000.0;
        mgr.Age = 40;
        mgr.Place = "Los Angeles";
        mgr.PNO = "098-765-4321";
        mgr.Department = "Human Resources";
        mgr.display();
    }
    
}

class Employee {
    public String Name;
    public Double Salary;
    public int Age;
    public String Place;
    public String PNO;
}
class EmployeeDetails extends Employee {
    String Specializations;

    void display() {
        String display =
        "FIELDNAME             | VALUE"+"\n"+
        "Name:            |" + Name+"\n"+
        "Salary:          |" + Salary+"\n"+
        "Age:             |" + Age+"\n"+
        "Place:           |" + Place+"\n"+
        "Phone Number:    |" + PNO+"\n"+
        "Specializations: |" + Specializations+"\n";

        JOptionPane.showMessageDialog(null, display);
    }
}
class ManagerDetails extends Employee {
    String Department;
    void display() {
        String display =
        "FIELDNAME             | VALUE"+"\n"+
        "Name:            |" + Name+"\n"+
        "Salary:          |" + Salary+"\n"+
        "Age:             |" + Age+"\n"+
        "Place:           |" + Place+"\n"+
        "Phone Number:    |" + PNO+"\n"+
        "Department:      |" + Department+"\n";

        JOptionPane.showMessageDialog(null, display);
    }
}
