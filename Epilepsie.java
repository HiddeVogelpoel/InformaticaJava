package me.hidde.informatica;

import java.util.concurrent.ThreadLocalRandom;
import logotekenap.TekenApplet;

public class Epilepsie extends TekenApplet {

	String kleur1 = "wit";
	int r = 100, g = 100, b = 100, rb = 0, gb = 0, bb = 0;

	private static final long serialVersionUID = 1L;

	public void initialiseer() {
		setSize(1440, 900);
		maakAnimatieMogelijk();
	}

	public void tekenprogramma() {
		achtergrondkleur(rb, gb, bb);
		vulAan(r, g, b);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				vooruit(100);
				rechts(90);
			}
			rechts(180);
		}
		vulUit();
	}

	public void animatie() {
		while (animatieLopend()) {
			r = ThreadLocalRandom.current().nextInt(0, 256);
			g = ThreadLocalRandom.current().nextInt(0, 256);
			b = ThreadLocalRandom.current().nextInt(0, 256);
			rb = ThreadLocalRandom.current().nextInt(0, 256);
			gb = ThreadLocalRandom.current().nextInt(0, 256);
			bb = ThreadLocalRandom.current().nextInt(0, 256);
			tekenOpnieuw();
		}
	}
}