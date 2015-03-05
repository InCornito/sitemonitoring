package net.karalyus.sitemonitoring.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;
import net.karalyus.sitemonitoring.entity.Check;
import net.karalyus.sitemonitoring.service.CheckService;

@Getter
@Setter
@ManagedBean
@ViewScoped
public class CheckListController implements Serializable{
	
	@ManagedProperty("#{checkService}")
	private CheckService checkService;
	
	private List<Check> checks;
	
	private Check check = new Check();
	
	@PostConstruct
	public void loadChecks(){
		checks = checkService.findAll();
	}
	
	public void save(){
		checkService.save(check);
		check = new Check();
	}
}
