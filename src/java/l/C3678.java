package l;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: I6PE */
/* renamed from: l.ۘۗᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3678 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11207(C15007 c15007, C10130 c10130) {
        int size = c10130.size();
        c10130.writeInt(827544404);
        c10130.m25436();
        c10130.m25431(c15007.f45764);
        C12704 c12704 = c15007.f45762;
        c10130.m25431(c12704.m30979());
        c10130.m25434(c15007.f45763.f7359);
        C19761 c19761 = new C19761(c10130);
        c19761.m45459(c12704.m32420());
        C2309 c2309 = c15007.f45765;
        c10130.writeInt(c2309.f7443.m14642());
        c10130.writeInt(c2309.f7443.m14640());
        c10130.m25431(c2309.f7440);
        c10130.m25431(c2309.f7444);
        c10130.m25431(c2309.f7442);
        C9611 c9611 = c2309.f7441;
        c10130.m25431(c9611.f29154);
        c10130.writeByte(c9611.f29153 ? 1 : 0);
        m11208(c9611.f29156, c19761, c10130);
        m11208(c9611.f29155, c19761, c10130);
        c10130.m25418();
        c10130.writeInt(C1829.m6061(size, c10130.size() - size, c10130.m25438()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11208(C15713 c15713, C19761 c19761, C10130 c10130) {
        c10130.writeInt(c15713.m37046());
        Iterator it = c15713.iterator();
        while (true) {
            C20654 c20654 = (C20654) it;
            if (!c20654.hasNext()) {
                return;
            }
            C8905 c8905 = (C8905) c20654.next();
            long j = c8905.f27082;
            C15713 c157132 = c8905.f27081;
            c10130.m25431(j);
            c10130.m25431(c8905.f27083);
            c10130.writeByte(c8905.f27084 == EnumC14051.USER ? 0 : 1);
            c10130.writeInt(c157132.m37046());
            Iterator it2 = c157132.iterator();
            while (true) {
                C20654 c206542 = (C20654) it2;
                if (c206542.hasNext()) {
                    C23224 c23224 = (C23224) c206542.next();
                    int i = c23224.f74637;
                    C5089 c5089 = c23224.f74643;
                    c10130.writeInt(i);
                    c10130.m25431(c23224.f74640);
                    c10130.m25431(c23224.f74638);
                    c10130.writeInt(c5089.m14642());
                    c10130.writeInt(c5089.m14640());
                    c19761.m45459(c23224.f74639);
                    c19761.m45459(c23224.f74636);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0139 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:22:0x0072, B:24:0x00a1, B:26:0x00ab, B:28:0x00b5, B:30:0x00e0, B:33:0x00ee, B:35:0x00f3, B:36:0x00fa, B:38:0x010a, B:45:0x0139, B:46:0x013c, B:50:0x011e, B:51:0x0125, B:53:0x0126, B:54:0x012a, B:55:0x012b, B:56:0x012f), top: B:21:0x0072 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C15007 m11205(l.C12951 r32) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3678.m11205(l.۬ۜܽ):l.ܶۙᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15713 m11206(C12951 c12951, C19055 c19055, HashSet hashSet, long j, long j2) {
        int readInt = c12951.readInt();
        if (readInt < 0 || readInt > c12951.available() / 21) {
            throw m11204();
        }
        C15713 c15713 = new C15713();
        for (int i = 0; i < readInt; i++) {
            long readLong = c12951.readLong();
            long readLong2 = c12951.readLong();
            int readByte = c12951.readByte() & 255;
            int readInt2 = c12951.readInt();
            if (readLong <= 0 || readLong >= j || !hashSet.add(Long.valueOf(readLong)) || readByte > 1 || readInt2 <= 0 || readInt2 > c12951.available() / 52) {
                throw m11204();
            }
            C15713 c157132 = new C15713();
            for (int i2 = 0; i2 < readInt2; i2++) {
                int readInt3 = c12951.readInt();
                long readLong3 = c12951.readLong();
                long readLong4 = c12951.readLong();
                C5089 c5089 = new C5089(c12951.readInt(), c12951.readInt());
                if (readLong3 < 0 || readLong4 < 0 || readLong3 > j2 || readLong4 > j2) {
                    throw m11204();
                }
                c157132 = c157132.m37044(new C23224(readInt3, readLong3, readLong4, c5089, c19055.m43914(), c19055.m43914()));
            }
            c15713 = c15713.m37044(new C8905(readLong, readLong2, readByte == 0 ? EnumC14051.USER : EnumC14051.BATCH, c157132));
        }
        return c15713;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m11204() {
        return new IllegalArgumentException("Invalid inline session state");
    }
}
