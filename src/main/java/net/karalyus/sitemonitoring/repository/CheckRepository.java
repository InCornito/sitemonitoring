package net.karalyus.sitemonitoring.repository;

import net.karalyus.sitemonitoring.entity.Check;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CheckRepository extends JpaRepository<Check, Integer>{

}
