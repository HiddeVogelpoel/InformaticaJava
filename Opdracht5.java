package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Opdracht5 extends TekenApplet {

	private int lengte = 200;
	private String kleur = "geel", randkleur = "zwart";

	private static final long serialVersionUID = 1L;

	public void initialiseer() {
		setSize(600, 600);
	}

	public void tekenprogramma() {
		penUit();
		rechts(90);
		vooruit(-200);
		penAan(randkleur);
		vulAan(kleur);
		for (int i = 0; i < 3; i++) {
			vooruit(lengte);
			links(120);
		}
		vulUit();
		vooruit(lengte + 5);
		lengte /= 2;
		vulAan(kleur);
		for (int i = 0; i < 3; i++) {
			vooruit(lengte);
			links(120);
		}
		vulUit();
		vooruit(lengte + 5);
		lengte /= 2;
		vulAan(kleur);
		for (int i = 0; i < 3; i++) {
			vooruit(lengte);
			links(120);
		}
		vulUit();
	}

}
