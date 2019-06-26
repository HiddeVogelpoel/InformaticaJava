package me.hidde.informatica;

import logotekenap.*;

public class Opdracht19 extends TekenApplet {

	private static final long serialVersionUID = 1L;
	
	int hoek1 = 0, hoek2 = 0;

	public void initialiseer() {
		setSize(700, 700);
		maakTraceMogelijk();
		maakAnimatieMogelijk();
	}

	public void tekenprogramma() {
		links(90);
		rechts(hoek1);
		vierkant();
		links(hoek1);
		penUit();
		rechts(90);
		vooruit(150);
		rechts(90);
		vooruit(100);
		penAan();
		rechts(hoek2);
		vierkant();
	}

	public void vierkant() {
		vulAan("rood");
		for (int i = 0; i < 4; i++) {
			vooruit(75);
			rechts(90);
		}
		vulUit();
	}
	
	public void animatie() {
		while(animatieLopend()) {
			hoek1++;
			hoek2--;
			
			tekenOpnieuw();
		}
	}

}
