package l;

import java.util.BitSet;
import java.util.HashSet;

/* compiled from: KATI */
/* renamed from: l.ۡ᩻֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9203 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21631 f27884;

    public C9203(C21631 c21631) {
        this.f27884 = c21631;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23637(AbstractC23041 abstractC23041, AbstractC16466 abstractC16466, C23936 c23936, HashSet hashSet, BitSet bitSet) {
        C23936 m52716;
        C8706 c8706;
        C21631 c21631 = this.f27884;
        int i = c21631.f69448;
        if (hashSet.add(new C22336(abstractC23041, 0, abstractC16466))) {
            if (abstractC23041 == null) {
                if (abstractC16466 == null) {
                    c23936.m52719(-2);
                    return;
                } else if (abstractC16466.mo27960()) {
                    c23936.m52719(-1);
                    return;
                }
            }
            if (abstractC23041 instanceof C9412) {
                if (abstractC16466 == null) {
                    c23936.m52719(-2);
                    return;
                }
                if (abstractC16466.mo27960()) {
                    c23936.m52719(-1);
                    return;
                }
                if (abstractC16466 != C21198.f68319) {
                    boolean z = bitSet.get(abstractC23041.f74154);
                    try {
                        bitSet.clear(abstractC23041.f74154);
                        for (int i2 = 0; i2 < abstractC16466.mo21317(); i2++) {
                            m23637((AbstractC23041) c21631.f69449.get(abstractC16466.mo21316(i2)), abstractC16466.mo21315(i2), c23936, hashSet, bitSet);
                        }
                        if (z) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (z) {
                            bitSet.set(abstractC23041.f74154);
                        }
                    }
                }
            }
            int size = abstractC23041.f74151.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC12938 m51211 = abstractC23041.m51211(i3);
                if (m51211.getClass() == C8706.class) {
                    C8706 c87062 = (C8706) m51211;
                    if (!bitSet.get(c87062.f38806.f74154)) {
                        C8000 m21314 = C8000.m21314(abstractC16466, c87062.f26506.f74153);
                        try {
                            bitSet.set(((C8706) m51211).f38806.f74154);
                            c8706 = c87062;
                            try {
                                m23637(m51211.f38806, m21314, c23936, hashSet, bitSet);
                                bitSet.clear(c8706.f38806.f74154);
                            } catch (Throwable th) {
                                th = th;
                                bitSet.clear(c8706.f38806.f74154);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c8706 = c87062;
                        }
                    }
                } else if (m51211 instanceof AbstractC7519) {
                    m23637(m51211.f38806, abstractC16466, c23936, hashSet, bitSet);
                } else if (m51211.mo5546()) {
                    m23637(m51211.f38806, abstractC16466, c23936, hashSet, bitSet);
                } else {
                    if (m51211.getClass() == C12233.class) {
                        C23936 c239362 = new C23936(new int[0]);
                        c239362.m52720(1, i);
                        c23936.m52721(c239362);
                    } else {
                        C23936 mo3365 = m51211.mo3365();
                        if (mo3365 != null) {
                            if (m51211 instanceof C12730) {
                                C23936 c239363 = new C23936(new int[0]);
                                c239363.m52720(1, i);
                                if (c239363.m52722()) {
                                    m52716 = null;
                                } else if (mo3365.m52722()) {
                                    mo3365 = new C23936(c239363);
                                } else {
                                    m52716 = C23936.m52716(c239363, mo3365);
                                }
                                mo3365 = m52716;
                            }
                            c23936.m52721(mo3365);
                        }
                    }
                }
            }
        }
    }
}
