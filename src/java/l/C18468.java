package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: W5L3 */
/* renamed from: l.ᩴۖۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18468 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19174 f57266;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ۖۖۡ] */
    public C18468(ViewOnClickListenerC19174 viewOnClickListenerC19174, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f57266 = viewOnClickListenerC19174;
        m31273(C4925.m14306(R.string.MT_Protector_res_0x7f12017a, 10));
        m31257();
        m31283(C21943.f70269);
        final TextView m31255 = m31255();
        m31255.setVisibility(8);
        m31249(new C3651(new Runnable() { // from class: l.ۖۖۡ
            @Override // java.lang.Runnable
            public final void run() {
                C18468 c18468 = C18468.this;
                int m14614 = c18468.f57266.f60423.m14614();
                TextView textView = m31255;
                if (m14614 > 0) {
                    try {
                        if (Integer.parseInt(c18468.m31260()) <= 10) {
                            textView.setVisibility(0);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                textView.setVisibility(8);
            }
        }));
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0020 */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2170() {
        /*
            r3 = this;
            l.᩵ۖۡ r0 = r3.f57266
            l.ۚۖۡ r0 = r0.f60423
            java.lang.String r1 = r3.m31260()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L12
            r3.m31262()
            return
        L12:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L41
            if (r1 < 0) goto L3b
        L18:
            l.֨ۖۡ r2 = l.C5062.m14592(r0)
            int r2 = r2.m3093()
            if (r2 <= r1) goto L2a
            l.֨ۖۡ r2 = l.C5062.m14592(r0)
            r2.m3091()
            goto L18
        L2a:
            l.֨ۖۡ r1 = l.C5062.m14592(r0)
            r1.m3094()
            l.C5062.m14596(r0)
            r0.m14613()
            r3.m31262()
            return
        L3b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L41
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L41
            throw r0     // Catch: java.lang.NumberFormatException -> L41
        L41:
            r0 = 2131888968(0x7f120b48, float:1.9412586E38)
            r3.m31263(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18468.mo2170():void");
    }
}
