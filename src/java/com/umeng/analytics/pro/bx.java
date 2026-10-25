package com.umeng.analytics.pro;

import com.umeng.analytics.pro.bo;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: S4JL */
/* loaded from: classes.dex */
public class bx {
    public static int a = Integer.MAX_VALUE;

    public static void a(int i) {
        a = i;
    }

    public static void a(bu buVar, byte b) {
        a(buVar, b, a);
    }

    public static void a(bu buVar, byte b, int i) {
        if (i <= 0) {
            throw new bb("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                buVar.t();
                return;
            case 3:
                buVar.u();
                return;
            case 4:
                buVar.y();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                buVar.v();
                return;
            case 8:
                buVar.w();
                return;
            case 10:
                buVar.x();
                return;
            case 11:
                buVar.A();
                return;
            case 12:
                buVar.j();
                while (true) {
                    byte b2 = buVar.l().b;
                    if (b2 != 0) {
                        a(buVar, b2, i - 1);
                        buVar.m();
                    } else {
                        buVar.k();
                        return;
                    }
                }
            case 13:
                br n = buVar.n();
                while (i2 < n.c) {
                    int i3 = i - 1;
                    a(buVar, n.a, i3);
                    a(buVar, n.b, i3);
                    i2++;
                }
                buVar.o();
                return;
            case 14:
                by r = buVar.r();
                while (i2 < r.b) {
                    a(buVar, r.a, i - 1);
                    i2++;
                }
                buVar.s();
                return;
            case 15:
                bq p = buVar.p();
                while (i2 < p.b) {
                    a(buVar, p.a, i - 1);
                    i2++;
                }
                buVar.q();
                return;
        }
    }

    public static bw a(byte[] bArr, bw bwVar) {
        if (bArr[0] > 16) {
            return new bo.a();
        }
        return (bArr.length <= 1 || (bArr[1] & GCMSIVBlockCipher.MASK) == 0) ? bwVar : new bo.a();
    }
}
