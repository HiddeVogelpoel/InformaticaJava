package me.hidde.informatica;

import logotekenap.*;

public class Opdracht18 extends TekenApplet {

	private static final long serialVersionUID = 1L;
	
	InvoerVariabele snelheidInv;
	int hoek = 0;
	int snelheid = 1;

	public void initialiseer() {
		setSize(700, 700);
		snelheidInv = new InvoerVariabele("Snelheid", 0, 360, 1);
		maakZichtbaar(snelheidInv);
		maakAnimatieMogelijk();
	}

	public void tekenprogramma() {
		links(15);
		rechts(hoek);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				ruit("oranje", 130);
				ruit("geel", 65);
			}
		}

	}

	public void ruit(String kleur, int lengte) {
		vulAan(kleur);
		for (int i = 0; i < 2; i++) {
			vooruit(lengte);
			rechts(30);
			vooruit(lengte);
			rechts(150);
		}
		rechts(30);
		vulUit();
	}
	
	public void invoerVarActie(InvoerVariabele iv) {
		snelheid = snelheidInv.geefWaarde();
		tekenOpnieuw();
	}
	
	public void animatie() {
		while(animatieLopend()) {
			hoek += snelheid;
			tekenOpnieuw();
		}
	}

}
