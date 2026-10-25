package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.BitSet;
import java.util.function.Function;

/* compiled from: M5T2 */
/* renamed from: l.ۙۢۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4563 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14568;

    public /* synthetic */ C4563(int i) {
        this.f14568 = i;
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
        Double lambda$surfaceContainerLowest$22;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        Double lambda$shadow$47;
        InterfaceC17664 stream;
        switch (this.f14568) {
            case 0:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 1:
                return new C16773((C12951) obj);
            case 2:
                return ((C4027) obj).f12783;
            case 3:
                return ((C8712) obj).f26517;
            case 4:
                return new BitSet();
            case 5:
                lambda$surfaceContainerLowest$22 = MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
                return lambda$surfaceContainerLowest$22;
            case 6:
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            case 7:
                tonalPalette2 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette2;
            case 8:
                lambda$shadow$47 = MaterialDynamicColors.lambda$shadow$47((DynamicScheme) obj);
                return lambda$shadow$47;
            case 9:
                return ((EnumC13833) obj).m33193();
            case 10:
                return ((EnumC15204) obj).m35962();
            case 11:
                return ((StackTraceElement) obj).toString();
            default:
                stream = C5378.stream(((C18963) obj).f59815);
                return stream;
        }
    }
}
