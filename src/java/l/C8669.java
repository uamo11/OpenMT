package l;

import java.io.IOException;

/* compiled from: H89Z */
/* renamed from: l.ۡۚۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8669 extends IOException {
    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "UnmarshalException: ".concat(localizedMessage) : "UnmarshalException";
    }
}
