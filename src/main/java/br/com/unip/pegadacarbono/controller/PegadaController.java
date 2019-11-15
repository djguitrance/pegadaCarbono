package br.com.unip.pegadacarbono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.unip.pegadacarbono.models.Pegada;

@Controller
public class PegadaController {
	
	@PostMapping("/calculaPegada")
	@ResponseBody
	public String calculaPegada(@RequestBody Pegada pegada) {
		double co2Energia = pegada.calculaCo2Energia();
		double co2Gas = pegada.calculaCo2Gas();
		double co2Transp = pegada.calculaCo2Transp();
		String resultadoMensal = pegada.totalCo2(co2Energia, co2Gas, co2Transp);
		
		return ("Sua pegada de carbono é aproximadamente: " + resultadoMensal + " Toneladas de CO2 por mês");
	}

}
