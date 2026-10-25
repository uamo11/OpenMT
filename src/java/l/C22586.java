package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: P1ZZ */
/* renamed from: l.᩹᩹᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C22586 extends AbstractC22366 {

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73005 = 0;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C21818 f73006;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f73007 = 0;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C18090 f73008;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C18090 f73009;

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76955;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a23, m11517("tarZipPath"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        Iterator it;
        int i;
        String str;
        String m11556 = m11556("srcZipPath");
        String m115562 = m11556("tarZipPath");
        String m115563 = m11556("targetPath");
        int m11548 = m11548("update");
        String[] m11558 = m11558("ARG_PATHS");
        C11667 m11533 = m11533();
        boolean m11552 = m11552("keepApkSigBlock");
        AbstractC15440 m39866 = C16999.m39866(m115562, new String[0]);
        C17721.m41504(m39866, EnumC16309.MODIFY_FILE);
        this.f73008 = new C18090(C16999.m39866(m11556, new String[0]));
        this.f73009 = new C18090(m39866);
        int i2 = 1;
        C21818 m50499 = C22523.m50499(m39866, m11533 != null);
        this.f73006 = m50499;
        C8918 m49176 = m50499.m49176();
        boolean m42212 = this.f73009.m42212();
        if (m11533 == null && m11552 && this.f73009.m42201()) {
            m49176.m23016(this.f73009);
        }
        if (m42212) {
            m49176.m23025();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Collection<C3545> m42210 = this.f73008.m42210();
        int length = m11558.length;
        int i3 = 0;
        while (i3 < length) {
            String substring = m11558[i3].substring(i2);
            if (substring.endsWith("/")) {
                int lastIndexOf = substring.lastIndexOf(47, substring.length() - 2) + 1;
                for (C3545 c3545 : m42210) {
                    String[] strArr = m11558;
                    Collection collection = m42210;
                    if (c3545.getName().startsWith(substring)) {
                        StringBuilder m15339 = C5368.m15339(m115563);
                        str = substring;
                        m15339.append(c3545.getName().substring(lastIndexOf));
                        String sb = m15339.toString();
                        c3545.m10788(sb);
                        linkedHashMap.put(sb, c3545);
                    } else {
                        str = substring;
                    }
                    m42210 = collection;
                    m11558 = strArr;
                    substring = str;
                }
            } else {
                C3545 m42211 = this.f73008.m42211(substring);
                StringBuilder m153392 = C5368.m15339(m115563);
                m153392.append(m42211.m10810());
                String sb2 = m153392.toString();
                m42211.m10788(sb2);
                linkedHashMap.put(sb2, m42211);
            }
            i3++;
            i2 = 1;
            m42210 = m42210;
            m11558 = m11558;
        }
        for (C3545 c35452 : this.f73009.m42210()) {
            linkedHashMap2.put(c35452.getName(), c35452);
        }
        if (m11548 == 0) {
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap2.remove((String) it2.next());
            }
        } else if (m11548 == 1) {
            Iterator it3 = new ArrayList(linkedHashMap.entrySet()).iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                C3545 c35453 = (C3545) linkedHashMap2.get(entry.getKey());
                if (c35453 != null) {
                    if (((C3545) entry.getValue()).getTime() > c35453.getTime()) {
                        linkedHashMap2.remove(entry.getKey());
                    } else {
                        linkedHashMap.remove(entry.getKey());
                    }
                }
            }
        } else if (m11548 == 2) {
            Iterator it4 = linkedHashMap2.keySet().iterator();
            while (it4.hasNext()) {
                linkedHashMap.remove((String) it4.next());
            }
        }
        C15313 c15313 = new C15313();
        if (m42212) {
            C3545 c35454 = (C3545) linkedHashMap.get("AndroidManifest.xml");
            if (c35454 != null) {
                InputStream m42189 = this.f73008.m42189(c35454);
                try {
                    try {
                        C15206 m35970 = C15206.m35970(m42189);
                        c15313.f46967 = C22263.m49982(m35970);
                        c15313.f46966 = C22263.m49984(m35970);
                    } catch (Exception unused) {
                        c15313.f46967 = false;
                        c15313.f46966 = false;
                    }
                    m42189.close();
                } finally {
                }
            } else {
                c15313.m36337(this.f73009);
            }
        }
        C15529 c15529 = new C15529(this, m50562(linkedHashMap.values(), c15313) + m50562(linkedHashMap2.values(), c15313));
        int i4 = 0;
        for (C3545 c35455 : linkedHashMap.values()) {
            if (mo1526()) {
                return C17222.m40521();
            }
            i4++;
            mo11546(C4925.m14327(R.string.MT_Protector_res_0x7f120032) + MotionUtils.EASING_TYPE_FORMAT_START + i4 + "/" + linkedHashMap.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo11520(c35455.getName());
            if (c35455.isDirectory()) {
                m49176.m23013(c35455);
            } else {
                C21665.m48936(this.f73008, m49176, c35455, c15313, new C21881(c15529));
                this.f73007 += C21665.m48935(c35455, c15313);
            }
        }
        Iterator it5 = linkedHashMap2.values().iterator();
        int i5 = 0;
        while (it5.hasNext()) {
            C3545 c35456 = (C3545) it5.next();
            if (mo1526()) {
                return C17222.m40521();
            }
            int i6 = i5 + 1;
            mo11546(C4925.m14327(R.string.MT_Protector_res_0x7f120ac0) + MotionUtils.EASING_TYPE_FORMAT_START + i6 + "/" + linkedHashMap2.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo11520(c35456.getName());
            if (c35456.isDirectory()) {
                m49176.m23013(c35456);
                it = it5;
                i = i6;
            } else {
                C21665.m48936(this.f73009, m49176, c35456, c15313, new C21881(c15529));
                it = it5;
                i = i6;
                this.f73007 += C21665.m48935(c35456, c15313);
            }
            it5 = it;
            i5 = i;
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C0349.m1793(this.f73008);
        this.f73008 = null;
        C0349.m1793(this.f73009);
        this.f73009 = null;
        m49176.close();
        if (m11533 != null) {
            C10025.m25200(this.f73006, m11533, this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C18838.m43524(m39866);
        C17558 c17558 = new C17558();
        c17558.m41050(m39866);
        this.f73006.m49175(m39866, new RunnableC20923(3, this, m39866), new AutoCloseable[0]);
        c17558.m41052(m39866);
        return C17222.m40520();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m50562(Collection collection, C15313 c15313) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            C3545 c3545 = (C3545) it.next();
            if (!c3545.isDirectory()) {
                j += C21665.m48935(c3545, c15313);
            }
        }
        return j;
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526()) {
            if (m11542(c16560)) {
                c16560.m39041();
            }
            if (m11525(c165602)) {
                c165602.m39000((Collection) AbstractC3817.m11510(m11558("ARG_PATHS")));
                c165602.m39015();
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818 = this.f73006;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f73006.m49174().mo23552();
        }
        C0349.m1793(this.f73008);
        C0349.m1793(this.f73009);
        C15528.m36596();
    }
}
