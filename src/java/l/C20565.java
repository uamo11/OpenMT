package l;

import android.os.Bundle;
import android.view.View;
import java.io.IOException;

/* compiled from: Z1GQ */
/* renamed from: l.᩷֫ۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20565 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f66239;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f66240;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f66241;

    public C20565(C7864 c7864, String str) {
        this.f66241 = c7864;
        this.f66239 = str;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12392 c12392;
        View view;
        C15545 c15545;
        C7864 c7864 = this.f66241;
        c12392 = c7864.f24374;
        view = c7864.f24384;
        c12392.m30314(view, true, false);
        c7864.f24382 = true;
        c7864.f24376 = false;
        c15545 = c7864.f24369;
        c15545.m36677(".xml");
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0068 */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            r5 = this;
            l.۠֫ۢ r0 = r5.f66241
            l.۫ۛ᩷ r1 = l.C7864.m21108(r0)
            r1.m29734()
            boolean r1 = l.C7864.m21083(r0)
            if (r1 != 0) goto L10
            goto L76
        L10:
            l.᩵ۨ᩷ r1 = l.C7864.m21104(r0)
            l.ۧ۫᩷ r1 = r1.m36268()
            l.ۧ۫᩷ r1 = l.C7864.m21097(r0, r1)
            boolean r2 = r1.m27336()
            if (r2 == 0) goto L35
            byte[] r1 = r1.m27337()     // Catch: java.lang.Exception -> L34
            l.۬ۜܽ r1 = l.C12951.m31485(r1)     // Catch: java.lang.Exception -> L34
            boolean r1 = l.C7864.m21078(r0, r1)     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto L35
            r1 = 1
            r5.f66240 = r1     // Catch: java.lang.Exception -> L34
            return
        L34:
        L35:
            boolean r1 = l.C7864.m21083(r0)
            if (r1 != 0) goto L3c
            goto L76
        L3c:
            l.᩵ۨ᩷ r1 = l.C7864.m21104(r0)
            java.lang.String r2 = r5.f66239
            java.lang.String r1 = r1.m44856(r2)
            boolean r2 = l.C7864.m21083(r0)
            if (r2 != 0) goto L4d
            goto L76
        L4d:
            l.۫ۨᩳ r2 = l.C7864.m21118(r0)
            l.᩵ۨ᩷ r3 = l.C7864.m21104(r0)
            l.ۧ۫᩷ r3 = r3.m36268()
            l.ۧ۫᩷ r3 = l.C7864.m21117(r0, r3)
            l.ܶ᩵ܿ r3 = r3.m27340()
            r2.m30337(r3, r1)
        L64:
            boolean r1 = l.C7864.m21083(r0)
            if (r1 == 0) goto L76
            boolean r1 = r2.m30370()
            if (r1 == 0) goto L76
            r3 = 10
            android.os.SystemClock.sleep(r3)
            goto L64
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20565.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        boolean z;
        C12392 c12392;
        C12392 c123922;
        C12392 c123923;
        Bundle bundle;
        C12392 c123924;
        C12392 c123925;
        C19452 c19452;
        C12392 c123926;
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        C12392 c123927;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        C12392 c123928;
        InterfaceMenuItemC13827 interfaceMenuItemC138273;
        C12392 c123929;
        C7864 c7864 = this.f66241;
        z = c7864.f24385;
        if (z) {
            if (this.f66240) {
                c123926 = c7864.f24374;
                c123926.m30410();
                interfaceMenuItemC13827 = c7864.f24377;
                if (interfaceMenuItemC13827 != null) {
                    interfaceMenuItemC138272 = c7864.f24377;
                    c123928 = c7864.f24374;
                    interfaceMenuItemC138272.setEnabled(!c123928.m30441());
                    interfaceMenuItemC138273 = c7864.f24380;
                    c123929 = c7864.f24374;
                    interfaceMenuItemC138273.setChecked(c123929.m30441());
                }
                C7864.m21110(c7864);
                c123927 = c7864.f24374;
                c123927.invalidate();
            } else {
                c12392 = c7864.f24374;
                c12392.m30360();
                c123922 = c7864.f24374;
                c123922.m30456(false);
                c123923 = c7864.f24374;
                c123923.m30303();
            }
            bundle = c7864.f43260;
            c123924 = c7864.f24374;
            bundle.putBoolean("changed", c123924.m30297());
            try {
                c19452 = c7864.f24368;
                c7864.m34239(c19452.m36268());
            } catch (IOException unused) {
            }
            C4925.m14316(new Runnable() { // from class: l.ۜ֫ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2;
                    C7864 c78642 = C20565.this.f66241;
                    c78642.f24378 = true;
                    z2 = c78642.f24385;
                    if (z2) {
                        C7864.m21114(c78642);
                    }
                }
            }, 200L);
            c7864.m21115();
            c123925 = c7864.f24374;
            c123925.requestFocus();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        boolean z;
        C12392 c12392;
        C12392 c123922;
        C7864 c7864 = this.f66241;
        c3764 = c7864.f24386;
        c3764.m11384((Throwable) exc);
        c7864.f24376 = true;
        z = c7864.f24385;
        if (z) {
            c12392 = c7864.f24374;
            c12392.mo25910((CharSequence) exc.toString());
            c123922 = c7864.f24374;
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
        C7864 c7864 = this.f66241;
        z = c7864.f24385;
        if (z) {
            c12392 = c7864.f24374;
            view = c7864.f24384;
            z2 = c7864.f24376;
            c12392.m30314(view, false, !z2);
        }
        c7864.f24382 = false;
        c7864.f24375 = true;
    }
}
