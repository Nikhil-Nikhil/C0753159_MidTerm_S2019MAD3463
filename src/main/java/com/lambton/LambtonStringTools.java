package com.lambton;

public class LambtonStringTools {


    public void reversestring() {

        String s = "lambton";

        for (int i = 0; i <= s.length() - 1; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println("");

        for (int i = s.length() - 1; i >= 0; --i) {
            System.out.print(s.charAt(i));
        }
    }


    public int decimaltobinary(String c) {
        String str = "1000";
        double j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                j = j + Math.pow(2, str.length() - 1 - i);
            }

        }
        return (int) j;
    }



        public char[] frequent(String q) {
        String str ="Hello How are You? Are You Fine";

            int temp = 0;
            int count = 0;
            int current = 0;

            char[] maxchar = new char[str.length()];

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                for (int j = i + 1; j < str.length(); j++) {
                    char ch1 = str.charAt(j);

                    if (ch != ch1) {
                        count++;
                    }
                }

                if (count > temp) {
                    temp = count;
                    maxchar[current] = ch;
                    current++;
                }
            }
            return maxchar;
        }



    public void replacestring() {
            String s1 = "THE DOG JUMPED INTO THE FENCE";
            String s2 = "the";
            String s3 = "that";

            String replacestring = s1.replace(s2, s3);
        }



}