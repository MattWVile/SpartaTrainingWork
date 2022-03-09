package org.sparta.mv.enums;

import java.util.Arrays;

import static java.lang.System.*;

public enum GuitarStrings {
    lowE("Plays open Low E",'S'),
    A("Plays open A",'S'),
    D("Plays open D",'S'),
    G("Plays open G",'S'),
    B("Plays open B",'S'),
    highE("Plays open High E",'S');

    private String note;
    private char tuning;

    GuitarStrings(String note, char tuning) {
        this.note = note;
        this.tuning = tuning;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public char getTuning() {
        return tuning;
    }

    public void setTuning(char tuning) {
        this.tuning = tuning;
    }
    public static void main(String[] args) {
        GuitarStrings first = GuitarStrings.lowE;
        GuitarStrings last = GuitarStrings.highE;
        out.println(Arrays.toString(GuitarStrings.values()));
        out.println(last.compareTo(first));
        out.println(first.note);
        for(GuitarStrings strings : GuitarStrings.values()){
            out.println(strings.note + " "+ strings.tuning);
        }
    }
}
