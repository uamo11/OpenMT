package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.util.Arrays;

/* compiled from: E9TD */
/* renamed from: l.ۛ֡᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5716 extends AbstractC19031 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11361 f17627;

    public C5716(C11361 c11361) {
        this.f17627 = c11361;
    }

    @Override // l.AbstractC19031
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo16148(Object obj) {
        Long l2 = (Long) obj;
        C11361 c11361 = this.f17627;
        InterfaceC1377 m28114 = C11361.m28114(c11361);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            m28114.seek(l2.longValue() * 102400);
            int mo2559 = m28114.mo2559(bArr);
            return mo2559 == -1 ? new byte[0] : mo2559 != 102400 ? Arrays.copyOf(bArr, mo2559) : bArr;
        } finally {
            C11361.m28115(c11361, m28114);
        }
    }
}
