package com.umeng.analytics.pro;

/* compiled from: 746V */
/* loaded from: classes.dex */
public class au extends bb {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final bz j = new bz("TApplicationException");
    public static final bp k = new bp("message", (byte) 11, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final bp f77927l = new bp("type", (byte) 8, 2);
    public static final long m = 1;
    public int i;

    public au() {
        this.i = 0;
    }

    public au(int i) {
        this.i = i;
    }

    public au(int i, String str) {
        super(str);
        this.i = i;
    }

    public au(String str) {
        super(str);
        this.i = 0;
    }

    public int a() {
        return this.i;
    }

    public static au a(bu buVar) {
        buVar.j();
        String str = null;
        int i = 0;
        while (true) {
            bp l2 = buVar.l();
            byte b2 = l2.b;
            if (b2 != 0) {
                short s = l2.c;
                if (s != 1) {
                    if (s != 2) {
                        bx.a(buVar, b2);
                    } else if (b2 == 8) {
                        i = buVar.w();
                    } else {
                        bx.a(buVar, b2);
                    }
                } else if (b2 == 11) {
                    str = buVar.z();
                } else {
                    bx.a(buVar, b2);
                }
                buVar.m();
            } else {
                buVar.k();
                return new au(i, str);
            }
        }
    }

    public void b(bu buVar) {
        buVar.a(j);
        if (getMessage() != null) {
            buVar.a(k);
            buVar.a(getMessage());
            buVar.c();
        }
        buVar.a(f77927l);
        buVar.a(this.i);
        buVar.c();
        buVar.d();
        buVar.b();
    }
}
