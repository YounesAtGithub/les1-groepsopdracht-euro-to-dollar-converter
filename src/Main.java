import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double currencyDollar = 0.92; // euro cent voor 1 dollar peildatum: 14-5-2024 19:56u
        double amountInEuro = 1.00; // hoeveelheid te converteren naar dollar
        double amountInUsd = 1.00; // hoeveelheid te converteren naar euro
        double euroToDollar = amountInEuro / currencyDollar;
        double dollarToEuro = amountInUsd * currencyDollar;

        System.out.println("1 euro to dollar is " + "$" + euroToDollar); // rekent aantal dollars uit
        System.out.println("1 dollar to euro is " + "€" + dollarToEuro); // rekent aantal euros uit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount in Euro you would like to convert to Dollar: ");

        if (scanner.hasNextDouble())
        {
            amountInEuro = scanner.nextDouble();
            System.out.println("€" + amountInEuro + " euro to dollar is " + "$" + euroToDollar); // rekent aantal dollars uit

        } else {
            System.out.println("Your input is not valid");
        }



    }
}