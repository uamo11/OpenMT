package l;

import android.content.SharedPreferences;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/* compiled from: D20P */
/* renamed from: l.ۜᩴۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC6948 implements Runnable {

    /* renamed from: ۫᩹ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f21420 = {6906, -21795, -21848, -21816, -21807, -21814, -21810, 5327, 27690, 27761, 27744, 27766, 27761, 27703, 27747, 27748, 27766, 27761, 27738, 27760, 27767, 27753, 27766, 27769, 27747, 27748, 27766, 27761, 27738, 27760, 27767, 27753, 27766, 27738, 27744, 27773, 27765, 27756, 27767, 27744, 27745, 27733, 27722, 27734, 27729};

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC18132 f21421;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18621 f21422;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f21423;

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        SharedPreferences sharedPreferences;
        LinkedList linkedList;
        LinkedList linkedList2;
        C18621 c18621;
        short s = f21420[7];
        int i3 = (s * 2) + 1;
        int i4 = s + 1;
        int i5 = i3 - (i4 * i4) > 0 ? 16955 : 27653;
        try {
            byte[] bArr = new byte[1024];
            for (int i6 = 0; i6 < 1024; i6++) {
                bArr[i6] = (byte) (i6 & 255);
            }
            C9449 c9449 = new C9449();
            c9449.m24282(this.f21421.mo39359(C1005.m3502(f21420, 8, 6, i5)));
            c9449.m24277(C2126.m7036(f21420, 41, 4, i5), AbstractC2393.m7755(C18237.f56669, bArr));
            C8743 m24274 = c9449.m24274();
            C1294.m4371();
            C18621 execute = C18237.m42478().m40469(m24274).execute();
            this.f21422 = execute;
            if (m18769(execute, bArr)) {
                C1294.m4371();
                C11003.toString(this.f21421);
                int i7 = C9065.f27486;
                this.f21423 = true;
            } else {
                C11003.toString(this.f21421);
                int i8 = C9065.f27486;
            }
        } catch (SocketTimeoutException unused) {
            C11003.toString(this.f21421);
            int i9 = C9065.f27486;
        } catch (Throwable th) {
            C11003.toString(this.f21421);
            C0050.m947(th);
            int i10 = C9065.f27486;
        }
        C21060 c21060 = (C21060) this;
        c21060.f67930.getAndIncrement();
        if (!c21060.f21423) {
            if (C0714.m2817(c21060.f67928) != 0 || (c18621 = c21060.f21422) == null) {
                return;
            }
            AbstractC18132.m42250(c18621);
            return;
        }
        int andIncrement = c21060.f67928.getAndIncrement();
        i = C9065.f27488;
        if (andIncrement >= i) {
            return;
        }
        if (andIncrement == 0) {
            AbstractC18132.m42250(c21060.f21422);
            linkedList = c21060.f67929.f29554;
            synchronized (linkedList) {
                linkedList2 = c21060.f67929.f29554;
                linkedList2.addFirst(c21060.f21421);
            }
        }
        c21060.f67931[andIncrement] = c21060.f21421;
        i2 = C9065.f27488;
        if (andIncrement == i2 - 1) {
            LinkedList linkedList3 = new LinkedList();
            Collections.addAll(linkedList3, c21060.f67931);
            sharedPreferences = C9065.f27487;
            sharedPreferences.edit().putString(C1128.m3841(f21420, 14, 9, i5), C9679.m24609(linkedList3, C3683.m11225(f21420, 23, 1, i5))).putLong(C0630.m2575(f21420, 24, 17, i5), ViewOnClickListenerC1958.m6432() + 604800000).apply();
            c21060.f67929.f29554 = linkedList3;
            Arrays.toString(c21060.f67931);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if (l.RunnableC3474.m10630() != false) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m18769(l.C18621 r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractRunnableC6948.m18769(l.ᩴ۟᩵, byte[]):boolean");
    }
}
