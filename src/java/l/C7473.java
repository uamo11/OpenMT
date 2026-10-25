package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: 28WH */
/* renamed from: l.۟۫ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C7473 extends ViewGroup implements InterfaceC16685 {

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23014 = 0;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f23015;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f23016;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public EnumC10296 f23017;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f23018;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f23019;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f23020;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14127 f23021;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final float[] f23022;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f23023;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f23024;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final Object f23025;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C12412 f23026;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f23027;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Path f23028;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C6062 f23029;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f23030;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C4701 f23031;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12392 f23032;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f23033;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public RunnableC4196 f23034;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12412 f23035;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f23036;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f23037;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f23038;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f23039;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C5242 f23040;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f23041;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f23042;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f23043;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f23044;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f23045;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f23046;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4651 f23047;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f23048;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f23049;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public ArrayList f23050;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C12392 f23051;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f23052;

    public C7473(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7473(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23035 = new C12412();
        this.f23026 = new C12412();
        C6062 c6062 = new C6062();
        c6062.f18575 = -1;
        c6062.f18574 = -1;
        c6062.f18577 = -1;
        c6062.f18576 = -1;
        this.f23029 = c6062;
        this.f23025 = new Object();
        this.f23033 = new AtomicInteger();
        this.f23047 = new C4651(this);
        this.f23028 = new Path();
        this.f23022 = new float[4];
        this.f23031 = new C4701();
        this.f23041 = true;
        this.f23040 = new C5242(Boolean.TRUE);
        this.f23046 = true;
        this.f23017 = EnumC10296.DO_NOT_IGNORE;
        this.f23030 = false;
        this.f23045 = false;
        this.f23037 = true;
        this.f23027 = true;
        this.f23023 = 300;
        setMotionEventSplittingEnabled(false);
        C12392 c12392 = new C12392(context, null);
        this.f23032 = c12392;
        C12392 c123922 = new C12392(context, null);
        this.f23051 = c123922;
        addView(c12392);
        addView(c123922);
        c12392.m30313(new C22290(this, true));
        c123922.m30313(new C22290(this, false));
        c12392.m30446();
        c123922.m30446();
        c12392.m30461();
        c123922.m30461();
        c12392.m30419();
        c123922.m30419();
        this.f23049 = C21943.m49424(-13158601, -1309);
        this.f23044 = C21943.m49424(-9803710, -332368);
        C12392.m30142(c12392, c123922);
        C22686 c22686 = c12392.f37245;
        C22686 c226862 = c123922.f37245;
        c22686.f73268 = 0;
        c226862.f73268 = 0;
        c22686.f73278 = true;
        c226862.f73278 = true;
        c22686.f73264 = true;
        c226862.f73264 = true;
        c22686.f73286 = true;
        c226862.f73286 = true;
        c22686.f73240 = true;
        c226862.f73240 = true;
        c22686.f73235 = true;
        c226862.f73235 = true;
        boolean z = this.f23045;
        c22686.f73291 = z;
        c226862.f73291 = true;
        c22686.f73277 = 0;
        c226862.f73277 = 0;
        c22686.f73254 = 1.0f;
        c226862.f73254 = 1.0f;
        boolean z2 = this.f23037;
        c22686.f73243 = z2;
        c226862.f73243 = z2;
        if (z) {
            int intrinsicHeight = c22686.f73231.getIntrinsicHeight() * 2;
            c226862.f73259 = intrinsicHeight;
            c22686.f73259 = intrinsicHeight;
        }
        int alpha = (c22686.f73287 & 16777215) | (((int) (Color.alpha(r3) * 0.5f)) << 24);
        c226862.f73287 = alpha;
        c22686.f73287 = alpha;
        c22686.f73253 = new C8179(this);
        c226862.f73253 = new C15233(this);
        c12392.m30321(new C4236(3, this));
        c123922.m30321(new C1909(this));
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: l.ۘ۫ᩳ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                C7473.m20026(C7473.this, view, z3);
            }
        };
        c12392.setOnFocusChangeListener(onFocusChangeListener);
        c123922.setOnFocusChangeListener(onFocusChangeListener);
        c12392.m30330(new InterfaceC8035() { // from class: l.ᩴ۫ᩳ
            @Override // l.InterfaceC8035
            /* renamed from: ֫ */
            public final void mo1646(int i2, int i3) {
                C7473.m20046(C7473.this, i2, i3);
            }
        });
        c123922.m30330(new InterfaceC8035() { // from class: l.᩵۫ᩳ
            @Override // l.InterfaceC8035
            /* renamed from: ֫ */
            public final void mo1646(int i2, int i3) {
                C7473.m20024(C7473.this, i2, i3);
            }
        });
        c12392.f37299 = new C22995(this, true);
        c123922.f37299 = new C22995(this, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20025(C7473 c7473, int i, int i2, int i3) {
        if (c7473.f23027) {
            C12392 c12392 = c7473.f23032;
            C12392 c123922 = c7473.f23051;
            if (c12392.isFocused() || c12392.isPressed()) {
                if (i == i3) {
                    c123922.m30392(i2, c123922.m30408());
                    c7473.invalidate();
                    return;
                }
                C4651 c4651 = c7473.f23047;
                if (c4651.m13619(c12392, c123922, true)) {
                    float m24484 = c12392.f37245.m24484();
                    float m13620 = (c4651.m13620(c12392) - ((c4651.f14750 * m24484) - i3)) / m24484;
                    int i4 = c4651.f14751;
                    i3 = (int) (((((i4 - r3) * m13620) + c4651.f14752) * m24484) - c4651.m13620(c123922));
                }
                c123922.m30392(i2, i3);
                c7473.invalidate();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20047(C7473 c7473, int i, int i2, int i3) {
        if (c7473.f23027) {
            C12392 c12392 = c7473.f23051;
            C12392 c123922 = c7473.f23032;
            if (c12392.isFocused() || c12392.isPressed()) {
                if (i == i3) {
                    c123922.m30392(i2, c123922.m30408());
                    c7473.invalidate();
                    return;
                }
                C4651 c4651 = c7473.f23047;
                if (c4651.m13619(c12392, c123922, false)) {
                    float m24484 = c12392.f37245.m24484();
                    float m13620 = (c4651.m13620(c12392) - ((c4651.f14750 * m24484) - i3)) / m24484;
                    int i4 = c4651.f14751;
                    i3 = (int) (((((i4 - r3) * m13620) + c4651.f14752) * m24484) - c4651.m13620(c123922));
                }
                c123922.m30392(i2, i3);
                c7473.invalidate();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20026(C7473 c7473, View view, boolean z) {
        if (z) {
            boolean z2 = view == c7473.f23032;
            if (c7473.f23041 != z2) {
                c7473.f23041 = z2;
                c7473.f23040.mo1669(Boolean.valueOf(z2));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20046(C7473 c7473, int i, int i2) {
        C12392 c12392 = c7473.f23051;
        if (c7473.f23037 && c7473.f23041) {
            c7473.m20022(i, i2, true);
            c12392.invalidate();
        } else if (c7473.f23045) {
            c12392.invalidate();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20024(C7473 c7473, int i, int i2) {
        C12392 c12392 = c7473.f23032;
        if (c7473.f23037 && !c7473.f23041) {
            c7473.m20022(i, i2, false);
            c12392.invalidate();
        } else if (c7473.f23045) {
            c12392.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m20022(int i, int i2, boolean z) {
        int m20043;
        int m200432;
        List list = this.f23019;
        if (list == null) {
            return;
        }
        C12392 c12392 = this.f23051;
        C12392 c123922 = this.f23032;
        C12392 c123923 = z ? c123922 : c12392;
        if (!z) {
            c12392 = c123922;
        }
        int length = c123923.m30436().length();
        int length2 = c12392.m30436().length();
        if (i == i2) {
            m20043 = m20043(z, i, length, length2, list);
            m200432 = m20043;
        } else {
            m20043 = m20043(z, i, length, length2, list);
            m200432 = m20043(z, i2, length, length2, list);
        }
        c12392.mo25922(m20043, m200432);
        c12392.m30404();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5 A[RETURN] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m20043(boolean r6, int r7, int r8, int r9, java.util.List r10) {
        /*
            int r0 = r10.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L88
            java.lang.Object r3 = r10.get(r2)
            l.ᩴܳۘ r3 = (l.InterfaceC18813) r3
            int r4 = r3.mo15478(r6)
            int r5 = r3.mo15483(r6)
            if (r4 > r7) goto L58
            if (r7 != r8) goto L1f
            if (r4 != r7) goto L1f
            if (r4 != r5) goto L1f
            goto L58
        L1f:
            if (r5 > r7) goto L29
            if (r7 != r8) goto L26
            if (r5 != r7) goto L26
            goto L29
        L26:
            int r2 = r2 + 1
            goto L6
        L29:
            r8 = r6 ^ 1
            int r9 = r3.mo15478(r8)
            int r8 = r3.mo15483(r8)
            int r7 = r7 - r4
            boolean r10 = r3 instanceof l.InterfaceC0467
            if (r10 == 0) goto L50
            r10 = r3
            l.֡ܳۘ r10 = (l.InterfaceC0467) r10
            java.util.List r10 = r10.mo2067()
            if (r10 == 0) goto L50
            int r0 = r3.mo15483(r6)
            int r1 = r3.mo15478(r6)
            int r0 = r0 - r1
            int r1 = r8 - r9
            int r7 = m20043(r6, r7, r0, r1, r10)
        L50:
            int r7 = r7 + r9
            if (r7 >= r9) goto L54
            return r9
        L54:
            if (r7 <= r8) goto L57
            return r8
        L57:
            return r7
        L58:
            if (r2 <= 0) goto L71
            int r8 = r2 + (-1)
            java.lang.Object r8 = r10.get(r8)
            l.ᩴܳۘ r8 = (l.InterfaceC18813) r8
            r1 = r6 ^ 1
            int r1 = r8.mo15483(r1)
            int r8 = r8.mo15483(r6)
            int r7 = r7 - r8
            int r7 = r7 + r1
            if (r7 >= r1) goto L71
            r7 = r1
        L71:
            int r2 = r2 + 1
            if (r2 >= r0) goto L84
            java.lang.Object r8 = r10.get(r2)
            l.ᩴܳۘ r8 = (l.InterfaceC18813) r8
            r6 = r6 ^ 1
            int r6 = r8.mo15478(r6)
            if (r7 <= r6) goto L84
            r7 = r6
        L84:
            if (r7 <= r9) goto L87
            goto La5
        L87:
            return r7
        L88:
            if (r0 <= 0) goto La0
            int r0 = r0 + (-1)
            java.lang.Object r8 = r10.get(r0)
            l.ᩴܳۘ r8 = (l.InterfaceC18813) r8
            int r10 = r8.mo15483(r6)
            if (r7 < r10) goto La0
            int r7 = r7 - r10
            r6 = r6 ^ 1
            int r6 = r8.mo15483(r6)
            int r7 = r7 + r6
        La0:
            if (r7 >= 0) goto La3
            return r1
        La3:
            if (r7 <= r9) goto La6
        La5:
            return r9
        La6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7473.m20043(boolean, int, int, int, java.util.List):int");
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m20078() {
        return this.f23045;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m20097(boolean z) {
        if (this.f23045 != z) {
            this.f23045 = z;
            C22686 c22686 = this.f23032.f37245;
            c22686.f73291 = z;
            C12392 c12392 = this.f23051;
            if (z) {
                C22686 c226862 = c12392.f37245;
                int intrinsicHeight = c22686.f73231.getIntrinsicHeight() * 2;
                c226862.f73259 = intrinsicHeight;
                c22686.f73259 = intrinsicHeight;
            } else {
                C22686 c226863 = c12392.f37245;
                int intrinsicHeight2 = c22686.f73231.getIntrinsicHeight() * 3;
                c226863.f73259 = intrinsicHeight2;
                c22686.f73259 = intrinsicHeight2;
            }
            requestLayout();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m20084(boolean z) {
        this.f23027 = z;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m20061() {
        return this.f23027;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20067(ActivityC1748 activityC1748, C19013 c19013) {
        this.f23040.m1668(activityC1748, new C4052(1, c19013));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20069(C10130 c10130) {
        c10130.writeInt(631841030);
        c10130.m25425(this.f23041);
        c10130.m25425(this.f23046);
        c10130.writeByte(this.f23017.ordinal());
        c10130.mo13231(8454);
        c10130.m25425(this.f23030);
        c10130.m25425(this.f23045);
        c10130.m25425(this.f23037);
        c10130.mo13231(8454);
        c10130.m25425(this.f23027);
        if (this.f23019 == null) {
            c10130.writeByte(0);
        } else {
            c10130.m25425(true);
            c10130.writeInt(this.f23019.size());
            Iterator it = this.f23019.iterator();
            while (it.hasNext()) {
                ((InterfaceC0467) it.next()).mo15479(c10130);
            }
        }
        this.f23032.m30331(c10130, true);
        this.f23051.m30331(c10130, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20071(C12951 c12951, AbstractC15440 abstractC15440, AbstractC15440 abstractC154402) {
        C22124.m49722((InterfaceC20008) c12951, 631841030);
        ArrayList arrayList = null;
        m20044((List) null);
        this.f23041 = c12951.m31498();
        C5242 c5242 = this.f23040;
        boolean booleanValue = ((Boolean) c5242.m1662()).booleanValue();
        boolean z = this.f23041;
        if (booleanValue != z) {
            c5242.mo1664(Boolean.valueOf(z));
        }
        this.f23046 = c12951.m31498();
        this.f23017 = EnumC10296.values()[c12951.readByte() & 255];
        boolean m31497 = c12951.m31497(8454);
        C12392 c12392 = this.f23051;
        C12392 c123922 = this.f23032;
        if (m31497) {
            m20088(c12951.m31498());
            m20097(c12951.m31498());
            boolean m31498 = c12951.m31498();
            this.f23037 = m31498;
            c123922.f37245.f73243 = m31498;
            c12392.f37245.f73243 = m31498;
            invalidate();
        }
        if (c12951.m31497(8454)) {
            this.f23027 = c12951.m31498();
        }
        boolean m314982 = c12951.m31498();
        if (m314982) {
            int readInt = c12951.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList2.add(new C5407(c12951));
            }
            arrayList = arrayList2;
        }
        c123922.mo25896(c12951);
        c12392.mo25896(c12951);
        if (m314982) {
            m20044(arrayList);
        } else {
            m20049();
        }
        m20038();
        if (this.f23041) {
            if (c12392.isFocused()) {
                post(new RunnableC17872(c123922, 1));
            }
        } else if (c123922.isFocused()) {
            post(new RunnableC17872(c12392, 1));
        }
        m20057();
        if (abstractC15440 != null) {
            c123922.m30336(abstractC15440);
        }
        if (abstractC154402 != null) {
            c12392.m30336(abstractC154402);
        }
        m20057();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m20033(l.C7473 r25, boolean r26, l.C20736 r27, int r28, int r29, int r30, android.graphics.Canvas r31, android.graphics.Paint r32, l.C22686 r33) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7473.m20033(l.۟۫ᩳ, boolean, l.᩷۟ᩳ, int, int, int, android.graphics.Canvas, android.graphics.Paint, l.᩺֫ܿ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b3, code lost:
    
        if (r18.mo15485() == r18.mo15489()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a4, code lost:
    
        if (r18.mo15487() == r18.mo15477()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b7, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b5, code lost:
    
        r2 = true;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m20032(l.C7473 r25, boolean r26, l.C20736 r27, int r28, int r29, float r30, float r31, boolean r32, android.graphics.Canvas r33, android.graphics.Paint r34, l.InterfaceC10961 r35, l.C22686 r36) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7473.m20032(l.۟۫ᩳ, boolean, l.᩷۟ᩳ, int, int, float, float, boolean, android.graphics.Canvas, android.graphics.Paint, l.ۧۧܿ, l.᩺֫ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20031(C7473 c7473, boolean z, C20736 c20736, float f, float f2, float f3, float f4, Canvas canvas, Paint paint, C22686 c22686) {
        float f5;
        float f6;
        int m47366;
        int m47365;
        List<InterfaceC0467> list = c7473.f23019;
        if (list == null || !c7473.m20064(z).m30505() || c20736.isEmpty()) {
            return;
        }
        int i = (int) (f4 - f2);
        int size = c20736.size();
        float f7 = c22686.f29068 * 3.0f;
        if (z && !c7473.f23045) {
            f6 = c22686.f73289 + f;
            f5 = f;
        } else {
            f5 = f3 - c22686.f73289;
            f6 = f3;
        }
        for (InterfaceC0467 interfaceC0467 : list) {
            int mo2065 = z ? interfaceC0467.mo2065() : interfaceC0467.mo2068();
            int mo2063 = z ? interfaceC0467.mo2063() : interfaceC0467.mo2072();
            int m47348 = c20736.m47348(mo2065);
            if (m47348 == -1) {
                if (mo2065 == c20736.m47368().f35064 + 1) {
                    m47366 = c20736.size();
                }
            } else {
                m47366 = c20736.m47366(m47348);
            }
            int m473482 = c20736.m47348(mo2063);
            if (m473482 == -1) {
                if (mo2063 == c20736.m47368().f35064 + 1) {
                    m47365 = c20736.size();
                }
            } else {
                m47365 = c20736.m47365(m473482);
            }
            float f8 = i;
            float f9 = size;
            float f10 = (m47366 * f8) / f9;
            float f11 = (m47365 * f8) / f9;
            float f12 = f8 - f7;
            if (f10 > f12) {
                f10 = f12;
            }
            if (f11 - f10 < f7) {
                f11 = f10 + f7;
            }
            paint.setColor(EnumC3240.m9913(interfaceC0467).f10197);
            canvas.drawRect(f5, f2 + f10, f6, f2 + f11, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        C12392 c12392 = this.f23032;
        C12392 c123922 = this.f23051;
        C12392.m30208(c12392, c123922);
        C22686 c22686 = c12392.f37245;
        c123922.computeScroll();
        c123922.f37192 = true;
        this.f23024 = true;
        try {
            super.dispatchDraw(canvas);
            this.f23024 = false;
            c123922.f37192 = false;
            List list = this.f23019;
            boolean m20036 = m20036(list);
            this.f23039 = m20036;
            C1539 c1539 = c22686.f73269;
            if (this.f23045) {
                int bottom = c12392.getBottom();
                int top = c123922.getTop();
                c1539.setColor(C7191.m19274((C21943.f70274 & 16777215) | (-1610612736), C21943.f70259));
                canvas.drawRect(0.0f, bottom, getWidth(), top, c1539);
                c1539.setColor(C21943.f70274);
                canvas.drawRect(0.0f, bottom + 2, getWidth(), top - 2, c1539);
            } else if (m20036) {
                C12412 c12412 = this.f23035;
                int m47357 = c12412.f37387.m47357(c12412.f37385);
                C12412 c124122 = this.f23026;
                int m473572 = c124122.f37387.m47357(c124122.f37385);
                int m473573 = c12412.f37387.m47357(c12412.f37388) + 1;
                int m473574 = c124122.f37387.m47357(c124122.f37388) + 1;
                float width = getWidth() / 2.0f;
                C22686 c226862 = c12412.f37383;
                float f = width - (c226862.f73254 * c226862.f73245);
                C22686 c226863 = c124122.f37383;
                z = m20036;
                float f2 = (c226863.f73254 * c226863.f73245) + width;
                float f3 = c22686.f73245 / 2.0f;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
                    if (interfaceC0467.mo2063() >= m47357 || interfaceC0467.mo2072() >= m473572) {
                        if (interfaceC0467.mo2065() <= m473573 || interfaceC0467.mo2068() <= m473574) {
                            EnumC3240 m9913 = EnumC3240.m9913(interfaceC0467);
                            Iterator it2 = it;
                            Path path = this.f23028;
                            path.reset();
                            int i = m47357;
                            float[] fArr = this.f23022;
                            int i2 = m473572;
                            int i3 = m473573;
                            if (c12412.m30579(interfaceC0467, true, fArr, 0) && c124122.m30579(interfaceC0467, false, fArr, 2)) {
                                int paddingTop = c12392.getPaddingTop() - c12392.m30408();
                                int paddingTop2 = c123922.getPaddingTop() - c123922.m30408();
                                float f4 = paddingTop;
                                float f5 = fArr[0] + f4;
                                fArr[0] = f5;
                                fArr[1] = fArr[1] + f4;
                                float f6 = paddingTop2;
                                fArr[2] = fArr[2] + f6;
                                fArr[3] = fArr[3] + f6;
                                path.moveTo(f, f5);
                                path.lineTo(f, fArr[1]);
                                if (Math.abs(fArr[1] - fArr[3]) <= 1.0f) {
                                    path.lineTo(f2, fArr[3]);
                                } else {
                                    float f7 = fArr[3];
                                    path.cubicTo(f + f3, fArr[1], f2 - f3, f7, f2, f7);
                                }
                                path.lineTo(f2, fArr[2]);
                                if (Math.abs(fArr[2] - fArr[0]) <= 1.0f) {
                                    path.lineTo(f, fArr[0]);
                                } else {
                                    float f8 = fArr[0];
                                    path.cubicTo(f2 - f3, fArr[2], f + f3, f8, f, f8);
                                }
                                path.close();
                                c1539.setColor(m9913.f10198);
                                canvas.drawPath(path, c1539);
                            }
                            it = it2;
                            m47357 = i;
                            m473572 = i2;
                            m473573 = i3;
                        }
                    }
                }
                if (this.f23030 || !z) {
                }
                C4651 c4651 = this.f23047;
                Paint paint = c4651.f14754;
                paint.setColor(C21943.f70257);
                C7473 c7473 = c4651.f14753;
                C12392 c123923 = c7473.f23051;
                C12392 c123924 = c7473.f23032;
                if (c7473.f23045) {
                    float top2 = c123924.getTop() + ((int) c4651.m13620(c123924));
                    canvas.drawLine(0.0f, top2, c7473.getWidth(), top2, paint);
                    float top3 = c123923.getTop() + ((int) c4651.m13620(c123923));
                    canvas.drawLine(0.0f, top3, c7473.getWidth(), top3, paint);
                    return;
                }
                float m13620 = (int) c4651.m13620(c123924);
                canvas.drawLine(0.0f, m13620, c7473.getWidth(), m13620, paint);
                return;
            }
            z = m20036;
            if (this.f23030) {
            }
        } catch (Throwable th) {
            this.f23024 = false;
            c123922.f37192 = false;
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20029(C7473 c7473, C12412 c12412, boolean z) {
        c12412.f37386 = z;
        if (c7473.f23024 || c7473.f23039 == c7473.m20036(c7473.f23019)) {
            return;
        }
        super.invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20036(List list) {
        if (list == null) {
            return false;
        }
        C12392 c12392 = this.f23032;
        if (!c12392.m30505()) {
            return false;
        }
        C12392 c123922 = this.f23051;
        return c123922.m30505() && this.f23035.m30580(c12392, list) && this.f23026.m30580(c123922, list);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m20037(C7473 c7473) {
        return c7473.f23032.m30505() && c7473.f23051.m30505();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20082(final boolean z) {
        if (!C10975.m27285()) {
            post(new RunnableC5357(0, this));
            return;
        }
        if (this.f23016) {
            this.f23015 = true;
            return;
        }
        if (m20055()) {
            return;
        }
        boolean z2 = this.f23019 == null;
        synchronized (this.f23029) {
            if (!z2) {
                try {
                    C6062 c6062 = this.f23029;
                    if (c6062.f18575 == -1 && c6062.f18577 == -1) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            int i = z2 ? 0 : this.f23029.f18575;
            int m30526 = z2 ? this.f23032.m30526() : this.f23029.f18574;
            int i2 = z2 ? 0 : this.f23029.f18577;
            int m305262 = z2 ? this.f23051.m30526() : this.f23029.f18576;
            final InterfaceC7785 m30436 = this.f23032.m30436();
            final InterfaceC7785 m304362 = this.f23051.m30436();
            final C7744 mo26562 = m30436.mo26562();
            try {
                final C7744 mo265622 = m304362.mo26562();
                final int i3 = this.f23033.get();
                final int m20767 = mo26562.m20767();
                final int m207672 = mo265622.m20767();
                final List list = this.f23019;
                try {
                    final C13822 m20021 = m20021(list, mo26562, mo265622, i, m30526, i2, m305262);
                    final EnumC10296 enumC10296 = this.f23017;
                    final boolean z3 = this.f23046;
                    final C14127 c14127 = this.f23021;
                    this.f23016 = true;
                    m30436.setReadOnly(true);
                    m304362.setReadOnly(true);
                    Runnable runnable = new Runnable() { // from class: l.֨۫ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7473.m20027(C7473.this, mo26562, mo265622, m20021, enumC10296, z3, c14127, m30436, m304362, i3, list, m20767, m207672, z);
                        }
                    };
                    if (z) {
                        runnable.run();
                        return;
                    }
                    try {
                        C1802.f6208.execute(runnable);
                    } catch (RuntimeException e) {
                        this.f23016 = false;
                        mo26562.close();
                        mo265622.close();
                        m30436.setReadOnly(false);
                        m304362.setReadOnly(false);
                        throw e;
                    }
                } catch (Error | RuntimeException e2) {
                    mo26562.close();
                    mo265622.close();
                    throw e2;
                }
            } catch (Error | RuntimeException e3) {
                mo26562.close();
                throw e3;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20027(final C7473 c7473, C7744 c7744, C7744 c77442, final C13822 c13822, final EnumC10296 enumC10296, final boolean z, final InterfaceC13117 interfaceC13117, final InterfaceC7785 interfaceC7785, final InterfaceC7785 interfaceC77852, final int i, final List list, final int i2, final int i3, boolean z2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            try {
                C15172 m35874 = C15172.m35874(c7744);
                try {
                    C15172 m358742 = C15172.m35874(c77442);
                    try {
                        i4 = c13822.f41235;
                        i5 = c13822.f41231;
                        CharSequence range = m35874.range(i4, i5);
                        i6 = c13822.f41236;
                        i7 = c13822.f41234;
                        final ArrayList m20019 = m20019(range, m358742.range(i6, i7), enumC10296, z, interfaceC13117, new C4701());
                        Iterator it = m20019.iterator();
                        while (it.hasNext()) {
                            InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
                            int mo2065 = interfaceC0467.mo2065();
                            i8 = c13822.f41233;
                            interfaceC0467.mo2071(mo2065 + i8);
                            int mo2063 = interfaceC0467.mo2063();
                            i9 = c13822.f41233;
                            interfaceC0467.mo2064(mo2063 + i9);
                            int mo15487 = interfaceC0467.mo15487();
                            i10 = c13822.f41235;
                            interfaceC0467.mo15486(mo15487 + i10);
                            int mo15477 = interfaceC0467.mo15477();
                            i11 = c13822.f41235;
                            interfaceC0467.mo15484(mo15477 + i11);
                            int mo2068 = interfaceC0467.mo2068();
                            i12 = c13822.f41232;
                            interfaceC0467.mo2060(mo2068 + i12);
                            int mo2072 = interfaceC0467.mo2072();
                            i13 = c13822.f41232;
                            interfaceC0467.mo2073(mo2072 + i13);
                            int mo15485 = interfaceC0467.mo15485();
                            i14 = c13822.f41236;
                            interfaceC0467.mo15482(mo15485 + i14);
                            int mo15489 = interfaceC0467.mo15489();
                            i15 = c13822.f41236;
                            interfaceC0467.mo15480(mo15489 + i15);
                        }
                        m358742.close();
                        try {
                            try {
                                m35874.close();
                                c77442.close();
                                c7744.close();
                                interfaceC7785.setReadOnly(false);
                                interfaceC77852.setReadOnly(false);
                                Runnable runnable = new Runnable() { // from class: l.ܺ۫ᩳ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C7473.m20028(C7473.this, enumC10296, z, interfaceC13117, i, list, interfaceC7785, interfaceC77852, i2, i3, c13822, m20019);
                                    }
                                };
                                if (z2) {
                                    runnable.run();
                                } else {
                                    c7473.post(runnable);
                                }
                            } catch (Throwable th) {
                                interfaceC7785.setReadOnly(false);
                                interfaceC77852.setReadOnly(false);
                                throw th;
                            }
                        } catch (Error | RuntimeException e) {
                            c7473.post(new RunnableC23951(2, c7473));
                            throw e;
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20045(C7473 c7473) {
        c7473.f23016 = false;
        c7473.f23015 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20028(C7473 c7473, EnumC10296 enumC10296, boolean z, InterfaceC13117 interfaceC13117, int i, List list, InterfaceC7785 interfaceC7785, InterfaceC7785 interfaceC77852, int i2, int i3, C13822 c13822, ArrayList arrayList) {
        try {
            if (c7473.f23017 == enumC10296 && c7473.f23046 == z && c7473.f23021 == interfaceC13117 && i == c7473.f23033.get() && c7473.f23019 == list && !c7473.m20055() && interfaceC7785 == c7473.f23032.m30436() && interfaceC77852 == c7473.f23051.m30436() && i2 == interfaceC7785.mo26548() && i3 == interfaceC77852.mo26548()) {
                List m20020 = m20020(list, c13822, arrayList);
                synchronized (c7473.f23029) {
                    C6062 c6062 = c7473.f23029;
                    c6062.f18576 = -1;
                    c6062.f18577 = -1;
                    c6062.f18574 = -1;
                    c6062.f18575 = -1;
                }
                c7473.m20044(m20020);
                c7473.invalidate();
                boolean z2 = c7473.f23041;
                C12392 m20064 = c7473.m20064(z2);
                c7473.m20022(m20064.m30444(), m20064.m30448(), z2);
                c7473.m20058();
            } else if (!c7473.m20055()) {
                c7473.f23015 = true;
            }
        } finally {
            c7473.f23016 = false;
            if (c7473.f23015) {
                c7473.f23015 = false;
                c7473.post(new RunnableC2535(0, c7473));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13822 m20021(List list, C7744 c7744, C7744 c77442, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int size = list == null ? 0 : list.size();
        int m20765 = i == -1 ? -1 : c7744.m20765(i);
        int m207652 = i2 == -1 ? -1 : c7744.m20765(i2) + 1;
        int m207653 = i3 == -1 ? -1 : c77442.m20765(i3);
        int m207654 = i4 == -1 ? -1 : c77442.m20765(i4) + 1;
        int i11 = 0;
        int i12 = size;
        while (i11 < i12) {
            int i13 = (i11 + i12) >>> 1;
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) list.get(i13);
            if ((m20765 == -1 || interfaceC0467.mo2063() < m20765) && (m207653 == -1 || interfaceC0467.mo2072() < m207653)) {
                i11 = i13 + 1;
            } else {
                i12 = i13;
            }
        }
        int max = Math.max(-1, i11 - 2);
        int i14 = 0;
        int i15 = size;
        while (i14 < i15) {
            int i16 = (i14 + i15) >>> 1;
            InterfaceC0467 interfaceC04672 = (InterfaceC0467) list.get(i16);
            if ((m207652 == -1 || interfaceC04672.mo2065() > m207652) && (m207654 == -1 || interfaceC04672.mo2068() > m207654)) {
                i15 = i16;
            } else {
                i14 = i16 + 1;
            }
        }
        int min = Math.min(size, i14 + 1);
        if (max >= 0) {
            InterfaceC0467 interfaceC04673 = (InterfaceC0467) list.get(max);
            int mo15477 = interfaceC04673.mo15477();
            int mo15489 = interfaceC04673.mo15489();
            int mo2063 = interfaceC04673.mo2063();
            i8 = interfaceC04673.mo2072();
            i5 = mo15477;
            i6 = mo15489;
            i7 = mo2063;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        int length = c7744.length();
        int length2 = c77442.length();
        if (min < size) {
            InterfaceC0467 interfaceC04674 = (InterfaceC0467) list.get(min);
            int mo15487 = interfaceC04674.mo15487();
            int mo15485 = interfaceC04674.mo15485();
            if (mo15487 != c7744.length()) {
                mo15487--;
            }
            if (mo15485 != c77442.length()) {
                mo15485--;
            }
            i10 = mo15485;
            i9 = mo15487;
        } else {
            i9 = length;
            i10 = length2;
        }
        return new C13822(max, min, i5, i9, i6, i10, i7, i8);
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0022 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List m20020(java.util.List r3, l.C13822 r4, java.util.ArrayList r5) {
        /*
            if (r3 != 0) goto L3
            return r5
        L3:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = l.C13822.m33174(r4)
            int r1 = r1 + 1
            int r2 = r5.size()
            int r2 = r2 + r1
            int r1 = r3.size()
            int r1 = r1 + r2
            int r2 = l.C13822.m33173(r4)
            int r1 = r1 - r2
            r0.<init>(r1)
            r1 = 0
        L1e:
            int r2 = l.C13822.m33174(r4)
            if (r1 > r2) goto L30
            java.lang.Object r2 = r3.get(r1)
            l.֡ܳۘ r2 = (l.InterfaceC0467) r2
            r0.add(r2)
            int r1 = r1 + 1
            goto L1e
        L30:
            r0.addAll(r5)
            int r4 = l.C13822.m33173(r4)
        L37:
            int r5 = r3.size()
            if (r4 >= r5) goto L49
            java.lang.Object r5 = r3.get(r4)
            l.֡ܳۘ r5 = (l.InterfaceC0467) r5
            r0.add(r5)
            int r4 = r4 + 1
            goto L37
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7473.m20020(java.util.List, l.ܰ۫ᩳ, java.util.ArrayList):java.util.List");
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f23032.invalidate();
        this.f23051.invalidate();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m20075() {
        return this.f23030;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20088(boolean z) {
        if (this.f23030 != z) {
            this.f23030 = z;
            super.invalidate();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20070(EnumC10296 enumC10296) {
        if (this.f23017 == enumC10296) {
            return;
        }
        C11003.requireNonNull(enumC10296);
        this.f23017 = enumC10296;
        if (this.f23032.m30526() > 0 || this.f23051.m30526() > 0) {
            m20049();
            invalidate();
            m20058();
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC10296 m20080() {
        return this.f23017;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20092(boolean z) {
        if (this.f23046 == z) {
            return;
        }
        this.f23046 = z;
        if (this.f23032.m30526() > 0 || this.f23051.m30526() > 0) {
            m20049();
            invalidate();
            m20058();
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m20060() {
        return this.f23046;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20072(C14127 c14127) {
        this.f23021 = c14127;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20044(List list) {
        this.f23019 = list;
        this.f23033.incrementAndGet();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12392 m20064(boolean z) {
        return z ? this.f23032 : this.f23051;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12392 m20096() {
        return this.f23032;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12392 m20077() {
        return this.f23051;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m20076() {
        return this.f23032.m30441() && this.f23051.m30441();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20090(boolean z) {
        this.f23032.m30407(z);
        this.f23051.m30407(z);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20081() {
        boolean z;
        synchronized (this.f23025) {
            if (this.f23036) {
                z = false;
            } else {
                this.f23036 = true;
                this.f23052 = false;
                this.f23048 = false;
                this.f23033.incrementAndGet();
                z = true;
            }
        }
        if (z) {
            this.f23032.m30346(true, false);
            this.f23051.m30346(true, false);
            this.f23032.m30485();
            this.f23051.m30485();
            this.f23032.m30438();
            this.f23051.m30438();
        }
        C1802.m5993().removeCallbacksAndMessages(this.f23029);
        synchronized (this.f23029) {
            C6062 c6062 = this.f23029;
            c6062.f18576 = -1;
            c6062.f18577 = -1;
            c6062.f18574 = -1;
            c6062.f18575 = -1;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20091() {
        synchronized (this.f23025) {
            if (this.f23036) {
                this.f23036 = false;
                if (this.f23043 || m20039()) {
                    m20065();
                }
                this.f23032.m30439();
                this.f23051.m30439();
                if (!this.f23032.m30493()) {
                    this.f23032.m30371();
                }
                if (!this.f23051.m30493()) {
                    this.f23051.m30371();
                }
                if (this.f23048 || m20039()) {
                    return;
                }
                this.f23032.m30346(false, false);
                this.f23051.m30346(false, false);
                invalidate();
            }
        }
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private boolean m20055() {
        boolean z;
        synchronized (this.f23025) {
            z = this.f23036;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z2 = this.f23045;
        C12392 c12392 = this.f23051;
        C12392 c123922 = this.f23032;
        if (z2) {
            int m27878 = C11266.m27878(2.5f);
            int i7 = i6 / 2;
            c123922.layout(0, 0, i5, i7 - m27878);
            c12392.layout(0, i7 + m27878, i5, i6);
            return;
        }
        int i8 = i5 / 2;
        c123922.layout(0, 0, i8, i6);
        c12392.layout(i8, 0, i5, i6);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20066(CharSequence charSequence, CharSequence charSequence2, AbstractC15440 abstractC15440, AbstractC15440 abstractC154402) {
        C12392 c12392 = this.f23032;
        if (c12392.m30493()) {
            return;
        }
        C12392 c123922 = this.f23051;
        if (c123922.m30493()) {
            return;
        }
        m20048();
        InterfaceC7785 m30436 = c12392.m30436();
        InterfaceC7785 m304362 = c123922.m30436();
        this.f23043 = false;
        this.f23050 = null;
        try {
            if (C10975.m27285()) {
                c12392.m30337(abstractC15440, charSequence);
                m20034(m30436, m304362);
                if (m20039()) {
                    m20065();
                    return;
                }
                c123922.m30337(abstractC154402, charSequence2);
            } else {
                this.f23043 = true;
                m20044((List) null);
                m20038();
                if (!new C1062(new C9591(this)).m3632(c12392, charSequence, abstractC15440, c123922, charSequence2, abstractC154402)) {
                    m20065();
                    return;
                }
            }
            m20034(m30436, m304362);
            if (m20039()) {
                m20065();
                return;
            }
            InterfaceC7785 m304363 = c12392.m30436();
            InterfaceC7785 m304364 = c123922.m30436();
            m304363.setReadOnly(true);
            m304364.setReadOnly(true);
            this.f23018 = m304363;
            this.f23020 = m304364;
            C7744 mo26562 = m304363.mo26562();
            try {
                C7744 mo265622 = m304364.mo26562();
                try {
                    this.f23038 = mo26562.m20767();
                    this.f23042 = mo265622.m20767();
                    this.f23050 = m20063(mo26562, mo265622);
                    mo265622.close();
                    mo26562.close();
                    m20057();
                    if (m20039()) {
                        m20065();
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException | Error | RuntimeException e) {
            m20034(m30436, m304362);
            m20065();
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20034(InterfaceC7785 interfaceC7785, InterfaceC7785 interfaceC77852) {
        if (this.f23043) {
            return;
        }
        if (this.f23032.m30436() == interfaceC7785 && this.f23051.m30436() == interfaceC77852) {
            return;
        }
        this.f23043 = true;
        m20044((List) null);
        m20038();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20065() {
        this.f23048 = true;
        this.f23043 = false;
        this.f23050 = null;
        try {
            this.f23032.m30308();
            this.f23051.m30308();
        } finally {
            m20048();
        }
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m20048() {
        InterfaceC7785 interfaceC7785 = this.f23018;
        InterfaceC7785 interfaceC77852 = this.f23020;
        this.f23020 = null;
        this.f23018 = null;
        if (interfaceC7785 != null) {
            interfaceC7785.setReadOnly(false);
            interfaceC77852.setReadOnly(false);
        }
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m20085() {
        this.f23032.m30386();
        this.f23051.m30386();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m20094() {
        return this.f23032.m30370() || this.f23051.m30370();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m20089() {
        C12392 c12392 = this.f23032;
        try {
            InterfaceC7785 interfaceC7785 = this.f23018;
            InterfaceC7785 m30436 = c12392.m30436();
            C12392 c123922 = this.f23051;
            if (interfaceC7785 == m30436 && this.f23020 == c123922.m30436() && this.f23038 == this.f23018.mo26548() && this.f23042 == this.f23020.mo26548()) {
                m20044(this.f23050);
            } else {
                m20044((List) null);
                post(new RunnableC23516(1, this));
            }
            this.f23050 = null;
            this.f23043 = false;
            c12392.m30360();
            c123922.m30360();
            boolean m30437 = c12392.m30437();
            boolean m304372 = c123922.m30437();
            if (m30437 && !m304372) {
                c123922.m30382(true);
            } else if (!m30437 && m304372) {
                c12392.m30382(true);
            }
            invalidate();
            m20058();
        } finally {
            m20048();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20087() {
        this.f23052 = true;
        this.f23031.m13774();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m20039() {
        return this.f23052 || this.f23032.m30493() || this.f23051.m30493();
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m20057() {
        if (C10975.m27285()) {
            return;
        }
        boolean z = false;
        while (m20094()) {
            if (m20039()) {
                this.f23032.m30462();
                this.f23051.m30462();
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException unused) {
                z = true;
                this.f23052 = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m20093() {
        return this.f23041;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12392 m20095() {
        return this.f23041 ? this.f23032 : this.f23051;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m20083() {
        List list = this.f23019;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m20062(int i, boolean z) {
        List list = this.f23019;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) list.get(i3);
            int mo15478 = interfaceC0467.mo15478(z);
            int mo15483 = interfaceC0467.mo15483(z);
            if (i < mo15478) {
                size = i3 - 1;
            } else {
                if (i <= mo15483 && (i != mo15483 || mo15478 >= mo15483)) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m20086() {
        InterfaceC0467 interfaceC0467;
        List list = this.f23019;
        if (list == null || list.isEmpty()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206ed);
            return;
        }
        boolean z = this.f23041;
        int m30444 = (z ? this.f23032 : this.f23051).m30444();
        int i = 0;
        while (true) {
            if (i >= this.f23019.size()) {
                interfaceC0467 = null;
                break;
            }
            interfaceC0467 = (InterfaceC0467) this.f23019.get(i);
            if (interfaceC0467.mo15478(z) > m30444) {
                break;
            } else {
                i++;
            }
        }
        if (interfaceC0467 == null) {
            interfaceC0467 = (InterfaceC0467) this.f23019.get(0);
        }
        m20035(z, (InterfaceC18813) interfaceC0467, true);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m20074() {
        InterfaceC0467 interfaceC0467;
        List list = this.f23019;
        if (list == null || list.isEmpty()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206ed);
            return;
        }
        boolean z = this.f23041;
        int m30444 = (z ? this.f23032 : this.f23051).m30444();
        int size = this.f23019.size() - 1;
        while (true) {
            if (size < 0) {
                interfaceC0467 = null;
                break;
            }
            interfaceC0467 = (InterfaceC0467) this.f23019.get(size);
            if (interfaceC0467.mo15483(z) < m30444) {
                break;
            } else {
                size--;
            }
        }
        if (interfaceC0467 == null) {
            interfaceC0467 = (InterfaceC0467) C7166.m19188(1, this.f23019);
            this.f23019.size();
        }
        m20035(z, (InterfaceC18813) interfaceC0467, true);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m20079() {
        List list = this.f23019;
        if (list == null || list.isEmpty()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206ed);
            return;
        }
        boolean z = this.f23041;
        C12392 c12392 = z ? this.f23032 : this.f23051;
        if (!c12392.isFocused()) {
            c12392.requestFocus();
        }
        m20035(z, (InterfaceC18813) this.f23019.get(0), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20035(boolean z, InterfaceC18813 interfaceC18813, boolean z2) {
        int mo15478 = interfaceC18813.mo15478(z);
        C12392 c12392 = z ? this.f23032 : this.f23051;
        if (c12392.m30505()) {
            c12392.m30400();
            c12392.mo25919(mo15478);
            c12392.m30404();
            int m13620 = (int) this.f23047.m13620(c12392);
            int m24484 = (int) (c12392.f37245.m24484() * c12392.f37258.m9790(mo15478));
            if (z2) {
                c12392.m30411(0, c12392.m30521(m24484 - m13620));
            } else {
                c12392.scrollTo(0, c12392.m30521(m24484 - m13620));
            }
        }
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m20049() {
        C12392 c12392 = this.f23032;
        InterfaceC7785 m30436 = c12392.m30436();
        C12392 c123922 = this.f23051;
        InterfaceC7785 m304362 = c123922.m30436();
        m30436.setReadOnly(true);
        m304362.setReadOnly(true);
        try {
            C7744 mo26562 = m30436.mo26562();
            try {
                C7744 mo265622 = m304362.mo26562();
                try {
                    ArrayList m20063 = m20063(mo26562, mo265622);
                    if (m30436 == c12392.m30436() && m304362 == c123922.m30436() && mo26562.m20767() == m30436.mo26548() && mo265622.m20767() == m304362.mo26548()) {
                        m20044(m20063);
                    } else {
                        m20044((List) null);
                        post(new RunnableC0417(0, this));
                    }
                    mo265622.close();
                    mo26562.close();
                } finally {
                }
            } finally {
            }
        } finally {
            m30436.setReadOnly(false);
            m304362.setReadOnly(false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m20063(C7744 c7744, C7744 c77442) {
        C15172 m35874 = C15172.m35874(c7744);
        try {
            C15172 m358742 = C15172.m35874(c77442);
            try {
                ArrayList m20019 = m20019(m35874.range(0, m35874.length()), m358742.range(0, m358742.length()), this.f23017, this.f23046, this.f23021, this.f23031);
                m358742.close();
                m35874.close();
                return m20019;
            } finally {
            }
        } catch (Throwable th) {
            try {
                m35874.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m20019(CharSequence charSequence, CharSequence charSequence2, EnumC10296 enumC10296, boolean z, InterfaceC13117 interfaceC13117, C4701 c4701) {
        EnumC5491 enumC5491;
        if (!z) {
            C11720 c11720 = new C11720(charSequence);
            charSequence2 = new C11720(charSequence2);
            charSequence = c11720;
        }
        int i = C20174.f65303[enumC10296.ordinal()];
        if (i == 1) {
            enumC5491 = EnumC5491.DEFAULT;
        } else if (i == 2) {
            enumC5491 = EnumC5491.TRIM_WHITESPACES;
        } else if (i == 3 || i == 4) {
            enumC5491 = EnumC5491.IGNORE_WHITESPACES;
        } else {
            throw new RuntimeException();
        }
        int i2 = 0;
        boolean z2 = enumC10296 == EnumC10296.IGNORE_WHITESPACES_AND_EMPTY_LINES;
        c4701.m13777();
        ArrayList m2298 = C0551.m2298(charSequence, charSequence2, C15283.m36291(charSequence), C15283.m36291(charSequence2), enumC5491, EnumC21719.WORDS, c4701);
        if (!c4701.m13776()) {
            if (interfaceC13117 != null) {
                Iterator it = m2298.iterator();
                while (it.hasNext()) {
                    InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
                    String substring = TextUtils.substring(charSequence, interfaceC0467.mo15487(), interfaceC0467.mo15477());
                    String substring2 = TextUtils.substring(charSequence2, interfaceC0467.mo15485(), interfaceC0467.mo15489());
                    InterfaceC10798 listIterator = ((C19119) ((C14127) interfaceC13117).f42611).listIterator(0);
                    while (true) {
                        if (listIterator.hasNext()) {
                            C12164 c12164 = (C12164) listIterator.next();
                            c12164.m29615reset((CharSequence) substring);
                            if (c12164.matches()) {
                                c12164.m29615reset((CharSequence) substring2);
                                if (c12164.matches()) {
                                    it.remove();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (m2298.isEmpty()) {
                return m2298;
            }
            final ArrayList arrayList = new ArrayList();
            final CharSequence charSequence3 = charSequence;
            final CharSequence charSequence4 = charSequence2;
            final EnumC5491 enumC54912 = enumC5491;
            final boolean z3 = z2;
            Consumer consumer = new Consumer() { // from class: l.᩵ܿۘ
                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return C23517.$default$andThen(this, consumer2);
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void n(java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 426
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: l.C19603.n(java.lang.Object):void");
                }
            };
            for (int i3 = 1; i3 < m2298.size(); i3++) {
                InterfaceC0467 interfaceC04672 = (InterfaceC0467) m2298.get(i3 - 1);
                InterfaceC0467 interfaceC04673 = (InterfaceC0467) m2298.get(i3);
                if (interfaceC04672.mo2063() != interfaceC04673.mo2065() || interfaceC04672.mo2072() != interfaceC04673.mo2068() || interfaceC04672.mo15477() != interfaceC04673.mo15487() || interfaceC04672.mo15489() != interfaceC04673.mo15485()) {
                    consumer.n(m2298.subList(i2, i3));
                    i2 = i3;
                }
            }
            if (i2 < m2298.size()) {
                consumer.n(m2298.subList(i2, m2298.size()));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // l.InterfaceC16685
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20073(float f, float f2) {
        return this.f23032.mo20073(f, f2) || this.f23051.mo20073(f, f2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20068(RunnableC4196 runnableC4196) {
        this.f23034 = runnableC4196;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m20058() {
        if (this.f23034 != null) {
            if (C10975.m27285()) {
                this.f23034.run();
            } else {
                C4925.m14315(this.f23034);
            }
        }
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m20038() {
        if (C10975.m27285()) {
            invalidate();
            m20058();
        } else {
            C4925.m14315(new RunnableC8885(0, this));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20023(C7473 c7473) {
        c7473.invalidate();
        c7473.m20058();
    }
}
