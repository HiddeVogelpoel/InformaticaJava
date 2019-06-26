package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Opdracht8 extends TekenApplet {

	private static final long serialVersionUID = 1L;

	public void initialiseer() {
		setSize(700, 700);
		maakTraceMogelijk();
	}

	public void tekenprogramma() {
		links(30);
		for (int j = 0; j < 3; j++) {
			driehoek(150, "oranje");
			driehoek(100, "geel");
		}
	}

	public void driehoek(int lengte, String kleur) {
		vulAan(kleur);
		for (int i = 0; i < 3; i++) {
			vooruit(lengte);
			links(120);
		}
		rechts(60);
		vulUit();
	}

}