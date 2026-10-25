package l;

import java.nio.ByteBuffer;

/* compiled from: 05ZP */
/* renamed from: l.ۛܺܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6163 extends C10397 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m17068(int i) {
        ByteBuffer byteBuffer = this.f31272.f15067;
        int i2 = ((int) this.f31273) + i;
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b = byteBuffer.get(i2);
            if (b != 0) {
                sb.append((char) b);
                i2++;
            } else {
                return sb.toString();
            }
        }
    }
}
