package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: Q3ZI */
/* renamed from: l.᩺ᩳ֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C23147 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74406;

    public /* synthetic */ C23147(int i) {
        this.f74406 = i;
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
        switch (this.f74406) {
            case 0:
                return ((EnumC1960) obj).name();
            case 1:
                return C5031.m14528((C12951) obj);
            case 2:
                return new ArrayList();
            case 3:
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            case 4:
                tonalPalette2 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette2;
            case 5:
                tonalPalette3 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette3;
            case 6:
                return ((C12429) obj).mo30595();
            case 7:
                return (C9378) C9378.class.cast((InterfaceC13206) obj);
            case 8:
                return ((StringBuilder) obj).toString();
            case 9:
                return (InterfaceC3350) ((AbstractC9701) obj);
            default:
                return ((C9764) obj).f29541;
        }
    }
}
