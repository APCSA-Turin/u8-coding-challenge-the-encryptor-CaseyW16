package com.example.project;

public class Test {
    public static void main(String[] args) {
        // String str = "Blah blah blah blah. Something something. Hmmmm. Hmmmmmmm. Something: blah blah blah, blah blah.";
        // int rows = 9;
        // String msg = Encryptor.encryptMessage(str, rows);
        // System.out.println(msg);
        // String msg2 = Encryptor.decryptMessage(msg, rows);
        // System.out.println(msg2);
        String decryptStr = "bSommill=  sHmhbb=h.  mt  =ahg.meh,.langmmahhblinHolaa bhi Sbllh th.  bbahetm.:  lamemmghhBlommmnaa";
        System.out.println(Encryptor.decryptMessage(decryptStr, 9));
    }
}