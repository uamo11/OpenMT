package l;

import android.media.MediaDrmResetException;
import java.util.function.BiFunction;

/* compiled from: NJN */
/* renamed from: l.ۙ᩵ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4860 implements InterfaceC7961 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14172(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14173(String str, String str2) {
        C19956.m46037(str + str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m14174(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m14175(InterfaceC12621 interfaceC12621, Object obj, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        Object obj2 = interfaceC12621.get(obj);
        if (obj2 == null && !interfaceC12621.containsKey(obj)) {
            return null;
        }
        Object apply = biFunction.apply(obj, obj2);
        if (apply == null) {
            interfaceC12621.remove(obj);
            return null;
        }
        interfaceC12621.put(obj, apply);
        return apply;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m14171(InterfaceC12621 interfaceC12621, Object obj, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        Object obj2 = interfaceC12621.get(obj);
        boolean z = obj2 != null || interfaceC12621.containsKey(obj);
        if (!z) {
            obj2 = null;
        }
        Object apply = biFunction.apply(obj, obj2);
        if (apply != null) {
            interfaceC12621.put(obj, apply);
            return apply;
        }
        if (z) {
            interfaceC12621.remove(obj);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m14170(InterfaceC12621 interfaceC12621, Object obj, Object obj2, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        C11003.requireNonNull(obj2);
        Object obj3 = interfaceC12621.get(obj);
        if ((obj3 != null || interfaceC12621.containsKey(obj)) && (obj2 = biFunction.apply(obj3, obj2)) == null) {
            interfaceC12621.remove(obj);
            return null;
        }
        interfaceC12621.put(obj, obj2);
        return obj2;
    }
}
