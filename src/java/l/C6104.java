package l;

import java.util.ArrayList;

/* compiled from: M4F8 */
/* renamed from: l.ۛܰ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6104 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f18713;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f18714;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f18716;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f18717;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f18719;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f18718 = "";

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f18715 = "";

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18720 = -1;

    public C6104() {
        ArrayList arrayList = new ArrayList();
        this.f18717 = arrayList;
        arrayList.add("");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11749 m17022() {
        if (this.f18714 == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f18716 == null) {
            throw new IllegalStateException("host == null");
        }
        return new C11749(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f18714;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.f18718.isEmpty() || !this.f18715.isEmpty()) {
            sb.append(this.f18718);
            if (!this.f18715.isEmpty()) {
                sb.append(':');
                sb.append(this.f18715);
            }
            sb.append('@');
        }
        String str2 = this.f18716;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f18716);
                sb.append(']');
            } else {
                sb.append(this.f18716);
            }
        }
        int i = this.f18720;
        if (i != -1 || this.f18714 != null) {
            if (i == -1) {
                i = C11749.m28762(this.f18714);
            }
            String str3 = this.f18714;
            if (str3 == null || i != C11749.m28762(str3)) {
                sb.append(':');
                sb.append(i);
            }
        }
        ArrayList arrayList = this.f18717;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.f18719 != null) {
            sb.append('?');
            C11749.m28760(sb, this.f18719);
        }
        if (this.f18713 != null) {
            sb.append('#');
            sb.append(this.f18713);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0224, code lost:
    
        if (r5 <= 65535) goto L114;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m17023(l.C11749 r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6104.m17023(l.ۨܰ᩵, java.lang.String):void");
    }
}
