package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Opdracht17 extends TekenApplet {

	private static final long serialVersionUID = 1L;

	public void initialiseer() {
		setSize(700, 700);
		maakTraceMogelijk();
	}

	public void tekenprogramma() {
		links(15);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				ruit("oranje", 130);
				ruit("geel", 65);
			}
		}

	}

	public void ruit(String kleur, int lengte) {
		vulAan(kleur);
		for (int i = 0; i < 2; i++) {
			vooruit(lengte);
			rechts(30);
			vooruit(lengte);
			rechts(150);
		}
		rechts(30);
		vulUit();
	}

}
