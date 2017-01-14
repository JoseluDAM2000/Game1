package graficos;

public final class Sprite {

	private final int lado;
	private int x;
	private int y;
	public int[] pixeles;
	private HojaSprites hoja;

	// colección de sprites
	public static final Sprite VACIO = new Sprite(32, 0);
	public static final Sprite HIERBA1 = new Sprite(32, 0, 0, HojaSprites.texturas);
	public static final Sprite HIERBA2 = new Sprite(32, 1, 0, HojaSprites.texturas);
	public static final Sprite HIERBA3 = new Sprite(32, 2, 0, HojaSprites.texturas);
	public static final Sprite HIERBA4 = new Sprite(32, 0, 1, HojaSprites.texturas);
	public static final Sprite HIERBA5 = new Sprite(32, 1, 1, HojaSprites.texturas);
	public static final Sprite HIERBA6 = new Sprite(32, 2, 1, HojaSprites.texturas);
	public static final Sprite HIERBA7 = new Sprite(32, 0, 2, HojaSprites.texturas);
	public static final Sprite HIERBA8 = new Sprite(32, 1, 2, HojaSprites.texturas);
	public static final Sprite HIERBA9 = new Sprite(32, 2, 2, HojaSprites.texturas);
	public static final Sprite HIERBA10 = new Sprite(32, 0, 3, HojaSprites.texturas);
	public static final Sprite HIERBA11 = new Sprite(32, 1, 3, HojaSprites.texturas);
	public static final Sprite HIERBA12 = new Sprite(32, 2, 3, HojaSprites.texturas);
	public static final Sprite HIERBA13 = new Sprite(32, 0, 4, HojaSprites.texturas);
	public static final Sprite HIERBA14 = new Sprite(32, 1, 4, HojaSprites.texturas);
	public static final Sprite HIERBA15 = new Sprite(32, 2, 4, HojaSprites.texturas);
	public static final Sprite HIERBA16 = new Sprite(32, 1, 5, HojaSprites.texturas);
	public static final Sprite PIEDRA1 = new Sprite(32, 2, 5, HojaSprites.texturas);
	public static final Sprite PIEDRA2 = new Sprite(32, 0, 6, HojaSprites.texturas);
	public static final Sprite PIEDRA3 = new Sprite(32, 1, 6, HojaSprites.texturas);
	public static final Sprite PIEDRA4 = new Sprite(32, 2, 6, HojaSprites.texturas);
	public static final Sprite FLOR1 = new Sprite(32, 0, 5, HojaSprites.texturas);
	public static final Sprite FLOR2 = new Sprite(32, 0, 7, HojaSprites.texturas);
	public static final Sprite FLOR3 = new Sprite(32, 1, 7, HojaSprites.texturas);
	public static final Sprite TOCON = new Sprite(32, 2, 7, HojaSprites.texturas);
	public static final Sprite INTERRUPTOR1 = new Sprite(32, 0, 8, HojaSprites.texturas);
	public static final Sprite INTERRUPTOR2 = new Sprite(32, 1, 8, HojaSprites.texturas);
	public static final Sprite INTERRUPTOR3 = new Sprite(32, 2, 8, HojaSprites.texturas);
	public static final Sprite INTERRUPTOR4 = new Sprite(32, 0, 9, HojaSprites.texturas);
	public static final Sprite INTERRUPTOR5 = new Sprite(32, 1, 9, HojaSprites.texturas);
	public static final Sprite INTERRUPTOR6 = new Sprite(32, 2, 9, HojaSprites.texturas);
	public static final Sprite TEMPLO1 = new Sprite(32, 3, 0, HojaSprites.texturas);
	public static final Sprite TEMPLO2 = new Sprite(32, 3, 1, HojaSprites.texturas);
	public static final Sprite TEMPLO3 = new Sprite(32, 3, 2, HojaSprites.texturas);
	public static final Sprite TEMPLO4 = new Sprite(32, 3, 3, HojaSprites.texturas);
	public static final Sprite TEMPLO5 = new Sprite(32, 3, 4, HojaSprites.texturas);
	public static final Sprite TEMPLO6 = new Sprite(32, 3, 5, HojaSprites.texturas);
	public static final Sprite TEMPLO7 = new Sprite(32, 3, 6, HojaSprites.texturas);
	public static final Sprite TEMPLO8 = new Sprite(32, 3, 7, HojaSprites.texturas);
	public static final Sprite TEMPLO9 = new Sprite(32, 3, 8, HojaSprites.texturas);
	public static final Sprite TEMPLO10 = new Sprite(32, 3, 9, HojaSprites.texturas);
	public static final Sprite TEMPLO11 = new Sprite(32, 4, 0, HojaSprites.texturas);
	public static final Sprite TEMPLO12 = new Sprite(32, 4, 1, HojaSprites.texturas);
	public static final Sprite TEMPLO13 = new Sprite(32, 4, 2, HojaSprites.texturas);
	public static final Sprite TEMPLO14 = new Sprite(32, 4, 3, HojaSprites.texturas);
	public static final Sprite TEMPLO15 = new Sprite(32, 4, 4, HojaSprites.texturas);
	public static final Sprite TEMPLO16 = new Sprite(32, 4, 5, HojaSprites.texturas);
	public static final Sprite TEMPLO17 = new Sprite(32, 4, 6, HojaSprites.texturas);
	public static final Sprite TEMPLO18 = new Sprite(32, 4, 7, HojaSprites.texturas);
	public static final Sprite TEMPLO19 = new Sprite(32, 4, 8, HojaSprites.texturas);
	public static final Sprite TEMPLO20 = new Sprite(32, 4, 9, HojaSprites.texturas);
	public static final Sprite TEMPLO21 = new Sprite(32, 5, 0, HojaSprites.texturas);
	public static final Sprite TEMPLO22 = new Sprite(32, 5, 1, HojaSprites.texturas);
	public static final Sprite TEMPLO23 = new Sprite(32, 5, 2, HojaSprites.texturas);
	public static final Sprite TEMPLO24 = new Sprite(32, 5, 3, HojaSprites.texturas);
	public static final Sprite TEMPLO25 = new Sprite(32, 5, 4, HojaSprites.texturas);
	public static final Sprite TEMPLO26 = new Sprite(32, 5, 5, HojaSprites.texturas);
	public static final Sprite TEMPLO27 = new Sprite(32, 5, 6, HojaSprites.texturas);
	public static final Sprite TEMPLO28 = new Sprite(32, 5, 7, HojaSprites.texturas);
	public static final Sprite TEMPLO29 = new Sprite(32, 5, 8, HojaSprites.texturas);
	public static final Sprite TEMPLO30 = new Sprite(32, 5, 9, HojaSprites.texturas);
	public static final Sprite TEMPLO31 = new Sprite(32, 6, 0, HojaSprites.texturas);
	public static final Sprite TEMPLO32 = new Sprite(32, 6, 1, HojaSprites.texturas);
	public static final Sprite TEMPLO33 = new Sprite(32, 6, 2, HojaSprites.texturas);
	public static final Sprite TEMPLO34 = new Sprite(32, 6, 3, HojaSprites.texturas);
	public static final Sprite TEMPLO35 = new Sprite(32, 6, 4, HojaSprites.texturas);
	public static final Sprite TEMPLO36 = new Sprite(32, 6, 5, HojaSprites.texturas);
	public static final Sprite TEMPLO37 = new Sprite(32, 6, 6, HojaSprites.texturas);
	public static final Sprite TEMPLO38 = new Sprite(32, 6, 7, HojaSprites.texturas);
	public static final Sprite TEMPLO39 = new Sprite(32, 7, 0, HojaSprites.texturas);
	public static final Sprite TEMPLO40 = new Sprite(32, 7, 1, HojaSprites.texturas);
	public static final Sprite TEMPLO41 = new Sprite(32, 7, 2, HojaSprites.texturas);
	public static final Sprite TEMPLO42 = new Sprite(32, 7, 3, HojaSprites.texturas);
	public static final Sprite TEMPLO43 = new Sprite(32, 7, 4, HojaSprites.texturas);
	public static final Sprite TEMPLO44 = new Sprite(32, 7, 5, HojaSprites.texturas);
	public static final Sprite TEMPLO45 = new Sprite(32, 7, 6, HojaSprites.texturas);
	public static final Sprite TEMPLO46 = new Sprite(32, 7, 7, HojaSprites.texturas);
	public static final Sprite TEMPLO47 = new Sprite(32, 8, 0, HojaSprites.texturas);
	public static final Sprite TEMPLO48 = new Sprite(32, 8, 1, HojaSprites.texturas);
	public static final Sprite TEMPLO49 = new Sprite(32, 8, 2, HojaSprites.texturas);
	public static final Sprite TEMPLO50 = new Sprite(32, 8, 3, HojaSprites.texturas);
	public static final Sprite TEMPLO51 = new Sprite(32, 8, 4, HojaSprites.texturas);
	public static final Sprite TEMPLO52 = new Sprite(32, 8, 5, HojaSprites.texturas);
	public static final Sprite TEMPLO53 = new Sprite(32, 8, 6, HojaSprites.texturas);
	public static final Sprite TEMPLO54 = new Sprite(32, 8, 7, HojaSprites.texturas);
	// fin de la colección

	public Sprite(final int lado, final int columna, final int fila, final HojaSprites hoja) {
		this.lado = lado;
		pixeles = new int[lado * lado];
		this.x = columna * lado;
		this.y = fila * lado;
		this.hoja = hoja;
		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.obtenAncho()];
			}
		}
	}

	public Sprite(final int lado, final int color) {
		this.lado = lado;
		pixeles = new int[lado * lado];
		for (int i = 0; i < pixeles.length; i++) {
			pixeles[i] = color;
		}
	}

	public int obtenLado() {
		return lado;
	}
}
