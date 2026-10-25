package com.umeng.commonsdk.vchannel;

import l.C16014;
import l.C5368;

/* compiled from: Y5AS */
/* loaded from: classes.dex */
public class a {
    public static String a = "https://pslog.umeng.com";
    public static String b = "https://pslog.umeng.com/";
    public static String c = "explog";
    public static final String d = "analytics";
    public static final String e = "ekv";
    public static final String f = "id";
    public static final String g = "ts";
    public static final String h = "ds";
    public static final String i = "pn";
    public static String j = "";

    static {
        String m37865 = C16014.m37865(System.currentTimeMillis(), "SUB");
        StringBuilder m15339 = C5368.m15339(m37865);
        m15339.append(String.format("%0" + (32 - m37865.length()) + "d", 0));
        j = m15339.toString();
    }
}
