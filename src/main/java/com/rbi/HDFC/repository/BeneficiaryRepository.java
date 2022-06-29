package com.rbi.HDFC.repository;

import com.rbi.HDFC.entity.BeneficiaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository<BeneficiaryEntity,Long> {

    void deleteByBenId(Long benId);
}
