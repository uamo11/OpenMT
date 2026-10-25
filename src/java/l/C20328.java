package l;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: W8AM */
/* renamed from: l.᩶ᩳۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20328 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f65632;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f65633;

    public C20328() {
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f65632 = map;
        this.f65633 = list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46638(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
    
        if (l.C6216.m17138(r0[0]) != java.lang.String.class) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC21013 m46639(l.C16469 r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20328.m46639(l.ܽۜۖ, boolean):l.᩷ܿۖ");
    }

    public final String toString() {
        return this.f65632.toString();
    }
}
