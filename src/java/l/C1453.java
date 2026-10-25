package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;

/* compiled from: IC7P */
/* renamed from: l.֨᩻ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1453 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C12512 f5193 = C12512.m30694(C7573.m20297("Ldalvik/annotation/AnnotationDefault;"));

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C12512 f5195 = C12512.m30694(C7573.m20297("Ldalvik/annotation/EnclosingClass;"));

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C12512 f5197 = C12512.m30694(C7573.m20297("Ldalvik/annotation/EnclosingMethod;"));

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C12512 f5196 = C12512.m30694(C7573.m20297("Ldalvik/annotation/InnerClass;"));

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C12512 f5194 = C12512.m30694(C7573.m20297("Ldalvik/annotation/MemberClasses;"));

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C12512 f5190 = C12512.m30694(C7573.m20297("Ldalvik/annotation/Signature;"));

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12512 f5198 = C12512.m30694(C7573.m20297("Ldalvik/annotation/SourceDebugExtension;"));

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C12512 f5192 = C12512.m30694(C7573.m20297("Ldalvik/annotation/Throws;"));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13217 f5189 = new C13217("accessFlags");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C13217 f5199 = new C13217("name");

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C13217 f5191 = new C13217(b.d);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5978 m4995(C5978 c5978) {
        C5978 c59782 = new C5978(f5193, EnumC11623.SYSTEM);
        c59782.m16778(new C7389(f5191, new C7368(c5978)));
        c59782.mo20349();
        return c59782;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5978 m4996(C12512 c12512) {
        C5978 c5978 = new C5978(f5195, EnumC11623.SYSTEM);
        c5978.m16778(new C7389(f5191, c12512));
        c5978.mo20349();
        return c5978;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5978 m5000(C22390 c22390) {
        C5978 c5978 = new C5978(f5197, EnumC11623.SYSTEM);
        c5978.m16778(new C7389(f5191, c22390));
        c5978.mo20349();
        return c5978;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5978 m4998(C13217 c13217, int i) {
        C5978 c5978 = new C5978(f5196, EnumC11623.SYSTEM);
        AbstractC13717 abstractC13717 = c13217;
        if (c13217 == null) {
            abstractC13717 = C19569.f63254;
        }
        c5978.m16778(new C7389(f5199, abstractC13717));
        c5978.m16778(new C7389(f5189, C2635.m8291(i)));
        c5978.mo20349();
        return c5978;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5978 m4999(C13922 c13922) {
        C11102 m5001 = m5001((InterfaceC10711) c13922);
        C5978 c5978 = new C5978(f5194, EnumC11623.SYSTEM);
        c5978.m16778(new C7389(f5191, m5001));
        c5978.mo20349();
        return c5978;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5978 m4997(C13217 c13217) {
        C5978 c5978 = new C5978(f5190, EnumC11623.SYSTEM);
        String string = c13217.getString();
        int length = string.length();
        ArrayList arrayList = new ArrayList(20);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (string.charAt(i) == 'L') {
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    char charAt = string.charAt(i2);
                    if (charAt == ';') {
                        i2++;
                        break;
                    }
                    if (charAt == '<') {
                        break;
                    }
                    i2++;
                }
            } else {
                while (i2 < length && string.charAt(i2) != 'L') {
                    i2++;
                }
            }
            arrayList.add(string.substring(i, i2));
            i = i2;
        }
        int size = arrayList.size();
        C1929 c1929 = new C1929(size);
        for (int i3 = 0; i3 < size; i3++) {
            c1929.mo12223(i3, (AbstractC13717) new C13217((String) arrayList.get(i3)));
        }
        c1929.mo20349();
        c5978.m16778(new C7389(f5191, new C11102(c1929)));
        c5978.mo20349();
        return c5978;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5978 m5003(C13217 c13217) {
        C5978 c5978 = new C5978(f5198, EnumC11623.SYSTEM);
        c5978.m16778(new C7389(f5191, c13217));
        c5978.mo20349();
        return c5978;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5978 m5002(InterfaceC10711 interfaceC10711) {
        C11102 m5001 = m5001(interfaceC10711);
        C5978 c5978 = new C5978(f5192, EnumC11623.SYSTEM);
        c5978.m16778(new C7389(f5191, m5001));
        c5978.mo20349();
        return c5978;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11102 m5001(InterfaceC10711 interfaceC10711) {
        int size = interfaceC10711.size();
        C1929 c1929 = new C1929(size);
        for (int i = 0; i < size; i++) {
            c1929.mo12223(i, (AbstractC13717) C12512.m30694(interfaceC10711.getType(i)));
        }
        c1929.mo20349();
        return new C11102(c1929);
    }
}
