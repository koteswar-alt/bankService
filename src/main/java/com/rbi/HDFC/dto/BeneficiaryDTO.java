package com.rbi.HDFC.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BeneficiaryDTO {

    private String message;
    private Long ben_Id;
    private String beneficiaryBank;
    private Long beneficiaryaccountNumber;
    private String beneficiaryName;
    private String beneficiaryIFSC;


}
