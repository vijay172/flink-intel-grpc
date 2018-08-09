package com.intel.flink.datatypes;

import org.apache.flink.api.java.tuple.Tuple2;

public class CameraTuple extends Tuple2<String, String> {

    public CameraTuple() {}

    public CameraTuple(final String cam, final String roi) {
        this.f0 = cam;
        this.f1 = roi;
    }

    public String getCamera() {
        return this.f0;
    }

    public void setCamera(String cam) {
        this.f0 = cam;
    }

    public String getRoi() {
        return this.f1;
    }

    public void setRoi(String roi) {
        this.f1 = roi;
    }

    @Override
    public String toString() {
        return "CameraTuple{" +
                "f0=" + f0 +
                ", f1=" + f1 +
                '}';
    }
}
