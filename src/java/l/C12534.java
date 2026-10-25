package l;

import android.content.res.Resources;
import android.util.TypedValue;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 45G7 */
/* renamed from: l.۫ܽܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12534 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f37656 = {"px", "dp", "sp", "pt", "in", "mm"};

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f37657 = {"%", "%p"};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f37658;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 f37659;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C17515 f37660;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f37661;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f37662;

    public C12534() {
        this.f37662 = new HashMap();
        this.f37659 = null;
        this.f37658 = false;
        this.f37661 = false;
    }

    public C12534(AbstractC15440 abstractC15440) {
        this(0, new C23326(abstractC15440));
    }

    public C12534(int i, InterfaceC9922 interfaceC9922) {
        boolean z;
        this.f37662 = new HashMap();
        this.f37659 = interfaceC9922;
        if (interfaceC9922 != null) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            loop0: for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
                if (!interfaceC4277.getPackageName().equals("bin.mt.plus.TranslationData")) {
                    hashSet.clear();
                    for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                        if (hashSet.add(interfaceC0748.getTypeName())) {
                            hashSet2.clear();
                            if (interfaceC0748.mo2868(new C20296(hashSet2)) != null) {
                            }
                        }
                        z = true;
                    }
                }
            }
        }
        z = false;
        this.f37658 = z;
        if (interfaceC9922 instanceof C23326) {
            ((C23326) interfaceC9922).m51731();
        } else if (interfaceC9922 instanceof C5191) {
            ((C5191) interfaceC9922).m14958();
        }
        this.f37661 = m30761(interfaceC9922);
    }

    public C12534(InterfaceC9922 interfaceC9922, C17515 c17515) {
        this(0, interfaceC9922);
        this.f37660 = c17515;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12534(l.C18090 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "resources.arsc"
            l.ۗ᩺ۡ r0 = r3.getEntry(r0)     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L12
            l.᩺᩻ܽ r1 = new l.᩺᩻ܽ     // Catch: java.lang.Exception -> L12
            java.io.InputStream r3 = r3.m42189(r0)     // Catch: java.lang.Exception -> L12
            r1.<init>(r3)     // Catch: java.lang.Exception -> L12
            goto L13
        L12:
            r1 = 0
        L13:
            r3 = 0
            r2.<init>(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12534.<init>(l.ᩳܰۡ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17515 m30773() {
        if (this.f37660 == null) {
            synchronized (this) {
                if (this.f37660 == null) {
                    this.f37660 = new C17515(this.f37659);
                }
            }
        }
        return this.f37660;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 m30769() {
        return this.f37659;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m30768(String str) {
        InterfaceC9922 interfaceC9922;
        ArrayList arrayList = new ArrayList();
        C13239 m30764 = m30764(str);
        int i = m30764.f39632;
        String str2 = m30764.f39631;
        int indexOf = str2.indexOf(47);
        if (indexOf != -1) {
            String substring = str2.substring(0, indexOf);
            String substring2 = str2.substring(indexOf + 1);
            if (!substring.isEmpty() && !substring2.isEmpty() && substring2.indexOf(47) == -1) {
                if (!this.f37661 && i == 1) {
                    m30760(arrayList, C11166.m27700(), 1, substring, substring2);
                }
                if (arrayList.isEmpty() && (interfaceC9922 = this.f37659) != null) {
                    m30760(arrayList, interfaceC9922, i, substring, substring2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30760(ArrayList arrayList, InterfaceC9922 interfaceC9922, int i, String str, String str2) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.getTypeName().equals(str)) {
                        int mo2867 = interfaceC0748.mo2867(new C4773(str2));
                        if (mo2867 != -1) {
                            Iterator it = interfaceC0748.mo2876().iterator();
                            while (it.hasNext()) {
                                InterfaceC7099 interfaceC7099 = (InterfaceC7099) it.next();
                                if (interfaceC7099.mo2347(mo2867)) {
                                    arrayList.add(interfaceC7099.mo2346(mo2867));
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m30767(int i) {
        InterfaceC9922 interfaceC9922;
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        int i4 = i & 65535;
        ArrayList arrayList = new ArrayList();
        if (!this.f37661 && i2 == 1) {
            m30759(arrayList, C11166.m27700(), 1, i3, i4, true);
        }
        if (arrayList.isEmpty() && (interfaceC9922 = this.f37659) != null) {
            m30759(arrayList, interfaceC9922, i2, i3, i4, true);
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30759(ArrayList arrayList, InterfaceC9922 interfaceC9922, int i, int i2, int i3, boolean z) {
        InterfaceC21211 mo2346;
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i2) {
                        for (InterfaceC7099 interfaceC7099 : z ? interfaceC0748.mo2876() : interfaceC0748.mo2872()) {
                            if (interfaceC7099.mo2347(i3) && (mo2346 = interfaceC7099.mo2346(i3)) != null) {
                                arrayList.add(mo2346);
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30770(int i, TypedValue typedValue, boolean z) {
        int i2 = (i >>> 24) & 255;
        if (i2 == 1) {
            C4925.m14338().getValue(i, typedValue, z);
            return;
        }
        if (this.f37659 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        ArrayList arrayList = new ArrayList();
        m30759(arrayList, this.f37659, i2, (i >>> 16) & 255, i & 65535, false);
        if (arrayList.isEmpty()) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        C21707 m48998 = C21707.m48998(C4925.m14338());
        Iterator it = arrayList.iterator();
        InterfaceC21211 interfaceC21211 = null;
        while (it.hasNext()) {
            InterfaceC21211 interfaceC212112 = (InterfaceC21211) it.next();
            if (!interfaceC212112.mo29412() && interfaceC212112.mo29410().mo18743().m49026(m48998) && (interfaceC21211 == null || interfaceC212112.mo29410().mo18743().m49023(interfaceC21211.mo29410().mo18743(), m48998))) {
                interfaceC21211 = interfaceC212112;
            }
        }
        if (interfaceC21211 == null) {
            throw new Resources.NotFoundException(String.format("id: %08x", Integer.valueOf(i)));
        }
        InterfaceC1454 value = interfaceC21211.getValue();
        typedValue.data = value.getValue();
        typedValue.type = value.mo5004();
        typedValue.resourceId = value.mo5006();
        if (typedValue.type == 3) {
            typedValue.string = value.mo5008().getValue();
        } else {
            typedValue.string = null;
        }
        if (z) {
            for (int i3 = 0; i3 < 20 && typedValue.type == 1; i3++) {
                m30770(typedValue.data, typedValue, false);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30775() {
        return this.f37658;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30771(String str) {
        Integer num;
        InterfaceC9922 interfaceC9922;
        C13239 m30764 = m30764(str);
        int i = m30764.f39632;
        String str2 = m30764.f39631;
        int indexOf = str2.indexOf(47);
        if (indexOf == -1) {
            return -1;
        }
        String substring = str2.substring(0, indexOf);
        String substring2 = str2.substring(indexOf + 1);
        if (substring.isEmpty() || substring2.isEmpty() || substring2.indexOf(47) != -1) {
            return -1;
        }
        int m30755 = (this.f37661 || i != 1) ? -1 : m30755(C11166.m27700(), 1, substring, substring2);
        if (m30755 == -1 && (interfaceC9922 = this.f37659) != null && !this.f37658) {
            m30755 = m30755(interfaceC9922, i, substring, substring2);
        }
        return (m30755 != -1 || (num = (Integer) this.f37662.get(str)) == null) ? m30755 : num.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0008, code lost:
    
        continue;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m30755(l.InterfaceC9922 r5, int r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Iterable r5 = r5.mo21936()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            r1 = -1
            if (r0 == 0) goto L56
            java.lang.Object r0 = r5.next()
            l.ۘ᩻ܽ r0 = (l.InterfaceC4277) r0
            if (r6 == r1) goto L1d
            int r2 = r0.mo12858()
            if (r2 != r6) goto L8
        L1d:
            java.lang.Iterable r2 = r0.mo12850()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8
            java.lang.Object r3 = r2.next()
            l.֡᩻ܽ r3 = (l.InterfaceC0748) r3
            java.lang.String r4 = r3.getTypeName()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L25
            l.ۗܽܽ r2 = new l.ۗܽܽ
            r4 = 0
            r2.<init>(r4, r8)
            int r2 = r3.mo2867(r2)
            if (r2 == r1) goto L8
            int r5 = r0.mo12858()
            int r5 = r5 << 24
            int r6 = r3.mo2870()
            int r6 = r6 << 16
            r5 = r5 | r6
            r5 = r5 | r2
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12534.m30755(l.ۢ᩻ܽ, int, java.lang.String, java.lang.String):int");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m30763(int i) {
        switch (i) {
            case 0:
                return "null";
            case 1:
                return Name.REFER;
            case 2:
                return AnnotationHandler.ATTRIBUTE;
            case 3:
                return "string";
            case 4:
                return ClassTransform.FLOAT;
            case 5:
                return "dimension";
            case 6:
                return "fraction";
            case 7:
                return "dynamic-reference";
            case 8:
                return "dynamic-attribute";
            default:
                switch (i) {
                    case 16:
                        return "int-dec";
                    case 17:
                        return "int-hex";
                    case 18:
                        return ClassTransform.BOOLEAN;
                    default:
                        switch (i) {
                            case 28:
                                return "color-argb8";
                            case 29:
                                return "color-rgb8";
                            case 30:
                                return "color-argb4";
                            case 31:
                                return "color-rgb4";
                            default:
                                return String.format("unknown-type-%02x", Integer.valueOf(i));
                        }
                }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m30766(InterfaceC1454 interfaceC1454) {
        int mo5004 = interfaceC1454.mo5004();
        int value = interfaceC1454.getValue();
        if (mo5004 == 17) {
            return C13540.m32584(new StringBuilder("0x"), value);
        }
        if (mo5004 == 18) {
            return value != 0 ? "true" : "false";
        }
        switch (mo5004) {
            case 0:
                return "null";
            case 1:
                return "@".concat(m30776(value));
            case 2:
                return "?".concat(m30776(value));
            case 3:
                String value2 = interfaceC1454.mo5008().getValue();
                return value2.length() > 100 ? value2.substring(0, 97).replaceFirst("[\\s]{0,6}$", "...") : value2;
            case 4:
                return Float.toString(Float.intBitsToFloat(value));
            case 5:
                return m30765(value);
            case 6:
                return m30762(value);
            default:
                return (mo5004 < 28 || mo5004 > 31) ? (mo5004 < 16 || mo5004 > 31) ? d.O : Integer.toString(value) : String.format("#%08x", Integer.valueOf(value));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m30772(int i) {
        String m30756 = m30756(i, this.f37659);
        return m30756 != null ? m30756 : String.format("%08x", Integer.valueOf(i));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m30774(int i) {
        return m30756(i, this.f37659);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m30776(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        boolean z = this.f37658;
        InterfaceC9922 interfaceC9922 = this.f37659;
        String str = null;
        String m30758 = z ? null : m30758(interfaceC9922, i4, i3, i2, true);
        if (m30758 != null) {
            str = m30758;
        } else if (!m30761(interfaceC9922)) {
            str = m30758((InterfaceC9922) C11166.m27700(), i4, i3, i2, false);
        }
        return str != null ? str : String.format("%08x", Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30756(int i, InterfaceC9922 interfaceC9922) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        String m30757 = m30757(interfaceC9922, i4, i3, i2);
        if (m30757 != null) {
            return m30757;
        }
        if (m30761(interfaceC9922)) {
            return null;
        }
        return m30757(C11166.m27700(), i4, i3, i2);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m30777(int i) {
        int i2 = 65535 & i;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 24) & 255;
        InterfaceC9922 interfaceC9922 = this.f37659;
        String m30757 = m30757(interfaceC9922, i4, i3, i2);
        if (m30757 == null && !m30761(interfaceC9922)) {
            m30757 = m30757(C11166.m27700(), i4, i3, i2);
        }
        return m30757 != null ? String.format("%s(%08x)", m30757, Integer.valueOf(i)) : String.format("%08x", Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30757(InterfaceC9922 interfaceC9922, int i, int i2, int i3) {
        if (interfaceC9922 == null) {
            return null;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i2) {
                        Iterator it = interfaceC0748.mo2872().iterator();
                        while (it.hasNext()) {
                            InterfaceC21211 mo2346 = ((InterfaceC7099) it.next()).mo2346(i3);
                            if (mo2346 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(mo2346.mo29406());
                                return sb.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30758(InterfaceC9922 interfaceC9922, int i, int i2, int i3, boolean z) {
        if (interfaceC9922 == null) {
            return null;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i2) {
                        Iterator it = interfaceC0748.mo2872().iterator();
                        while (it.hasNext()) {
                            InterfaceC21211 mo2346 = ((InterfaceC7099) it.next()).mo2346(i3);
                            if (mo2346 != null && (z || mo2346.mo29405())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i == 1 ? "android:" : i != 127 ? String.format("app%02x:", Integer.valueOf(i)) : "");
                                sb.append(interfaceC0748.getTypeName());
                                sb.append("/");
                                sb.append(mo2346.mo29406());
                                return sb.toString();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30761(InterfaceC9922 interfaceC9922) {
        if (interfaceC9922 == null) {
            return false;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == 1) {
                InterfaceC0748 type = interfaceC4277.getType("attr");
                InterfaceC0748 type2 = interfaceC4277.getType("id");
                return type != null && type.mo2878() > 50 && type2 != null && type2.mo2878() > 50;
            }
        }
        return false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m30765(int i) {
        return TypedValue.complexToFloat(i) + f37656[i & 15];
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m30762(int i) {
        return (TypedValue.complexToFloat(i) * 100.0f) + f37657[i & 15];
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C13239 m30764(String str) {
        String[] split = str.split(":", 2);
        if (split.length == 2) {
            if (split[0].equals("android")) {
                return new C13239(1, split[1]);
            }
            if (split[0].startsWith("app") && split[0].length() == 5) {
                String substring = split[0].substring(3);
                if (C9896.m24990(substring)) {
                    return new C13239(Integer.parseInt(substring, 16), split[1]);
                }
            }
        }
        return new C13239(127, str);
    }
}
