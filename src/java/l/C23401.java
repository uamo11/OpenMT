package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: 99PI */
/* renamed from: l.᩻ۖۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23401 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Set f75160;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f75161 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f75159 = true;

    public C23401(C5057[] c5057Arr) {
        this.f75160 = Collections.newSetFromMap(new IdentityHashMap(c5057Arr.length));
        for (C5057 c5057 : c5057Arr) {
            this.f75160.add(c5057);
            m51846(c5057);
        }
        for (C5057 c50572 : this.f75160) {
            try {
                m51850(c50572, c50572.m14580());
            } catch (C6468 e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51846(C5057 c5057) {
        for (C5057 c50572 : c5057.m14581()) {
            if (this.f75160.add(c50572)) {
                m51846(c50572);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if ((r0 instanceof l.C21286) != false) goto L23;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC0823 m51848(java.lang.String r4, l.EnumC14228 r5) {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.f75161
            java.lang.Object r0 = r0.get(r4)
            l.֨ۖۖ r0 = (l.AbstractC0823) r0
            if (r0 == 0) goto L30
            l.ܳۖۖ r1 = l.EnumC14228.ALL_SYMBOLS
            if (r5 == r1) goto L2f
            l.ܳۖۖ r1 = l.EnumC14228.TYPES_ONLY
            if (r5 != r1) goto L1b
            boolean r1 = r0 instanceof l.C17757
            if (r1 != 0) goto L1a
            boolean r1 = r0 instanceof l.C9291
            if (r1 == 0) goto L1b
        L1a:
            return r0
        L1b:
            l.ܳۖۖ r1 = l.EnumC14228.AGGREGATES_ONLY
            if (r5 != r1) goto L30
            boolean r1 = r0 instanceof l.C17757
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C9291
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C17051
            if (r1 != 0) goto L2f
            boolean r1 = r0 instanceof l.C21286
            if (r1 == 0) goto L30
        L2f:
            return r0
        L30:
            java.util.Set r0 = r3.f75160
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            l.ۚۖۖ r1 = (l.C5057) r1
            l.᩻ۖۖ r1 = l.C5057.m14575(r1)
            java.util.HashMap r1 = r1.f75161
            java.lang.Object r1 = r1.get(r4)
            l.֨ۖۖ r1 = (l.AbstractC0823) r1
            if (r1 == 0) goto L36
            l.ܳۖۖ r2 = l.EnumC14228.ALL_SYMBOLS
            if (r5 == r2) goto L75
            l.ܳۖۖ r2 = l.EnumC14228.TYPES_ONLY
            if (r5 != r2) goto L61
            boolean r2 = r1 instanceof l.C17757
            if (r2 != 0) goto L60
            boolean r2 = r1 instanceof l.C9291
            if (r2 == 0) goto L61
        L60:
            return r1
        L61:
            l.ܳۖۖ r2 = l.EnumC14228.AGGREGATES_ONLY
            if (r5 != r2) goto L36
            boolean r2 = r1 instanceof l.C17757
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C9291
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C17051
            if (r2 != 0) goto L75
            boolean r2 = r1 instanceof l.C21286
            if (r2 == 0) goto L36
        L75:
            return r1
        L76:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23401.m51848(java.lang.String, l.ܳۖۖ):l.֨ۖۖ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC0823 m51847(String str, AbstractC0823 abstractC0823, EnumC14228 enumC14228) {
        AbstractC0823 m51848;
        String str2;
        Logger logger;
        int i = 0;
        if (str.startsWith(".")) {
            str2 = str.substring(1);
            m51848 = m51848(str2, enumC14228);
        } else {
            int indexOf = str.indexOf(46);
            String substring = indexOf == -1 ? str : str.substring(0, indexOf);
            StringBuilder sb = new StringBuilder(abstractC0823.mo1141());
            while (true) {
                int lastIndexOf = sb.lastIndexOf(".");
                if (lastIndexOf == -1) {
                    m51848 = m51848(str, enumC14228);
                    str2 = str;
                    break;
                }
                int i2 = lastIndexOf + 1;
                sb.setLength(i2);
                sb.append(substring);
                AbstractC0823 m518482 = m51848(sb.toString(), EnumC14228.AGGREGATES_ONLY);
                if (m518482 != null) {
                    if (indexOf != -1) {
                        sb.setLength(i2);
                        sb.append(str);
                        m51848 = m51848(sb.toString(), enumC14228);
                    } else {
                        m51848 = m518482;
                    }
                    str2 = sb.toString();
                } else {
                    sb.setLength(lastIndexOf);
                }
            }
        }
        if (m51848 != null) {
            return m51848;
        }
        if (!this.f75159 || enumC14228 != EnumC14228.TYPES_ONLY) {
            throw new C6468(abstractC0823, C4860.m14172("\"", str, "\" is not defined."), i);
        }
        logger = C21991.f70408;
        logger.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
        C17757 c17757 = new C17757(str2);
        this.f75160.add(c17757.mo1134());
        return c17757;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51850(C5057 c5057, String str) {
        String substring;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            substring = str;
        } else {
            m51850(c5057, str.substring(0, lastIndexOf));
            substring = str.substring(lastIndexOf + 1);
        }
        C17051 c17051 = new C17051(substring, str, c5057);
        HashMap hashMap = this.f75161;
        AbstractC0823 abstractC0823 = (AbstractC0823) hashMap.put(str, c17051);
        if (abstractC0823 != null) {
            hashMap.put(str, abstractC0823);
            if (abstractC0823 instanceof C17051) {
                return;
            }
            StringBuilder m9834 = C3200.m9834("\"", substring, "\" is already defined (as something other than a package) in file \"");
            m9834.append(abstractC0823.mo1134().getName());
            m9834.append("\".");
            throw new C6468(c5057, m9834.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51849(AbstractC0823 abstractC0823) {
        String name = abstractC0823.getName();
        int i = 0;
        if (name.length() == 0) {
            throw new C6468(abstractC0823, "Missing name.", i);
        }
        for (int i2 = 0; i2 < name.length(); i2++) {
            char charAt = name.charAt(i2);
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && charAt != '_' && ('0' > charAt || charAt > '9' || i2 <= 0))) {
                throw new C6468(abstractC0823, C4860.m14172("\"", name, "\" is not a valid identifier."), i);
            }
        }
        String mo1141 = abstractC0823.mo1141();
        HashMap hashMap = this.f75161;
        AbstractC0823 abstractC08232 = (AbstractC0823) hashMap.put(mo1141, abstractC0823);
        if (abstractC08232 != null) {
            hashMap.put(mo1141, abstractC08232);
            if (abstractC0823.mo1134() != abstractC08232.mo1134()) {
                StringBuilder m9834 = C3200.m9834("\"", mo1141, "\" is already defined in file \"");
                m9834.append(abstractC08232.mo1134().getName());
                m9834.append("\".");
                throw new C6468(abstractC0823, m9834.toString(), i);
            }
            int lastIndexOf = mo1141.lastIndexOf(46);
            if (lastIndexOf == -1) {
                throw new C6468(abstractC0823, C4860.m14172("\"", mo1141, "\" is already defined."), i);
            }
            throw new C6468(abstractC0823, "\"" + mo1141.substring(lastIndexOf + 1) + "\" is already defined in \"" + mo1141.substring(0, lastIndexOf) + "\".", i);
        }
    }
}
