package com.example.iveci.mad6;

/**
 * Created by iveci on 2017-04-06.
 */

public class Rest {
    private String name = "";
    private String tel = "";
    int catnumber = 0;

    public Rest(String name, String tel, int catnumber) {
        this.name = name;
        this.tel = tel;
        this.catnumber = catnumber;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public int getCatnumber() {
        return catnumber;
    }

    @Override
    public String toString() {
        return name;
    }
}
