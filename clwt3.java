package Lab8;

public class clwt3 {
    public static void main(String[] args) {
        workerWithHourlyPay worker = new workerWithHourlyPay();
        System.out.println("Данные о рабочего с почасовой зарплатой");
        worker.inputPerson();
        worker.printPerson();
    }
}
