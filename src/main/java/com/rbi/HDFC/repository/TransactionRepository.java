package com.rbi.HDFC.repository;

import com.rbi.HDFC.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public interface TransactionRepository extends JpaRepository<TransactionRepository,Long> {
    Optional<List<TransactionEntity>>findByAccountNumber(Long accountNo);
}
