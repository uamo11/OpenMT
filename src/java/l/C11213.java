package l;

import bin.mt.plus.Features;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.Map;
import java.util.function.Function;

/* compiled from: 350S */
/* renamed from: l.ۧ᩵᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C11213 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33646;

    public /* synthetic */ C11213(int i) {
        this.f33646 = i;
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
        String uid2name;
        TonalPalette tonalPalette;
        switch (this.f33646) {
            case 0:
                uid2name = Features.uid2name(((Integer) obj).intValue());
                return uid2name;
            case 1:
                int i = C5981.f18368;
                return new SharedPreferencesC1055();
            case 2:
                return C19247.m44378((C12951) obj);
            case 3:
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            case 4:
                return "#" + ((Integer) obj);
            case 5:
                return ((Map) obj).values().iterator();
            default:
                return C6241.m17189(EnumC19920.f64377, EnumC19920.f64414);
        }
    }
}
