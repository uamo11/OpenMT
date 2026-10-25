package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.Set;

/* compiled from: W7N3 */
/* renamed from: l.ۗ᩻ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3563 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC12860 f11310;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m10856(View view, InterfaceC22285 interfaceC22285) {
        C11233.m27805(view, "<this>");
        view.setTag(R.id.MT_Protector_res_0x7f0a068b, interfaceC22285);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10859(Set set, Set set2) {
        if (set.size() != set2.size()) {
            return false;
        }
        Iterator it = set.iterator();
        Iterator it2 = set2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!C11003.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte m10866(long j) {
        return (byte) ((72 - Long.numberOfLeadingZeros(j ^ (j >> 63))) >> 3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10857(Iterable iterable, Iterable iterable2, boolean z) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!((C10097) it.next()).m25369((C10097) it2.next(), z)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m10861(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= (bArr[i] & 255) << (i * 8);
        }
        int length = (8 - bArr.length) * 8;
        return (j << length) >> length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10858(Iterable iterable, Iterable iterable2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!((C16611) it.next()).m39133((C16611) it2.next(), z, z2, z3, z4, z5)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m10862(long j) {
        int m10866 = m10866(j);
        byte[] bArr = new byte[m10866];
        for (int i = 0; i < m10866; i++) {
            bArr[i] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static byte m10863(long j) {
        int numberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros == 0) {
            numberOfLeadingZeros = 1;
        }
        return (byte) ((numberOfLeadingZeros + 7) >> 3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC12860 m10855() {
        if (f11310 == null) {
            try {
                if (C2732.m8475("com.portaudio.PortAudio", false) != null) {
                    f11310 = (InterfaceC12860) C2732.m8475("com.jsyn.devices.jportaudio.JPortAudioDevice", true).newInstance();
                }
            } catch (Throwable th) {
                System.err.println("Could not load JPortAudio device. " + th);
            }
        }
        if (f11310 == null) {
            try {
                Class m8475 = C2732.m8475("com.jsyn.devices.javasound.JavaSoundAudioDevice", false);
                if (m8475 != null) {
                    f11310 = (InterfaceC12860) m8475.newInstance();
                }
            } catch (Throwable th2) {
                System.err.println("Could not load JavaSound device. " + th2);
            }
        }
        return f11310;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m10864(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= (bArr[i] & 255) << (i * 8);
        }
        return j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m10865(long j) {
        int m10863 = m10863(j);
        byte[] bArr = new byte[m10863];
        for (int i = 0; i < m10863; i++) {
            bArr[i] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m10867(long j) {
        int numberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (numberOfTrailingZeros == 0) {
            numberOfTrailingZeros = 1;
        }
        return (numberOfTrailingZeros + 7) >> 3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m10854(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= (bArr[i] & 255) << (i * 8);
        }
        return j << ((8 - bArr.length) * 8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m10860(long j) {
        int m10867 = m10867(j);
        long j2 = j >> (64 - (m10867 * 8));
        byte[] bArr = new byte[m10867];
        for (int i = 0; i < m10867; i++) {
            bArr[i] = (byte) j2;
            j2 >>= 8;
        }
        return bArr;
    }
}
