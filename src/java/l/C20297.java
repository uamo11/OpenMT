package l;

import java.util.function.Function;

/* compiled from: D7UG */
/* renamed from: l.᩶ܽܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C20297 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65552;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65553;

    public /* synthetic */ C20297(int i, Object obj) {
        this.f65552 = i;
        this.f65553 = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        InterfaceC20758 mo8367;
        switch (this.f65552) {
            case 0:
                return C3363.m10275((C3363) this.f65553, (C10419) obj);
            default:
                mo8367 = super/*l.ۖܿ۠*/.mo8367((InterfaceC20758) obj);
                return mo8367;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
