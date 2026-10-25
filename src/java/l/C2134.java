package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.simpleframework.xml.strategy.Name;

/* compiled from: 64YZ */
/* renamed from: l.֫᩺ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2134 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12534 f7094;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Map f7096;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17515 f7097;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20631 f7098;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17656 f7099;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f7095 = new HashMap();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f7100 = true;

    public C2134(C12534 c12534) {
        this.f7094 = c12534;
        this.f7097 = c12534.m30773();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7058(boolean z) {
        this.f7100 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7056(Map map) {
        this.f7096 = map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x025c, code lost:
    
        r19 = r1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7055(java.lang.CharSequence r25) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2134.m7055(java.lang.CharSequence):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7057(C10130 c10130) {
        char c;
        C20631 c20631 = this.f7098;
        c10130.mo13229((short) 3);
        int i = 8;
        c10130.mo13229((short) 8);
        long position = c10130.getPosition();
        int i2 = 4;
        c10130.skipBytes(4);
        int i3 = 0;
        this.f7099.m41381(this.f7100).m32180((InterfaceC4485) c10130, false, (C19277) null);
        int[] m41384 = this.f7099.m41384();
        if (m41384.length > 0) {
            c10130.mo13231(MLKEMEngine.KyberPolyBytes);
            c10130.mo13231(8);
            c10130.writeInt((m41384.length * 4) + 8);
            c10130.mo13230(m41384);
        }
        int i4 = 0;
        while (i4 < c20631.m47204()) {
            int m47209 = c20631.m47209(i4);
            if (m47209 == 0) {
                C23452 m47207 = c20631.m47207(i4);
                C24006 c24006 = (C24006) m47207.m51902();
                c10130.writeInt(1048832);
                c10130.writeInt(24);
                c10130.writeInt(m47207.m51899());
                c10130.writeInt(-1);
                c10130.writeInt(c24006.f77805.m42794());
                c10130.writeInt(c24006.f77806.m42794());
            } else if (m47209 == 1) {
                C14279 m47205 = c20631.m47205(i4);
                C24006 c240062 = (C24006) m47205.m34050();
                List m34045 = m47205.m34045();
                c10130.writeInt(1048834);
                int size = ((ArrayList) m34045).size();
                c10130.writeInt((size * 20) + 36);
                c10130.writeInt(m47205.m34047());
                c10130.writeInt(-1);
                C18362 c18362 = c240062.f77805;
                c10130.writeInt(c18362 == null ? -1 : c18362.m42794());
                c10130.writeInt(c240062.f77806.m42794());
                c10130.mo13231(20);
                c10130.mo13231(20);
                if (size == 0) {
                    c10130.m25431(0L);
                } else {
                    c10130.mo13229((short) size);
                    int i5 = 0;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) m34045;
                        if (i5 < arrayList.size()) {
                            String m40118 = ((C17102) arrayList.get(i5)).m40118();
                            m40118.getClass();
                            switch (m40118.hashCode()) {
                                case 3355:
                                    if (m40118.equals("id")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 94742904:
                                    if (m40118.equals(Name.LABEL)) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109780401:
                                    if (m40118.equals("style")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    s = (short) (i5 + 1);
                                    break;
                                case 1:
                                    s2 = (short) (i5 + 1);
                                    break;
                                case 2:
                                    s3 = (short) (i5 + 1);
                                    break;
                            }
                            i5++;
                        } else {
                            c10130.mo13229(s);
                            c10130.mo13229(s2);
                            c10130.mo13229(s3);
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                C14833 c14833 = (C14833) ((C17102) arrayList.get(i6)).m40123();
                                C18362 c183622 = c14833.f45245;
                                c10130.writeInt(c183622 == null ? -1 : c183622.m42794());
                                c10130.writeInt(c14833.f45244.m42794());
                                C7073 c7073 = c14833.f45247;
                                if (c7073.f21767 == 3) {
                                    int m42794 = c14833.f45246.m42794();
                                    c7073.f21766 = m42794;
                                    c7073.f21768 = m42794;
                                }
                                c10130.writeInt(c7073.f21768);
                                c10130.writeInt((c7073.f21767 << 24) | 8);
                                c10130.writeInt(c7073.f21766);
                            }
                        }
                    }
                }
            } else if (m47209 == 2) {
                C14279 m472052 = c20631.m47205(i4);
                C24006 c240063 = (C24006) m472052.m34050();
                c10130.writeInt(1048835);
                c10130.writeInt(24);
                c10130.writeInt(m472052.m34047());
                c10130.writeInt(-1);
                C18362 c183623 = c240063.f77805;
                c10130.writeInt(c183623 != null ? c183623.m42794() : -1);
                c10130.writeInt(c240063.f77806.m42794());
            } else if (m47209 == 3) {
                C23452 m472072 = c20631.m47207(i4);
                C24006 c240064 = (C24006) m472072.m51902();
                c10130.writeInt(1048833);
                c10130.writeInt(24);
                c10130.writeInt(m472072.m51899());
                c10130.writeInt(-1);
                c10130.writeInt(c240064.f77805.m42794());
                c10130.writeInt(c240064.f77806.m42794());
            } else if (m47209 == i2) {
                C6519 m47208 = c20631.m47208(i4);
                C24006 c240065 = (C24006) m47208.m18017();
                c10130.writeInt(1048836);
                c10130.writeInt(28);
                c10130.writeInt(m47208.m18015());
                c10130.writeInt(-1);
                c10130.writeInt(c240065.f77805.m42794());
                c10130.writeInt(i);
                c10130.writeInt(i3);
            }
            i4++;
            i = 8;
            i2 = 4;
            i3 = 0;
        }
        long position2 = c10130.getPosition();
        c10130.seek(position);
        c10130.writeInt((int) ((position2 - position) + 4));
        c10130.seek(position2);
    }
}
