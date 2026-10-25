package l;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: 898C */
/* renamed from: l.ۛᩴܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6248 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19326;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f19327;

    public /* synthetic */ C6248(int i, Serializable serializable) {
        this.f19326 = i;
        this.f19327 = serializable;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f19326) {
            case 0:
                return C11893.m29014((File) obj, (String) this.f19327);
            default:
                return new ArrayList((ArrayList) this.f19327);
        }
    }
}
