package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: U410 */
/* renamed from: l.ۡ֨۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8547 implements InterfaceC4350 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f26131;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f26132;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumSet f26133;

    public C8547(Set set) {
        this.f26132 = new HashMap();
        this.f26133 = EnumSet.copyOf((Collection) set);
        m22267(EnumC19873.DEPTH, -1);
        m22267(EnumC19873.LENGTH, -1);
        this.f26131 = true;
    }

    public C8547(C11781 c11781, EnumSet enumSet) {
        this(enumSet);
        String m28824 = c11781.m28824("diags.showSource");
        if (m28824 != null) {
            if (m28824.equals("true")) {
                m22268(EnumC21989.SOURCE, true);
            } else if (m28824.equals("false")) {
                m22268(EnumC21989.SOURCE, false);
            }
        }
        String m288242 = c11781.m28824("diags.formatterOptions");
        if (m288242 != null) {
            List asList = Arrays.asList(m288242.split(","));
            if (asList.contains(ClassTransform.SHORT)) {
                m22268(EnumC21989.DETAILS, false);
                m22268(EnumC21989.SUBDIAGNOSTICS, false);
            }
            if (asList.contains("source")) {
                m22268(EnumC21989.SOURCE, true);
            }
            if (asList.contains("-source")) {
                m22268(EnumC21989.SOURCE, false);
            }
        }
        String m288243 = c11781.m28824("diags.multilinePolicy");
        if (m288243 != null) {
            if (m288243.equals("disabled")) {
                m22268(EnumC21989.SUBDIAGNOSTICS, false);
            } else if (m288243.startsWith("limit:")) {
                String[] split = m288243.substring(6).split(":");
                try {
                    int length = split.length;
                    if (length != 1) {
                        if (length == 2) {
                            if (!split[1].equals("*")) {
                                m22267(EnumC19873.DEPTH, Integer.parseInt(split[1]));
                            }
                        }
                    }
                    if (!split[0].equals("*")) {
                        m22267(EnumC19873.LENGTH, Integer.parseInt(split[0]));
                    }
                } catch (NumberFormatException unused) {
                    m22267(EnumC19873.DEPTH, -1);
                    m22267(EnumC19873.LENGTH, -1);
                }
            }
        }
        String m288244 = c11781.m28824("diags.showCaret");
        if (m288244 == null || !m288244.equals("false")) {
            this.f26131 = true;
        } else {
            this.f26131 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22267(EnumC19873 enumC19873, int i) {
        if (i < -1) {
            i = -1;
        }
        this.f26132.put(enumC19873, Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22268(EnumC21989 enumC21989, boolean z) {
        if (z) {
            this.f26133.add(enumC21989);
        } else {
            this.f26133.remove(enumC21989);
        }
    }
}
