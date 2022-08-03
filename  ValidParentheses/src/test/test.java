package test;

import java.util.*;

public class test {

    public static void main(String[] args) {
        String s = "))";
        System.out.print(isValid(s));

    }

    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        List<Character> pila = new ArrayList<>();

        for (char c : arr) {

            if (c == '(' || c == '[' || c == '{' || pila.isEmpty()) {
                pila.add(c);
                
            } else if (c == ')' || c == ']' || c == '}' || !pila.isEmpty()) {
                
                char verificador = pila.get(pila.size() - 1);
                pila.remove(pila.size() - 1);

                switch (verificador) {
                    case '(':
                        if (c != ')') {
                            return false;
                        }
                        break;
                    case '[':
                        if (c != ']') {
                            return false;
                        }
                        break;
                    case '{':
                        if (c != '}') {
                            return false;
                        }
                        break;
                    default:
                        return false;

                }
            }

        }

        if (!pila.isEmpty()) {
            return false;
        }

        return true;

    }
}
