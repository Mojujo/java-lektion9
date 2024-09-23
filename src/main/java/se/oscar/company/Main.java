package se.oscar.company;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Oscar", 43);
        Employee employee2 = new Employee("Stefan", 843);
        Department department = new Department("Microdata", "Refining");

        department.setEmployee(employee);
        department.setEmployee(employee2);

        Company company = new Company("Microsoft", "135 37 Avenue");
        company.setDepartment(department);

        System.out.println(company);
        System.out.println(company.getDepartment().getName());

        System.out.println(department.getEmployee().getName());
        System.out.println(department.getEmployee().getId());
    }
}
