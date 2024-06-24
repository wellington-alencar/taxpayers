import entities.Company;
import entities.Individual;
import entities.Taxpayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Taxpayers> taxpayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        var n = input.nextInt();
        Double totalTaxes = 0.0;

        for (int i = 1; i <=n; i++){
            System.out.println("Tax payer #"+ i +"  data:");
            System.out.print("Individual or company (i/c)? ");
            String response = input.next();
            System.out.print("Name: ");
            input.nextLine();
            var name = input.nextLine();
            System.out.print("Anual income: ");
            var anualIncome = input.nextDouble();
            if (response.equalsIgnoreCase("i")){
                System.out.print("Health expenditures: ");
                var healthExpenditures = input.nextDouble();
                taxpayers.add(new Individual( name, anualIncome, healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                var numberOfEmployees = input.nextInt();
                taxpayers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Taxpayers payer: taxpayers ) {
            System.out.println(payer.getName() +" -  $ " + String.format("%.2f", payer.tax()));
        }
        for (Taxpayers payer: taxpayers ) {
            totalTaxes += payer.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
    }
}