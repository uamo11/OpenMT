package l;

import java.util.function.Supplier;

/* compiled from: P7M1 */
/* renamed from: l.᩸ۘ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C21325 extends C20515 {
    public static final long serialVersionUID = 0;

    public C21325(C14163 c14163, final InterfaceC18278 interfaceC18278, final C16719 c16719, final C5931 c5931, C2002 c2002) {
        super(c14163, new Supplier() { // from class: l.ܶۘ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                InterfaceC18278 interfaceC182782 = InterfaceC18278.this;
                return c5931.m16622(interfaceC182782.mo21321() == EnumC16866.SOURCE ? "bad.source.file.header" : "bad.class.file.header", interfaceC182782, c16719);
            }
        }, c2002);
    }
}
