package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: R8SJ */
/* renamed from: l.ܶܺۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15331 extends AbstractC5455 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f46988;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f46989;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f46990;

    public C15331(long j, long j2, List list) {
        this.f46990 = j;
        this.f46989 = j2;
        this.f46988 = C20195.unmodifiableList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15331 m36362(C17714 c17714, long j, C9248 c9248) {
        List list;
        long j2;
        c17714.m41479();
        boolean z = (c17714.m41456() & 128) != 0;
        ?? r7 = Collections.EMPTY_LIST;
        if (z) {
            list = r7;
            j2 = -9223372036854775807L;
        } else {
            int m41456 = c17714.m41456();
            boolean z2 = (m41456 & 64) != 0;
            boolean z3 = (m41456 & 32) != 0;
            boolean z4 = (m41456 & 16) != 0;
            long m10194 = (!z2 || z4) ? -9223372036854775807L : C3338.m10194(j, c17714);
            if (!z2) {
                int m414562 = c17714.m41456();
                r7 = new ArrayList(m414562);
                for (int i = 0; i < m414562; i++) {
                    c17714.m41456();
                    c9248.m23734(!z4 ? C3338.m10194(j, c17714) : -9223372036854775807L);
                    r7.add(new C8277());
                }
            }
            if (z3) {
                c17714.m41456();
                c17714.m41479();
            }
            c17714.m41464();
            c17714.m41456();
            c17714.m41456();
            list = r7;
            j2 = m10194;
        }
        return new C15331(j2, c9248.m23734(j2), list);
    }

    @Override // l.AbstractC5455
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f46990);
        sb.append(", programSplicePlaybackPositionUs= ");
        return C15942.m37718(sb, this.f46989, " }");
    }
}
