package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: PAJ1 */
/* renamed from: l.ۛܺܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6161 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18953;

    public /* synthetic */ C6161(int i) {
        this.f18953 = i;
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
        TonalPalette tonalPalette;
        switch (this.f18953) {
            case 0:
                return C2346.m7631((C12951) obj);
            case 1:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            default:
                return new HashMap();
        }
    }
}
