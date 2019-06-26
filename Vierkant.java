package me.hidde.informatica;

import logotekenap.TekenApplet;

public class Vierkant extends TekenApplet{
	
	private static final long serialVersionUID = 1L;
	
	public void tekenprogramma() {
		penAan("rood");
		vulAan(0, 255, 0);
		for(int i = 0; i < 4; i ++) {
			vooruit(200);
			rechts(90);
		}
		vulUit();
	}
}
