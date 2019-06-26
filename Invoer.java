package me.hidde.informatica;

import logotekenap.*;

public class Invoer extends TekenApplet {

	private static final long serialVersionUID = 1L;

	InvoerVariabele zijdeInv;
	double hoeken;

	public void initialiseer() {
		zijdeInv = new InvoerVariabele("Hoeken", 0, 15, 4);
		maakZichtbaar(zijdeInv);
		hoeken = 4;
		setSize(700, 700);
		maakTraceMogelijk();
	}

	public void tekenprogramma() {
		penUit();
		links(90);
		vooruit(230);
		links(90);
		vooruit(50);
		rechts(180);
		penAan();
		tekenHoeken(hoeken);
	}

	public void tekenHoeken(double hoek) {
		for (int i = 0; i < hoek; i++) {
			vooruit(100);
			rechts(360 / hoek);
		}
	}

	public void invoerVarActie(InvoerVariabele iv) {
		hoeken = zijdeInv.geefWaarde();
		tekenOpnieuw();
	}
}
