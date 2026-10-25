package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataOutputStream;
import java.io.OutputStream;

/* compiled from: A8AG */
/* renamed from: l.ۖۚۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2319 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2844 f7450;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9194 f7451;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7452;

    public C2319(OutputStream outputStream) {
        C9194 c9194 = new C9194(outputStream);
        this.f7451 = c9194;
        this.f7450 = new C2844(new DataOutputStream(c9194));
        this.f7452 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7579(EnumC3730 enumC3730) {
        if (enumC3730 == EnumC3730.ONE) {
            return;
        }
        long m11345 = enumC3730.m11345();
        C9194 c9194 = this.f7451;
        long m23627 = ((~enumC3730.m11345()) & (c9194.m23627() + m11345)) - c9194.m23627();
        while (true) {
            long j = m23627 - 1;
            if (m23627 <= 0) {
                return;
            }
            m7577(0);
            m23627 = j;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7576() {
        int i = this.f7452;
        this.f7452 = i + 4;
        m7581(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7580(byte[] bArr) {
        this.f7450.write(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7577(int i) {
        this.f7450.writeByte(i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7582(int i) {
        this.f7450.writeShort(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7581(int i) {
        this.f7450.writeInt(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7578(String str) {
        this.f7450.writeChars(str);
    }
}
