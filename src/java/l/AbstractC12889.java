package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: C627 */
/* renamed from: l.۬ۙܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC12889 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f38683;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f38684;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView f38685;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f38686;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5062 f38687;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC4423 f38688;

    /* renamed from: ֫ */
    public abstract void mo17648();

    /* renamed from: ֫ */
    public abstract void mo17649(String str, String str2, boolean z);

    /* JADX WARN: Type inference failed for: r13v5, types: [l.ۙۙܽ] */
    public AbstractC12889(int i, final AbstractActivityC3346 abstractActivityC3346, final String str) {
        this.f38684 = false;
        this.f38686 = false;
        View m10216 = abstractActivityC3346.m10216(i);
        final C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final RadioButton radioButton = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479);
        final RadioButton radioButton2 = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a);
        final RadioButton radioButton3 = (RadioButton) m10216.findViewById(R.id.radioButton3);
        this.f38685 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f38687 = c5062;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩶ۙܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC12889.m31327(AbstractC12889.this, radioButton, radioButton2, radioButton3, c5062, view);
            }
        };
        radioButton.setOnClickListener(onClickListener);
        radioButton2.setOnClickListener(onClickListener);
        radioButton3.setOnClickListener(onClickListener);
        int i2 = ApplicationC20075.f65008.getInt(str, 0);
        if (i2 == 1) {
            radioButton2.setChecked(true);
            this.f38686 = true;
        } else if (i2 == 2) {
            radioButton3.setChecked(true);
            this.f38684 = true;
        } else {
            radioButton.setChecked(true);
        }
        c5062.m14604(radioButton.isChecked());
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f38683 = c19258.m44415();
        this.f38688 = new View.OnClickListener() { // from class: l.ۙۙܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC12889.m31328(AbstractC12889.this, radioButton2, radioButton3, c5062, str, radioButton, abstractActivityC3346);
            }
        };
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31327(AbstractC12889 abstractC12889, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, C5062 c5062, View view) {
        if (view == radioButton) {
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
            c5062.m14599(1);
            abstractC12889.f38684 = false;
            abstractC12889.f38686 = false;
        } else if (view == radioButton2) {
            radioButton.setChecked(false);
            radioButton3.setChecked(false);
            c5062.m14599(2);
            try {
                if (abstractC12889.f38684 && m31329(c5062.m14611().toString().trim())) {
                    c5062.m14601(String.valueOf(Long.parseLong(c5062.m14611().toString().trim(), 16)));
                }
                abstractC12889.f38684 = false;
                abstractC12889.f38686 = true;
            } catch (NumberFormatException unused) {
                abstractC12889.f38684 = false;
                abstractC12889.f38686 = false;
            }
        } else {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            c5062.m14599(1);
            try {
                if (abstractC12889.f38686 && m31330(c5062.m14611().toString().trim())) {
                    c5062.m14601(Long.toHexString(Long.parseLong(c5062.m14611().toString().trim())));
                }
                abstractC12889.f38684 = true;
                abstractC12889.f38686 = false;
            } catch (NumberFormatException unused2) {
                abstractC12889.f38684 = false;
                abstractC12889.f38686 = false;
            }
        }
        c5062.m14604(radioButton.isChecked());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m31328(l.AbstractC12889 r9, android.widget.RadioButton r10, android.widget.RadioButton r11, l.C5062 r12, java.lang.String r13, android.widget.RadioButton r14, l.AbstractActivityC3346 r15) {
        /*
            boolean r10 = r10.isChecked()
            r0 = 2
            r1 = 1
            r2 = 0
            if (r10 == 0) goto Lb
            r10 = 1
            goto L14
        Lb:
            boolean r10 = r11.isChecked()
            if (r10 == 0) goto L13
            r10 = 2
            goto L14
        L13:
            r10 = 0
        L14:
            l.۟᩺ᩳ r11 = r12.m14611()
            java.lang.String r7 = r11.toString()
            l.۫ۤۡ r11 = l.ApplicationC20075.f65008
            l.۬ۤۡ r11 = r11.edit()
            l.۬ۤۡ r11 = r11.mo25853(r10, r13)
            r11.apply()
            r12.m14610()
            r11 = 2131888968(0x7f120b48, float:1.9412586E38)
            if (r10 == r1) goto L5e
            if (r10 == r0) goto L35
            r6 = r7
            goto L6d
        L35:
            java.lang.String r12 = r7.trim()
            boolean r13 = m31329(r12)
            if (r13 != 0) goto L43
            l.C21374.m48457(r11)
            return
        L43:
            char[] r12 = r12.toCharArray()
            int r13 = r12.length
            r0 = 0
        L4a:
            if (r2 >= r13) goto L59
            char r3 = r12[r2]
            r4 = 4
            long r0 = r0 << r4
            int r3 = l.C9896.m24989(r3)
            long r3 = (long) r3
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L4a
        L59:
            java.lang.String r12 = java.lang.String.valueOf(r0)
            goto L6c
        L5e:
            java.lang.String r12 = r7.trim()
            boolean r13 = m31330(r12)
            if (r13 != 0) goto L6c
            l.C21374.m48457(r11)
            return
        L6c:
            r6 = r12
        L6d:
            int r12 = r6.length()
            if (r12 <= 0) goto L8c
            if (r10 == 0) goto L7d
            java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L79
            goto L7d
        L79:
            l.C21374.m48457(r11)
            return
        L7d:
            boolean r8 = r14.isChecked()
            l.ۗۙܽ r10 = new l.ۗۙܽ
            r3 = r10
            r4 = r9
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            r10.m20274()
        L8c:
            l.֡ۚۢ r9 = r9.f38683
            r9.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC12889.m31328(l.۬ۙܽ, android.widget.RadioButton, android.widget.RadioButton, l.ۚۖۡ, java.lang.String, android.widget.RadioButton, l.ۗܺ᩷):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31331(boolean z) {
        this.f38685.setText(z ? R.string.MT_Protector_res_0x7f12090f : R.string.MT_Protector_res_0x7f1208f5);
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f38683;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this.f38688);
        C5062 c5062 = this.f38687;
        c5062.m14615();
        C4925.m14329(c5062.m14607());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31332() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f38683;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this.f38688);
        C5062 c5062 = this.f38687;
        c5062.m14615();
        C4925.m14329(c5062.m14607());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31329(String str) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (((charAt < '0' || charAt > '9') && ((charAt < 'A' || charAt > 'F') && charAt < 'a')) || charAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31330(String str) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;
    }
}
