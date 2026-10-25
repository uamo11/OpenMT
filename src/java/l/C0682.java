package l;

import android.os.SystemClock;

/* compiled from: W1SD */
/* renamed from: l.֡᩸ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0682 {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x00ef
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf A[EDGE_INSN: B:71:0x01bf->B:52:0x01bf BREAK  A[LOOP:1: B:45:0x019e->B:69:0x01bc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17574 m2766(java.lang.String r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0682.m2766(java.lang.String, boolean, boolean):l.ܿ᩶ۢ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2767(final C17574 c17574) {
        if (c17574 == null || !c17574.m41098()) {
            return;
        }
        if (c17574.m41095().endsWith("/bash")) {
            c17574.m8717("history -d -1 && history -w; exit\r");
            final long currentTimeMillis = System.currentTimeMillis();
            new Thread(new Runnable() { // from class: l.ᩴ᩸ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    while (true) {
                        C17574 c175742 = C17574.this;
                        if (!c175742.m41098()) {
                            return;
                        }
                        if (System.currentTimeMillis() - currentTimeMillis > 500) {
                            c175742.m41097();
                            return;
                        }
                        SystemClock.sleep(5L);
                    }
                }
            }).start();
            return;
        }
        c17574.m41097();
    }
}
