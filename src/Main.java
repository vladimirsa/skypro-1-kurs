import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Ivan", "Petr", "Sidor", "Vasya", "Kolya", "Masha", "Dasha", "Katya", "Vika", "Vova"};
    private final static String[] SURNAMES = {"Ivanov", "Petrov", "Sidorov", "Vasilev", "Kolyanov", "Mashin", "Dashin", "Katyan", "Vikin", "Vovin"};
    private final static String[] PATRONYMICS = {"Ivanovich", "Petrovich", "Sidorovich", "Vasilevich", "Kolyanovich", "Mashinovich", "Dashinovich", "Katyanovich", "Vikinovich", "Vovinovich"};

    private static final Employee[] EMPLOYEES = new Employee[10];


    private static void initEmployees() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " " +
                    NAMES[RANDOM.nextInt(0, NAMES.length)] + " " +
                    PATRONYMICS[RANDOM.nextInt(0, PATRONYMICS.length)];
            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(50_000, 100_000));
        }
    }

    public static void main(String[] args) {
        initEmployees();
        print();
        System.out.println("Сумма ЗП сотрудников: " + calculateSumOfSalaries());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП сотрудников: " + calculateAvarageOfSalaries());
        printFullNames();
    }

    private static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateAvarageOfSalaries() {
        return (double) calculateSumOfSalaries() / EMPLOYEES.length;
    }

    private static void printFullNames() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

}
