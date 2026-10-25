package l;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/* compiled from: K3ZR */
/* renamed from: l.ۧ᩶۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public interface InterfaceC11223 extends Closeable, Flushable, InterfaceC17572 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* renamed from: ֫ */
    Iterable mo1702(InterfaceC2050 interfaceC2050, String str, Set set, boolean z);

    /* renamed from: ֫ */
    String mo1703(InterfaceC2050 interfaceC2050, InterfaceC18278 interfaceC18278);

    /* renamed from: ֫ */
    ServiceLoader mo1704(InterfaceC2050 interfaceC2050, Class cls);

    /* renamed from: ֫ */
    InterfaceC7757 mo1705(InterfaceC2050 interfaceC2050, String str);

    /* renamed from: ֫ */
    InterfaceC18278 mo1707(InterfaceC2050 interfaceC2050, String str, EnumC16866 enumC16866);

    /* renamed from: ֫ */
    InterfaceC18278 mo1708(InterfaceC2050 interfaceC2050, String str, EnumC16866 enumC16866, InterfaceC7757 interfaceC7757);

    /* renamed from: ֫ */
    boolean mo1709(Iterator it, String str);

    /* renamed from: ֫ */
    boolean mo1710(InterfaceC2050 interfaceC2050);

    /* renamed from: ֫ */
    boolean mo1711(InterfaceC2050 interfaceC2050, InterfaceC7757 interfaceC7757);

    /* renamed from: ֫ */
    boolean mo1712(InterfaceC7757 interfaceC7757, InterfaceC7757 interfaceC77572);

    /* renamed from: ۧ */
    Iterable mo1713(InterfaceC2050 interfaceC2050);

    /* renamed from: ۧ */
    InterfaceC2050 mo1714(InterfaceC2050 interfaceC2050, String str);

    /* renamed from: ۧ */
    InterfaceC2050 mo1715(InterfaceC2050 interfaceC2050, InterfaceC18278 interfaceC18278);

    /* renamed from: ܽ */
    ClassLoader mo1716(InterfaceC2050 interfaceC2050);

    /* renamed from: ᩳ */
    String mo1717(InterfaceC2050 interfaceC2050);
}
