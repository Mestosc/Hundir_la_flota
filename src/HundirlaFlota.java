/**
 * Representacion del juego de hundir la flota
 * @author Oscar Rodriguez
 * @version 1.0
 */
public class HundirlaFlota {
    public static void main(String[] args) {
        int[][] barcos =
                {
                {4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,0,0,2},
                {0,1,0,0,0}
                };
        recorrerTablero(barcos);
       mostrarTocado(barcos,0,0);
       mostrarNaveCoordenadaLetra(barcos,coordenadaANumero('D'), coordenadaANumero('E'));
    }

    /**
     * Recorrer un tablero de hundir la flota ejecutando una funcion que muestra las naves para mostrar todas las naves
     * @param tablero el tablero que queremos recoorrer
     */
    static void recorrerTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                mostrarNave(tablero,i,j);
            }
        }
    }
    /**
     * Recorre el tablero pero pasandole letras como coordenadas, y mostrandolas en ese formato
     * @param tablero el tablero que queremos recorrer
     */
    static void recorrerTableroConLetra(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                mostrarNaveCoordenadaLetra(tablero,i,j);
            }
        }
    }
    static void mostrarTocado(int[][] tablero, int coordenada1, int coordenada2) {
        if (saberEsNave(tablero,coordenada1,coordenada2)) {
            System.out.println("Coordenadas " + coordenada1 + " " + coordenada2 + " tocado");
        }
        else {
            System.out.println("En las coordenadas " + coordenada1 + " " + coordenada2 + " hay agua");
        }
    }
    /**
     * Nos indica si es nave
     * @param tablero el tablero en el queremos comprobar si es una nave
     * @param coordenada1 la primera coordenada
     * @param coordenada2 la segunda coordenada
     * @return true si es nave false si no
     */
    static boolean saberEsNave(int[][] tablero, int coordenada1, int coordenada2) {
        return tablero[coordenada1][coordenada2] > 0;
    }

    /**
     * Muestra el tipo de nave que es
     * @param tablero le pasamos el tablero
     * @param coordenada1 le indicamos la primera coordenada
     * @param coordenada2 le indicamos la segunda coordenada
     */
    static void mostrarNave(int[][] tablero,int coordenada1, int coordenada2) {
        if (saberEsNave(tablero,coordenada1,coordenada2)) { // Verificamos si es una nave
            switch (tablero[coordenada1][coordenada2]) { // Luego dependiendo del tipo de nave mostramos una cosa u otra
                case 1-> System.out.println("La nave en las coordenadas " + coordenada1 + " " + coordenada2 + " es un barco");
                case 2-> System.out.println("La nave en las coordenadas " + coordenada1 + " " + coordenada2 + " es un barco más grande");
                case 4-> System.out.println("La nave en las coordenadas " + coordenada1 + " " + coordenada2 + " es un portaaviones");
                default-> System.out.println("No se conoce esta ubicacion");
            }
        }}
    static void mostrarNaveCoordenadaLetra(int[][] tablero,int coordenada1, int coordenada2) {
        if (saberEsNave(tablero,coordenada1,coordenada2)) { // Verificamos si es una nave
            switch (tablero[coordenada1][coordenada2]) { // Luego dependiendo del tipo de nave mostramos una cosa u otra
                case 1-> System.out.println("La nave en las coordenadas " + coordenadaALetra(coordenada1) + " " + coordenadaALetra(coordenada2) + " es un barco");
                case 2-> System.out.println("La nave en las coordenadas " + coordenadaALetra(coordenada1) + " " + coordenadaALetra(coordenada2) + " es un barco más grande");
                case 4-> System.out.println("La nave en las coordenadas " + coordenadaALetra(coordenada1) + " " + coordenadaALetra(coordenada2) + " es un portaaviones");
                default-> System.out.println("No se conoce esta ubicacion");
            }
        }}

    /**
     * Convierte a numeros las coordenadas pasadas como letras
     * @param letra la letra que queremos convertir en su equivalente numerico
     * @return Nos devuelve el numero
     */
    static int coordenadaANumero(char letra) {
        switch (letra) {
            case 'A','a' -> {
                return 0;
            }
            case 'B','b'-> {
                return 1;
            }
            case 'C','c'-> {
                return 2;
            }
            case 'D','d'-> {
                return 3;
            }
            case 'E','e'-> {
                return 4;
            }
            default -> {
                return -1;
            }

        }
    }
    static char coordenadaALetra(int num) {
        switch (num) {
            case 0 -> {
                return 'A';
            }
            case 1-> {
                return 'B';
            }
            case 2-> {
                return 'C';
            }
            case 3-> {
                return 'D';
            }
            case 4-> {
                return 'E';
            }
            default -> {
                return 'W';
            }

        }
    }

}


