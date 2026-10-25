package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 022A */
/* renamed from: l.᩹ۜ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22113 extends AbstractC5447 {

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15323 f71788 = new C21408();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f71792;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap f71793 = new HashMap();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f71790 = new HashMap();

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashMap f71791 = new HashMap();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f71789 = false;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f71794 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22113 m49690(C3330 c3330) {
        return (C22113) new C4741(c3330, f71788).m13885(C22113.class);
    }

    public C22113(boolean z) {
        this.f71792 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49694(boolean z) {
        this.f71794 = z;
    }

    @Override // l.AbstractC5447
    /* renamed from: ܽ */
    public final void mo15547() {
        if (AbstractC5180.m14853(3)) {
            toString();
        }
        this.f71789 = true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m49700() {
        return this.f71789;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49693(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (this.f71794) {
            AbstractC5180.m14853(2);
            return;
        }
        String str = componentCallbacksC9205.mWho;
        HashMap hashMap = this.f71793;
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(componentCallbacksC9205.mWho, componentCallbacksC9205);
        if (AbstractC5180.m14853(2)) {
            componentCallbacksC9205.toString();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m49695(String str) {
        return (ComponentCallbacksC9205) this.f71793.get(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m49701() {
        return new ArrayList(this.f71793.values());
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m49697(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (this.f71793.containsKey(componentCallbacksC9205.mWho) && this.f71792) {
            return this.f71789;
        }
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m49699(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (this.f71794) {
            AbstractC5180.m14853(2);
        } else {
            if (this.f71793.remove(componentCallbacksC9205.mWho) == null || !AbstractC5180.m14853(2)) {
                return;
            }
            componentCallbacksC9205.toString();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22113 m49698(ComponentCallbacksC9205 componentCallbacksC9205) {
        String str = componentCallbacksC9205.mWho;
        HashMap hashMap = this.f71790;
        C22113 c22113 = (C22113) hashMap.get(str);
        if (c22113 != null) {
            return c22113;
        }
        C22113 c221132 = new C22113(this.f71792);
        hashMap.put(componentCallbacksC9205.mWho, c221132);
        return c221132;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3330 m49702(ComponentCallbacksC9205 componentCallbacksC9205) {
        String str = componentCallbacksC9205.mWho;
        HashMap hashMap = this.f71791;
        C3330 c3330 = (C3330) hashMap.get(str);
        if (c3330 != null) {
            return c3330;
        }
        C3330 c33302 = new C3330();
        hashMap.put(componentCallbacksC9205.mWho, c33302);
        return c33302;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49696(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (AbstractC5180.m14853(3)) {
            C11003.toString(componentCallbacksC9205);
        }
        m49691(componentCallbacksC9205.mWho);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49692(String str) {
        AbstractC5180.m14853(3);
        m49691(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m49691(String str) {
        HashMap hashMap = this.f71790;
        C22113 c22113 = (C22113) hashMap.get(str);
        if (c22113 != null) {
            c22113.mo15547();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f71791;
        C3330 c3330 = (C3330) hashMap2.get(str);
        if (c3330 != null) {
            c3330.m10189();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22113.class == obj.getClass()) {
            C22113 c22113 = (C22113) obj;
            if (this.f71793.equals(c22113.f71793) && this.f71790.equals(c22113.f71790) && this.f71791.equals(c22113.f71791)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f71791.hashCode() + ((this.f71790.hashCode() + (this.f71793.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f71793.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f71790.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f71791.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
