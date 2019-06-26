package me.hidde.informatica;

import logotekenap.*;

public class Opdracht22 extends TekenApplet {

	private static final long serialVersionUID = 1L;
	int pos1 = 0, pos2 = 0;

	public void initialiseer() {
		setSize(1200, 500);
		maakTraceMogelijk();
		maakAnimatieMogelijk();
	}

	public void tekenprogramma() {
		rechthoek(1200, 200);

		links(90);
		vooruit(102);
		rechts(90);
		for (int j = 0; j < 17; j++) {
			strepen();
		}
		vooruit(pos1);
		penUit();
		links(90);
		vooruit(50);
		auto();
		links(90);
		vooruit(1100 - pos2);
		links(90);
		vooruit(120);
		auto();
	}

	public void rechthoek(int breedte, int lengte) {
		rechts(90);
		vooruit(-600);
		vulAan("zwart");
		for (int i = 0; i < 2; i++) {
			vooruit(breedte);
			links(90);
			vooruit(lengte);
			links(90);
		}
		vulUit();
	}

	public void strepen() {
		vooruit(70);
		vulAan("wit");
		for (int i = 0; i < 2; i++) {
			rechts(90);
			vooruit(4);
			rechts(90);
			vooruit(40);
		}
		vulUit();
	}

	public void auto() {
		vulAan("rood");
		for (int i = 0; i < 2; i++) {
			links(90);
			vooruit(50);
			links(90);
			vooruit(10);
		}
		vulUit();
	}

	public void animatie() {
		while (animatieLopend()) {
			pos1--;
			pos2 += 2;
			tekenOpnieuw();
		}
	}

}
