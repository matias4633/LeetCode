package longestcommonprefix;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        boolean caracterIgual = true;
        int cont = 0;
        int caracter = 0;
        String respuesta = "";
        char c;
        String referencia = strs[0];

        for (String valor : strs) {
            if (valor.length() > referencia.length()) {
                referencia = valor;
            }
        }
        if (referencia.isBlank()) {
            return respuesta;
        }
        while (caracterIgual && cont < referencia.length()) {

            c = referencia.charAt(caracter);
            for (String cadena : strs) {
                if (cont >= cadena.length() || Character.compare(cadena.charAt(cont), c) != 0) {
                    caracterIgual = false;
                }
            }
            if (caracterIgual == false) {
                break;
            }
            respuesta += c;
            caracter++;
            cont++;

        }
        System.out.println(respuesta);
        return respuesta;
    }

}
