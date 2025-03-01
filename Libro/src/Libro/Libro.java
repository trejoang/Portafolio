package Libro;

public class Libro {
	//declaramos atributos
		private String nombre;
		private String autor;
		private String editorial;
		private int noPaginas;
		private double precio;
		
		public Libro () {
			
		}

		public Libro(String nombre, String autor, String editorial, int noPaginas, double precio) {
			super();
			this.nombre = nombre;
			this.autor = autor;
			this.editorial = editorial;
			this.noPaginas = noPaginas;
			this.precio = precio;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getEditorial() {
			return editorial;
		}

		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}

		public int getNoPaginas() {
			return noPaginas;
		}

		public void setNoPaginas(int noPaginas) {
			this.noPaginas = noPaginas;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		@Override
		public String toString() {
			return "Libro [nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + ", noPaginas=" + noPaginas
					+ ", precio=" + precio + "]\n";
		}
		
		

	}
