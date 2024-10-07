package com.ecommerce.project.service;

import com.ecommerce.project.payload.OrderDTO;
import jakarta.transaction.Transactional;

@Transactional
public interface OrderService {
    OrderDTO placeOrder(String emailId, Long addressId, String paymentMethod, String pgName, String pgPaymentId, String pgStatus, String pgResponseMessage);
}
