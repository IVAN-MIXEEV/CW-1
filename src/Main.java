public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.setEmployees(new Employee("Сара", "Конор", "Ивановна", 1, 10_000, 1));
        employeeBook.setEmployees(new Employee("Артем", "Майоров", "Сергеевич", 2, 12_000, 2));
        employeeBook.setEmployees(new Employee("Павел", "Комаров", "Дмитриевич", 3, 14_000, 3));
        employeeBook.setEmployees(new Employee("Мария", "Матвеева", "Вячеславовна", 4, 16_000, 4));
        employeeBook.setEmployees(new Employee("Ксения", "Воронова", "Николаевна", 5, 18_000, 5));
        employeeBook.setEmployees(new Employee("Всеволод", "Маркелов", "Владиславович", 1, 20_000, 6));
        employeeBook.setEmployees(new Employee("Кирилл", "Киличев", "Игоревич", 2, 22_000, 7));
        employeeBook.changeSalary("Конор", 50_000);
        employeeBook.changeDepartment("Конор", 4);
        employeeBook.printEmployeeByDepartment();
        employeeBook.printEmployee();
        employeeBook.printSalary();
        employeeBook.minSalary();
        employeeBook.maxSalary();
        employeeBook.midlSalary();
        employeeBook.printFIO();
        employeeBook.indexSalary();
        employeeBook.minSalaryInDepartment(3);
        employeeBook.maxSalaryInDepartment(3);
        employeeBook.salaryInDepartment(1);
        employeeBook.midlSlararyInDepartment(5);
        employeeBook.indexForDepartment(1, 5);
        employeeBook.printEmployeeForOneDepartment(5);
        employeeBook.salaryLessNumber(19000);
        employeeBook.salaryHigherNumber(18900);
    }
}