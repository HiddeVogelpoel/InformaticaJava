package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Opdracht3 extends TekenApplet {

	private static final long serialVersionUID = 1L;

	public void initialiseer() {
		setSize(500, 500);
		achtergrondkleur("cyaan");
	}

	public void tekenprogramma() {
		penAan("magenta");
		vulAan("geel");
		links(90);
		for (int i = 0; i < 5; i++) {
			vooruit(150);
			rechts(72);
		}
		vulUit();
	}

}
