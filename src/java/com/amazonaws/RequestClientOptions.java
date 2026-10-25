package com.amazonaws;

import java.util.EnumMap;
import l.C22870;

/* loaded from: classes.dex */
public final class RequestClientOptions {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumMap f113 = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m196(Marker marker) {
        return (String) this.f113.get(marker);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m197(String str) {
        Marker marker = Marker.USER_AGENT;
        EnumMap enumMap = this.f113;
        String str2 = (String) enumMap.get(marker);
        if (str2 == null) {
            str2 = "";
        }
        if (!str2.contains(str)) {
            str2 = C22870.m50967(str2, " ", str);
        }
        enumMap.put((EnumMap) marker, (Marker) str2);
    }
}
