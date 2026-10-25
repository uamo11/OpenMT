package l;

import java.util.List;
import java.util.function.ToIntFunction;

/* compiled from: 85H5 */
/* renamed from: l.ۛ֨ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5727 implements ToIntFunction {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17651;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f17651) {
            case 0:
                return ((C11372) obj).f34032;
            default:
                return ((List) ((C6491) obj).f20043).size();
        }
    }
}
