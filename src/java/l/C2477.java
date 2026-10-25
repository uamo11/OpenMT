package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: 31K1 */
/* renamed from: l.ۖۤ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2477 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f7889;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7890;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f7891;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7892;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f7893;

    public C2477(ActivityC17169 activityC17169, boolean z, boolean z2) {
        this.f7889 = activityC17169;
        this.f7892 = z;
        this.f7890 = z2;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12366 c12366;
        C12366 c123662;
        ActivityC17169 activityC17169 = this.f7889;
        C22933 c22933 = new C22933(activityC17169);
        c22933.m51049(R.string.MT_Protector_res_0x7f1201da);
        c22933.m51040("...");
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f7893 = c22933;
        c22933.m51047().setEllipsize(TextUtils.TruncateAt.START);
        c12366 = activityC17169.f52606;
        if (c12366 != null) {
            c123662 = activityC17169.f52606;
            c123662.m30024();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C12366 c12366;
        C19452 c19452;
        C12366 c123662;
        C19452 c194522;
        C19452 c194523;
        C19452 c194524;
        C12366 c123663;
        C12366 c123664;
        C19452 c194525;
        C19452 c194526;
        C19452 c194527;
        C12366 c123665;
        C19452 c194528;
        C19452 c194529;
        C12366 c123666;
        C12366 c123667;
        ActivityC17169 activityC17169 = this.f7889;
        c12366 = activityC17169.f52606;
        if (c12366 != null) {
            c123666 = activityC17169.f52606;
            c123666.m30051();
            c123667 = activityC17169.f52606;
            c123667.m30035(new C8827(this));
        }
        if (this.f7893.m51053()) {
            return;
        }
        c19452 = activityC17169.f52621;
        if (c19452 != null) {
            if (this.f7892) {
                this.f7893.m51046("resources.arsc");
                this.f7893.m51038(R.string.MT_Protector_res_0x7f1201da);
                this.f7893.m51045(0);
                c194529 = activityC17169.f52621;
                ArrayList m44853 = c194529.m44853();
                if (!m44853.isEmpty()) {
                    this.f7891 = m44853;
                    return;
                }
            }
            c194528 = activityC17169.f52621;
            c194528.m44831(true, (InterfaceC5880) new C15881(this));
        }
        if (this.f7893.m51053()) {
            return;
        }
        this.f7893.m51045(100);
        this.f7893.m51049(R.string.MT_Protector_res_0x7f120b85);
        if (activityC17169.m40373() && activityC17169.m40346() != null) {
            String m40346 = activityC17169.m40346();
            c123664 = activityC17169.f52606;
            if (c123664 != null) {
                this.f7893.m51040("classes.dex");
                c123665 = activityC17169.f52606;
                c123665.m30036(C16999.m39866(m40346, new String[0]), C19890.f64276);
            }
            c194525 = activityC17169.f52621;
            if (c194525 != null) {
                C22933 c22933 = this.f7893;
                c194526 = activityC17169.f52621;
                c22933.m51040(c194526.m44837());
                c194527 = activityC17169.f52621;
                c194527.m44827(C16999.m39866(m40346, new String[0]), C19890.f64276);
                return;
            }
            return;
        }
        c123662 = activityC17169.f52606;
        if (c123662 != null) {
            this.f7893.m51040("classes.dex");
            c123663 = activityC17169.f52606;
            c123663.m30077();
        }
        c194522 = activityC17169.f52621;
        if (c194522 != null) {
            C22933 c229332 = this.f7893;
            c194523 = activityC17169.f52621;
            c229332.m51040(c194523.m44837());
            c194524 = activityC17169.f52621;
            c194524.m44836();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C11005 c11005;
        if (this.f7893.m51053() || this.f7891 != null) {
            return;
        }
        boolean z = this.f7890;
        ActivityC17169 activityC17169 = this.f7889;
        if (z) {
            activityC17169.finish();
            return;
        }
        if (activityC17169.m40373()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
            return;
        }
        c11005 = activityC17169.f52620;
        final String mo23554 = c11005.m27330("out").mo23554();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC17169);
        c19258.m44433(R.string.MT_Protector_res_0x7f120491);
        c19258.m44424(activityC17169.getString(R.string.MT_Protector_res_0x7f1203a4, mo23554));
        c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
        c19258.m44440(R.string.MT_Protector_res_0x7f120530, new DialogInterface.OnClickListener() { // from class: l.᩷ۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C2477 c2477 = C2477.this;
                c2477.getClass();
                Intent intent = new Intent();
                intent.putExtra(MotionUtils.EASING_TYPE_PATH, mo23554);
                ActivityC17169 activityC171692 = c2477.f7889;
                activityC171692.setResult(-1, intent);
                activityC171692.finish();
            }
        });
        c19258.m44438();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC17169.m40277(this.f7889, exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C12366 c12366;
        C12366 c123662;
        final ActivityC17169 activityC17169 = this.f7889;
        c12366 = activityC17169.f52606;
        if (c12366 != null) {
            c123662 = activityC17169.f52606;
            c123662.m30061();
        }
        this.f7893.m51051();
        if (this.f7891 == null || this.f7893.m51053()) {
            return;
        }
        final ArrayList<C3929> arrayList = this.f7891;
        if (arrayList.isEmpty()) {
            return;
        }
        View m10216 = activityC17169.m10216(R.layout.MT_Protector_res_0x7f0d00d9);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(activityC17169.getString(R.string.MT_Protector_res_0x7f1200f4, Integer.valueOf(arrayList.size())));
        StringBuilder sb = new StringBuilder();
        String str = null;
        for (C3929 c3929 : arrayList) {
            String str2 = c3929.f12542;
            if (!str2.equals(str)) {
                if (str != null) {
                    sb.append('\n');
                }
                C20177.m46410(sb, "<!-- ", str2, ".xml -->\n");
                str = str2;
            }
            sb.append("<entry id=\"");
            sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c3929.f12538)));
            sb.append("\" name=\"");
            sb.append(C10035.f30193.m28254(c3929.f12537));
            sb.append("\" />\n");
        }
        C10235 c10235 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a044f);
        c10235.m30407(true);
        c10235.mo25910((CharSequence) sb.toString().trim());
        c10235.m25927();
        final C3929 c39292 = (C3929) arrayList.get(0);
        C19258 buildDialog = activityC17169.buildDialog();
        buildDialog.m44421(m10216);
        final boolean z = this.f7890;
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1200f1, new DialogInterface.OnClickListener() { // from class: l.ۙ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC17169.f52595;
                new C6710(ActivityC17169.this, arrayList, z).m20274();
            }
        });
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1200f3, new DialogInterface.OnClickListener() { // from class: l.ۗ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC17169.m40281(ActivityC17169.this, c39292);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
