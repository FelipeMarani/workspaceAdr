package br.com.itb.miniprojeto3cspring.control;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*" , maxAge = 3600, allowCredentials = "false" )
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	//criação do objeto de serviço
	final FuncionarioService funcionarioSevice;
	
	//iniciação de dependencia
	public FuncionarioController(FuncionarioService _funcionarioService) {}
	

}
