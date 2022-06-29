package com.rbi.HDFC.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "BENEFICIARY_TABLE")
@NoArgsConstructor

public class BeneficiaryEntity {
    @Id
    @SequenceGenerator(name = "myBenSeqGen",sequenceName = "meBenSeq",initialValue= 1,allocationSize = 150)
    @GeneratedValue(generator = "myBenSeqGen")

    private Long id;
    private String beneficiaryName;
    private String beneficiaryBank;
    private Long beneficiaryaccountNumber;
    private String beneficiaryIFSC;
    private Double moneyTransferred=0.0;
    @ManyToOne
    private CustomerEntity customerEntity;
}
