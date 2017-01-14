package mapa.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro {
	public int x;
	public int y;
	public Sprite sprite;
	public static final int LADO = 32;

	// Coleccion de cuadros
	public static final Cuadro VACIO = new Cuadro(Sprite.VACIO);
	public static final Cuadro HIERBA1 = new Cuadro(Sprite.HIERBA1);
	public static final Cuadro HIERBA2 = new Cuadro(Sprite.HIERBA2);
	public static final Cuadro HIERBA3 = new Cuadro(Sprite.HIERBA3);
	public static final Cuadro HIERBA4 = new Cuadro(Sprite.HIERBA4);
	public static final Cuadro HIERBA5 = new Cuadro(Sprite.HIERBA5);
	public static final Cuadro HIERBA6 = new Cuadro(Sprite.HIERBA6);
	public static final Cuadro HIERBA7 = new Cuadro(Sprite.HIERBA7);
	public static final Cuadro HIERBA8 = new Cuadro(Sprite.HIERBA8);
	public static final Cuadro HIERBA9 = new Cuadro(Sprite.HIERBA9);
	public static final Cuadro FLOR1 = new Cuadro(Sprite.FLOR1);
	public static final Cuadro FLOR2 = new Cuadro(Sprite.FLOR2);
	public static final Cuadro FLOR3 = new Cuadro(Sprite.FLOR3);
	public static final Cuadro TOCON = new Cuadro(Sprite.TOCON);
	public static final Cuadro INTERRUPTOR6 = new Cuadro(Sprite.INTERRUPTOR6);
	public static final Cuadro TEMPLO3 = new Cuadro(Sprite.TEMPLO3);
	public static final Cuadro TEMPLO4 = new Cuadro(Sprite.TEMPLO4);
	public static final Cuadro TEMPLO10 = new Cuadro(Sprite.TEMPLO10);
	public static final Cuadro TEMPLO11 = new Cuadro(Sprite.TEMPLO11);
	public static final Cuadro TEMPLO12 = new Cuadro(Sprite.TEMPLO12);
	public static final Cuadro TEMPLO13 = new Cuadro(Sprite.TEMPLO13);
	public static final Cuadro TEMPLO14 = new Cuadro(Sprite.TEMPLO14);
	public static final Cuadro TEMPLO20 = new Cuadro(Sprite.TEMPLO20);
	public static final Cuadro TEMPLO21 = new Cuadro(Sprite.TEMPLO21);
	public static final Cuadro TEMPLO23 = new Cuadro(Sprite.TEMPLO23);
	public static final Cuadro TEMPLO24 = new Cuadro(Sprite.TEMPLO24);
	public static final Cuadro TEMPLO38 = new Cuadro(Sprite.TEMPLO38); // Adorno
	public static final Cuadro TEMPLO39 = new Cuadro(Sprite.TEMPLO39);
	public static final Cuadro TEMPLO47 = new Cuadro(Sprite.TEMPLO47);

	// Fin de la coleccion de cuadros

	public Cuadro(Sprite sprite) {
		this.sprite = sprite;
	}

	public void mostrar(int x, int y, Pantalla pantalla) {
		pantalla.mostrarCuadro(x << 5, y << 5, this);
	}

	public boolean solido() {
		return false;
	}
}
