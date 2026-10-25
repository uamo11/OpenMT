package l;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: P5J2 */
/* renamed from: l.ۘۖ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3643 extends AbstractC16342 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f11496 = Pattern.compile("^total \\d+$");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f11497;

    public C3643(C3328 c3328, boolean z) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)");
        mo4051(c3328);
        this.f11497 = z;
    }

    @Override // l.AbstractC16342
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3328 mo11133() {
        return new C3328("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|(1:5)|(3:6|7|(1:9)(1:51))|10|(13:12|(10:14|17|(3:19|(2:26|27)(2:23|24)|25)|28|(2:43|44)|30|31|32|(2:34|(1:36)(1:39))(1:40)|37)|49|16|17|(0)|28|(0)|30|31|32|(0)(0)|37)|50|16|17|(0)|28|(0)|30|31|32|(0)(0)|37) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // l.InterfaceC6150
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C10384 mo11134(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3643.mo11134(java.lang.String):l.ۤܺ֡");
    }

    @Override // l.AbstractC11795, l.InterfaceC6150
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List mo11132(LinkedList linkedList) {
        C5378.removeIf(linkedList, new C23159(1));
        return linkedList;
    }
}
