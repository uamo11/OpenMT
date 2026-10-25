package l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: N673 */
/* renamed from: l.ۤۨᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10277 {
    public static InterfaceC11688 of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, EnumC6043... enumC6043Arr) {
        Set unmodifiableSet;
        C11003.requireNonNull(supplier);
        C11003.requireNonNull(biConsumer);
        C11003.requireNonNull(binaryOperator);
        C11003.requireNonNull(enumC6043Arr);
        if (enumC6043Arr.length == 0) {
            unmodifiableSet = C22976.a;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(EnumC6043.IDENTITY_FINISH, enumC6043Arr));
        }
        return new C2497(supplier, biConsumer, binaryOperator, unmodifiableSet);
    }

    public static InterfaceC11688 of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, EnumC6043... enumC6043Arr) {
        C11003.requireNonNull(supplier);
        C11003.requireNonNull(biConsumer);
        C11003.requireNonNull(binaryOperator);
        C11003.requireNonNull(function);
        C11003.requireNonNull(enumC6043Arr);
        Set set = C22976.c;
        if (enumC6043Arr.length > 0) {
            EnumSet noneOf = EnumSet.noneOf(EnumC6043.class);
            Collections.addAll(noneOf, enumC6043Arr);
            set = Collections.unmodifiableSet(noneOf);
        }
        return new C2497(supplier, biConsumer, binaryOperator, function, set);
    }
}
