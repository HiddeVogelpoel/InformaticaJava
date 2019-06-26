package me.hidde.informatica;

import logotekenap.*;

public class Opdracht13 extends TekenApplet {

	private static final long serialVersionUID = 1L;

	InvoerVariabele lengteInv, roodInv, groenInv, blauwInv;
	int lengte = 50, rood = 50, groen = 50, blauw = 50, hoek = 0;

	public void initialiseer() {
		lengteInv = new InvoerVariabele("Lengte", 0, 100, lengte);
		roodInv = new InvoerVariabele("Rood", 0, 255, rood);
		groenInv = new InvoerVariabele("Groen", 0, 255, groen);
		blauwInv = new InvoerVariabele("Blauw", 0, 255, blauw);
		maakZichtbaar(lengteInv);
		maakZichtbaar(roodInv);
		maakZichtbaar(groenInv);
		maakZichtbaar(blauwInv);
		setSize(700, 700);
		
		maakAnimatieMogelijk();
	}
	
	public void tekenprogramma() {
		rechts(hoek);
		vierkant();
		
	}
	
	public void vierkant() {
		vulAan(rood, groen, blauw);
		for(int i =0; i < 4; i++) {
			vooruit(lengte);
			rechts(90);
		}
		vulUit();
	}
	
	public void invoerVarActie(InvoerVariabele iv) {
		lengte = lengteInv.geefWaarde();
		rood = roodInv.geefWaarde();
		groen = groenInv.geefWaarde();
		blauw = blauwInv.geefWaarde();
		tekenOpnieuw();
	}
	
	public void animatie() {
		while(animatieLopend()) {
			hoek++;
			tekenOpnieuw();
		}
	}

}
