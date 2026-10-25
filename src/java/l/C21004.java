package l;

import com.alipay.sdk.m.p.d;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: B1VV */
/* renamed from: l.᩷ܽᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C21004 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return new C1247(258, XMSSKeyParameters.SHA_512, d.a, "SHA512withRSA/PSS", new PSSParameterSpec(XMSSKeyParameters.SHA_512, "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
    }
}
