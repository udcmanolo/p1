package e1;

public class StringCount {

    public static int countWords(String texto) {
        if (texto == null) {
            return 0;
        }

        int contador = 0;
        boolean dentroPalabra = false;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                if (!dentroPalabra) {
                    contador++;
                    dentroPalabra = true;
                }
            } else {
                dentroPalabra = false;
            }
        }

        return contador;
    }

    public static int countChar(String texto, char caracter) {
        if (texto == null) {
            return 0;
        }

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }

        return contador;
    }

    public static int countCharIgnoringCase(String texto, char caracter) {
        if (texto == null) {
            return 0;
        }

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (Character.toLowerCase(texto.charAt(i)) ==
                    Character.toLowerCase(caracter)) {
                contador++;
            }
        }

        return contador;
    }

    public static boolean isPasswordSafe(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean especial = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);

            if (Character.isUpperCase(caracter)) {
                mayuscula = true;
            }

            if (Character.isLowerCase(caracter)) {
                minuscula = true;
            }

            if (Character.isDigit(caracter)) {
                numero = true;
            }

            if (caracter == '?' || caracter == '@' || caracter == '#' ||
                    caracter == '$' || caracter == '.' || caracter == ',') {
                especial = true;
            }
        }

        return mayuscula && minuscula && numero && especial;
    }
}