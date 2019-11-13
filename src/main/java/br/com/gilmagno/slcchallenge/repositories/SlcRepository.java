package br.com.gilmagno.slcchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gilmagno.slcchallenge.entities.SlcEntity;

@Repository
public interface SlcRepository extends JpaRepository<SlcEntity, Long> {

}
