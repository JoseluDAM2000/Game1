package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import mapa.cuadro.Cuadro;

public class MapaCargado extends Mapa {

	private int[] pixeles;

	public MapaCargado(String ruta) {
		super(ruta);
	}

	protected void cargarMapa(String ruta) {
		try {
			BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
			ancho = imagen.getWidth();
			alto = imagen.getHeight();

			cuadrosCatalogo = new Cuadro[ancho * alto];
			pixeles = new int[ancho * alto];
			imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void generarMapa() {
		for (int i = 0; i < pixeles.length; i++) {
			switch (pixeles[i]) {
			case 0xff0fff41:
				cuadrosCatalogo[i] = Cuadro.HIERBA1;
				continue;
			case 0xff0ef43e:
				cuadrosCatalogo[i] = Cuadro.HIERBA4;
				continue;
			case 0xffbbff6b:
				cuadrosCatalogo[i] = Cuadro.HIERBA2;
				continue;
			case 0xffe4ff2c:
				cuadrosCatalogo[i] = Cuadro.HIERBA3;
				continue;
			case 0xffa7e460:
				cuadrosCatalogo[i] = Cuadro.HIERBA5;
				continue;
			case 0xffd9f32b:
				cuadrosCatalogo[i] = Cuadro.HIERBA6;
				continue;
			case 0xff0de83a:
				cuadrosCatalogo[i] = Cuadro.HIERBA7;
				continue;
			case 0xff97ce56:
				cuadrosCatalogo[i] = Cuadro.HIERBA8;
				continue;
			case 0xffd5ee2a:
				cuadrosCatalogo[i] = Cuadro.HIERBA9;
				continue;
			case 0xffb8ce24:
				cuadrosCatalogo[i] = Cuadro.PIEDRA1;
				continue;
			case 0xff6f983f:
				cuadrosCatalogo[i] = Cuadro.PIEDRA3;
				continue;
			case 0xffaec322:
				cuadrosCatalogo[i] = Cuadro.PIEDRA4;
				continue;
			case 0xff08c42f:
				cuadrosCatalogo[i] = Cuadro.FLOR1;
				continue;
			case 0xff08b12b:
				cuadrosCatalogo[i] = Cuadro.FLOR2;
				continue;
			case 0xff668b3a:
				cuadrosCatalogo[i] = Cuadro.FLOR3;
				continue;
			case 0xffa5b820:
				cuadrosCatalogo[i] = Cuadro.TOCON;
				continue;
			case 0xff91a21d:
				cuadrosCatalogo[i] = Cuadro.INTERRUPTOR6;
				continue;
			case 0xffe8c20d:
				cuadrosCatalogo[i] = Cuadro.TEMPLO3;
				continue;
			case 0xffdbb60a:
				cuadrosCatalogo[i] = Cuadro.TEMPLO4;
				continue;
			case 0xff8b7408:
				cuadrosCatalogo[i] = Cuadro.TEMPLO10;
				continue;
			case 0xffffa00b:
				cuadrosCatalogo[i] = Cuadro.TEMPLO11;
				continue;
			case 0xfff2980a:
				cuadrosCatalogo[i] = Cuadro.TEMPLO12;
				continue;
			case 0xffe8920a:
				cuadrosCatalogo[i] = Cuadro.TEMPLO13;
				continue;
			case 0xffdc8a09:
				cuadrosCatalogo[i] = Cuadro.TEMPLO14;
				continue;
			case 0xff986007:
				cuadrosCatalogo[i] = Cuadro.TEMPLO20;
				continue;
			case 0xffe76a0e:
				cuadrosCatalogo[i] = Cuadro.TEMPLO23;
				continue;
			case 0xffdc650e:
				cuadrosCatalogo[i] = Cuadro.TEMPLO24;
				continue;
			case 0xffdb3b0f:
				cuadrosCatalogo[i] = Cuadro.TEMPLO34;
				continue;
			case 0xffab2f0d:
				cuadrosCatalogo[i] = Cuadro.TEMPLO38;
				continue;
			case 0xfff01717:
				cuadrosCatalogo[i] = Cuadro.TEMPLO39;
				continue;
			case 0xfff10e24:
				cuadrosCatalogo[i] = Cuadro.TEMPLO47;
				continue;
			default:
				cuadrosCatalogo[i] = Cuadro.VACIO;
			}
		}
	}
}
