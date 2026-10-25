package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 77BL */
/* renamed from: l.ᩳ֡ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17700 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m41433(C15996 c15996) {
        String m40234 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
        boolean z = false;
        if (m40234 == null || m40234.isEmpty()) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12073e, new Object[0]));
        }
        String m39731 = AbstractC16891.m39731(m40234);
        ArrayList mo7637 = C2499.f7958.mo7637(m39731, C17315.m40631());
        if (mo7637.isEmpty() && !C16999.m39866(m39731, new String[0]).mo23120()) {
            return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f120829, new Object[0]));
        }
        if (!C17315.m40629()) {
            C5378.removeIf(mo7637, new C16288());
        }
        C9087 m38052 = C16141.m38052(m39731);
        if (m38052 == null) {
            String m402342 = C17140.m40234(c15996, "sortMethod");
            String m402343 = C17140.m40234(c15996, "sortReverse");
            if (m402342 == null && m402343 == null) {
                m38052 = new C9087(0, false);
            } else {
                if (m402342 == null) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "sortMethod"));
                }
                if (m402343 == null) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "sortReverse"));
                }
                try {
                    int m38053 = C16141.m38053(m402342);
                    try {
                        if ("true".equals(m402343)) {
                            z = true;
                        } else if (!"false".equals(m402343)) {
                            throw C6411.m17739((RuntimeException) new IllegalArgumentException("invalid boolean"));
                        }
                        m38052 = new C9087(m38053, z);
                    } catch (RuntimeException unused) {
                        return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120826, "sortReverse"));
                    }
                } catch (RuntimeException unused2) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120826, "sortMethod"));
                }
            }
        }
        C7489.m20119(mo7637, m38052.f27538, m38052.f27539);
        ArrayList arrayList = new ArrayList(mo7637.size());
        Iterator it = mo7637.iterator();
        while (it.hasNext()) {
            arrayList.add(C21082.m47981((InterfaceC17889) it.next()));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MotionUtils.EASING_TYPE_PATH, m39731);
        hashMap.put("files", arrayList);
        return C2884.m8817(hashMap);
    }
}
