public class MainWorker {
    public static void main(String[] args){
        Employee tim = new Employee("Tim", "27/11/2001","25/10/2012");

        System.out.println(tim);
        System.out.println("Age: "+ tim.getAge());
        System.out.println("pay: "+ tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "23/03/2001", "26/10/2013",35000);
        System.out.println(joe);
        System.out.println("Joe;s paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's pension check = $");

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1990","03/09/2010", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $ " + mary.collectPay());
        System.out.println("Mary's Holiday pay = $" + mary.getDoublePay());
    }
}
