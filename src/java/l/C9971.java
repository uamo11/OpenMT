package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 673L */
/* renamed from: l.ۤ֨᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9971 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f30082;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f30083;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10235 f30084;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19907 f30085;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5062 f30086;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10235 f30087;

    public C9971(Main main, C19907 c19907) {
        this.f30082 = main;
        this.f30085 = c19907;
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00eb);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(main);
        c19258.m44421(m10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 m44415 = c19258.m44415();
        this.f30083 = m44415;
        m44415.m1437(new DialogInterface.OnKeyListener() { // from class: l.ۙ֨᩻
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return C9971.m25136(C9971.this, i2, keyEvent);
            }
        });
        C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f30086 = c5062;
        c5062.m14602("rpur", (String) null);
        c5062.m14606();
        c5062.m14599(17);
        C10235 m14607 = c5062.m14607();
        m14607.m25924(6);
        m14607.m30512(2);
        m14607.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۗ֨᩻
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return C9971.m25133(C9971.this, i2, keyEvent);
            }
        });
        C10235 c10235 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04aa);
        this.f30084 = c10235;
        c10235.m25924(5);
        String string = ApplicationC20075.f65008.getString("rpua", "MT-RemotePayload/1");
        c10235.mo25910((CharSequence) (C22794.m50882(string) ? string : "MT-RemotePayload/1"));
        C10235 c102352 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a6);
        this.f30087 = c102352;
        c102352.m25924(6);
        int i2 = 4;
        int i3 = ApplicationC20075.f65008.getInt("rpdt", 4);
        if (i3 >= 1 && i3 <= 16) {
            i2 = i3;
        }
        c102352.mo25910((CharSequence) String.valueOf(i2));
        c102352.setOnKeyListener(new View.OnKeyListener() { // from class: l.۬֨᩻
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                return C9971.m25135(C9971.this, i4, keyEvent);
            }
        });
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0257).setOnClickListener(new ViewOnClickListenerC10893(3, main));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25136(C9971 c9971, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        c9971.f30083.dismiss();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25133(C9971 c9971, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c9971.m25134();
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m25135(C9971 c9971, int i, KeyEvent keyEvent) {
        if (i != 66 && i != 160) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            c9971.m25134();
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25137() {
        C5062 c5062 = this.f30086;
        c5062.m14615();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f30083;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.۫֨᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9971.this.m25134();
            }
        });
        C4925.m14329(c5062.m14607());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m25134() {
        C11749 c11749;
        AbstractActivityC3346 abstractActivityC3346 = this.f30082;
        C10235 c10235 = this.f30087;
        C5062 c5062 = this.f30086;
        String trim = c5062.m14611().toString().trim();
        try {
            c11749 = C11749.m28763(trim);
        } catch (IllegalArgumentException unused) {
            c11749 = null;
        }
        if (c11749 == null || !c11749.m28778().isEmpty() || !c11749.m28769().isEmpty() || c11749.m28773().isEmpty()) {
            c5062.m14607().requestFocus();
            C21374.m48463(R.string.MT_Protector_res_0x7f120856);
            return;
        }
        C10235 c102352 = this.f30084;
        String trim2 = c102352.m30436().toString().trim();
        if (!C22794.m50882(trim2)) {
            c102352.requestFocus();
            C21374.m48463(R.string.MT_Protector_res_0x7f120857);
            return;
        }
        try {
            int parseInt = Integer.parseInt(c10235.m30436().toString().trim());
            if (parseInt >= 1 && parseInt <= 16) {
                if (trim.length() <= 2000) {
                    c5062.m14601(trim);
                    c5062.m14610();
                }
                ApplicationC20075.f65008.edit().putString("rpua", trim2).mo25853(parseInt, "rpdt").apply();
                this.f30083.dismiss();
                ((C16560) this.f30085.f64320).m39009((InterfaceC18303) new C19849(trim, trim2, parseInt, new C22670()));
                return;
            }
            c10235.requestFocus();
            c10235.m25900();
            C21374.m48464(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120855, 16));
        } catch (NumberFormatException unused2) {
            c10235.requestFocus();
            c10235.m25900();
            C21374.m48464(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120855, 16));
        }
    }
}
