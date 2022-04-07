package com.example.javatest.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
