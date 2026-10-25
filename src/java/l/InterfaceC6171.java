package l;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: W4D8 */
/* renamed from: l.ۛܽ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public interface InterfaceC6171 extends InterfaceC1274, ReadableByteChannel {
    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    void skip(long j);

    /* renamed from: ֡֫ */
    String mo12300();

    /* renamed from: ֫ */
    long mo12302(InterfaceC5508 interfaceC5508);

    /* renamed from: ֫ */
    String mo12303(long j);

    /* renamed from: ֫ */
    String mo12304(Charset charset);

    /* renamed from: ۜ */
    C11816 mo12305(long j);

    /* renamed from: ۜۧ */
    byte[] mo12306();

    /* renamed from: ۡܽ */
    InputStream mo12307();

    /* renamed from: ۢۧ */
    boolean mo12308();

    /* renamed from: ۢܽ */
    long mo12309();

    /* renamed from: ۧ */
    boolean mo12311(C11816 c11816);

    /* renamed from: ܽ */
    byte[] mo12312(long j);

    /* renamed from: ܿ */
    void mo12313(long j);

    /* renamed from: ᩵ۧ */
    long mo12314();

    /* renamed from: ᩷ */
    C12521 mo12315();
}
