package l;

/* compiled from: K8HG */
/* renamed from: l.ۜ᩷ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7013 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18947(long j, C17714 c17714, InterfaceC19383[] interfaceC19383Arr) {
        int i;
        while (true) {
            if (c17714.m41457() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c17714.m41457() == 0) {
                    i = -1;
                    break;
                }
                int m41456 = c17714.m41456();
                i2 += m41456;
                if (m41456 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (c17714.m41457() == 0) {
                    i3 = -1;
                    break;
                }
                int m414562 = c17714.m41456();
                i3 += m414562;
                if (m414562 != 255) {
                    break;
                }
            }
            int m41485 = c17714.m41485() + i3;
            if (i3 == -1 || i3 > c17714.m41457()) {
                C19956.m46037("Skipping remainder of malformed SEI NAL unit.");
                m41485 = c17714.m41483();
            } else if (i == 4 && i3 >= 8) {
                int m414563 = c17714.m41456();
                int m41464 = c17714.m41464();
                int m41493 = m41464 == 49 ? c17714.m41493() : 0;
                int m414564 = c17714.m41456();
                if (m41464 == 47) {
                    c17714.m41478(1);
                }
                boolean z = m414563 == 181 && (m41464 == 49 || m41464 == 47) && m414564 == 3;
                if (m41464 == 49) {
                    z &= m41493 == 1195456820;
                }
                if (z) {
                    m18948(j, c17714, interfaceC19383Arr);
                }
            }
            c17714.m41484(m41485);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18948(long j, C17714 c17714, InterfaceC19383[] interfaceC19383Arr) {
        int m41456 = c17714.m41456();
        if ((m41456 & 64) != 0) {
            c17714.m41478(1);
            int i = (m41456 & 31) * 3;
            int m41485 = c17714.m41485();
            for (InterfaceC19383 interfaceC19383 : interfaceC19383Arr) {
                c17714.m41484(m41485);
                interfaceC19383.mo8453(i, c17714);
                C22632.m50634(j != -9223372036854775807L);
                interfaceC19383.mo8455(j, 1, i, 0, null);
            }
        }
    }
}
