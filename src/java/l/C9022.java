package l;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: N43O */
/* renamed from: l.ۡܿ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9022 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27388;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27389;

    public /* synthetic */ C9022(int i, Object obj) {
        this.f27388 = i;
        this.f27389 = obj;
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
        DynamicColor lambda$onTertiaryFixed$139;
        Double lambda$onPrimaryContainer$62;
        switch (this.f27388) {
            case 0:
                InterfaceC20758 interfaceC20758 = (InterfaceC20758) obj;
                ((C16076) this.f27389).getClass();
                try {
                    return C16646.of(C17229.readAttributes(interfaceC20758, InterfaceC15111.class, new EnumC14406[0]));
                } catch (IOException unused) {
                    return C16646.empty();
                }
            case 1:
                lambda$onTertiaryFixed$139 = ((MaterialDynamicColors) this.f27389).lambda$onTertiaryFixed$139((DynamicScheme) obj);
                return lambda$onTertiaryFixed$139;
            default:
                lambda$onPrimaryContainer$62 = ((MaterialDynamicColors) this.f27389).lambda$onPrimaryContainer$62((DynamicScheme) obj);
                return lambda$onPrimaryContainer$62;
        }
    }
}
