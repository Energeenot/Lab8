package Lab8;

public class workerWithHourlyPay extends workerWithFixedSalary{
    workerWithFixedSalary fsw = new workerWithFixedSalary();
    public void inputPerson(){
        super.inputPerson();
    }
    public void printPerson(){
        super.printPerson();
    }
    @Override
    public double itogSalary(){
        return ((this.getSalary()*30+this.getPrize()) * 1.13 );
    }
}
