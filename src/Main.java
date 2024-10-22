public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String [] args){
        employees[0] = new Employee("Петров Петр Петрович", 1, 75_000);
        employees[1] = new Employee("Иванов Иван Иванович", 2, 152_000);
        employees[2] = new Employee("Кириллов Кирилл Кириллович", 3, 461_000);
        employees[3] = new Employee("Владимеров Алекснадр Сергеевич", 3, 100_000);
        employees[4] = new Employee("Петров Аркадий Алексеевич", 4, 1_200_000);
        employees[5] = new Employee("Зубенко Михаил Петрович", 4, 52_000);
        employees[6] = new Employee("Давыдов Дмитрий Алексеевич", 3, 120_000);
        employees[7] = new Employee("Сергеев Артём Вальдемарович", 1, 420_000);
        employees[8] = new Employee("Буторов Игорь Евгеньевич", 2, 150_000);
        employees[9] = new Employee("Петрова Анастасия Алексеевна", 4, 600_000);


        // Вывод
        printAllEmployess();
        System.out.println("Сумма затрат на ЗП за месяц: " + fullSumSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeMaxSalary());
        System.out.println("Средняя зарплата за месяц " + calculateAverageSalary());
        printAllEmployees();
    }


    // Список всех сотрудников
    public static void printAllEmployess(){
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee);
            }
        }
    }

    // Сумма трат за месяц
    public static int fullSumSalary(){
        int totalSalary = 0;
        for (Employee employee : employees){
            if (employee != null){
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    // Находит сотрдника с минимальной ЗП
    public static Employee findEmployeeMinSalary(){
        Employee minSalary = null;
        for (Employee employee : employees){
            if (employee != null && (minSalary == null || employee.getSalary() < minSalary.getSalary())){
                minSalary = employee;
            }
        }
        return minSalary;
    }


    // Находи сотрудника с максимальной ЗП
    public static Employee findEmployeeMaxSalary(){
        Employee maxSalary = null;
        for (Employee employee : employees){
            if (employee != null && (maxSalary == null || employee.getSalary() > maxSalary.getSalary())){
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    // Подсчёт средней зарплаты
    public static double calculateAverageSalary(){
        int totalSalary = fullSumSalary();
        int avgSalary = 0;
        for (Employee employee : employees){
            if (employee != null){
                avgSalary++;
                }
            }
        return avgSalary > 0 ? totalSalary / avgSalary : 0;
    }

    // Вывод ФИО всех сотрудников
    public static void printAllEmployees(){
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee.getFullName());
            }
        }
    }

}