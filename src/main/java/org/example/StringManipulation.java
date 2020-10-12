package org.example;

public class StringManipulation {

    public static void main(String[] args) {

    }

    static boolean checkEncoding(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            Character ci = input.charAt(i);
            int count = 1;
            sb.append(ci);
            int j = i+1;
            for (; j < input.length(); j++) {
                Character cj = input.charAt(i);
                if (ci.equals(cj)) {
                    ++count;
                    i = j;
                }
                break;
            }
            sb.append(count);
        }
        System.out.println(sb.toString());

        return sb.toString().length() < input.length();
    }
}
