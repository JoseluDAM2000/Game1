package mapa;

import graficos.Pantalla;
import mapa.cuadro.Cuadro;

public abstract class Mapa {
	protected int ancho;
	protected int alto;
	protected int[] cuadros;

	public Mapa(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
		cuadros = new int[ancho * alto];
		generarMapa();
	}

	public Mapa(String ruta) {
		cargarMapa(ruta);
	}

	protected void generarMapa() {
	}

	private void cargarMapa(String ruta) {
	}

	public void actualizar() {
	}

	public void mostrar(final int compensacionX, final int compensacionY, final Pantalla pantalla) {
		pantalla.estableceDiferencia(compensacionX, compensacionY);
		int o = compensacionX >> 5;
		int e = (compensacionX + pantalla.obtenAncho() + Cuadro.LADO) >> 5;
		int n = compensacionY >> 5;
		int s = (compensacionY + pantalla.obtenAlto() + Cuadro.LADO) >> 5;

		for (int y = n; y < s; y++) {
			for (int x = o; x < e; x++) {
				obtenCuadro(x, y).mostrar(x, y, pantalla);
			}
		}
	}

	public Cuadro obtenCuadro(final int x, final int y) {
		if (x < 0 || y < 0 || x >= ancho || y >= alto) {
			return Cuadro.VACIO;
		}
		switch (cuadros[x + y * ancho]) {
		case 0:
			return Cuadro.HIERBA1;
		case 1:
			return Cuadro.HIERBA2;
		case 2:
			return Cuadro.HIERBA3;
		case 3:
			return Cuadro.HIERBA4;
		case 4:
			return Cuadro.HIERBA5;
		case 5:
			return Cuadro.HIERBA6;
		case 6:
			return Cuadro.HIERBA7;
		case 7:
			return Cuadro.HIERBA8;
		case 8:
			return Cuadro.HIERBA9;
		case 9:
			return Cuadro.FLOR1;
		case 10:
			return Cuadro.FLOR2;
		case 11:
			return Cuadro.FLOR3;
		case 12:
			return Cuadro.TOCON;
		case 13:
			return Cuadro.INTERRUPTOR6;
		case 14:
			return Cuadro.TEMPLO3;
		case 15:
			return Cuadro.TEMPLO4;
		case 16:
			return Cuadro.TEMPLO10;
		case 17:
			return Cuadro.TEMPLO11;
		case 18:
			return Cuadro.TEMPLO12;
		case 19:
			return Cuadro.TEMPLO13;
		case 20:
			return Cuadro.TEMPLO14;
		case 21:
			return Cuadro.TEMPLO20;
		case 22:
			return Cuadro.TEMPLO21;
		case 23:
			return Cuadro.TEMPLO23;
		case 24:
			return Cuadro.TEMPLO24;
		case 25:
			return Cuadro.TEMPLO38;
		case 26:
			return Cuadro.TEMPLO39;
		case 27:
			return Cuadro.TEMPLO47;
		default:
			return Cuadro.VACIO;
		}
	}
}
