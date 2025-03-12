package org.example.practicalWork2;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Петров Игорь Юрьевич", 24, "Разработка", 340000.7));
        employeeArrayList.add(new Employee("Комаров Никита Николаевич", 45, "Тестирование", 203734.5));
        employeeArrayList.add(new Employee("Старк Тони Петрович", 36, "Разработка", 999999.9));
        employeeArrayList.add(new Employee("Романов Наталья Сидоровна", 29, "Поддержка", 170745.3));
        employeeArrayList.add(new Employee("Калугин Тор Одинов", 759, "Тестирпование", 260847.8));

        employeeArrayList.stream().filter(employee -> employee.age > 30).forEach(System.out::println);
    }

    public static class Employee {
        private String fullName;
        private Integer age;
        private String department;
        private Double salary;

        @Override
        public String toString() {
            return "Employee{" +
                    "fullName='" + fullName + '\'' +
                    ", age=" + age +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public Employee(String fullName, Integer age, String department, Double salary) {
            this.fullName = fullName;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }
    }
}
