package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.List;
import java.util.function.Function;

/* compiled from: 51FV */
/* renamed from: l.ۧۨ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C10985 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33045;

    public /* synthetic */ C10985(int i) {
        this.f33045 = i;
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
        CharSequence m14736;
        Double lambda$onSurfaceVariant$36;
        Double lambda$onTertiaryFixed$138;
        TonalPalette tonalPalette;
        switch (this.f33045) {
            case 0:
                return C5378.stream((List) obj);
            case 1:
                return new C19866(((AbstractC15440) obj).m36517());
            case 2:
                m14736 = C5156.m14736((CharSequence) obj);
                return m14736;
            case 3:
                return "$RECYCLE.BIN$" + ((InterfaceC17889) obj).getPath();
            case 4:
                lambda$onSurfaceVariant$36 = MaterialDynamicColors.lambda$onSurfaceVariant$36((DynamicScheme) obj);
                return lambda$onSurfaceVariant$36;
            case 5:
                lambda$onTertiaryFixed$138 = MaterialDynamicColors.lambda$onTertiaryFixed$138((DynamicScheme) obj);
                return lambda$onTertiaryFixed$138;
            case 6:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            default:
                return (Integer) ((C4599) obj).m13510().m33075();
        }
    }
}
