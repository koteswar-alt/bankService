package com.rbi.HDFC.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionDTO {

    private Long transactionId;
    private  String transactionType;
    private  Double amount;
    private LocalDateTime time;
}
