package com.luizsoftware.apiservicos.repository;

import com.luizsoftware.apiservicos.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Servico,Long> {

}
