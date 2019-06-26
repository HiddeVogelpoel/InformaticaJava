package me.hidde.informatica;

import java.awt.Font;
import java.util.concurrent.ThreadLocalRandom;

import logotekenap.*;

public class Oof extends TekenApplet {

	private static final long serialVersionUID = 1L;

	int hoek = 0;
	int r = 100, g = 100, b = 100;

	Font font1 = new Font("Arial", Font.PLAIN, 14);

	public void initialiseer() {
		setSize(700, 700);
		maakAnimatieMogelijk();
	}

	public void tekenprogramma() {
		driehoek();
	}

	public void driehoek() {
		vulAan(r, g, b);
		rechts(hoek);
		for (int i = 0; i < 5; i++) {
			vooruit(100);
			rechts(hoek);
		}
		vulUit();
	}

	public void animatie() {
		while (animatieLopend()) {
			hoek += 3;
			r = ThreadLocalRandom.current().nextInt(0, 256);
			g = ThreadLocalRandom.current().nextInt(0, 256);
			b = ThreadLocalRandom.current().nextInt(0, 256);
			tekenOpnieuw();
		}
	}

}
