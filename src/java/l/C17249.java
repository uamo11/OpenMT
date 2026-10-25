package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: 71Y3 */
/* renamed from: l.ܿۡᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17249 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f52880;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f52881;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4549 f52882;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19357 f52884;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f52879 = new HashSet();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f52883 = new HashMap();

    public C17249(AbstractC15440 abstractC15440, C4549 c4549, boolean z, boolean z2, InterfaceC5276 interfaceC5276) {
        boolean z3;
        this.f52882 = c4549;
        this.f52881 = z;
        ArrayList arrayList = new ArrayList();
        C18090 c18090 = new C18090(abstractC15440.m36526("base.apk"));
        try {
            C3545 entry = c18090.getEntry("classes.dex");
            if (entry != null) {
                int i = 0;
                byte[] m1795 = C0349.m1795(c18090.m42189(entry), 0);
                byte[] copyOf = Arrays.copyOf(m1795, 20);
                C23881 m7785 = C2405.m7785(copyOf);
                if (!m7785.m52607()) {
                    throw new C19401(C1575.m5392(m7785, R.string.MT_Protector_res_0x7f120520));
                }
                if (C2732.m8478(m7785.m52602(), copyOf)) {
                    z3 = true;
                } else {
                    for (int length = m1795.length / 2; length < m1795.length; length++) {
                        m1795[length] = (byte) (m1795[length] / 2);
                    }
                    z3 = false;
                }
                C12918 m31381 = C12918.m31381(m1795);
                m31381.m31387("classes.dex");
                arrayList.add(m31381);
                int i2 = 1;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("classes");
                    i2++;
                    sb.append(i2);
                    sb.append(".dex");
                    String sb2 = sb.toString();
                    C3545 entry2 = c18090.getEntry(sb2);
                    if (entry2 == null) {
                        break;
                    }
                    byte[] m17952 = C0349.m1795(c18090.m42189(entry2), 0);
                    if (!z3) {
                        for (int length2 = m17952.length / 2; length2 < m17952.length; length2++) {
                            m17952[length2] = (byte) (m17952[length2] / 2);
                        }
                    }
                    C12918 m313812 = C12918.m31381(m17952);
                    m313812.m31387(sb2);
                    arrayList.add(m313812);
                }
                c18090.close();
                c4549.m13377(abstractC15440.mo23554(), z, z2);
                C19357 c19357 = new C19357(((C12918) arrayList.get(0)).mo27437());
                this.f52884 = c19357;
                this.f52880 = c19357.f68942.m46805();
                interfaceC5276.mo3578();
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    i3 += ((C12918) it.next()).m31408();
                }
                Iterator it2 = arrayList.iterator();
                int i4 = -1;
                while (it2.hasNext()) {
                    C12918 c12918 = (C12918) it2.next();
                    HashSet hashSet = new HashSet();
                    Iterator it3 = ((AbstractC18605) c12918.mo27438()).iterator();
                    while (it3.hasNext()) {
                        C7980 c7980 = (C7980) it3.next();
                        i++;
                        int i5 = (i * 100) / i3;
                        if (i5 != i4) {
                            interfaceC5276.mo3581(i5);
                            i4 = i5;
                        }
                        if (!this.f52884.f68942.m46805().containsKey(c7980.getType())) {
                            this.f52884.m44606((InterfaceC8566) c7980);
                            hashSet.add(c7980.getType());
                            if (interfaceC5276.mo1526()) {
                                return;
                            }
                        }
                    }
                    this.f52883.put((String) c12918.m31395(), hashSet);
                }
                return;
            }
            throw new IOException("classes.dex not found");
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
