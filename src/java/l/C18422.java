package l;

import java.io.IOException;

/* compiled from: J8A1 */
/* renamed from: l.ᩴ֨ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18422 extends IOException {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC7462 f57170;

    public C18422(C23670 c23670, String str) {
        super(String.format("%s returned %s (%d/%d): %s", c23670.m52217(), Long.valueOf(c23670.m52202()), Long.valueOf(c23670.m52202()), Long.valueOf(c23670.m52202()), str));
        this.f57170 = EnumC7462.m19988(c23670.m52202());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC7462 m42844() {
        return this.f57170;
    }
}
