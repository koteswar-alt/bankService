package com.rbi.HDFC.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ACCOUNT_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class AccountEntity {
    @Id
    @SequenceGenerator(name = "myAccountSeqGen",sequenceName = "MyAccSeq",initialValue = 1500,allocationSize = 150)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long accountId;
    @Column(name="BALANCE")
    private Double balance;
    private Long accountNumber;
    @Column(name = "PASSWORD")
    private String password;

}
