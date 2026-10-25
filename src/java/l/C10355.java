package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: P1F8 */
/* renamed from: l.ۤܳܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C10355 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 f31166;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C17515 f31167;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2727 f31168 = new C2727();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f31169 = new ThreadLocal();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8367 f31170 = new C8367();

    public C10355(InterfaceC9922 interfaceC9922) {
        this.f31166 = interfaceC9922;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17515 mo26163() {
        if (this.f31167 == null) {
            synchronized (this) {
                if (this.f31167 == null) {
                    this.f31167 = new C17515(this.f31166);
                }
            }
        }
        return this.f31167;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m26158(String str, C8238 c8238) {
        return C13843.computeIfAbsent(this.f31168, str, c8238);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26164(int i, String str) {
        this.f31170.mo21965(i, (Object) str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo26157(String str) {
        int mo24837 = this.f31170.mo24837(-1, str);
        if (mo24837 == -1 && str.equals("android")) {
            return 1;
        }
        return mo24837;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo26156(int i, String str) {
        String str2;
        String[] split = str.split(":", 2);
        if (split.length == 2) {
            String str3 = split[0];
            String str4 = split[1];
            str2 = str3;
            str = str4;
        } else {
            str2 = null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (str2 != null && !str2.isEmpty() && (i = this.f31170.mo24837(-1, str2)) == -1) {
                if (str2.equals("android")) {
                    i = 1;
                }
            }
            int m26155 = m26155(this.f31166, i, substring, substring2);
            return (m26155 == -1 && i == 1) ? m26155(C11166.m27700(), i, substring, substring2) : m26155;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0008, code lost:
    
        continue;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m26155(l.InterfaceC9922 r5, int r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Iterable r5 = r5.mo21936()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            r1 = -1
            if (r0 == 0) goto L56
            java.lang.Object r0 = r5.next()
            l.ۘ᩻ܽ r0 = (l.InterfaceC4277) r0
            if (r6 == r1) goto L1d
            int r2 = r0.mo12858()
            if (r2 != r6) goto L8
        L1d:
            java.lang.Iterable r2 = r0.mo12850()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8
            java.lang.Object r3 = r2.next()
            l.֡᩻ܽ r3 = (l.InterfaceC0748) r3
            java.lang.String r4 = r3.getTypeName()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L25
            l.ܶ֡ۚ r2 = new l.ܶ֡ۚ
            r4 = 1
            r2.<init>(r4, r8)
            int r2 = r3.mo2867(r2)
            if (r2 == r1) goto L8
            int r5 = r0.mo12858()
            int r5 = r5 << 24
            int r6 = r3.mo2870()
            int r6 = r6 << 16
            r5 = r5 | r6
            r5 = r5 | r2
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10355.m26155(l.ۢ᩻ܽ, int, java.lang.String, java.lang.String):int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m26165() {
        this.f31169.set(new ArrayList());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m26159() {
        ThreadLocal threadLocal = this.f31169;
        List list = (List) threadLocal.get();
        C11003.requireNonNull(list);
        List list2 = list;
        threadLocal.remove();
        return list2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26160(int i, int i2, int i3) {
        List list = (List) this.f31169.get();
        C11003.requireNonNull(list);
        list.add(new C24032(i, i2, i3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26161(C4794 c4794, int i, int i2) {
        List list = (List) this.f31169.get();
        C11003.requireNonNull(list);
        if (c4794.mo5009() || c4794.mo5007() || c4794.mo5005()) {
            list.add(new C24032(c4794, i, i2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26162(C4794 c4794, C0874 c0874) {
        m26161(c4794, c0874.m22403(), c0874.m22402());
    }
}
