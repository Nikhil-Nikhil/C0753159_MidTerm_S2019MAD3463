package com.lambton;

public class LambtonStringTools {



    public void reversestring()
    {

            String s="lambton";

            for(int i=0;i<=s.length()-1;i++)
            {
                System.out.print(s.charAt(i));
            }
            System.out.println("");

            for(int i = s.length() - 1; i >= 0; --i) {
                System.out.print(s.charAt(i));
            }
        }


    public void binarytodecimal()
    {

    }

    public void replacestring()
    {
        String s1="THE DOG JUMPED INTO THE FENCE";
        String s2="the";
        String s3="that";

        String replacestring=s1.replace(s2,s3);
    }



}
