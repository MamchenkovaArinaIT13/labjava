import java.util.List;

public class Employee {

  // Поля
  private String name;
  private Departament departament;
  
  //Конструкторы
  public Employee() {
    this.name = null;
    this.departament = null;
  }

  public Employee(String name, Departament departament) {
    this.name = name;
    this.departament = departament;
    if (departament != null) {
      departament.addEmployee(this);
    }
  }

  //Геттеры и сеттеры
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  //Метод to_string
  @Override
  public String toString() {
    String managerName = (departament != null && departament.getManager() != null)
            ? departament.getManager().getName() : "не назначен";
    String departmentName = (departament != null) ? departament.getName1() : "не указан";

    return this.name + " работает в отделе " + departmentName
            + ", начальник которого " + managerName;
  }

  // Метод для получение всех сотрудников по ссылке
  public List<Employee> getAllDepartmentEmployees() {
    return departament.getEmployees();
  }
}
