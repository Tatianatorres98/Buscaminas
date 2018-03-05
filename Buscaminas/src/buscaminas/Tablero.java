package buscaminas;

public class Tablero {

    private Emoji emoji;
    private Cronometro microno;
    private Contador contador;
    private Celda misceldas[][];

    public Tablero(int ancho, int largo) {

        misceldas = new Celda[ancho][largo];
        int fila;
        int columna;

        
        
        for (fila = 0; fila < largo; fila++) {
            for (columna = 0; columna < ancho; columna++) {
                misceldas[fila][columna] = new Celda();
            }
            Sembrador sembrador=new Sembrador();
            sembrador.sembrarminas(misceldas, 10);
            

        }

    }

}
