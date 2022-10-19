package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/forms")
	public String Form() {
		return "formEvento";
	}
	@PostMapping("/eventos/adicionar")
	public String add(Evento dados) {
	System.out.println(dados);
		return "adicionar";
	}
}
