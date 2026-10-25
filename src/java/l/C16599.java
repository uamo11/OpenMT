package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* compiled from: Y1KK */
/* renamed from: l.ܽۧۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C16599 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50997;

    public /* synthetic */ C16599(int i) {
        this.f50997 = i;
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
        Double lambda$textPrimaryInverse$153;
        Double lambda$secondaryContainer$74;
        Double lambda$onError$95;
        switch (this.f50997) {
            case 0:
                return ((C18011) obj).f56169;
            case 1:
                int i = C23031.f74117;
                return C16999.m39866((String) obj, new String[0]);
            case 2:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 3:
                lambda$textPrimaryInverse$153 = MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj);
                return lambda$textPrimaryInverse$153;
            case 4:
                lambda$secondaryContainer$74 = MaterialDynamicColors.lambda$secondaryContainer$74((DynamicScheme) obj);
                return lambda$secondaryContainer$74;
            case 5:
                lambda$onError$95 = MaterialDynamicColors.lambda$onError$95((DynamicScheme) obj);
                return lambda$onError$95;
            case 6:
                return ((C9378) obj).f28489.f17560;
            default:
                return ((InterfaceC5641) obj).toString();
        }
    }
}
