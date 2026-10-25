package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: 97F2 */
/* renamed from: l.ۗᩳ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3392 extends AbstractC9701 {

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final C8331 f10733;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final Map f10734;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final Set f10735;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final Set f10736;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final Map f10737;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final Map f10738;

    public C3392(C19621 c19621) {
        C8331 c8331;
        c8331 = c19621.f63353;
        this.f10733 = c8331;
        this.f10736 = C20195.unmodifiableSet(c19621.f63356);
        this.f10734 = C20195.unmodifiableMap(c19621.f63351);
        this.f10738 = C20195.unmodifiableMap(c19621.f63357);
        this.f10735 = C20195.unmodifiableSet(c19621.f63350);
        this.f10737 = C20195.unmodifiableMap(c19621.f63349);
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m10344() {
        return (String) this.f10733.f20043;
    }

    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        C5378.stream(this.f10736).forEach(new Consumer() { // from class: l.ܳᩳ֨
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                String str;
                C0569 c0569 = (C0569) obj;
                String m24643 = C3392.this.m24643(9, "requires");
                StringBuilder sb2 = sb;
                sb2.append(m24643);
                sb2.append(c0569);
                if (c0569.m14014() == null) {
                    str = "";
                } else {
                    str = " // @" + c0569.m14014();
                }
                sb2.append(String.format(";%s%n", str));
            }
        });
        Map map = this.f10734;
        C5378.stream(map.entrySet()).filter(new C0065(6)).map(new C18915(0, this)).forEach(new C1178(1, sb));
        C5378.stream(map.entrySet()).filter(new C2538(3)).map(new C23853(0, this)).forEach(new C1178(1, sb));
        Map map2 = this.f10738;
        C5378.stream(map2.entrySet()).filter(new C10948()).map(new Function() { // from class: l.ۜᩳ֨
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
                return C3392.this.m24643(9, "opens").concat(String.format("%s;%n", ((C15385) ((Map.Entry) obj).getKey()).toString()));
            }
        }).forEach(new C1178(1, sb));
        C5378.stream(map2.entrySet()).filter(new C9037(0)).map(new Function() { // from class: l.ܺᩳ֨
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String concat;
                concat = r0.m24643(9, "opens").concat(String.format("%s to%n%s;%n", ((C15385) r2.getKey()).toString(), C5378.stream((Set) ((Map.Entry) obj).getValue()).map(new C18003(C3392.this, 1)).collect(C22976.joining(",\n"))));
                return concat;
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }).forEach(new C1178(1, sb));
        C5378.stream(this.f10735).map(new C2687(0, this)).forEach(new C1178(1, sb));
        C5378.stream(this.f10737.entrySet()).filter(new C18411(2)).map(new C4098(0, this)).forEach(new C1178(1, sb));
        if (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
