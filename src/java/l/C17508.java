package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* compiled from: G7AI */
/* renamed from: l.ܿᩳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17508 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f53476;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53477;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53478;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f53479;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f53480;

    public C17508(ArrayList arrayList, int i, int i2) {
        this.f53478 = arrayList;
        this.f53479 = i;
        this.f53476 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40896(C23858 c23858, InterfaceC7099 interfaceC7099, String str) {
        int i = this.f53480;
        this.f53480 = i + 1;
        if (i < this.f53479) {
            return false;
        }
        return m40893(i, new C14685(c23858.m52571(), C2692.m8426(interfaceC7099), "parent_reference", "parent=".concat(str), null, null, null));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40894(C14587 c14587, C23858 c23858, InterfaceC7099 interfaceC7099, InterfaceC1454 interfaceC1454, String str, HashSet hashSet) {
        C0532 m23320;
        C19584 m23310;
        String m23296;
        int i = this.f53480;
        this.f53480 = i + 1;
        if (i < this.f53479) {
            return false;
        }
        String m8426 = C2692.m8426(interfaceC7099);
        m23320 = C9042.m23320(c14587, interfaceC7099, interfaceC1454.mo5006());
        m23310 = C9042.m23310(c14587, interfaceC1454, 300);
        m23296 = C9042.m23296(interfaceC1454, m23310, (Set) hashSet);
        C13232 m52571 = c23858.m52571();
        String str2 = m23320.f2194;
        return m40893(i, new C14685(m52571, m8426, Name.REFER, (str2 == null || str2.isEmpty() || str2.equals(str)) ? "item key=".concat(str) : C20087.m46306("item key=", str2, " (", str, MotionUtils.EASING_TYPE_FORMAT_END), m23320.f2194, m23320.f2195, m23296));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40895(C14587 c14587, C23858 c23858, InterfaceC7099 interfaceC7099, InterfaceC1454 interfaceC1454, boolean z, String str, HashSet hashSet) {
        C19584 m23310;
        String m23296;
        int i = this.f53480;
        this.f53480 = i + 1;
        if (i < this.f53479) {
            return false;
        }
        String m8426 = C2692.m8426(interfaceC7099);
        C0532 m23320 = z ? C9042.m23320(c14587, interfaceC7099, interfaceC1454.mo5006()) : new C0532(null, 0);
        m23310 = C9042.m23310(c14587, interfaceC1454, 300);
        m23296 = C9042.m23296(interfaceC1454, m23310, (Set) hashSet);
        C13232 m52571 = c23858.m52571();
        String str2 = m23310.f63272;
        String str3 = m23310.f63276;
        return m40893(i, new C14685(m52571, m8426, Name.REFER, (str2 != null || str3 == null || str3.isEmpty()) ? str : C8163.m21635(0, str3.length(), 300, str3), z ? m23320.f2194 : null, z ? m23320.f2195 : null, z ? m23296 : null));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40893(int i, C14685 c14685) {
        ArrayList arrayList = this.f53478;
        arrayList.add(c14685);
        if (arrayList.size() < this.f53476) {
            return false;
        }
        this.f53477 = i + 1;
        return true;
    }
}
