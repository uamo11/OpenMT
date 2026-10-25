package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Y4ZV */
/* renamed from: l.ۙ᩸ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4918 extends AbstractViewOnClickListenerC12490 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15510 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap f15511 = new HashMap();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f15512;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private synchronized void m14295() {
        this.f37525.clear();
        this.f37525.add(new C22557(this, this.f34527, R.string.MT_Protector_res_0x7f1208bf, "/", "/system", C19883.f64190));
        this.f37525.add(new C22557(this, this.f34527, R.string.MT_Protector_res_0x7f1209e3, C16293.f50120.mo23554(), (String) null, C19883.f64180));
        Iterator it = ((ArrayList) C19739.m45451()).iterator();
        while (it.hasNext()) {
            C4216 c4216 = (C4216) it.next();
            String path = c4216.f13687.getPath();
            this.f37525.add(new C22557(this, this.f34527, c4216.f13686, path, C19883.f64180, (C4027) null));
        }
        this.f15512 = this.f37525.size();
        for (C4027 c4027 : C18844.m43546()) {
            String m12120 = c4027.m12120();
            this.f37525.add(new C22557(this, this.f34527, c4027.f12781, m12120, C19883.f64181, c4027));
        }
        f15511.clear();
        for (int i = 0; i < this.f37525.size(); i++) {
            C22557 c22557 = (C22557) this.f37525.get(i);
            String str = c22557.f72949;
            if (str != null) {
                f15511.put(str.toLowerCase(), c22557.f72952);
            }
        }
        for (C4027 c40272 : C18844.m43547()) {
            C13843.putIfAbsent(f15511, c40272.m12120().toLowerCase(), c40272.f12781);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14291(C4918 c4918, C20441 c20441) {
        c4918.getClass();
        int bindingAdapterPosition = c20441.getBindingAdapterPosition();
        C3318 c3318 = c4918.f37526;
        int m10143 = (bindingAdapterPosition - c3318.m10143(c4918)) - 1;
        if (m10143 >= c4918.f15512) {
            c4918.f37525.remove(m10143);
            C18844.m43534(m10143 - c4918.f15512);
            c3318.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14292(C4918 c4918, C20441 c20441, C20441 c204412) {
        c4918.getClass();
        int bindingAdapterPosition = c20441.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c204412.getBindingAdapterPosition();
        C3318 c3318 = c4918.f37526;
        int m10143 = (bindingAdapterPosition - c3318.m10143(c4918)) - 1;
        int m101432 = (bindingAdapterPosition2 - c3318.m10143(c4918)) - 1;
        int i = c4918.f15512;
        C18844.m43535(m10143 - i, m101432 - i);
        C6055.m16890(m10143, m101432, c4918.f37525);
        c3318.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m14294(C4918 c4918, C20441 c20441) {
        c4918.getClass();
        int bindingAdapterPosition = c20441.getBindingAdapterPosition();
        C3318 c3318 = c4918.f37526;
        int m10143 = (bindingAdapterPosition - c3318.m10143(c4918)) - 1;
        if (m10143 >= c4918.f15512) {
            c4918.f37525.remove(m10143);
            C18844.m43542(m10143 - c4918.f15512);
            c3318.notifyItemRangeRemoved(bindingAdapterPosition, 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۚ᩸ܳ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.֨᩸ܳ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4918(bin.mt.plus.Main r2, final l.C3318 r3) {
        /*
            r1 = this;
            r0 = 2131887407(0x7f12052f, float:1.940942E38)
            java.lang.String r0 = l.C4925.m14327(r0)
            r1.<init>(r2, r0, r0, r3)
            l.ۚ᩸ܳ r0 = new l.ۚ᩸ܳ
            r0.<init>()
            l.C19739.m45450(r2, r0)
            l.֨᩸ܳ r0 = new l.֨᩸ܳ
            r0.<init>()
            l.C18844.m43537(r2, r0)
            r1.m14295()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4918.<init>(bin.mt.plus.Main, l.ۗܶܳ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14293(C4918 c4918, C3318 c3318) {
        c4918.m14295();
        c3318.notifyDataSetChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14290(C4918 c4918, C3318 c3318) {
        c4918.m14295();
        c3318.notifyDataSetChanged();
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo14296() {
        m14295();
    }

    @Override // l.AbstractViewOnClickListenerC12490, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f37526.m10155()) {
            return false;
        }
        C21282 c21282 = new C21282(this.f34527, view, 8388693);
        C7716.m20669(view);
        c21282.m48306();
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1202d1, 0, R.string.MT_Protector_res_0x7f1202d1).setIcon(R.drawable.MT_Protector_res_0x7f0801ce);
        c21282.m48302(new InterfaceC14930() { // from class: l.۠᩸ܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() != R.string.MT_Protector_res_0x7f1202d1) {
                    return false;
                }
                C4918.this.f34527.m129();
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14289(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        return (String) f15511.get(str.toLowerCase());
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* renamed from: ֫ */
    public final void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i) {
        C2426 c2426;
        C2426 c24262;
        C2426 c24263;
        C2426 c24264;
        long j;
        long j2;
        C20441 c20441 = (C20441) abstractViewOnLongClickListenerC14606;
        C22557 c22557 = (C22557) this.f37525.get(i);
        c20441.f65939 = c22557;
        TextView textView = c20441.f44700;
        c20441.f44703.setText(c22557.f72952);
        c2426 = c20441.f65940;
        c2426.m7860(EnumC15830.Visible);
        String str = "";
        if (c22557.f72951 == null) {
            String str2 = c22557.f72954;
            c24264 = c20441.f65940;
            try {
                if (str2.equals("/")) {
                    C15955 m8086 = C2551.m8086();
                    if (m8086 != null) {
                        j = m8086.m37730();
                        j2 = m8086.m37731();
                    } else {
                        C5292 c5292 = new C5292("/system", "/data");
                        j = c5292.m15219();
                        j2 = c5292.m15220();
                    }
                } else {
                    C5292 c52922 = new C5292(str2);
                    long m15219 = c52922.m15219();
                    long m15220 = c52922.m15220();
                    j = m15219;
                    j2 = m15220;
                }
                if (j2 != 0) {
                    long j3 = j2 - j;
                    c24264.m7859((int) ((100 * j3) / j2));
                    str = c24264.getContext().getString(R.string.MT_Protector_res_0x7f1202c0, C22927.m51020(j3), C22927.m51020(j));
                }
            } catch (Throwable unused) {
            }
            textView.setText(str);
        } else {
            textView.setText("");
        }
        if (textView.length() == 0) {
            c24262 = c20441.f65940;
            c24262.m7859(0);
            c24263 = c20441.f65940;
            c24263.m7860(EnumC15830.Invisible);
            textView.setText(c22557.f72949);
        }
        c20441.f44704.m26232(c22557.f72950.f64248);
        c20441.itemView.setOnClickListener(c22557);
        this.f37526.m10148((AbstractViewOnLongClickListenerC14606) c20441);
    }
}
