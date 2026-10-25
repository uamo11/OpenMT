package l;

import android.os.Bundle;
import android.view.View;
import java.io.IOException;

/* compiled from: O1K3 */
/* renamed from: l.֨᩷ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1367 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f4997;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f4998;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4999;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7897 f5000;

    public C1367(C6306 c6306, String str) {
        this.f4997 = c6306;
        this.f4999 = str;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12392 c12392;
        View view;
        C15545 c15545;
        C6306 c6306 = this.f4997;
        c12392 = c6306.f19506;
        view = c6306.f19520;
        c12392.m30314(view, true, false);
        c6306.f19521 = true;
        c6306.f19525 = false;
        c15545 = c6306.f19513;
        c15545.m36677(".smali");
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x008c */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            r5 = this;
            l.ۛ᩷ۢ r0 = r5.f4997
            l.۫ۛ᩷ r1 = l.C6306.m17410(r0)
            r1.m29734()
            boolean r1 = l.C6306.m17385(r0)
            if (r1 != 0) goto L11
            goto L9a
        L11:
            l.۫ۧۢ r1 = l.C6306.m17405(r0)
            java.lang.String r2 = r0.m17420()
            java.lang.String r1 = r1.m30076(r2)
            l.۫ۧۢ r2 = l.C6306.m17405(r0)
            l.᩵ܺۚ r1 = r2.m30045(r1)
            int r1 = r1.f63232
            l.۠ۗ֡ r1 = l.C7897.m21184(r1)
            r5.f5000 = r1
            l.۫ۧۢ r1 = l.C6306.m17405(r0)
            l.ۧ۫᩷ r1 = r1.m36268()
            l.ۧ۫᩷ r1 = l.C6306.m17398(r0, r1)
            boolean r2 = r1.m27336()
            if (r2 == 0) goto L52
            byte[] r1 = r1.m27337()     // Catch: java.lang.Exception -> L51
            l.۬ۜܽ r1 = l.C12951.m31485(r1)     // Catch: java.lang.Exception -> L51
            boolean r1 = l.C6306.m17380(r0, r1)     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L52
            r1 = 1
            r5.f4998 = r1     // Catch: java.lang.Exception -> L51
            return
        L51:
        L52:
            boolean r1 = l.C6306.m17385(r0)
            if (r1 != 0) goto L59
            goto L9a
        L59:
            l.۫ۧۢ r1 = l.C6306.m17405(r0)
            java.lang.String r2 = r5.f4999
            java.lang.String r1 = r1.m30052(r2)
            boolean r2 = l.C6306.m17385(r0)
            if (r2 != 0) goto L6a
            goto L9a
        L6a:
            l.۫ۨᩳ r2 = l.C6306.m17419(r0)
            l.۫ۧۢ r3 = l.C6306.m17405(r0)
            l.ۧ۫᩷ r3 = r3.m36268()
            l.ۧ۫᩷ r3 = l.C6306.m17418(r0, r3)
            l.ܶ᩵ܿ r3 = r3.m27340()
            r2.m30337(r3, r1)
            boolean r1 = l.C6306.m17385(r0)
            if (r1 != 0) goto L88
            goto L9a
        L88:
            boolean r1 = l.C6306.m17385(r0)
            if (r1 == 0) goto L9a
            boolean r1 = r2.m30370()
            if (r1 == 0) goto L9a
            r3 = 10
            android.os.SystemClock.sleep(r3)
            goto L88
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1367.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        boolean z;
        C12392 c12392;
        C12392 c123922;
        C12392 c123923;
        C12392 c123924;
        Bundle bundle;
        C12392 c123925;
        C12392 c123926;
        C12366 c12366;
        C12392 c123927;
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        C12392 c123928;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        C12392 c123929;
        InterfaceMenuItemC13827 interfaceMenuItemC138273;
        C12392 c1239210;
        C6306 c6306 = this.f4997;
        z = c6306.f19523;
        if (z) {
            c12392 = c6306.f19506;
            c12392.m30343(new C14693((ActivityC17169) c6306.requireActivity(), this.f5000));
            if (this.f4998) {
                c123927 = c6306.f19506;
                c123927.m30410();
                interfaceMenuItemC13827 = c6306.f19511;
                if (interfaceMenuItemC13827 != null) {
                    interfaceMenuItemC138272 = c6306.f19511;
                    c123929 = c6306.f19506;
                    interfaceMenuItemC138272.setEnabled(!c123929.m30441());
                    interfaceMenuItemC138273 = c6306.f19507;
                    c1239210 = c6306.f19506;
                    interfaceMenuItemC138273.setChecked(c1239210.m30441());
                }
                C6306.m17417(c6306);
                c123928 = c6306.f19506;
                c123928.invalidate();
            } else {
                c123922 = c6306.f19506;
                c123922.m30360();
                c123923 = c6306.f19506;
                c123923.m30456(false);
                c123924 = c6306.f19506;
                c123924.m30303();
            }
            bundle = c6306.f43260;
            c123925 = c6306.f19506;
            bundle.putBoolean("changed", c123925.m30297());
            try {
                c12366 = c6306.f19514;
                c6306.m34239(c12366.m36268());
            } catch (IOException unused) {
            }
            C4925.m14316(new Runnable() { // from class: l.ۚ᩷ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2;
                    C6306 c63062 = C1367.this.f4997;
                    c63062.f19503 = true;
                    z2 = c63062.f19523;
                    if (z2) {
                        C6306.m17415(c63062);
                    }
                }
            }, 200L);
            c123926 = c6306.f19506;
            c123926.requestFocus();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        boolean z;
        C12392 c12392;
        C12392 c123922;
        C6306 c6306 = this.f4997;
        c3764 = c6306.f19500;
        c3764.m11384((Throwable) exc);
        c6306.f19525 = true;
        z = c6306.f19523;
        if (z) {
            c12392 = c6306.f19506;
            c12392.mo25910((CharSequence) exc.toString());
            c123922 = c6306.f19506;
            c123922.m30407(true);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        boolean z;
        C12392 c12392;
        View view;
        boolean z2;
        C6306 c6306 = this.f4997;
        z = c6306.f19523;
        if (z) {
            c12392 = c6306.f19506;
            view = c6306.f19520;
            z2 = c6306.f19525;
            c12392.m30314(view, false, !z2);
        }
        c6306.f19521 = false;
        c6306.f19519 = true;
    }
}
