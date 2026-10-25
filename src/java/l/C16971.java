package l;

import android.view.View;

/* compiled from: J1J0 */
/* renamed from: l.ܽ᩻ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16971 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13876 f52077;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7527 f52078;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f52079;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f52080;

    public C16971(C13876 c13876, AbstractViewOnClickListenerC17677 abstractViewOnClickListenerC17677, View view) {
        this.f52077 = c13876;
        this.f52080 = view;
        C7527 c7527 = abstractViewOnClickListenerC17677.f54077;
        this.f52078 = c7527;
        this.f52079 = abstractViewOnClickListenerC17677.getBindingAdapterPosition();
        if (c7527.m20188()) {
            throw new RuntimeException();
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39806() {
        this.f52077.m33279(this.f52078);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m39800() {
        /*
            r6 = this;
            l.۟ܳۡ r0 = r6.f52078
            boolean r1 = r0.m20181()
            l.۟ܳۡ r2 = r0.f23158
            l.ܰܳۡ r3 = r6.f52077
            if (r1 == 0) goto Lf
            r3.m33276(r0)
        Lf:
            if (r2 == 0) goto L29
            java.util.ArrayList r1 = r2.f23154
            r1.remove(r0)
            java.util.ArrayList r0 = r2.f23154
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            l.۟ܳۡ r0 = r2.f23158
            if (r0 == 0) goto L27
            java.util.ArrayList r0 = r0.f23154
            r0.remove(r2)
        L27:
            r0 = 1
            goto L33
        L29:
            l.ۧ᩻ۡ r1 = r3.m33283()
            java.util.ArrayList r1 = r1.f33901
            r1.remove(r0)
        L32:
            r0 = 0
        L33:
            int r1 = r3.mo15999()
            int r2 = r6.f52079
            if (r0 == 0) goto L52
            java.util.ArrayList r0 = r3.m33284()
            int r4 = r2 + (-1)
            int r5 = r4 - r1
            int r2 = r2 + 1
            int r2 = r2 - r1
            java.util.List r0 = r0.subList(r5, r2)
            r0.clear()
            r0 = 2
            r3.notifyItemRangeRemoved(r4, r0)
            return
        L52:
            java.util.ArrayList r0 = r3.m33284()
            int r1 = r2 - r1
            r0.remove(r1)
            r3.notifyItemRemoved(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16971.m39800():void");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m39807() {
        return this.f52078.m20189();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View m39802() {
        return this.f52080;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m39805() {
        return this.f52078.f23157;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39799() {
        return this.f52078.m20184();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m39803() {
        C7527 c7527 = this.f52078.f23158;
        if (c7527 == null) {
            return null;
        }
        return c7527.f23157;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m39801() {
        return C6554.m18061(200, this.f52078.f23155);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m39804() {
        return this.f52079;
    }
}
