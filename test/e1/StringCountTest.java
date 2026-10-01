package e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaStringCount {

    @Test
    void pruebaContarPalabras() {
        assertEquals(6, StringCount.countWords("Hoy tengo clase por la tarde"));
        assertEquals(3, StringCount.countWords("Hola   que   tal"));
        assertEquals(2, StringCount.countWords("  Buenas tardes  "));
        assertEquals(0, StringCount.countWords(""));
        assertEquals(0, StringCount.countWords(null));
    }


    testestestet




    @Test
    void pruebaContarCaracter() {
        assertEquals(3, StringCount.countChar("programar", 'r'));
        assertEquals(0, StringCount.countChar("programar", 'x'));
        assertEquals(0, StringCount.countChar(null, 'a'));
    }

    @Test
    void pruebaContarCaracterSinMayusculas() {
        assertEquals(4, StringCount.countCharIgnoringCase("aAaA", 'a'));
        assertEquals(2, StringCount.countCharIgnoringCase("aAáÁ", 'á'));
        assertEquals(0, StringCount.countCharIgnoringCase(null, 'a'));
    }

    @Test
    void pruebaContrasena() {
        assertTrue(StringCount.isPasswordSafe("Hola123?"));

        assertFalse(StringCount.isPasswordSafe("Ho1?"));
        assertFalse(StringCount.isPasswordSafe("hola123?"));
        assertFalse(StringCount.isPasswordSafe("HOLA123?"));
        assertFalse(StringCount.isPasswordSafe("Holaabcd?"));
        assertFalse(StringCount.isPasswordSafe("Hola1234"));
    }
}