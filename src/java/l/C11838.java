package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: S7EN */
/* renamed from: l.ۨܿ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11838 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f35317;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f35318;

    public C11838(String str, InterfaceC20758 interfaceC20758) {
        InterfaceC20758 resolve = interfaceC20758 == null ? C8763.get(str, new String[0]) : interfaceC20758.resolve(str);
        this.f35317 = resolve;
        try {
            this.f35318 = C17229.readAllLines(resolve, StandardCharsets.UTF_8);
        } catch (IOException unused) {
        }
    }
}
