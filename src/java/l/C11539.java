package l;

import bin.mt.json.JSONValue;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: 969A */
/* renamed from: l.ۨۜܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C11539 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34456;

    public /* synthetic */ C11539(int i) {
        this.f34456 = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        InterfaceC17664 stream;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        switch (this.f34456) {
            case 0:
                return new C5168((C12951) obj);
            case 1:
                stream = C5378.stream(((C20317) obj).f65617);
                return stream;
            case 2:
                return C9523.m24406((String) obj);
            case 3:
                return (CharSequence) obj;
            case 4:
                return ((JSONValue) obj).asString();
            case 5:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            default:
                tonalPalette2 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette2;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
