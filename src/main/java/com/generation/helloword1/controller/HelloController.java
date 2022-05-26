//Atividade prática – Desenvolvendo o Backend com Spring
package com.generation.helloword1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indica que é classe controladora do tipo Rest
@RequestMapping("/hello") //Indica que a classe é responsavel por controlar o recurso hello, a raiz
public class HelloController {

	@GetMapping // ira responder uma requisição que vier ao endereço hallo e retornará hello turma 53
	public String helloWord() {
		return "Olá Usuário!";
	}
	
	@GetMapping("bsm") // ira responder uma requisição que vier ao endereço hallo e retornará hello turma 53
	public String bsm() {
		return "<b>BSM</b> <br /> <b>Habilidades:</b><br />  <br >Comunicação <br /> Atenção aos detalhes <br />Proatividade <br /> Trabalho em Equipe <br /><br />  <b>Mentalidades</b> <br /> <br /> Orientação ao Futuro <br />Responsabilidade Pessoal <br /> Mentalidade de Crescimento <br /> Persistência";
	}
	
	@GetMapping("objetivo") // ira responder uma requisição que vier ao endereço hallo e retornará hello turma 53
	public String objetivo() {
		return "Meu objetivo dessa semana é :<br /> <b>Objetivos Pessoais:</b><br />Começar a ter uma alimentação mais saudável;<br />Dormir e acordar mais cedo;<br />Começar a caminhar;<br /><br /><b>Objetivos Profissionais</b><br />Me aprofundar nos estudos sobre MySQL;<br />Finalizar provas da faculdade;<br />Me dedicar a apoiar o grupo;<br />Atualizar o Linkedin";
	}
}

//dica: para rodar usa o boot dashboard
//abrir aba e digitar localhost:8080/hello