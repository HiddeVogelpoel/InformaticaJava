package me.hidde.informatica;
import logotekenap.*;

public class Opdracht12 extends TekenApplet{

	
	private static final long serialVersionUID = 1L;

	InvoerVariabele zijdeInv;
	int lengte;
	
	public void initialiseer() {
		zijdeInv = new InvoerVariabele("lengte", 10, 300, 50);
		maakZichtbaar(zijdeInv);
		setSize(700, 700);
	}

	public void tekenprogramma() {
		penUit();
		links(90);
		vooruit(230);
		links(90);
		vooruit(115);
		links(180);
		penAan();
		vierkant(lengte);

	}
	
	public void vierkant(int lengte) {
		for(int i = 0; i < 4; i++) {
			vooruit(lengte);
			rechts(90);
		}
	}
	
	public void invoerVarActie(InvoerVariabele iv) {
		lengte = zijdeInv.geefWaarde();
		tekenOpnieuw();
	}
}
