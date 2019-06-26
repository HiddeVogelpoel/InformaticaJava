package me.hidde.informatica;

import java.awt.Font;

import logotekenap.*;

public class Opdracht20 extends TekenApplet {

	private static final long serialVersionUID = 1L;
	Font font = new Font("Arial", Font.PLAIN, 42);
	Font font1 = new Font("Arial", Font.ITALIC, 42);
	Font font2 = new Font("Arial", Font.BOLD, 42);
	Font font3 = new Font("Arial", Font.BOLD + Font.ITALIC, 42);
	Font font4 = new Font ("Arial", Font.PLAIN, 20);

	public void initialiseer() {
		setSize(500, 500);
		maakTraceMogelijk();
	}

	public void tekenprogramma() {
		penUit();
		vooruit(200);

		// Loop 1
		//penAan();
		schrijf("Hello World!", font);
		//penUit();
		rechts(180);
		vooruit(100);
		//links(180);

		// Loop 2
		//penAan();
		schrijf("Hello World!", font1);
		//penUit();
		//rechts(180);
		vooruit(100);
		//links(180);

		// Loop 3
		//penAan();
		schrijf("Hello World!", font2);
		//penUit();
		//rechts(180);
		vooruit(100);
		//links(180);

		// Loop 4
		//penAan();
		schrijf("Hello World!", font3);
		//penUit();
		//rechts(180);
		vooruit(100);
		//links(180);

		// Loop 5
		//penAan();
		schrijf("Hello World!", font4);
		//penUit();
		//rechts(180);
		vooruit(100);
		//links(180);

	}

}
