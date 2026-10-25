package l;

import com.google.android.material.motion.MotionUtils;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: N673 */
/* renamed from: l.᩶ۙᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19949 extends C22065 {
    public static final ConcurrentMapC10942 i = new ConcurrentMapC10942();
    public final EnumC20655 e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public C19949(EnumC20655 enumC20655, boolean z) {
        super(AbstractC5796.e, "ZoneText(" + enumC20655 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.g = new HashMap();
        this.h = new HashMap();
        this.e = (EnumC20655) C11003.requireNonNull(enumC20655, "textStyle");
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // l.C22065, l.InterfaceC14303
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(l.C10071 r14, java.lang.StringBuilder r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19949.l(l.ۤۙᩴ, java.lang.StringBuilder):boolean");
    }

    @Override // l.C22065
    public final C0192 a(C3015 c3015) {
        C0192 c0192;
        if (this.e == EnumC20655.NARROW) {
            return super.a(c3015);
        }
        Locale locale = c3015.a.b;
        boolean z = c3015.b;
        Set set = C3967.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (c0192 = (C0192) ((SoftReference) entry.getValue()).get()) != null) {
            return c0192;
        }
        C0192 c01922 = c3015.b ? new C0192("", null, null) : new C19244("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                c01922.a(str, str);
                HashMap hashMap = (HashMap) AbstractC8660.d;
                String str2 = (String) hashMap.get(str);
                if (str2 == null) {
                    HashMap hashMap2 = (HashMap) AbstractC8660.g;
                    if (hashMap2.containsKey(str)) {
                        str = (String) hashMap2.get(str);
                        str2 = (String) hashMap.get(str);
                    }
                }
                if (str2 != null) {
                    Map map2 = (Map) ((HashMap) AbstractC8660.f).get(str2);
                    str = (map2 == null || !map2.containsKey(locale.getCountry())) ? (String) ((HashMap) AbstractC8660.e).get(str2) : (String) map2.get(locale.getCountry());
                }
                HashMap hashMap3 = (HashMap) AbstractC8660.g;
                if (hashMap3.containsKey(str)) {
                    str = (String) hashMap3.get(str);
                }
                for (int i2 = this.e == EnumC20655.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    c01922.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(c01922)));
        return c01922;
    }
}
