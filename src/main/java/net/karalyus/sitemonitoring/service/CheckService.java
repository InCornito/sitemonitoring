package net.karalyus.sitemonitoring.service;

import java.util.List;

import net.karalyus.sitemonitoring.entity.Check;
import net.karalyus.sitemonitoring.repository.CheckRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService {

	@Autowired
	private CheckRepository checkRepository;
	
	public List<Check> findAll(){
		return checkRepository.findAll();
	}

	public void save(Check check) {
		checkRepository.save(check);
		
	}
}
