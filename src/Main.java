public class Main {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Max",
                "1989", "2020", 8000);
        System.out.println(salariedEmployee);
        System.out.println("Age = " + salariedEmployee.getAge());
        System.out.println("Pay = " + salariedEmployee.collectPay());
        salariedEmployee.retire();
        System.out.println("pay = " + salariedEmployee.collectPay());


        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bob",
                "1980", "2021",5);
        System.out.println(hourlyEmployee);
        System.out.println("Age = " + hourlyEmployee.getAge());
        System.out.println("Pay = " + hourlyEmployee.collectPay());
        System.out.println("pay = " + hourlyEmployee.getDoublePay());


    }
}
