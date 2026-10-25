package l;

/* compiled from: V627 */
/* renamed from: l.ۙܺ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4741 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7563 f15043;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15323 f15044;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3330 f15045;

    public C4741(C3330 c3330, InterfaceC15323 interfaceC15323, AbstractC7563 abstractC7563) {
        C11233.m27805(c3330, "store");
        C11233.m27805(interfaceC15323, "factory");
        C11233.m27805(abstractC7563, "defaultCreationExtras");
        this.f15045 = c3330;
        this.f15044 = interfaceC15323;
        this.f15043 = abstractC7563;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4741(C3330 c3330, InterfaceC15323 interfaceC15323) {
        this(c3330, interfaceC15323, C23085.f74234);
        C11233.m27805(c3330, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4741(l.InterfaceC13207 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            l.C11233.m27805(r4, r0)
            l.ۗܺ֫ r0 = r4.getViewModelStore()
            l.ܰܺ֫ r1 = l.C8269.f25430
            boolean r1 = r4 instanceof l.InterfaceC4557
            if (r1 == 0) goto L17
            r2 = r4
            l.ۙۢ֫ r2 = (l.InterfaceC4557) r2
            l.ܶܺ֫ r2 = r2.getDefaultViewModelProviderFactory()
            goto L2c
        L17:
            l.᩹ܺ֫ r2 = l.C22380.m50243()
            if (r2 != 0) goto L25
            l.᩹ܺ֫ r2 = new l.᩹ܺ֫
            r2.<init>()
            l.C22380.m50244(r2)
        L25:
            l.᩹ܺ֫ r2 = l.C22380.m50243()
            l.C11233.m27799(r2)
        L2c:
            if (r1 == 0) goto L35
            l.ۙۢ֫ r4 = (l.InterfaceC4557) r4
            l.۟ܺ֫ r4 = r4.getDefaultViewModelCreationExtras()
            goto L37
        L35:
            l.᩺ܺ֫ r4 = l.C23085.f74234
        L37:
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4741.<init>(l.۬ܺ֫):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 m13885(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m13886(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 m13886(Class cls, String str) {
        AbstractC5447 mo5213;
        C11233.m27805(str, "key");
        C3330 c3330 = this.f15045;
        AbstractC5447 m10188 = c3330.m10188(str);
        boolean isInstance = cls.isInstance(m10188);
        InterfaceC15323 interfaceC15323 = this.f15044;
        if (isInstance) {
            C20264 c20264 = interfaceC15323 instanceof C20264 ? (C20264) interfaceC15323 : null;
            if (c20264 != null) {
                C11233.m27799(m10188);
                c20264.mo8257(m10188);
            }
            C11233.m27800((Object) m10188, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return m10188;
        }
        C16344 c16344 = new C16344(this.f15043);
        int i = C22380.f72526;
        c16344.m20277().put(C21675.f69527, str);
        try {
            mo5213 = interfaceC15323.mo5214(cls, c16344);
        } catch (AbstractMethodError unused) {
            mo5213 = interfaceC15323.mo5213(cls);
        }
        c3330.m10190(str, mo5213);
        return mo5213;
    }
}
