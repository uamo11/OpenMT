package l;

/* compiled from: QAY3 */
/* renamed from: l.ᩴۛ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18580 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43107(int i, Throwable th) {
        if ((i & 1) != 0) {
            th = null;
        }
        if (th != null) {
            throw th;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
