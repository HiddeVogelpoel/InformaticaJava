package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Opdracht4 extends TekenApplet {

	private int hoogte = 400, lengte = 600;
	private String achtergrond = "wit", randkleur = "zwart", vulkleur = "rood";

	private static final long serialVersionUID = 1L;

	public void initialiseer() {
		setSize(lengte, hoogte);
		achtergrondkleur(achtergrond);
	}

	public void tekenprogramma() {
		penAan(randkleur);
		vulAan(vulkleur);
		rechts(90);
		for (int i = 0; i < 2; i++) {
			vooruit(150);
			links(90);
			vooruit(75);
			links(90);
		}
		vulUit();
	}

}
