package l;

/* compiled from: 4BCI */
/* renamed from: l.᩻ۡܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23596 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C23596 f76501 = new C23596();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52070(C3135 c3135, C21480 c21480, C21480 c214802) {
        if (c21480.getType() == C7573.f23413) {
            if (!(c214802.m48637() instanceof C2635)) {
                if ((c21480.m48637() instanceof C2635) && c3135.m9562() == 15) {
                    C2635 c2635 = (C2635) c21480.m48637();
                    c2635.getClass();
                    int mo2231 = c2635.mo2231();
                    return ((short) mo2231) == mo2231;
                }
            } else {
                C2635 c26352 = (C2635) c214802.m48637();
                switch (c3135.m9562()) {
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                        c26352.getClass();
                        int mo22312 = c26352.mo2231();
                        if (((short) mo22312) == mo22312) {
                            return true;
                        }
                        break;
                    case 15:
                        int mo22313 = C2635.m8291(-c26352.mo2231()).mo2231();
                        return ((short) mo22313) == mo22313;
                    case 23:
                    case 24:
                    case 25:
                        c26352.getClass();
                        int mo22314 = c26352.mo2231();
                        if (((byte) mo22314) == mo22314) {
                            return true;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
