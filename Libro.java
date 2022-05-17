package comunicacion;

public class Libro extends Escrito {
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}

	public String getCo_autor() {
		return this.co_autor;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public String getEdicion() {
		return this.edicion;
	}

    public int palabrasTotales(int palabrasPagina){
		int factor = 2;
		return this.getPaginas()* palabrasPagina * factor;
    }

    public String interpretacion() {
        return this.interpretacion;
    } 

    public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.co_autor + "\n";
		r += this.editorial + "\n";
		r += this.edicion;
        return r;
    }
}
