package model.entities;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer numberContract;
    private LocalDate contractDate;
    private Double totalValueOfContract;

    private List<RegistrationInstallments> installments = new ArrayList<>();


    public Contract() {
    }

    public Contract(Integer numberContract, LocalDate contractDate, Double totalValueOfContract) {
        this.numberContract = numberContract;
        this.contractDate = contractDate;
        this.totalValueOfContract = totalValueOfContract;
    }

    public Integer getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Integer numberContract) {
        this.numberContract = numberContract;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public Double getTotalValueOfContract() {
        return totalValueOfContract;
    }

    public void setTotalValueOfContract(Double totalValueOfContract) {
        this.totalValueOfContract = totalValueOfContract;
    }

    public List<RegistrationInstallments> getInstallments() {
        return installments;
    }
}
