package me.hidde.informatica;

import logotekenap.*;

public class Opdracht16 extends TekenApplet {

	private static final long serialVersionUID = 1L;
	
	InvoerVariabele snelheidInv;
	int positieVooruit = -700, snelheid;
	
	public void initialiseer() {
		setSize(1400, 500);
		snelheidInv = new InvoerVariabele("Snelheid", 0, 20, 1);
		maakZichtbaar(snelheidInv);
		maakAnimatieMogelijk();
	}
	
	public void tekenprogramma() {
		vierkant();
	}
	
	public void vierkant() {
		penUit();
		rechts(90);
		vooruit(positieVooruit);
		links(90);
		penAan();
		vulAan("oranje");
		for(int i = 0; i < 2; i++) {
			vooruit(50);
			rechts(90);
			vooruit(100);
			rechts(90);
		}
		vulUit();
	}
	
	public void invoerVarActie(InvoerVariabele iv) {
		snelheid = snelheidInv.geefWaarde();
		tekenOpnieuw();
	}
	
	public void animatie() {
		while(animatieLopend()) {
			positieVooruit += snelheid;
			tekenOpnieuw();
		}
	}
	

}
