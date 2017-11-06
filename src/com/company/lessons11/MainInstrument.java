package com.company.lessons11;

import com.company.lessons11.taskInstrument.Baraban;
import com.company.lessons11.taskInstrument.Gitara;
import com.company.lessons11.taskInstrument.Instrument;
import com.company.lessons11.taskInstrument.Truba;

public class MainInstrument {
    public static void main(String[] args) {
        Instrument instrument[] = new Instrument[3];
        instrument[0] = new Baraban();
        instrument[1] = new Gitara();
        instrument[2] = new Truba();
        for (Instrument tmp : instrument) {
            tmp.play();
        }
    }
}
