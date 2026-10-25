package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.text.DateFormat;
import java.util.Date;

/* compiled from: J6WT */
/* renamed from: l.ۗ۬᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3264 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f10236;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f10237;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22314 f10238 = new C22314(this);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2978 f10239;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10240;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f10241;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f10242;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19379 f10243;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5267 f10244;

    public C3264(AbstractActivityC3346 abstractActivityC3346, C5267 c5267) {
        this.f10236 = abstractActivityC3346;
        this.f10244 = c5267;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3264 m9981(View view, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        C3264 c3264 = new C3264(abstractActivityC3346, C5267.m15182());
        c3264.f10242 = dialogInterfaceC0206;
        C2447 c2447 = (C2447) view.findViewById(R.id.MT_Protector_res_0x7f0a007d);
        c2447.m7898();
        c3264.m10007();
        c2447.setAdapter(c3264.f10238);
        return c3264;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9983(final C3264 c3264, View view) {
        c3264.f10239 = (C2978) view.findViewById(R.id.MT_Protector_res_0x7f0a04b7);
        c3264.f10241 = view.findViewById(R.id.MT_Protector_res_0x7f0a018f);
        c3264.m10002();
        c3264.f10239.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩷۬᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C3264.m9998(C3264.this, z);
            }
        });
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m9998(final C3264 c3264, final boolean z) {
        if (c3264.f10237) {
            return;
        }
        c3264.m10007();
        if (c3264.f10240) {
            return;
        }
        if (z && c3264.f10244.m15190().f62726.isEmpty()) {
            C21374.m48463(R.string.MT_Protector_res_0x7f12057e);
            return;
        }
        AbstractActivityC3346 abstractActivityC3346 = c3264.f10236;
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44433(R.string.MT_Protector_res_0x7f120584);
        c19258.m44416(z ? R.string.MT_Protector_res_0x7f12057f : R.string.MT_Protector_res_0x7f12057d);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۡ۬᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C3264.m9995(C3264.this, z);
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9995(final C3264 c3264, final boolean z) {
        c3264.m9991(new InterfaceC15257() { // from class: l.ܺ۬᩻
            @Override // l.InterfaceC15257
            public final C3856 run() {
                C3264.this.f10244.m15188(z);
                return null;
            }
        }, (Runnable) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10005() {
        if (this.f10240) {
            return;
        }
        C5267 c5267 = this.f10244;
        if (c5267.m15190().f62726.size() >= 32) {
            C21374.m48463(R.string.MT_Protector_res_0x7f120581);
            return;
        }
        if (!c5267.m15190().f62724) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this.f10236);
            c19258.m44433(R.string.MT_Protector_res_0x7f12057b);
            c19258.m44416(R.string.MT_Protector_res_0x7f120585);
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC6792(0, this));
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        m9992((C18673) null, (DialogInterfaceC0206) null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m10006() {
        return this.f10240;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10007() {
        this.f10243 = this.f10244.m15190();
        m10002();
        this.f10238.notifyDataSetChanged();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m10002() {
        C2978 c2978 = this.f10239;
        if (c2978 == null) {
            return;
        }
        this.f10237 = true;
        c2978.setChecked(this.f10243.f62728);
        this.f10237 = false;
        this.f10241.setVisibility(this.f10243.f62726.isEmpty() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m9992(C18673 c18673, DialogInterfaceC0206 dialogInterfaceC0206) {
        AbstractActivityC3346 abstractActivityC3346 = this.f10236;
        C1147 c1147 = new C1147(this, abstractActivityC3346, c18673, dialogInterfaceC0206);
        c1147.m31258(c18673 == null ? R.string.MT_Protector_res_0x7f12057b : R.string.MT_Protector_res_0x7f1205f9);
        c1147.m31265(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120582));
        c1147.m31250((CharSequence) (c18673 == null ? "" : c18673.f59008));
        c1147.m31242();
        c1147.m31244();
        c1147.m31266(true);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m9997(final C3264 c3264, final String str) {
        AbstractActivityC3346 abstractActivityC3346 = c3264.f10236;
        C5267 c5267 = c3264.f10244;
        C18673 m15189 = c5267.m15189(str);
        if (m15189 == null) {
            c3264.m10007();
            return;
        }
        String str2 = m15189.f59012;
        String str3 = m15189.f59011;
        long j = m15189.f59009;
        String format = j == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j));
        long j2 = m15189.f59010;
        String format2 = j2 == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j2));
        if (str2.isEmpty()) {
            str2 = "—";
        }
        String string = abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12057c, str3, format, format2, str2);
        String m15191 = c5267.m15191(str);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44436(m15189.f59008);
        if (m15191 == null) {
            StringBuilder m19190 = C7166.m19190(string, "\n\n");
            m19190.append(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12058b));
            string = m19190.toString();
        }
        c19258.m44424(string);
        c19258.m44442(R.string.MT_Protector_res_0x7f1205c2, null);
        c19258.m44440(R.string.MT_Protector_res_0x7f120634, (DialogInterface.OnClickListener) null);
        c19258.m44434(R.string.MT_Protector_res_0x7f120189, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = c19258.m44438();
        m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۖ۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3264.m9986(C3264.this, str, m44438, view);
            }
        });
        m44438.m1447().setEnabled(m15191 != null);
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3264.m9984(C3264.this, str);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9984(C3264 c3264, String str) {
        String m15191 = c3264.f10244.m15191(str);
        if (m15191 != null) {
            C4925.m14314((CharSequence) m15191);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9986(final C3264 c3264, final String str, final DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        final C18673 m15189 = c3264.f10244.m15189(str);
        if (m15189 != null) {
            C21282 c21282 = new C21282(c3264.f10236, view, 0);
            c21282.m48304().add(R.string.MT_Protector_res_0x7f1205f9).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ᩴ۬᩻
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C3264.this.m9992(m15189, dialogInterfaceC0206);
                    return true;
                }
            });
            c21282.m48304().add(R.string.MT_Protector_res_0x7f1205ca).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.᩵۬᩻
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C3264.m9988(C3264.this, m15189, str, dialogInterfaceC0206);
                    return true;
                }
            });
            c21282.m48305();
            return;
        }
        c3264.m10007();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.f62726.size() == 1) goto L8;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m9988(l.C3264 r4, l.C18673 r5, java.lang.String r6, l.DialogInterfaceC0206 r7) {
        /*
            l.ۚۢۜ r0 = r4.f10244
            l.᩵ۢۜ r0 = r0.m15190()
            boolean r1 = r0.f62728
            r2 = 0
            if (r1 == 0) goto L15
            java.util.List r0 = r0.f62726
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            l.ۗܺ᩷ r0 = r4.f10236
            int r3 = l.DialogInterfaceC0206.f1451
            l.᩵ۚۢ r3 = new l.᩵ۚۢ
            r3.<init>(r0)
            java.lang.String r5 = r5.f59008
            r3.m44436(r5)
            if (r1 == 0) goto L2a
            r5 = 2131887488(0x7f120580, float:1.9409585E38)
            goto L2d
        L2a:
            r5 = 2131887494(0x7f120586, float:1.9409597E38)
        L2d:
            r3.m44416(r5)
            l.᩻۬᩻ r5 = new l.᩻۬᩻
            r5.<init>(r4, r6, r7, r2)
            r4 = 2131887562(0x7f1205ca, float:1.9409735E38)
            r3.m44442(r4, r5)
            r4 = 2131886430(0x7f12015e, float:1.9407439E38)
            r5 = 0
            r3.m44434(r4, r5)
            r3.m44438()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3264.m9988(l.ۗ۬᩻, l.ᩴۢۜ, java.lang.String, l.֡ۚۢ):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m9991(InterfaceC15257 interfaceC15257, Runnable runnable) {
        if (this.f10240) {
            return;
        }
        this.f10240 = true;
        new C8203(this, interfaceC15257, runnable).m20274();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m10003(C3264 c3264, String str) {
        AbstractActivityC3346 abstractActivityC3346 = c3264.f10236;
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44433(R.string.MT_Protector_res_0x7f12057b);
        c19258.m44424(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12058a) + "\n\n" + str);
        c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
        c19258.m44440(R.string.MT_Protector_res_0x7f1205c2, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 m44415 = c19258.m44415();
        m44415.m1449();
        m44415.m1448().setOnClickListener(new ViewOnClickListenerC9615(0, str));
    }
}
