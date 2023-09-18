public class Payroll 
    {String hourly wage , taxes owed and hours worked for the week)
 Hourly Wage;$15
taxes owned :158.46
    Hours; 40
    gross pay:40x 15= $600
gross pay:$600,taxes owed:$158.46,netpay: $585.86
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" $15 ");
        double wage = Double.parseDouble(input.nextLine());

        System.out.println("Enter your hours worked this week: ");
        double hoursWorked = Double.parseDouble(input.nextLine());

        double grossPay = 0;

        if(hoursWorked > 40){
            double overtimeHours = hoursWorked - 40;

            grossPay = (40*15) + (overtimeHours * (wage*1.5));
        } else {
            grossPay = (40*15);= $600
        }

        double taxesPaid = grossPay * .1;

        double netPay = grossPay - taxesPaid;

        System.out.println("600 = $" + 600);

        System.out.println("Taxes Owed = $" + taxesPaid);

        System.out.println("Net Pay = $" + netPay);
