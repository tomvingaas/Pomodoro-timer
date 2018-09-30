package com.tomvingaas.pomodorotimer.model;

public enum AttemptKind {
    FOCUS(25 *60, "Fokusér"),
    BREAK(5*60, "Slapp Av");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
