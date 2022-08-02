package test;

public class test {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        char[] arr = s.toCharArray();
        int[] arrInt = new int[arr.length];
        int cont = 0;
        int numero = 0;
        while (cont < arr.length) {
            switch (arr[cont]) {
                case 'I':
                    arrInt[cont] = 1;
                    break;
                case 'V':
                    arrInt[cont] = 5;
                    break;

                case 'X':
                    arrInt[cont] = 10;
                    break;
                case 'L':
                    arrInt[cont] = 50;
                    break;
                case 'C':
                    arrInt[cont] = 100;
                    break;
                case 'D':
                    arrInt[cont] = 500;
                    break;
                case 'M':
                    arrInt[cont] = 1000;
                    break;
            }
            cont++;
        }
        cont = 0;
        numero = 0;
        while (cont < arrInt.length - 1) {
            if (arrInt[cont] < arrInt[cont + 1]) {
                numero = numero + arrInt[cont + 1] - arrInt[cont];
                arrInt[cont] = 0;
                arrInt[cont + 1] = 0;
                cont += 2;
            } else {
                cont++;
            }

        }
        cont = 0;
        while (cont < arrInt.length) {
            if (arrInt[cont] != 0) {
                numero += arrInt[cont];
            }

            cont++;
        }

    
        System.out.println("numero = " + numero);

    }
}
