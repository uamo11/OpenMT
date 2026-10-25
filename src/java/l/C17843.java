package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: 28FF */
/* renamed from: l.ᩳۚۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C17843 extends ArrayList implements InterfaceC9603 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f54509;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Boolean f54510;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f54508 = new HashMap();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15859 f54507 = new C15859();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f54506 = null;

    /* renamed from: ۢ */
    public boolean mo30570() {
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo41816(int i, int i2) {
    }

    public C17843(int i, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            String path = interfaceC17889.getPath();
            Uri build = new Uri.Builder().scheme("mt_media").path(path).build();
            C22464 c22464 = new C22464();
            c22464.m50395(build);
            c22464.m50396(interfaceC17889);
            c22464.m50397(interfaceC17889.mo36985());
            C11197 m50394 = c22464.m50394();
            this.f54508.put(path, m50394);
            add(m50394);
        }
        this.f54509 = i;
    }

    @Override // l.InterfaceC9603
    /* renamed from: ᩷ */
    public final void mo16337() {
        int m26284;
        m41813();
        int i = this.f54509;
        C15859 c15859 = this.f54507;
        if (c15859.isEmpty()) {
            m26284 = i - 1;
            if (m26284 < 0) {
                m26284 = size() - 1;
            }
        } else {
            m26284 = c15859.m26284();
        }
        m41817(m26284);
        mo41816(i, m26284);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r1 >= r2) goto L35;
     */
    @Override // l.InterfaceC9603
    /* renamed from: ۜ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo16332() {
        /*
            r6 = this;
            r6.m41813()
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            int r0 = r6.f54509
            int r2 = r6.size()
            l.ܺۢᩴ r3 = r6.f54507
            boolean r4 = r3.isEmpty()
            r5 = 0
            if (r4 != 0) goto L25
            int r4 = r3.size()
            int r4 = r4 - r1
            int r1 = r3.getInt(r4)
            if (r1 == r0) goto L33
        L25:
            r3.add(r0)
            int r1 = r3.size()
            r4 = 100
            if (r1 <= r4) goto L33
            r3.mo3542(r5)
        L33:
            boolean r1 = r6.mo30570()
            if (r1 == 0) goto La5
            java.util.ArrayList r1 = r6.f54506
            if (r1 != 0) goto L5d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r2 + (-1)
            r1.<init>(r3)
            r6.f54506 = r1
            r1 = 0
        L47:
            if (r1 >= r2) goto L57
            if (r1 == r0) goto L54
            java.util.ArrayList r3 = r6.f54506
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3.add(r4)
        L54:
            int r1 = r1 + 1
            goto L47
        L57:
            java.util.ArrayList r1 = r6.f54506
            java.util.Collections.shuffle(r1)
            goto L93
        L5d:
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L93
            r1 = 0
        L64:
            if (r1 >= r2) goto L72
            java.util.ArrayList r3 = r6.f54506
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3.add(r4)
            int r1 = r1 + 1
            goto L64
        L72:
            java.util.ArrayList r1 = r6.f54506
            java.util.Collections.shuffle(r1)
            java.util.ArrayList r1 = r6.f54506
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r0) goto L93
            java.util.ArrayList r1 = r6.f54506
            r1.remove(r5)
            java.util.ArrayList r1 = r6.f54506
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.add(r2)
        L93:
            java.util.ArrayList r1 = r6.f54506
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.ArrayList r2 = r6.f54506
            r2.remove(r5)
            goto Laa
        La5:
            int r1 = r0 + 1
            if (r1 < r2) goto Laa
            goto Lab
        Laa:
            r5 = r1
        Lab:
            r6.m41817(r5)
            r6.mo41816(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17843.mo16332():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41815(int i) {
        m41813();
        int i2 = this.f54509;
        if (i != i2) {
            C15859 c15859 = this.f54507;
            if (c15859.isEmpty() || c15859.getInt(c15859.size() - 1) != i2) {
                c15859.add(i2);
                if (c15859.size() > 100) {
                    c15859.mo3542(0);
                }
            }
            this.f54506 = null;
            m41817(i);
            mo41816(i2, i);
        }
    }

    @Override // l.InterfaceC9603
    /* renamed from: ܿ */
    public final boolean mo16335() {
        m41813();
        if (mo30570()) {
            ArrayList arrayList = this.f54506;
            if (arrayList == null || !arrayList.isEmpty()) {
                return false;
            }
        } else if (this.f54509 != size() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m41813() {
        boolean mo30570 = mo30570();
        Boolean bool = this.f54510;
        if (bool == null || bool.booleanValue() != mo30570) {
            this.f54506 = null;
            this.f54510 = Boolean.valueOf(mo30570);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC9603
    /* renamed from: ܳ */
    public final C11197 mo16333() {
        return (C11197) get(this.f54509);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC9603
    /* renamed from: ܽ */
    public final InterfaceC17889 mo16334() {
        return m41812((C11197) get(this.f54509));
    }

    @Override // l.InterfaceC9603
    /* renamed from: ᩳ */
    public final int mo16336() {
        return this.f54509;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41817(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        this.f54509 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11197 m41814(String str) {
        return (C11197) this.f54508.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17889 m41812(C11197 c11197) {
        C11881 c11881 = c11197.f33612;
        C11003.requireNonNull(c11881);
        Object obj = c11881.f35422;
        C11003.requireNonNull(obj);
        return (InterfaceC17889) obj;
    }
}
