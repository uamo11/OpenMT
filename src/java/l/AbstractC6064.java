package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: 3ANU */
/* renamed from: l.ۛ۫᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC6064 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17168 f18578 = new C17168();
    public volatile /* synthetic */ Object onCloseHandler = null;

    static {
        AtomicReferenceFieldUpdater.newUpdater(AbstractC6064.class, Object.class, "onCloseHandler");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo16919() {
        return "";
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17168 m16922() {
        return this.f18578;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo16918(C17473 c17473) {
        InterfaceC6709 m16924;
        do {
            m16924 = m16924();
            if (m16924 == null) {
                return C10298.f31022;
            }
        } while (m16924.mo13623(c17473) == null);
        m16924.mo13621(c17473);
        return m16924.mo18267();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17998 m16921() {
        C20697 m47315 = this.f18578.m47315();
        C17998 c17998 = m47315 instanceof C17998 ? (C17998) m47315 : null;
        if (c17998 == null) {
            return null;
        }
        m16917(c17998);
        return c17998;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m16920(C17473 c17473) {
        C10943 c10943;
        Object mo16918 = mo16918(c17473);
        if (mo16918 == C10298.f31023) {
            return C8058.f24861;
        }
        if (mo16918 == C10298.f31022) {
            C17998 m16921 = m16921();
            if (m16921 != null) {
                m16917(m16921);
                return new C1770(new C14469("Channel was closed"));
            }
            c10943 = C16586.f50984;
            return c10943;
        }
        if (!(mo16918 instanceof C17998)) {
            throw new IllegalStateException(("trySend returned " + mo16918).toString());
        }
        m16917((C17998) mo16918);
        return new C1770(new C14469("Channel was closed"));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC20821 m16923() {
        C20697 c20697;
        C20697 m47311;
        while (true) {
            C17168 c17168 = this.f18578;
            c20697 = (C20697) c17168.m47316();
            if (c20697 != c17168 && (c20697 instanceof AbstractC20821)) {
                if (((((AbstractC20821) c20697) instanceof C17998) && !c20697.mo40262()) || (m47311 = c20697.m47311()) == null) {
                    break;
                }
                m47311.m47313();
            }
        }
        c20697 = null;
        return (AbstractC20821) c20697;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.᩷ۛ᩵] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6709 m16924() {
        ?? r1;
        C20697 m47311;
        while (true) {
            C17168 c17168 = this.f18578;
            r1 = (C20697) c17168.m47316();
            if (r1 != c17168 && (r1 instanceof InterfaceC6709)) {
                if (((((InterfaceC6709) r1) instanceof C17998) && !r1.mo40262()) || (m47311 = r1.m47311()) == null) {
                    break;
                }
                m47311.m47313();
            }
        }
        r1 = 0;
        return (InterfaceC6709) r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16917(C17998 c17998) {
        ArrayList arrayList = 0;
        while (true) {
            C20697 m47315 = c17998.m47315();
            AbstractC23642 abstractC23642 = m47315 instanceof AbstractC23642 ? (AbstractC23642) m47315 : null;
            if (abstractC23642 == null) {
                break;
            }
            if (abstractC23642.m47311() != null) {
                abstractC23642.m47314();
            } else if (arrayList == 0) {
                arrayList = abstractC23642;
            } else if (arrayList instanceof ArrayList) {
                arrayList.add(abstractC23642);
            } else {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(arrayList);
                arrayList2.add(abstractC23642);
                arrayList = arrayList2;
            }
        }
        if (arrayList == 0) {
            return;
        }
        if (arrayList instanceof ArrayList) {
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return;
                } else {
                    ((AbstractC23642) arrayList3.get(size)).mo13622(c17998);
                }
            }
        } else {
            ((AbstractC23642) arrayList).mo13622(c17998);
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C11024.m27354(this));
        sb.append('{');
        C20697 c20697 = this.f18578;
        C20697 m47312 = c20697.m47312();
        if (m47312 == c20697) {
            str2 = "EmptyQueue";
        } else {
            if (m47312 instanceof C17998) {
                str = m47312.toString();
            } else if (m47312 instanceof AbstractC23642) {
                str = "ReceiveQueued";
            } else if (m47312 instanceof AbstractC20821) {
                str = "SendQueued";
            } else {
                str = "UNEXPECTED:" + m47312;
            }
            C20697 m47315 = c20697.m47315();
            if (m47315 != m47312) {
                StringBuilder m19190 = C7166.m19190(str, ",queueSize=");
                int i = 0;
                for (C20697 c206972 = (C20697) c20697.m47316(); !C11233.m27802(c206972, c20697); c206972 = c206972.m47312()) {
                    if (c206972 != null) {
                        i++;
                    }
                }
                m19190.append(i);
                str2 = m19190.toString();
                if (m47315 instanceof C17998) {
                    str2 = str2 + ",closedForSend=" + m47315;
                }
            } else {
                str2 = str;
            }
        }
        sb.append(str2);
        sb.append('}');
        sb.append(mo16919());
        return sb.toString();
    }
}
