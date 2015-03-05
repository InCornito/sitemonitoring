package net.karalyus.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import lombok.Getter;
import lombok.Setter;
import net.karalyus.sitemonitoring.service.HelloSpringService;

@Getter
@Setter
@ManagedBean
public class HelloController {
	
	@ManagedProperty("#{helloSpringService}")
	private HelloSpringService helloSpringService;
	
	public String showHello(){
		return helloSpringService.sayHello();
	}


}
