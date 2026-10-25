package l;

import java.util.Set;

/* compiled from: N673 */
/* renamed from: l.ܳ֨ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14199 extends AbstractC7145 {
    public final String a;
    public final String b;
    public final C9262 c;

    @Override // l.AbstractC7145
    public final String getSeparator() {
        return "/";
    }

    @Override // l.AbstractC7145
    public final boolean isOpen() {
        return true;
    }

    @Override // l.AbstractC7145
    public final boolean isReadOnly() {
        return false;
    }

    @Override // l.AbstractC7145
    public final Set supportedFileAttributeViews() {
        return AbstractC22791.D(new Object[]{"basic"});
    }

    public C14199(C9262 c9262, String str, String str2) {
        this.c = c9262;
        this.a = str;
        this.b = str2;
    }

    @Override // l.AbstractC7145
    public final AbstractC13389 provider() {
        return this.c;
    }

    @Override // l.AbstractC7145, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC7145
    public final Iterable getRootDirectories() {
        return AbstractC22791.B(new Object[]{new C15610(this, "/", this.a, this.b)});
    }

    @Override // l.AbstractC7145
    public final Iterable getFileStores() {
        throw new UnsupportedOperationException("");
    }

    @Override // l.AbstractC7145
    public final InterfaceC20758 getPath(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new C15610(this, str, this.a, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0126, code lost:
    
        r5 = r3;
     */
    @Override // l.AbstractC7145
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC9469 getPathMatcher(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14199.getPathMatcher(java.lang.String):l.ۢ۠ᩴ");
    }

    @Override // l.AbstractC7145
    public final AbstractC12290 getUserPrincipalLookupService() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC7145
    public final InterfaceC5235 newWatchService() {
        throw new UnsupportedOperationException();
    }
}
