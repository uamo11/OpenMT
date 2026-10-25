package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 67CI */
/* renamed from: l.ۚܶܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5435 extends AbstractC17429 {

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13900 f16936;

    public C5435(Main main, C3318 c3318, C13900 c13900) {
        super(main, c13900.f41424, "drawer_expand_network_group_" + c13900.f41423, c3318, c13900.f41423);
        this.f16936 = c13900;
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15527(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606) {
        super.mo15527(abstractViewOnLongClickListenerC14606);
        if (this.f37526.m10155()) {
            ((C13195) abstractViewOnLongClickListenerC14606).f44703.setText(this.f37523 + " (" + C4925.m14327(R.string.MT_Protector_res_0x7f1206c9) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo15528() {
        if (this.f37522) {
            return this.f37525.size() + 1;
        }
        return 1;
    }

    @Override // l.AbstractViewOnClickListenerC12490, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f37526.m10155()) {
            return false;
        }
        C21282 c21282 = new C21282(this.f34527, view, 8388693);
        C7716.m20669(view);
        c21282.m48306();
        C3060 m48304 = c21282.m48304();
        m48304.add(0, R.string.MT_Protector_res_0x7f1205f9, 0, R.string.MT_Protector_res_0x7f1205f9).setIcon(R.drawable.MT_Protector_res_0x7f080231);
        m48304.add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e7);
        m48304.add(0, R.string.MT_Protector_res_0x7f1202d5, 0, R.string.MT_Protector_res_0x7f1202d5).setIcon(R.drawable.MT_Protector_res_0x7f0801ee);
        m48304.add(0, R.string.MT_Protector_res_0x7f1202d2, 0, R.string.MT_Protector_res_0x7f1202d2).setIcon(R.drawable.MT_Protector_res_0x7f0801fb);
        c21282.m48302(new C5544(this));
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15526(final C5435 c5435, MenuItem menuItem) {
        C13900 c13900 = c5435.f16936;
        Main main = c5435.f34527;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f1205f9) {
            C7346 c7346 = new C7346(main, c13900);
            c7346.m31258(R.string.MT_Protector_res_0x7f1205f9);
            c7346.m31250((CharSequence) c13900.f41424);
            c7346.m31244();
            c7346.m31281();
            c7346.m31266(true);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
            C19258 buildDialog = main.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ca);
            buildDialog.m44424(main.getString(R.string.MT_Protector_res_0x7f12023e, c13900.f41424));
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֡ܶܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C2096.m6946(C5435.this.f16936.f41423);
                }
            });
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
            return;
        }
        if (itemId != R.string.MT_Protector_res_0x7f1202d5) {
            if (itemId == R.string.MT_Protector_res_0x7f1202d2) {
                AbstractC17429.m40769(main);
                return;
            }
            return;
        }
        C13132 c13132 = (C13132) main.m10216(R.layout.MT_Protector_res_0x7f0d01e2);
        final ArrayList m6965 = C2096.m6965();
        C18324 c18324 = new C18324(main, m6965);
        C9876.m24967(c13132, -1, C11266.m27878(6.0f), -1, -1);
        c13132.setAdapter(c18324);
        C1556 c1556 = new C1556(new C16912(m6965, c18324));
        c1556.m5322(c13132);
        c18324.m42704(c1556);
        C19258 buildDialog2 = main.buildDialog();
        buildDialog2.m44433(R.string.MT_Protector_res_0x7f1202d5);
        buildDialog2.m44421(c13132);
        buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۧ᩸ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ArrayList arrayList = m6965;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C13900) it.next()).f41423));
                }
                C2096.m6952(arrayList2);
            }
        });
        buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog2.m44438();
    }
}
