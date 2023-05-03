package model.aplication;

import model.entities.Contract;
import model.entities.RegistrationInstallments;
import model.services.ContractService;
import model.services.ServicePaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data dd/MM/yyy: ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valueContract = sc.nextDouble();

        Contract contract = new Contract(number, date, valueContract);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new ServicePaypal());

        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for (RegistrationInstallments installments : contract.getInstallments()){
            System.out.println(installments);
        }

        sc.close();
        System.out.println();
    }
}