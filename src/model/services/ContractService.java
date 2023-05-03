package model.services;

import model.entities.Contract;
import model.entities.RegistrationInstallments;

import java.time.LocalDate;

public class ContractService{
    private ServicePayment servicePayment;

    public ContractService() {
    }

    public ContractService(ServicePayment servicePayment) {
        this.servicePayment = servicePayment;
    }

    public void processContract(Contract contract, Integer months){

      double basicQuote = contract.getTotalValueOfContract() / months;

      for(int i=1; i <=months; i++){
          LocalDate dueDate = contract.getContractDate().plusMonths(i);

          double interest = servicePayment.interest(basicQuote, i);
          double fee = servicePayment.paymentFee(basicQuote + interest);
          double quota = basicQuote +  interest + fee;

          contract.getInstallments().add(new RegistrationInstallments(dueDate, quota));


      }
    }


}
