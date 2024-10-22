public class Employee {
    private String fullName;
    private int department;
    private int salary;
    static int id = 1;
    private int developers;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.developers = id;
        id = id + 1;
    }

    public String getFullName(){
        return fullName;
    }

    public int getDepartment(){
        return department;
    }

    public int getSalary(){
        return salary;
    }

    public int getId(){
        return this.developers;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Зарплата должна быть больше 0");
        }
    }

    public void setDepartment(int department) {
        if (department >= 1 && department <= 5){
            this.department = department;
        } else {
            throw new IllegalArgumentException("Отдел должен быть от 1 до 5");
        }
    }

    public String toString() {
        return "ФИО сотрудника: " + getFullName() + " номер депортамента: " + getDepartment() + ", заработная плата: "
                + getSalary() + " какого id: " + developers;
    }

    public boolean equals(Employee employee) {
        return this.fullName.equals(employee.getFullName()) && this.department == employee.getDepartment();
    }

    public int hashCode(){
        return super.hashCode();
    }
}
