package e2;

public class Distance {

    public static char[][] seatingPeople(char[][] distribucion) {
        comprobarDistribucion(distribucion);

        char[][] aula = copiar(distribucion);
        boolean hayCambios = true;

        while (hayCambios) {
            hayCambios = false;
            char[][] aulaNueva = copiar(aula);

            for (int fila = 0; fila < aula.length; fila++) {
                for (int columna = 0; columna < aula[fila].length; columna++) {

                    if (aula[fila][columna] == 'A') {
                        if (contarOcupados(aula, fila, columna) == 0) {
                            aulaNueva[fila][columna] = '#';
                            hayCambios = true;
                        }
                    } else if (aula[fila][columna] == '#') {
                        if (contarOcupados(aula, fila, columna) >= 4) {
                            aulaNueva[fila][columna] = 'A';
                            hayCambios = true;
                        }
                    }
                }
            }

            aula = aulaNueva;
        }

        return aula;
    }

    private static void comprobarDistribucion(char[][] distribucion) {
        if (distribucion == null) {
            throw new IllegalArgumentException();
        }

        if (distribucion.length == 0) {
            return;
        }

        if (distribucion[0] == null) {
            throw new IllegalArgumentException();
        }

        int columnas = distribucion[0].length;

        for (int fila = 0; fila < distribucion.length; fila++) {
            if (distribucion[fila] == null ||
                    distribucion[fila].length != columnas) {
                throw new IllegalArgumentException();
            }

            for (int columna = 0;
                 columna < distribucion[fila].length;
                 columna++) {

                if (distribucion[fila][columna] != 'A' &&
                        distribucion[fila][columna] != '.') {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    private static int contarOcupados(char[][] aula, int fila, int columna) {
        int contador = 0;

        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {

                if (i >= 0 && i < aula.length &&
                        j >= 0 && j < aula[i].length) {

                    if (!(i == fila && j == columna)) {
                        if (aula[i][j] == '#') {
                            contador++;
                        }
                    }
                }
            }
        }

        return contador;
    }

    private static char[][] copiar(char[][] aula) {
        char[][] copia = new char[aula.length][];

        for (int fila = 0; fila < aula.length; fila++) {
            copia[fila] = new char[aula[fila].length];

            for (int columna = 0;
                 columna < aula[fila].length;
                 columna++) {

                copia[fila][columna] = aula[fila][columna];
            }
        }

        return copia;
    }
}