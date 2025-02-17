package Restaurante;
/**
 * La clase RestauranteIsrael gestiona los comensales del restaurante Israel
 * 
 * @author Miguel Acedo
 * @version 1.0
 */

	public class RestauranteIsrael {
		/** Representa el número de patatas */
		private int patatas;
		/** Representa el número de calamares */
		private int calamares;
		private static RestauranteIsrael miRestaurante;
		/**
		 * Contructor de la clase RestauranteIsrael
		 * 
		 * @param a Indica el número de patatas que hay en el stock
		 * @param b Indica el número de calamares que hay en el stock
		 */
		public RestauranteIsrael(int a, int b) {
			this.setPatatas(a);
			this.setCalamares(b);
		}
		/**
		 * Método por el que se conoce el número máximo de comensales en función del
		 * número de patatas en stock
		 * 
		 * @return Devuelve el número de comensales
		 */

		int cantP() {
			int a = this.getPatatas() * 3;
			return a;
		}

		/**
		 * Método por el que se conoce el número máximo de comensales en función del
		 * número de calamares en stock
		 * 
		 * @return Devuelve el número de comensales
		 */
		int cantC() {
			int ch = this.getCalamares() * 6;
			return ch;
		}
		/**
		 * Método por el que se añade la cantidad de calamares recibidos en un pedido
		 * 
		 * @param c cantidad de calamares a añadir al stock
		 */

		public void addCalamares(int c) {
			this.setCalamares(this.getCalamares() + c);
		}
		/**
		 * Método por el que se añade la cantidad de patatas recibidos en un pedido
		 * 
		 * @param d cantidad de patatas a añadir al stock
		 */
		

		public void addPatatas(int d) {
			this.setPatatas(this.getPatatas() + d);
		}

		public static void main(String[] args) {
			miRestaurante = new RestauranteIsrael(50, 60);
			System.out.println("Cantidad de calamares: " + miRestaurante.getCalamares());
			System.out.println("Cantidad de patatas: " + miRestaurante.getPatatas());
			calculaComensales(miRestaurante);
			miRestaurante.addCalamares(1);
			miRestaurante.addPatatas(80);
			System.out.println("\nPedido Recibido!! Stock actual: ");
			System.out.println(miRestaurante.getPatatas() + " patatas.\n" + miRestaurante.getCalamares() + " calamares");
			calculaComensales(miRestaurante);
		}

		private static void calculaComensales(RestauranteIsrael r1) {
			if (r1.cantP() <= r1.cantC()) {
				System.out.println(
						"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
			} else {
				System.out.println(
						"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
			}
		}

		public int getCalamares() {
			return calamares;
		}

		public void setCalamares(int calamares) {
			this.calamares = calamares;
		}

		public int getPatatas() {
			return patatas;
		}

		public void setPatatas(int patatas) {
			this.patatas = patatas;
		}
	}

