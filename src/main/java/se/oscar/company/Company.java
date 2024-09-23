package se.oscar.company;

public class Company {
    private String name;
    private String address;
    private Department department;

    public Company (String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Company [name=" + name + ", address=" + address + ", department=" + department + "]";
    }
}
