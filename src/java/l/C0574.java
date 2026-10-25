package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: W6LU */
/* renamed from: l.֡ᩳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0574 extends AbstractC6932 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f2261;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 f2262;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashMap f2263;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f2264;

    public C0574(InterfaceC0748 interfaceC0748, InterfaceC7099 interfaceC7099, String str, ArrayList arrayList) {
        super((AbstractC10460) interfaceC0748);
        C21707 mo18743;
        this.f2264 = new HashMap();
        this.f2263 = new HashMap();
        this.f2262 = interfaceC7099;
        try {
            if (interfaceC7099 == null) {
                mo18743 = C21707.m48999("default".equals(str) ? "" : str, ((AbstractC8343) ((AbstractC10460) interfaceC0748).mo2874()).mo12848());
            } else {
                mo18743 = interfaceC7099.mo18743();
            }
            this.f21394 = mo18743;
            if (!C2692.m8426(this).equals(str)) {
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch variant is not canonical.");
            }
            this.f2261 = interfaceC7099 == null ? -1 : interfaceC7099.mo2344();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C4103 c4103 = (C4103) it.next();
                int i = c4103.f13041 & 65535;
                if ((interfaceC7099 != null && interfaceC7099.mo2347(i)) || this.f2263.put(Integer.valueOf(i), c4103.f13040) != null) {
                    throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Added resource variant already exists.");
                }
                this.f2261 = Math.max(this.f2261, i);
                this.f2264.put(Integer.valueOf(i), C23816.m52501(this, i, c4103.f13042));
            }
        } catch (Exception unused) {
            throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch variant is invalid.");
        }
    }

    @Override // l.InterfaceC7099
    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo2344() {
        return this.f2261;
    }

    @Override // l.InterfaceC7099
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo2347(int i) {
        if (this.f2264.containsKey(Integer.valueOf(i))) {
            return true;
        }
        InterfaceC7099 interfaceC7099 = this.f2262;
        return interfaceC7099 != null && interfaceC7099.mo2347(i);
    }

    @Override // l.InterfaceC7099
    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2345() {
        InterfaceC7099 interfaceC7099 = this.f2262;
        return interfaceC7099 != null && interfaceC7099.mo2345();
    }

    @Override // l.InterfaceC7099
    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo2349() {
        InterfaceC7099 interfaceC7099 = this.f2262;
        return interfaceC7099 != null && interfaceC7099.mo2349();
    }

    @Override // l.InterfaceC7099
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo2348(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f2263;
        if (hashMap.containsKey(valueOf)) {
            return (String) hashMap.get(Integer.valueOf(i));
        }
        InterfaceC7099 interfaceC7099 = this.f2262;
        if (interfaceC7099 == null) {
            return null;
        }
        return interfaceC7099.mo2348(i);
    }

    @Override // l.InterfaceC7099
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21211 mo2346(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f2264;
        if (hashMap.containsKey(valueOf)) {
            return (InterfaceC21211) hashMap.get(Integer.valueOf(i));
        }
        InterfaceC7099 interfaceC7099 = this.f2262;
        if (interfaceC7099 == null) {
            return null;
        }
        return interfaceC7099.mo2346(i);
    }
}
