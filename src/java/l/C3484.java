package l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: O1K3 */
/* renamed from: l.ۗ᩷ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3484 implements InterfaceC0397, AdapterView.OnItemClickListener, InterfaceC21524 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f11034;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18222 f11035;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23655 f11036;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f11037;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f11038;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f11039;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f11040;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f11041;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f11042;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f11043;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f11044;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f11045 = new ForegroundColorSpan(C21943.f70257);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11046;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f11047;

    public C3484(C6306 c6306) {
        C12392 c12392;
        this.f11034 = c6306;
        C18222 c18222 = new C18222(c6306.requireContext(), 255);
        this.f11035 = c18222;
        c18222.m42454(this);
        c12392 = c6306.f19506;
        c12392.m30341((InterfaceC21524) this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x018d, code lost:
    
        r10 = r5.mo26557(r8, r6);
     */
    @Override // l.InterfaceC0397
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1091(java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3484.mo1091(java.util.ArrayList):void");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l.᩶᩷ۢ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10665(ArrayList arrayList, int i, int i2) {
        C12392 c12392;
        C12392 c123922;
        C6306 c6306 = this.f11034;
        c12392 = c6306.f19506;
        C1869 m30375 = c12392.m30375();
        m30375.f6373 = true;
        m30375.f6375 = i;
        m30375.f6374 = i2;
        c123922 = c6306.f19506;
        c123922.invalidate();
        arrayList.add(new C4895(this, new InterfaceC13041() { // from class: l.᩶᩷ۢ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                C3484.m10666(C3484.this, (C12392) obj);
            }
        }, m30375));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10666(C3484 c3484, C12392 c12392) {
        boolean z;
        C12366 c12366;
        C12366 c123662;
        C19287 c19287;
        C12366 c123663;
        C11459 c11459;
        C11459 c114592;
        C18222 c18222 = c3484.f11035;
        ForegroundColorSpan foregroundColorSpan = c3484.f11045;
        C6306 c6306 = c3484.f11034;
        z = c6306.f19523;
        if (z) {
            int i = 3;
            if (c3484.f11044 != 3) {
                String m36561 = C15472.m36561(1, 1, c3484.f11042);
                c12366 = c6306.f19514;
                String m30046 = c12366.m30046(m36561);
                c123662 = c6306.f19514;
                if (!c123662.m30058(m30046)) {
                    ((ActivityC17169) c6306.requireActivity()).m10221("Class not found: " + m36561.replace('/', '.'), false);
                    return;
                }
                int i2 = c3484.f11044;
                if (i2 == 1) {
                    c19287 = new C19287(7);
                    c19287.f60684 = 0;
                    c19287.f60685 = c3484.f11041.length();
                    c19287.f60681 = c3484.f11041;
                    c19287.f60683 = c3484.f11039;
                } else if (i2 == 2) {
                    c19287 = new C19287(3);
                    c19287.f60684 = 0;
                    c19287.f60685 = c3484.f11047.length();
                    c19287.f60681 = c3484.f11047;
                    c19287.f60683 = c3484.f11038;
                    c19287.f60679 = c3484.f11043;
                } else {
                    c19287 = null;
                }
                ((ActivityC17169) c6306.requireActivity()).m40343(m30046, c19287);
                c123663 = c6306.f19514;
                c123663.m30026(m30046);
                return;
            }
            int m52184 = c3484.f11036.m52184();
            int m52180 = c3484.f11036.m52180();
            ArrayList arrayList = new ArrayList();
            String mo26557 = c12392.m30436().mo26557(m52184, m52180);
            c11459 = C6306.f19497;
            C12164 matcher = c11459.matcher((CharSequence) mo26557);
            while (matcher.find()) {
                if (c3484.f11037.equals(matcher.group(i))) {
                    String trim = matcher.group().trim();
                    int start = matcher.start(i) + m52184;
                    C13361 c13361 = new C13361("[" + (c12392.m30420(start) + 1) + "]  " + trim);
                    c13361.m32372(start);
                    if (start == c3484.f11040) {
                        c13361.setSpan(foregroundColorSpan, 0, c13361.length(), 17);
                    }
                    arrayList.add(c13361);
                    i = 3;
                }
            }
            c114592 = C6306.f19499;
            C12164 matcher2 = c114592.matcher((CharSequence) mo26557);
            while (matcher2.find()) {
                for (int i3 = 1; i3 <= 3; i3++) {
                    if (c3484.f11037.equals(matcher2.group(i3))) {
                        String trim2 = matcher2.group().trim();
                        if (trim2.length() > 200) {
                            trim2 = C6554.m18061(200, trim2);
                        }
                        int start2 = matcher2.start(i3) + m52184;
                        C13361 c133612 = new C13361("[" + (c12392.m30420(start2) + 1) + "]  " + trim2);
                        c133612.m32372(start2);
                        if (start2 == c3484.f11040) {
                            c133612.setSpan(foregroundColorSpan, 0, c133612.length(), 17);
                        }
                        int indexOf = matcher2.group().indexOf(46) - TextUtils.indexOf((CharSequence) c133612, '.');
                        int start3 = (matcher2.start(i3) - matcher2.start()) - indexOf;
                        int end = (matcher2.end(i3) - matcher2.start()) - indexOf;
                        if (end <= c133612.length()) {
                            c133612.setSpan(new StyleSpan(1), start3, end, 17);
                        }
                        arrayList.add(c133612);
                    }
                }
            }
            Collections.sort(arrayList);
            c18222.m42455(arrayList);
            c18222.m42457(c12392, c12392.m30444());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C12392 c12392;
        C12392 c123922;
        C12392 c123923;
        C18222 c18222 = this.f11035;
        C13361 c13361 = (C13361) c18222.m42452(i);
        C6306 c6306 = this.f11034;
        c12392 = c6306.f19506;
        c12392.m30516();
        c123922 = c6306.f19506;
        c123922.mo25919(c13361.m32371());
        c123923 = c6306.f19506;
        c123923.m30430(false);
        c18222.m42453();
    }

    @Override // l.InterfaceC21524
    /* renamed from: ֫ */
    public final void mo1090() {
        this.f11035.m42453();
    }
}
