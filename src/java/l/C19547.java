package l;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: L5KK */
/* renamed from: l.᩵ܶܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19547 extends AbstractViewOnClickListenerC12490 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set f63206;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C5242 f63205 = new C5242();

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C5242 f63204 = new C5242();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19547(bin.mt.plus.Main r3, l.C3318 r4) {
        /*
            r2 = this;
            r0 = 2131886380(0x7f12012c, float:1.9407337E38)
            java.lang.String r0 = l.C4925.m14327(r0)
            r2.<init>(r3, r0, r0, r4)
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = l.C20195.synchronizedSet(r0)
            r2.f63206 = r0
            boolean r0 = l.C19890.f64278
            if (r0 == 0) goto L20
            r2.m44963()
        L20:
            l.ۢܶܳ r0 = new l.ۢܶܳ
            r1 = 0
            r0.<init>(r1, r2, r4)
            l.C9068.m23406(r3, r0)
            l.᩻ۢᩳ r0 = new l.᩻ۢᩳ
            r1 = 1
            r0.<init>(r1, r2, r4)
            l.ۚۡ֫ r4 = l.C19547.f63204
            r4.m1668(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19547.<init>(bin.mt.plus.Main, l.ۗܶܳ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44962(C19547 c19547, C3318 c3318) {
        if (C19890.f64278) {
            c19547.m44963();
            c3318.notifyDataSetChanged();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44961(C19547 c19547, C3318 c3318) {
        if (C19890.f64278) {
            c19547.m44963();
            c3318.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* renamed from: ܽ */
    public final int mo15528() {
        if (C19890.f64278) {
            return super.mo15528();
        }
        return 0;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m44963() {
        ArrayList arrayList = this.f37525;
        arrayList.clear();
        C6951 m23422 = C9068.m23422();
        int m18793 = m23422.m18793();
        for (int i = 0; i < m18793; i++) {
            arrayList.add(new C4024(this, this.f34527, m23422.m18789(i)));
        }
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* renamed from: ֫ */
    public final void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i) {
        C16828 c16828;
        C16828 c168282;
        C16828 c168283;
        C16828 c168284;
        C16828 c168285;
        C16828 c168286;
        C16828 c168287;
        C16828 c168288;
        C16828 c168289;
        C18841 c18841 = (C18841) abstractViewOnLongClickListenerC14606;
        C4024 c4024 = (C4024) this.f37525.get(i);
        c18841.f59428 = c4024;
        C10402 c10402 = c18841.f44704;
        TextView textView = c18841.f44700;
        TextView textView2 = c18841.f44703;
        c16828 = c4024.f12771;
        textView2.setText(c16828.m39592());
        c168282 = c4024.f12771;
        C17534 m39598 = c168282.m39598();
        if (m39598 == null) {
            c168289 = c4024.f12771;
            textView.setText(c168289.m39588());
        } else {
            AbstractC3577 m31047 = C12749.m31047(m39598.m40974());
            if (m31047 == null) {
                StringBuilder sb = new StringBuilder("error ");
                c168284 = c4024.f12771;
                sb.append(c168284.m39588());
                textView.setText(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m31047.mo6371());
                c168283 = c4024.f12771;
                sb2.append(c168283.m39588());
                textView.setText(sb2.toString());
            }
        }
        c168285 = c4024.f12771;
        c10402.setTag(c168285);
        c10402.m26232(c4024.m12101());
        c168286 = c4024.f12771;
        if (c168286.m39598() == null) {
            c168287 = c4024.f12771;
            if (c168287.m39597() == null) {
                c168288 = c4024.f12771;
                if (this.f63206.add(c168288)) {
                    C1802.f6208.execute(new RunnableC16017(this, c168288.m39588(), c18841, c168288, 0));
                }
            }
        }
        c18841.itemView.setOnClickListener(c4024);
        this.f37526.m10148((AbstractViewOnLongClickListenerC14606) c18841);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44960(final C19547 c19547, final String str, final C18841 c18841, final C16828 c16828) {
        C19883 m7317;
        Set set = c19547.f63206;
        try {
            try {
                AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
                if (!m39866.mo23120()) {
                    m7317 = C2204.m7292(str, true).m7317();
                } else {
                    m7317 = C20844.f67485.mo11258(new C9555(m39866));
                }
            } catch (RuntimeException unused) {
                m7317 = C2204.m7292(str, true).m7317();
            }
            final C19883 c19883 = m7317;
            C4925.m14315(new Runnable() { // from class: l.ۖܶܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C4024 c4024;
                    C4024 c40242;
                    C16828 c168282;
                    C19547.this.getClass();
                    C16828 c168283 = c16828;
                    if (str.equals(c168283.m39588())) {
                        C19883 c198832 = c19883;
                        c168283.m39584(c198832);
                        C18841 c188412 = c18841;
                        c4024 = c188412.f59428;
                        C10402 c10402 = c188412.f44704;
                        if (c4024 != null) {
                            c40242 = c188412.f59428;
                            c168282 = c40242.f12771;
                            if (c168282 == c168283 && c10402.getTag() == c168283) {
                                c10402.m26232(c198832.f64248);
                            }
                        }
                    }
                }
            });
        } finally {
            set.remove(c16828);
        }
    }
}
