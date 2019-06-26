package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Opdracht7 extends TekenApplet {

	private static final long serialVersionUID = 1L;

	public void ruit(int lengte) {
		vulAan("geel");
		for (int i = 0; i < 2; i++) {
			vooruit(lengte);
			links(45);
			vooruit(lengte);
			links(135);
		}
		vulUit();

	}

	public void initialiseer() {
		setSize(700, 700);
		maakTraceMogelijk();
	}

	public void tekenprogramma() {
		rechts(22.5);
		for (int j = 0; j < 4; j++) {
			ruit(150);
			rechts(45);
			ruit(100);
			rechts(45);
		}
	}
}
