package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 41UK */
/* renamed from: l.֡ۙۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0184 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1326(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, boolean z, boolean z2, InterfaceC22057 interfaceC22057) {
        AbstractC15440 m36527 = C16293.f50111.m36527();
        m36527.m36508();
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                C3545 m1324 = m1324(c18090);
                if (m1324 == null) {
                    throw new C19401(R.string.MT_Protector_res_0x7f12054b);
                }
                C22016 c22016 = new C22016();
                C19941.m46021(c18090, c22016, null, m36527, interfaceC22057);
                if (interfaceC22057.mo35997()) {
                    c18090.close();
                    return;
                }
                interfaceC22057.mo35998();
                C3671 m1325 = m1325(c18090.m42189(m1324), c22016);
                if (interfaceC22057.mo35997()) {
                    c18090.close();
                } else {
                    C19941.m46020(abstractC154402, z, z2, interfaceC22057, c18090, m36527, c22016, m1325, m1324);
                    c18090.close();
                }
            } finally {
            }
        } finally {
            m36527.mo23552();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3545 m1324(C18090 c18090) {
        for (C3545 c3545 : c18090.m42210()) {
            if (!c3545.isDirectory()) {
                String lowerCase = c3545.getName().toLowerCase();
                if (!lowerCase.contains("/") && lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                    return c3545;
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3671 m1325(InputStream inputStream, C22016 c22016) {
        c22016.m49537(new C5788(c22016));
        c22016.m49537(new C6781(new C15706()));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            C12951 c12951 = new C12951(bufferedInputStream);
            ArrayList arrayList = new ArrayList();
            C11929.m29107(c12951, new C2302(arrayList));
            bufferedInputStream.close();
            C3671 c3671 = new C3671(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3713 c3713 = (C3713) it.next();
                c3671.m11181(new C2260(C9045.m23341(new StringBuilder("L"), c3713.f11716, l.b), C9045.m23341(new StringBuilder("L"), c3713.f11715, l.b)));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C3713 c37132 = (C3713) it2.next();
                C2966 c2966 = (C2966) c22016.m49539(c37132.f11715);
                if (c2966 != null) {
                    c2966.mo13103((Object) c37132.f11716);
                    Iterator it3 = c37132.f11713.iterator();
                    while (it3.hasNext()) {
                        C18530 c18530 = (C18530) it3.next();
                        String str = c18530.f57431;
                        C10769 c10769 = new C10769(c22016.m49540(c3671.m11180(str, str)));
                        String str2 = c18530.f57432;
                        String str3 = c18530.f57433;
                        Iterator it4 = c2966.m45795().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                C12843 c12843 = (C12843) it4.next();
                                if (c12843.m13109().equals(str2) && c12843.m13108().equals(c10769)) {
                                    C15706.m37039(c12843).mo13103(str3);
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it5 = c37132.f11714.iterator();
                    while (it5.hasNext()) {
                        C19236 c19236 = (C19236) it5.next();
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_START);
                        C18070 c18070 = new C18070(c19236.f60544);
                        while (c18070.m42135()) {
                            String m42136 = c18070.m42136();
                            arrayList2.add(c22016.m49540(c3671.m11180(m42136, m42136)));
                        }
                        arrayList2.add(MotionUtils.EASING_TYPE_FORMAT_END);
                        String str4 = c19236.f60544;
                        String substring = str4.substring(str4.indexOf(41) + 1);
                        arrayList2.add(c22016.m49540(c3671.m11180(substring, substring)));
                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                        C1596 c1596 = new C1596(strArr, strArr.length);
                        arrayList2.clear();
                        String str5 = c19236.f60545;
                        String str6 = c19236.f60546;
                        Iterator it6 = c2966.m45797().iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                C10022 c10022 = (C10022) it6.next();
                                if (c10022.m13109().equals(str5) && c10022.m13108().equals(c1596)) {
                                    C15706.m37039(c10022).mo13103(str6);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C3671 c36712 = new C3671(0);
            c22016.m49537(new C14959(c36712));
            return c36712;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
