package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Driehoek extends TekenApplet {

	private static final long serialVersionUID = 1L;

	public void initialiseer() {

	}

	public void tekenprogramma() {
		penAan(255, 0, 0);
		vulAan(0, 255, 0);
		rechts(90);
		for (int i = 0; i < 3; i++) {
			vooruit(200);
			links(120);
		}
		vulUit();

	}
}
