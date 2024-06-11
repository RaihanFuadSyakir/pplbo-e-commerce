package com.pplbo.ecommerce.cart.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Shipping {
    private String shippingName;
    private double shippingPrice; // Use double for monetary values
    private String shippingStatus;
    private String shippingAddress;
}