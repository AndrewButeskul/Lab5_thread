package com.anskul.lab_5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.net.URL;
import java.nio.charset.Charset;

public class Branchs implements Serializable {
    private ArrayList<Branch> branchs = null;
    //private int count;

    public ArrayList<Branch> getBranchs() {
        return branchs;
    }

    public void setBranchs(ArrayList<Branch> branchs) {
        this.branchs = branchs;
    }

//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }

    public Branchs loadJason(String url) throws IOException
    {
        StringBuilder jsonIn = new StringBuilder();
        InputStream is = null;
        is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

            int cp;
            while ((cp = rd.read()) != -1) {
                jsonIn.append((char) cp);
            }
        }
        finally {
            is.close();
        }

        return new ObjectMapper().readValue(jsonIn.toString(), Branchs.class);
    }

    @Override
    public String toString(){
        return "branchs:\n" + branchs;
    }

    //"Count: " + count +

}
