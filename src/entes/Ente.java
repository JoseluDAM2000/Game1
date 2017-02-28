package entes;

import mapa.Mapa;

public abstract class Ente {
	private int x;
	private int y;
	private boolean eliminado = false;
	protected Mapa mapa;

	public void actualizar() {
	}

	public void mostrar() {
	}

	public void eliminar() {
		eliminado = true;
	}

	public int obtenerPosicionX() {
		return x;
	}

	public int obtenerPosicionY() {
		return y;
	}

	public boolean estaEliminado() {
		return eliminado;
	}

	public void modificarPosicionX(int desplazamientoX) {
		x += desplazamientoX;
	}

	public void modificarPosicionY(int desplazamientoY) {
		y += desplazamientoY;
	}
}
