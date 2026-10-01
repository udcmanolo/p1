package e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaDistance {

    @Test
    void pruebaEjemplo() {
        char[][] distribucion = {
                {'A', '.', 'A', 'A', '.'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', '.', 'A', '.', 'A'},
                {'A', 'A', 'A', 'A', '.'},
                {'A', '.', 'A', 'A', '.'}
        };

        char[][] esperado = {
                {'#', '.', '#', 'A', '.'},
                {'#', 'A', '#', 'A', '#'},
                {'A', '.', '#', '.', '#'},
                {'#', 'A', 'A', 'A', '.'},
                {'#', '.', 'A', '#', '.'}
        };

        char[][] resultado = Distance.seatingPeople(distribucion);

        for (int fila = 0; fila < esperado.length; fila++) {
            assertArrayEquals(esperado[fila], resultado[fila]);
        }
    }

    @Test
    void pruebaSimple() {
        char[][] distribucion = {
                {'A', '.', 'A'}
        };

        char[][] esperado = {
                {'#', '.', '#'}
        };

        char[][] resultado = Distance.seatingPeople(distribucion);

        assertArrayEquals(esperado[0], resultado[0]);
    }

    @Test
    void pruebaNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Distance.seatingPeople(null)
        );
    }

    @Test
    void pruebaFilasDiferentes() {
        char[][] distribucion = {
                {'A', 'A'},
                {'A'}
        };

        assertThrows(
                IllegalArgumentException.class,
                () -> Distance.seatingPeople(distribucion)
        );
    }

    @Test
    void pruebaCaracterIncorrecto() {
        char[][] distribucion = {
                {'A', '.'},
                {'X', 'A'}
        };

        assertThrows(
                IllegalArgumentException.class,
                () -> Distance.seatingPeople(distribucion)
        );
    }
}