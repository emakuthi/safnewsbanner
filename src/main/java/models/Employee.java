package models;

public class Employee {

    private int id;
    private String employeeName;
    private String ekNo;
    private String designation;
    private int taskId;
    private boolean completed;

    public Employee(String employeeName, String ekNo, String designation, int taskId) {
        this.id = id;
        this.employeeName = employeeName;
        this.ekNo = ekNo;
        this.designation = designation;
        this.taskId = taskId;
        this.completed = false;
    }


    public int getId() { return id;}

    public void setId(int id) { this.id = id; }

    public String getEmployeeName() { return employeeName; }

    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public String getEkNo() { return ekNo; }

    public void setEkNo(String ekNo) { this.ekNo = ekNo; }

    public String getDesignation() { return designation; }

    public void setDesignation(String designation) { this.designation = designation; }

    public int getTaskId() { return taskId; }

    public void setTaskId(int taskId) { this.taskId = taskId; }

    public boolean isCompleted() { return completed; }

    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if (completed != employee.completed) return false;
        if (id != employee.id) return false;
        if (taskId != employee.taskId) return false;
        return employeeName != null ? employeeName.equals(employee.employeeName) : employee.employeeName == null;
    }

    @Override
    public int hashCode() {
        int result = employeeName!= null ? employeeName.hashCode() : 0;
        result = 31 * result + (completed ? 1 : 0);
        result = 31 * result + id;
        result = 31 * result + taskId;
        return result;
    }
}
