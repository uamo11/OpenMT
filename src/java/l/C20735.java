package l;

import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* compiled from: M70U */
/* renamed from: l.᩷۟ܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20735 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f66756;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9446 f66757;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8740 f66758;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16684 f66759;

    public C20735(C8740 c8740, C6807 c6807, C9446 c9446, C16684 c16684) {
        this.f66758 = c8740;
        this.f66756 = c6807;
        this.f66757 = c9446;
        this.f66759 = c16684;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C1868 c1868;
        C6807 c6807 = this.f66756;
        C1868 m27416 = c6807.f21109.m27416();
        C8740 c8740 = this.f66758;
        c8740.f26616 = m27416;
        Context context = c6807.getContext();
        c1868 = c8740.f26616;
        if (c1868 == null || !(context instanceof AbstractActivityC3346)) {
            return;
        }
        final C9446 c9446 = this.f66757;
        m20269((AbstractActivityC3346) context, R.string.MT_Protector_res_0x7f1207a7, 200, new Runnable() { // from class: l.ۜ۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C20735.this.f23322.m31860(new RunnableC17206(c9446));
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47343(C20735 c20735) {
        if (c20735.f66757.mo1526()) {
            return true;
        }
        C13136 c13136 = c20735.f23322;
        return c13136 != null && c13136.m31868();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:12:0x001d, B:17:0x0029), top: B:5:0x000b }] */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            r5 = this;
            l.ۡ۟ܿ r0 = r5.f66758
            l.ܽܰܿ r1 = r5.f66759
            boolean r2 = r1.m39218()
            if (r2 != 0) goto Lb
            return
        Lb:
            l.֫ܰܿ r2 = l.C8740.m22603(r0)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L40
            l.ۢ۟ܿ r2 = r5.f66757     // Catch: java.lang.Throwable -> L44
            boolean r2 = r2.mo1526()     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L26
            l.۬۬ܿ r2 = r5.f23322     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L24
            boolean r2 = r2.m31868()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = 1
        L27:
            if (r2 != 0) goto L40
            l.ۜܰܿ r2 = r5.f66756     // Catch: java.lang.Throwable -> L44
            l.ۧܰܿ r2 = r2.f21109     // Catch: java.lang.Throwable -> L44
            l.֫ܰܿ r3 = l.C8740.m22603(r0)     // Catch: java.lang.Throwable -> L44
            l.᩻۟ܿ r4 = new l.᩻۟ܿ     // Catch: java.lang.Throwable -> L44
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L44
            long r2 = r2.m27389(r3, r4)     // Catch: java.lang.Throwable -> L44
            l.C8740.m22604(r0, r2)     // Catch: java.lang.Throwable -> L44
            l.C8740.m22606(r0)     // Catch: java.lang.Throwable -> L44
        L40:
            r1.m39221()
            return
        L44:
            r0 = move-exception
            r1.m39221()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20735.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        this.f66759.m39219();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C1868 c1868;
        if (exc instanceof C23821) {
            return;
        }
        C6807 c6807 = this.f66756;
        C11041 c11041 = c6807.f21109;
        c1868 = this.f66758.f26616;
        if (c11041.m27395(c1868)) {
            Context context = c6807.getContext();
            if (context instanceof AbstractActivityC3346) {
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) context;
                if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
                    return;
                }
            }
            if (exc instanceof C7161) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12030d);
            } else if (exc instanceof IOException) {
                c6807.m18479((IOException) exc);
            } else {
                c6807.m18479(new IOException("Unable to paste hex range", exc));
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C1868 c1868;
        C1868 c18682;
        C16684 c16684 = this.f66759;
        c16684.m39221();
        c16684.m39219();
        C8740 c8740 = this.f66758;
        c1868 = c8740.f26616;
        if (c1868 != null) {
            try {
                c18682 = c8740.f26616;
                c18682.close();
            } catch (IOException unused) {
            }
        }
        m20273();
        c16684.close();
    }
}
