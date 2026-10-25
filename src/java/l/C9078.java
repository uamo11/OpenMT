package l;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: Z6LO */
/* renamed from: l.ۡ᩵֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9078 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f27515;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public synchronized void m23434(C5215 c5215) {
        ((LinkedHashSet) this.f27515).remove(c5215);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public synchronized void m23436(C5215 c5215) {
        ((LinkedHashSet) this.f27515).add(c5215);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m23437(C5215 c5215) {
        return ((LinkedHashSet) this.f27515).contains(c5215);
    }

    public C9078(int i) {
        switch (i) {
            case 1:
                this.f27515 = new LinkedHashSet();
                break;
            default:
                this.f27515 = new HashMap();
                break;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23435(C16425 c16425) {
        Class m38696 = c16425.m38696();
        HashMap hashMap = (HashMap) this.f27515;
        C16425 c164252 = (C16425) hashMap.get(m38696);
        if (c164252 == null) {
            hashMap.put(c16425.m38696(), c16425);
        } else {
            c164252.m38699(c16425);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m23433(String str) {
        C16425 c16425 = (C16425) ((HashMap) this.f27515).get(C3726.class);
        if (c16425 == null) {
            return null;
        }
        return c16425.m38697(str);
    }
}
