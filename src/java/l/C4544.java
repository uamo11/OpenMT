package l;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: N8QS */
/* renamed from: l.ۙۡۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4544 extends AbstractC15126 {
    @Override // l.AbstractC15126
    /* renamed from: ֫ */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        return new C23896(m13350(new C17714(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20067 m13350(C17714 c17714) {
        String m41488 = c17714.m41488();
        m41488.getClass();
        String m414882 = c17714.m41488();
        m414882.getClass();
        return new C20067(m41488, m414882, c17714.m41487(), c17714.m41487(), Arrays.copyOfRange(c17714.m41482(), c17714.m41485(), c17714.m41483()));
    }
}
