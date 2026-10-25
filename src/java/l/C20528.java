package l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: A16O */
/* renamed from: l.᩷֡ܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C20528 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66140;

    public /* synthetic */ C20528(int i) {
        this.f66140 = i;
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
        Double lambda$scrim$49;
        TonalPalette tonalPalette2;
        switch (this.f66140) {
            case 0:
                Object m39866 = C16999.m39866((String) obj, new String[0]);
                return m39866 instanceof InterfaceC21855 ? ((InterfaceC21855) m39866).mo27913() : m39866;
            case 1:
                return new C21965((C12951) obj);
            case 2:
                return ((PackageInfo) obj).applicationInfo.sourceDir;
            case 3:
                return ((C12182) obj).m29658();
            case 4:
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            case 5:
                lambda$scrim$49 = MaterialDynamicColors.lambda$scrim$49((DynamicScheme) obj);
                return lambda$scrim$49;
            default:
                tonalPalette2 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette2;
        }
    }
}
