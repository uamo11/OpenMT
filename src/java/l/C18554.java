package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* compiled from: X1Y5 */
/* renamed from: l.ᩴۚܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C18554 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57589;

    public /* synthetic */ C18554(int i) {
        this.f57589 = i;
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
        Double lambda$inverseSurface$38;
        switch (this.f57589) {
            case 0:
                String mo36971 = ((InterfaceC17889) obj).mo36971();
                return (mo36971.equals("application/vnd.android.package-archive") && C3424.m10398()) ? "application/octet-stream" : mo36971;
            case 1:
                return ((C6703) obj).m18263();
            case 2:
                return (C12645) ((InterfaceC17889) obj);
            case 3:
                return ((C24032) obj).f77864;
            case 4:
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
                if (!interfaceC17889.isDirectory()) {
                    return interfaceC17889.getPath();
                }
                return interfaceC17889.getPath() + "/";
            case 5:
                lambda$inverseSurface$38 = MaterialDynamicColors.lambda$inverseSurface$38((DynamicScheme) obj);
                return lambda$inverseSurface$38;
            case 6:
                return ((C19480) obj).toString();
            case 7:
                return "#" + ((Integer) obj);
            case 8:
                return C2609.m8239();
            case 9:
                return Boolean.valueOf(((InterfaceC15111) obj).isRegularFile());
            default:
                return (AbstractC12612) ((AbstractC19669) obj);
        }
    }
}
