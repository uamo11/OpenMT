package l;

/* compiled from: B3ZP */
/* renamed from: l.ᩳ᩸۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18320 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 f56962;

    public C18320(C16719 c16719) {
        this.f56962 = c16719;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m42692(AbstractC12612 abstractC12612) {
        C16719 c16719 = this.f56962;
        C14397 m39355 = c16719.m39355();
        long lineNumber = c16719.getLineNumber();
        long m34392 = m39355.m34392(abstractC12612.f16085);
        long m34389 = m39355.m34389(abstractC12612.f16085, false);
        if (m34392 == lineNumber) {
            return String.valueOf(m34389);
        }
        return m34392 + ":" + m34389;
    }
}
