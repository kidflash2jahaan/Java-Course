package com.systemerr.javacourse.encapsulationchallenge;

public class Printer {
    private int tonerLevel = 0;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        addToner(tonerLevel);
    }

    public int addToner(int tonerAmount) {
        int newAmount = tonerLevel += tonerAmount;
        if (newAmount < 0 || newAmount > 100) {
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        if (duplex) {
            pages = Math.ceilDiv(pages, 2);
        }
        pagesPrinted += pages;
        return pages;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public boolean getDuplex() {
        return this.duplex;
    }

    public boolean isDuplex() {
        return this.duplex;
    }
}
