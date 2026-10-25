package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Predicate;

/* compiled from: X43L */
/* renamed from: l.۟ܶ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7541 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakHashMap f23305 = new WeakHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f23306;

    public C7541(C6319 c6319) {
        this.f23306 = c6319;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m20257(C3581 c3581, AbstractC19810 abstractC19810, boolean z, Predicate predicate) {
        WeakHashMap weakHashMap = this.f23305;
        SoftReference softReference = (SoftReference) weakHashMap.get(c3581);
        C3581 c35812 = null;
        Map map = softReference != null ? (Map) softReference.get() : null;
        if (map == null) {
            map = new HashMap();
            weakHashMap.put(c3581, new SoftReference(map));
        }
        C13890 c13890 = (C13890) map.get(abstractC19810);
        AbstractC4308 abstractC4308 = abstractC19810.f17560;
        C6319 c6319 = this.f23306;
        C17545 m17498 = c6319.m17498(abstractC4308, true);
        if (c13890 != null) {
            int mo27864 = m17498.mo27864();
            if (c13890.f41407 == predicate && c13890.f41406 == z && c13890.f41408 == mo27864) {
                return c13890.f41405;
            }
        }
        AbstractC4308 abstractC43082 = abstractC19810.f17560;
        while (true) {
            if (!abstractC43082.m12913(EnumC9454.CLASS) && !abstractC43082.m12913(EnumC9454.TYPEVAR)) {
                break;
            }
            AbstractC4308 m17526 = c6319.m17526(abstractC43082, false);
            AbstractC14016 mo16064 = m17526.f13890.mo16064();
            AbstractC10370 abstractC10370 = c3581.f17562;
            mo16064.getClass();
            Iterator it = mo16064.mo20477(abstractC10370, predicate, EnumC1317.RECURSIVE).iterator();
            AbstractC5698 abstractC5698 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC5698 abstractC56982 = (AbstractC5698) it.next();
                if (abstractC56982 != null && abstractC56982.mo10962(c3581, abstractC19810, c6319, z)) {
                    if ((abstractC56982.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                        abstractC5698 = abstractC56982;
                        break;
                    }
                    abstractC5698 = abstractC56982;
                }
            }
            if (abstractC5698 == null) {
                abstractC43082 = c6319.m17562(m17526);
            } else {
                c35812 = (C3581) abstractC5698;
                break;
            }
        }
        map.put(abstractC19810, new C13890(c35812, predicate, z, m17498.mo27864()));
        return c35812;
    }
}
