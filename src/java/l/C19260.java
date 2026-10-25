package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: X1Y5 */
/* renamed from: l.᩵ۚܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C19260 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str.equals(str2)) {
            return str;
        }
        int indexOf = str.indexOf(47);
        int indexOf2 = str2.indexOf(47);
        if (indexOf != indexOf2 || indexOf == -1) {
            return "*/*";
        }
        String substring = str.substring(0, indexOf + 1);
        return substring.equals(str2.substring(0, indexOf2 + 1)) ? substring.concat("*") : "*/*";
    }
}
