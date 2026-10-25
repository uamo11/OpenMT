package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.Map;
import java.util.function.Function;

/* compiled from: IB3L */
/* renamed from: l.ܿ᩶ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C17576 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53722;

    public /* synthetic */ C17576(int i) {
        this.f53722 = i;
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
        TonalPalette tonalPalette2;
        TonalPalette tonalPalette3;
        switch (this.f53722) {
            case 0:
                return ((InterfaceC17889) obj).getName() + "/";
            case 1:
                return (C0732) ((Map.Entry) obj).getValue();
            case 2:
                return ((C18011) obj).f56170;
            case 3:
                String str = (String) obj;
                return str.startsWith("/") ? str.substring(1) : str;
            case 4:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            case 5:
                tonalPalette2 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette2;
            case 6:
                tonalPalette3 = ((DynamicScheme) obj).errorPalette;
                return tonalPalette3;
            case 7:
                return ((C9268) obj).toString();
            case 8:
                return String.format("#%d?", (Integer) obj);
            default:
                return ((EnumC2113) obj).toString();
        }
    }
}
