package l;

import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: H74H */
/* renamed from: l.ᩳۗ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17777 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f54369;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC9505 f54372;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f54373;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f54374;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f54377;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16895 f54378;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC1368 f54380;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f54381;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16184 f54382;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f54383;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f54385;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23615 f54376 = new C23615();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12552 f54370 = new C12552();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f54384 = new ArrayList();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SparseArray f54371 = new SparseArray();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16365 f54379 = new C16365();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3002 f54386 = new C3002();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C21843 f54375 = new C21843(0, 0);

    public C17777(C16895 c16895, InterfaceC15097 interfaceC15097) {
        this.f54378 = c16895;
        this.f54381 = interfaceC15097;
        new C21843(2, 0);
        this.f54383 = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0059  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m41649(android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17777.m41649(android.net.Uri):void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m41653() {
        SparseArray sparseArray;
        int i = 0;
        while (true) {
            sparseArray = this.f54371;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C7235) sparseArray.valueAt(i)).m12202();
            i++;
        }
        sparseArray.clear();
        InterfaceC1368 interfaceC1368 = this.f54380;
        if (interfaceC1368 != null) {
            interfaceC1368.mo4838();
            this.f54380 = null;
        }
        this.f54382 = null;
        C8751.m22643(this.f54377);
        this.f54377 = null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41654() {
        return this.f54384.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaFormat m41647(int i) {
        C1549 c1549 = (C1549) this.f54384.get(i);
        MediaFormat m5307 = c1549.m5307(this.f54386, this.f54375);
        long j = c1549.f5462.f22184;
        if (j != -9223372036854775807L) {
            m5307.setLong("durationUs", j);
            return m5307;
        }
        InterfaceC9505 interfaceC9505 = this.f54372;
        if (interfaceC9505 != null && interfaceC9505.mo6827() != -9223372036854775807L) {
            m5307.setLong("durationUs", this.f54372.mo6827());
        }
        return m5307;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41651(int i) {
        this.f54383.add(Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41648() {
        if (m41641()) {
            m41645();
            m41641();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41646(ByteBuffer byteBuffer) {
        if (!m41641()) {
            return -1;
        }
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
        C21843 c21843 = this.f54375;
        c21843.f69995 = byteBuffer;
        C10722 m38528 = this.f54379.m38528();
        m38528.getClass();
        C7235 c7235 = ((C1549) this.f54384.get(m38528.f32309)).f5462;
        C3002 c3002 = this.f54386;
        int m12195 = c7235.m12195(c3002, c21843, 1, false);
        if (m12195 == -5) {
            m12195 = c7235.m12195(c3002, c21843, 1, false);
        }
        c3002.m9145();
        C22632.m50634(m12195 == -4);
        byteBuffer.flip();
        byteBuffer.position(0);
        c21843.f69995 = null;
        return byteBuffer.remaining();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m41652() {
        if (m41641()) {
            return this.f54379.m38528().f32308;
        }
        return -1L;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41650() {
        if (m41641()) {
            return this.f54379.m38528().f32307;
        }
        return -1;
    }

    @EnsuresNonNullIf(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m41641() {
        int mo4837;
        C23615 c23615 = this.f54376;
        boolean z = false;
        while (true) {
            C16365 c16365 = this.f54379;
            if (!c16365.m38527()) {
                C10722 m38528 = c16365.m38528();
                m38528.getClass();
                if (this.f54383.contains(Integer.valueOf(m38528.f32309))) {
                    return true;
                }
                m41645();
            } else {
                if (z) {
                    return false;
                }
                try {
                    InterfaceC1368 interfaceC1368 = this.f54380;
                    interfaceC1368.getClass();
                    C16184 c16184 = this.f54382;
                    c16184.getClass();
                    mo4837 = interfaceC1368.mo4837(c16184, c23615);
                } catch (Exception | OutOfMemoryError e) {
                    C19956.m46036("Treating exception as the end of input.", e);
                }
                if (mo4837 == -1) {
                    z = true;
                } else if (mo4837 == 1) {
                    this.f54382 = m41637(c23615.f76532);
                }
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m41645() {
        C1549 c1549 = (C1549) this.f54384.get(this.f54379.m38529().f32309);
        if (c1549.f5461) {
            return;
        }
        C7235 c7235 = c1549.f5462;
        c7235.m12215(1);
        c7235.m12207();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16184 m41637(long j) {
        InterfaceC21449 interfaceC21449 = this.f54377;
        interfaceC21449.getClass();
        Uri mo1621 = interfaceC21449.mo1621();
        mo1621.getClass();
        C8751.m22643(interfaceC21449);
        long j2 = this.f54385 + j;
        C4515 c4515 = new C4515();
        c4515.m13281(mo1621);
        c4515.m13286(j2);
        c4515.m13279(6);
        long mo1620 = interfaceC21449.mo1620(c4515.m13278());
        if (mo1620 != -1) {
            mo1620 += j;
        }
        return new C16184(interfaceC21449, j, mo1620);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41638(C17777 c17777, C7235 c7235, C8353 c8353) {
        c17777.f54373++;
        ArrayList arrayList = c17777.f54384;
        c7235.m19345(arrayList.size());
        arrayList.add(new C1549(c7235, false, null));
        String m49728 = C22134.m49728(c8353);
        if (m49728 != null) {
            c7235.m19346(arrayList.size());
            arrayList.add(new C1549(c7235, true, m49728));
        }
    }
}
