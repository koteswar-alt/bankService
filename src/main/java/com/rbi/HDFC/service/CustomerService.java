package com.rbi.HDFC.service;

import com.rbi.HDFC.dto.*;

public interface CustomerService {
    AccountCreatedDTO register(CustomerRegisterDTO customerRegDTO) ;
    AccountDTO login(Long accountNumber,String password);


}
