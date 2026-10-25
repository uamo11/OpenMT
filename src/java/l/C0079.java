package l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

/* compiled from: M445 */
/* renamed from: l.֡֨۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0079 extends C8547 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC19131 f1001;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f1002;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumMap f1003;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0079(l.C11781 r18) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0079.<init>(l.ۨܶ۠):void");
    }

    public C0079() {
        super(EnumSet.of(EnumC21989.SUMMARY, EnumC21989.DETAILS, EnumC21989.SUBDIAGNOSTICS, EnumC21989.SOURCE));
        this.f1003 = new EnumMap(EnumC18425.class);
        m1040(EnumC18425.DEFAULT_POS_FORMAT, "%f:%l:%_%p%L%m");
        m1040(EnumC18425.DEFAULT_NO_POS_FORMAT, "%p%L%m");
        m1040(EnumC18425.DEFAULT_CLASS_FORMAT, "%f:%_%p%L%m");
        m1038();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1038() {
        this.f1002 = new HashMap();
        m1041(EnumC21989.SUMMARY, 0);
        m1041(EnumC21989.DETAILS, 2);
        m1041(EnumC21989.SUBDIAGNOSTICS, 4);
        m1041(EnumC21989.SOURCE, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1039(EnumC21989 enumC21989) {
        return ((Integer) this.f1002.get(enumC21989)).intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1041(EnumC21989 enumC21989, int i) {
        this.f1002.put(enumC21989, Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1040(EnumC18425 enumC18425, String str) {
        this.f1003.put((EnumMap) enumC18425, (EnumC18425) str);
    }
}
