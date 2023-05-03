package model.services;

public interface ServicePayment {
     Double paymentFee(Double amount);
     Double interest(Double amount, Integer months);
}
