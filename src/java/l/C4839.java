package l;

/* compiled from: 91N0 */
/* renamed from: l.ۙᩴᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4839 {
    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m14083(InterfaceC12600 interfaceC12600, Object obj, Integer num) {
        boolean containsKey = interfaceC12600.containsKey(obj);
        int mo21965 = interfaceC12600.mo21965(num.intValue(), obj);
        if (containsKey) {
            return Integer.valueOf(mo21965);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m14082(InterfaceC12600 interfaceC12600, Object obj, C14450 c14450) {
        int mo21968 = interfaceC12600.mo21968(obj);
        if (mo21968 != 0 || interfaceC12600.containsKey(obj)) {
            return mo21968;
        }
        int mo219682 = c14450.mo21968(obj);
        interfaceC12600.mo21965(mo219682, obj);
        return mo219682;
    }
}
