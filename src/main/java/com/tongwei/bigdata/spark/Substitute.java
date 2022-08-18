package com.tongwei.bigdata.spark;

/**
 * Created on 2021/8/12.
 *
 * @author 黑皮大野猪
 */
public class Substitute {

    private String original;

    private String value;

    private int start;

    private int stop;

    public Substitute(String original, String value, int start, int stop) {
        this.original = original;
        this.value = value;
        this.start = start;
        this.stop = stop;
    }

    public String getOriginal() {
        return original;
    }

    public String getValue() {
        return value;
    }

    public int getStart() {
        return start;
    }

    public int getStop() {
        return stop;
    }
}
