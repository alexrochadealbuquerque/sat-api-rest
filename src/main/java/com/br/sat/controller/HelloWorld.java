package com.br.sat.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@Autowired
	private HttpServletRequest request;

	@GetMapping()
	public String helloWorld() {

		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
		String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);		
		String ipCliente = request.getRemoteAddr();

		return "Hello, World! Api Rest ativa - " + data + " " + hora + " IP: " + ipCliente ;

	}

}
