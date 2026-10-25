package l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: Z1GQ */
/* renamed from: l.֡֫ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0102 implements InterfaceC0397, AdapterView.OnItemClickListener, InterfaceC21524 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18222 f1067;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String[] f1068;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f1069;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f1070;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f1071;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f1072;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f1073;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f1074;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f1075;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f1076;

    public C0102(C7864 c7864) {
        C12392 c12392;
        this.f1073 = c7864;
        this.f1068 = c7864.m21123().split("/");
        C18222 c18222 = new C18222(c7864.requireContext(), 255);
        this.f1067 = c18222;
        c18222.m42454(this);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.START;
        c18222.m42461();
        c12392 = c7864.f24374;
        c12392.m30341((InterfaceC21524) this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (android.text.TextUtils.indexOf((java.lang.CharSequence) r3, '\n', r1, r2) == (-1)) goto L10;
     */
    @Override // l.InterfaceC0397
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1091(java.util.ArrayList r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0102.mo1091(java.util.ArrayList):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1086(C0102 c0102) {
        boolean z;
        String str;
        C7864 c7864 = c0102.f1073;
        z = c7864.f24385;
        if (z) {
            String m21067 = C7864.m21067(c7864, c0102.f1070);
            if (m21067 == null) {
                ActivityC17169 activityC17169 = (ActivityC17169) c7864.requireActivity();
                str = c7864.f24365;
                activityC17169.m40354(str, (C19287) null);
                C21374 m48458 = C21374.m48458(1, c7864.getString(R.string.MT_Protector_res_0x7f1200f7, c0102.f1070));
                m48458.m48467(17, 0);
                m48458.m48468();
                return;
            }
            C4925.m14308(-1, m21067);
            C21374 m484582 = C21374.m48458(0, m21067);
            m484582.m48467(17, 0);
            m484582.m48468();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m1089() {
        if ((this.f1070.startsWith("@") || this.f1070.startsWith("?")) && this.f1070.indexOf(32) == -1) {
            String[] split = this.f1070.substring(1).split("/");
            if (split.length == 2) {
                String str = split[0];
                this.f1075 = split[1];
                if (str.indexOf(58) != -1) {
                    String[] split2 = str.split(":");
                    if (split2.length != 2) {
                        return false;
                    }
                    this.f1074 = split2[0];
                    this.f1072 = split2[1];
                } else {
                    this.f1074 = "";
                    this.f1072 = str;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ᩴ֫ۢ] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m1088(ArrayList arrayList) {
        C12392 c12392;
        C12392 c123922;
        if (this.f1068.length != 3) {
            return;
        }
        C7864 c7864 = this.f1073;
        c12392 = c7864.f24374;
        C1869 m30375 = c12392.m30375();
        m30375.f6373 = true;
        m30375.f6375 = this.f1071;
        m30375.f6374 = this.f1069;
        c123922 = c7864.f24374;
        c123922.invalidate();
        arrayList.add(new C19154(this, new InterfaceC13041() { // from class: l.ᩴ֫ۢ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                C0102.m1087(C0102.this, (C12392) obj);
            }
        }, m30375));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1087(C0102 c0102, C12392 c12392) {
        boolean z;
        C19452 c19452;
        String concat;
        C3764 c3764;
        C19452 c194522;
        C3764 c37642;
        C18222 c18222 = c0102.f1067;
        C7864 c7864 = c0102.f1073;
        z = c7864.f24385;
        if (z) {
            if (TextUtils.isEmpty(c0102.f1074)) {
                concat = C9045.m23341(new StringBuilder(), c0102.f1068[0], "/");
            } else {
                c19452 = c7864.f24368;
                String m44848 = c19452.m44848(c0102.f1074);
                if (m44848 == null) {
                    c3764 = c7864.f24386;
                    c3764.m11384((Throwable) new C1637("Resource not found: " + c0102.f1070));
                    return;
                }
                concat = m44848.concat("/");
            }
            String m23341 = C9045.m23341(C5368.m15339(concat), c0102.f1072, "/");
            c194522 = c7864.f24368;
            ArrayList m44846 = c194522.m44846(m23341, c0102.f1075);
            if (m44846.isEmpty()) {
                c37642 = c7864.f24386;
                c37642.m11384((Throwable) new C1637("Resource not found: " + c0102.f1070));
                return;
            }
            if (c0102.f1076) {
                String m21123 = c7864.m21123();
                Iterator it = m44846.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2518 c2518 = (C2518) it.next();
                    if (c2518.f7992.equals(m21123)) {
                        c2518.setSpan(new ForegroundColorSpan(C21943.f70257), 0, m21123.length(), 33);
                        break;
                    }
                }
            }
            Collections.sort(m44846);
            c18222.m42455(m44846);
            c18222.m42457(c12392, c12392.m30444());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C12392 c12392;
        C18222 c18222 = this.f1067;
        c18222.m42453();
        C2518 c2518 = (C2518) c18222.m42452(i);
        C7864 c7864 = this.f1073;
        c12392 = c7864.f24374;
        c12392.m30516();
        ((ActivityC17169) c7864.requireActivity()).m40354(c2518.f7992, c2518.f7993);
    }

    @Override // l.InterfaceC21524
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1090() {
        this.f1067.m42453();
    }
}
