package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

/* compiled from: A6XJ */
/* renamed from: l.ۖۛ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2354 implements Supplier {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7546;

    public /* synthetic */ C2354(int i) {
        this.f7546 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        C14347 c14347;
        switch (this.f7546) {
            case 0:
                c14347 = ServiceC19288.f60687;
                return c14347;
            default:
                char[] cArr = C14460.f44310;
                try {
                    return MessageDigest.getInstance("SHA-384");
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
