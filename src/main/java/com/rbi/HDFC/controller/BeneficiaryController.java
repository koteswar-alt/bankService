package com.rbi.HDFC.controller;

import com.rbi.HDFC.dto.AccountCreatedDTO;
import com.rbi.HDFC.dto.BeneficiaryListDTO;
import com.rbi.HDFC.dto.TransferDTO;
import com.rbi.HDFC.service.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 1.add a beneficiary to the user account
 * 2.det details of asll the beneficiaries added to the account
 * 3.transfer money to a beneficiary
 * 4.delete a beneficiaryt
 * */
@RestController
@RequestMapping("/api/v1/beneficiary")
public class BeneficiaryController {
    @Autowired
    private BeneficiaryService beneficiaryService;

    @PostMapping("/addBeneficiary")
    public ResponseEntity<BeneficiaryListDTO>addBeneficiary(@RequestBody BeneficiaryListDTO beneficiaryListDTO){
        BeneficiaryListDTO beneficiaryList= beneficiaryService.addBeneficiary(beneficiaryListDTO);
        ResponseEntity<BeneficiaryListDTO> responseEntity =new ResponseEntity<>(beneficiaryList, HttpStatus.CREATED);
        return responseEntity;
    }
    @PostMapping("/allBeneficiaries")
    public ResponseEntity<BeneficiaryListDTO>getAllBeneficiaries(@RequestBody AccountCreatedDTO accountCreatedDTO){
        BeneficiaryListDTO beneficiaryList= beneficiaryService.getAllBeneficiaries(accountCreatedDTO.getCustomerId());
        ResponseEntity<BeneficiaryListDTO> responseEntity =new ResponseEntity<>(beneficiaryList, HttpStatus.CREATED);
        return responseEntity;
    }
    @PostMapping("/transfer_money")
    public ResponseEntity<String> transferMoney(@RequestBody TransferDTO transferDTO){
        String msg =beneficiaryService.transferMoney(transferDTO);
        ResponseEntity<String> responseEntity= new ResponseEntity<>(msg,HttpStatus.OK);
        return responseEntity;

    }
    @PostMapping("/deleteBeneficiary")
    public ResponseEntity<String> deleteBeneficiary(@RequestBody TransferDTO transferDTO){
        String msg =beneficiaryService.deleteBeneficiary(transferDTO);
        ResponseEntity<String> responseEntity = new ResponseEntity<>(msg,HttpStatus.OK);
        return  responseEntity;
    }
}
