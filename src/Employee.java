public class Employee {

    private static int idGenerator = 1;

    private final int id;
    private final String fullName;
    private int department;
    private int salary;


    public Employee(String fullName, int department, int salary) {
        id = idGenerator++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary;
    }
}

//Создать класс Employee, который содержит информацию о ФИО, отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//Добавить статическую переменную-счетчик, которая будет отвечать за id.
//Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//Скрыть прямой доступ к полям класса Employee и добавить возможность получать значения полей
//        (геттеры) и устанавливать значения полей отдела и зарплаты (сеттеры).
//Реализовать в классе Employee контракты equals и hashCode.
//По-умолчанию все поля должны передаваться через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//Создать внутри класса Main метод main и поле типа Employee[10], которое будет выполнять роль "хранилища" для записей о сотрудниках.
//Создать статические методы, которые будут взаимодействовать с массивом из пункта 6 и возвращать результат:
//Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString));
//Посчитать сумму затрат на ЗП в месяц;
//Найти сотрудника с минимальной ЗП;
//Найти сотрудника с максимальной ЗП;
//Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
//Распечатать ФИО всех сотрудников (метод ничего).