package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* compiled from: R1EE */
/* renamed from: l.ۗܽۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3358 implements InterfaceC19992 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f10617;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10618;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f10619;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12366 f10620;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f10621;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10622;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10623;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f10624;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10625;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10626;

    public C3358(int i, String str, boolean z, boolean z2, boolean z3, C12366 c12366, long j, String str2, boolean z4, Predicate predicate) {
        this.f10625 = i;
        this.f10617 = str;
        this.f10626 = z;
        this.f10623 = z2;
        this.f10622 = z3;
        this.f10620 = c12366;
        this.f10619 = j;
        this.f10621 = str2;
        this.f10618 = z4;
        this.f10624 = predicate;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۙܽۢ] */
    @Override // l.InterfaceC19992
    /* renamed from: ֫ */
    public final InterfaceC7997 mo2262() {
        final C10414 c10414 = new C10414();
        boolean z = this.f10623;
        boolean z2 = this.f10626;
        String str = this.f10617;
        int i = this.f10625;
        if (i == 0) {
            final C15051 m9357 = C3058.m9357(str, z2, z);
            return new InterfaceC7997() { // from class: l.ۚܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C10414 c104142 = C10414.this;
                    C15051 c15051 = m9357;
                    InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                    try {
                        C22706 c22706 = c104142.get();
                        if (!interfaceC13508.mo31671(c22706)) {
                            return null;
                        }
                        C11418 m50717 = c22706.m50717();
                        C12164 c12164 = c15051.get();
                        c12164.m29615reset((CharSequence) m50717);
                        ArrayList arrayList = new ArrayList();
                        C5898.m16538(c12164, m50717, 0, 500, arrayList);
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C10132 c10132 = (C10132) it.next();
                            C19287 c19287 = new C19287(0);
                            int i2 = c10132.f30494;
                            c19287.f60684 = i2;
                            int i3 = c10132.f30493;
                            c19287.f60685 = i3;
                            c19287.m44468(i2, i3, m50717);
                            arrayList2.add(c19287);
                        }
                        return arrayList2;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        final boolean z3 = this.f10622;
        if (i == 1) {
            C11459 m9359 = C3058.m9359(str, z2, z);
            final C15051 c15051 = new C15051(m9359);
            String pattern = m9359.pattern();
            final boolean z4 = z3 || pattern.contains("/");
            final boolean z5 = z3 || pattern.contains("\\.");
            final Map m30055 = this.f10620.m30055();
            final C8297 c8297 = new C8297();
            final ?? r7 = new ThreadLocal() { // from class: l.ۙܽۢ
                @Override // java.lang.ThreadLocal
                public final Object initialValue() {
                    C8297.this.getClass();
                    return new C4047();
                }
            };
            final boolean z6 = this.f10622;
            return new InterfaceC7997() { // from class: l.ܶܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C4769 c4769 = C4769.this;
                    Map map = m30055;
                    C15051 c150512 = c15051;
                    boolean z7 = z6;
                    boolean z8 = z4;
                    boolean z9 = z5;
                    InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                    try {
                        C4047 c4047 = (C4047) c4769.get();
                        C11003.requireNonNull(c4047);
                        String mo31672 = interfaceC13508.mo31672();
                        String str2 = (String) map.get(mo31672);
                        if (str2 == null) {
                            c4047.m12163(mo31672);
                        } else if ("".equals(str2)) {
                            C7980 mo31674 = interfaceC13508.mo31674();
                            if (mo31674 == null || !c4047.m12161(mo31674.getType())) {
                                return null;
                            }
                        } else {
                            c4047.m12163(str2);
                        }
                        if (C6180.m17094(c4047, c150512.get(), z7, z8, z9)) {
                            return Collections.EMPTY_LIST;
                        }
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 2) {
            final C15051 m93572 = C3058.m9357(str, z2, z);
            return new InterfaceC7997() { // from class: l.᩹ܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C15051 c150512 = C15051.this;
                    try {
                        return C6180.m17084(((InterfaceC13508) obj).mo31674(), c150512.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 3) {
            final C15051 m93573 = C3058.m9357(str, z2, z);
            return new InterfaceC7997() { // from class: l.᩸ܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C15051 c150512 = C15051.this;
                    try {
                        return C6180.m17098(((InterfaceC13508) obj).mo31674(), c150512.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i == 4) {
            final C15051 m93574 = C3058.m9357(str, z2, z);
            return new InterfaceC7997() { // from class: l.֨ܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C15051 c150512 = C15051.this;
                    try {
                        return C6180.m17100(((InterfaceC13508) obj).mo31674(), c150512.get(), z3);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            };
        }
        if (i != 5) {
            return null;
        }
        final long j = this.f10619;
        return new InterfaceC7997() { // from class: l.᩶ܽۢ
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                try {
                    return C6180.m17083(((InterfaceC13508) obj).mo31674(), j);
                } catch (Exception unused) {
                    return null;
                }
            }
        };
    }

    @Override // l.InterfaceC19992
    /* renamed from: ֫ */
    public final void mo2263(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f10620.m30033(concurrentLinkedQueue, this.f10621, this.f10618, this.f10624);
    }

    @Override // l.InterfaceC19992
    /* renamed from: ֫ */
    public final C0941 mo2261(ArrayList arrayList) {
        return new C0941(this.f10621, this.f10617, arrayList);
    }
}
