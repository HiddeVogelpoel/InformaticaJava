package me.hidde.informatica;

import java.util.concurrent.ThreadLocalRandom;

import logotekenap.*;

public class Opdracht14 extends TekenApplet {

	private static final long serialVersionUID = 1L;

	InvoerVariabele snelheidInv;
	int hoek = 0, snelheid = 1, r = 100, g = 100, b = 100;

	public void initialiseer() {
		snelheidInv = new InvoerVariabele("Snelheid", 0, 360, 1);
		maakZichtbaar(snelheidInv);
		setSize(700, 700);
		maakAnimatieMogelijk();
	}

	public void tekenprogramma() {
		for (int i = 0; i < 4; i++) {
			driehoek();
			rechts(90);
		}
	}

	public void driehoek() {
		rechts(hoek);
		vulAan(r, g, b);
		for (int i = 0; i < 3; i++) {
			vooruit(100);
			rechts(120);
		}
		vulUit();
	}

	public void animatie() {
		while (animatieLopend()) {
			r = ThreadLocalRandom.current().nextInt(0, 256);
			g = ThreadLocalRandom.current().nextInt(0, 256);
			b = ThreadLocalRandom.current().nextInt(0, 256);
			hoek += snelheid;
			tekenOpnieuw();
		}
	}

	public void invoerVarActie(InvoerVariabele iv) {
		snelheid = snelheidInv.geefWaarde();
		tekenOpnieuw();
	}

}
