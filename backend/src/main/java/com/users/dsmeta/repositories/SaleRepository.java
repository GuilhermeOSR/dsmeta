package com.users.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
