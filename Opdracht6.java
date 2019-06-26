package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Opdracht6 extends TekenApplet {

	private static final long serialVersionUID = 1L;

	public void ruit(String kleur) {
		vulAan(kleur);
		for(int i =0; i< 2; i++) {
			vooruit(120);
			rechts(30);
			vooruit(120);
			rechts(150);
		}
		rechts(30);
		vulUit();
	}

	public void vierkant(String kleur) {
		vulAan(kleur);
		for (int i = 0; i < 4; i++) {
			vooruit(120);
			rechts(90);
		}
		vulUit();
		rechts(90);
	}

	public void initialiseer() {
		setSize(700, 700);
		maakTraceMogelijk();
	}

	public void tekenprogramma() {
		penAan("zwart");
		rechts(15);
		for(int j = 0; j < 3; j++) {
			vierkant("groen");
			ruit("rood");
		}
		penUit();
	}

}
