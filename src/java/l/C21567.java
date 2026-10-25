package l;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: A8DI */
/* renamed from: l.᩸ۨ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21567 extends FilterOutputStream {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1105[] f69293 = {EnumC1105.BLOCK_INDEPENDENCE};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15215 f69294;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2988 f69295;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f69296;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f69297;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f69298;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f69299;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC2143 f69300;

    public C21567(OutputStream outputStream, EnumC5339 enumC5339, long j, AbstractC2988 abstractC2988, AbstractC2143 abstractC2143, EnumC1105... enumC1105Arr) {
        super(outputStream);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f69297 = allocate.order(byteOrder);
        this.f69294 = null;
        this.f69295 = abstractC2988;
        this.f69300 = abstractC2143;
        C15215 c15215 = new C15215(new C8161(enumC1105Arr), new C0399(enumC5339, 0));
        this.f69294 = c15215;
        int m1893 = c15215.m36006().m1893();
        this.f69296 = m1893;
        this.f69299 = ByteBuffer.allocate(m1893).order(byteOrder);
        abstractC2988.getClass();
        if (m1893 < 0) {
            throw new IllegalArgumentException(C19370.m44628(m1893, "length must be >= 0, got "));
        }
        if (m1893 >= 2113929216) {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
        this.f69298 = new byte[(m1893 / 255) + m1893 + 16];
        C8161 m36008 = c15215.m36008();
        EnumC1105 enumC1105 = EnumC1105.CONTENT_SIZE;
        if (m36008.m21633(enumC1105) && j < 0) {
            throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        }
        ByteBuffer order = ByteBuffer.allocate(15).order(byteOrder);
        order.putInt(407708164);
        order.put(c15215.m36008().m21632());
        order.put(c15215.m36006().m1894());
        if (c15215.m36004(enumC1105)) {
            order.putLong(j);
        }
        order.put((byte) ((abstractC2143.mo7070(order.array(), 4, order.position() - 4) >> 8) & 255));
        ((FilterOutputStream) this).out.write(order.array(), 0, order.position());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21567(java.io.OutputStream r9) {
        /*
            r8 = this;
            l.ۚۨ᩵ r2 = l.EnumC5339.SIZE_4MB
            l.ᩴۨ᩵ r0 = l.C18745.m43393()
            r0.getClass()
            l.C16959.m39782()
            l.֫᩺᩵ r6 = l.C16959.m39783()
            r3 = -1
            l.ۗۘۢ r5 = l.C4633.f14709
            l.֨ۨ᩵[] r7 = l.C21567.f69293
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21567.<init>(java.io.OutputStream):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21567(java.io.OutputStream r9, int r10, long r11) {
        /*
            r8 = this;
            l.ۚۨ᩵ r2 = l.EnumC5339.SIZE_4MB
            r0 = 1
            if (r10 != r0) goto Lf
            l.ᩴۨ᩵ r10 = l.C18745.m43393()
            r10.getClass()
            l.ۗۘۢ r10 = l.C4633.f14709
            goto L17
        Lf:
            l.ᩴۨ᩵ r1 = l.C18745.m43393()
            l.ۗۘۢ r10 = r1.m43395(r10)
        L17:
            r5 = r10
            l.C16959.m39782()
            l.֫᩺᩵ r6 = l.C16959.m39783()
            r3 = 0
            r10 = 0
            r1 = 2
            int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r7 >= 0) goto L33
            l.֨ۨ᩵[] r1 = new l.EnumC1105[r1]
            l.֨ۨ᩵ r3 = l.EnumC1105.BLOCK_INDEPENDENCE
            r1[r10] = r3
            l.֨ۨ᩵ r10 = l.EnumC1105.CONTENT_CHECKSUM
            r1[r0] = r10
            r7 = r1
            goto L43
        L33:
            r3 = 3
            l.֨ۨ᩵[] r3 = new l.EnumC1105[r3]
            l.֨ۨ᩵ r4 = l.EnumC1105.BLOCK_INDEPENDENCE
            r3[r10] = r4
            l.֨ۨ᩵ r10 = l.EnumC1105.CONTENT_CHECKSUM
            r3[r0] = r10
            l.֨ۨ᩵ r10 = l.EnumC1105.CONTENT_SIZE
            r3[r1] = r10
            r7 = r3
        L43:
            r0 = r8
            r1 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21567.<init>(java.io.OutputStream, int, long):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48726() {
        int i;
        ByteBuffer byteBuffer = this.f69299;
        if (byteBuffer.position() == 0) {
            return;
        }
        byte[] bArr = this.f69298;
        Arrays.fill(bArr, (byte) 0);
        EnumC1105 enumC1105 = EnumC1105.CONTENT_CHECKSUM;
        C15215 c15215 = this.f69294;
        if (c15215.m36004(enumC1105)) {
            c15215.m36003(byteBuffer.position(), byteBuffer.array());
        }
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position();
        AbstractC2988 abstractC2988 = this.f69295;
        abstractC2988.getClass();
        int mo9121 = abstractC2988.mo9121(position, bArr.length, array, bArr);
        if (mo9121 >= byteBuffer.position()) {
            mo9121 = byteBuffer.position();
            bArr = Arrays.copyOf(byteBuffer.array(), mo9121);
            i = Integer.MIN_VALUE;
        } else {
            i = 0;
        }
        ByteBuffer byteBuffer2 = this.f69297;
        byteBuffer2.putInt(0, i | mo9121);
        ((FilterOutputStream) this).out.write(byteBuffer2.array());
        ((FilterOutputStream) this).out.write(bArr, 0, mo9121);
        if (c15215.m36004(EnumC1105.BLOCK_CHECKSUM)) {
            byteBuffer2.putInt(0, this.f69300.mo7070(bArr, 0, mo9121));
            ((FilterOutputStream) this).out.write(byteBuffer2.array());
        }
        byteBuffer.rewind();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f69294.m36007()) {
            throw new IllegalStateException("The stream is already closed");
        }
        while (true) {
            ByteBuffer byteBuffer = this.f69299;
            if (i2 > byteBuffer.remaining()) {
                int remaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i, remaining);
                m48726();
                i += remaining;
                i2 -= remaining;
            } else {
                byteBuffer.put(bArr, i, i2);
                return;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (!this.f69294.m36007()) {
            m48726();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        if (!this.f69294.m36007()) {
            ByteBuffer byteBuffer = this.f69299;
            if (byteBuffer.position() == this.f69296) {
                m48726();
            }
            byteBuffer.put((byte) i);
            return;
        }
        throw new IllegalStateException("The stream is already closed");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C15215 c15215 = this.f69294;
        if (!c15215.m36007()) {
            flush();
            ByteBuffer byteBuffer = this.f69297;
            byteBuffer.putInt(0, 0);
            ((FilterOutputStream) this).out.write(byteBuffer.array());
            if (c15215.m36004(EnumC1105.CONTENT_CHECKSUM)) {
                byteBuffer.putInt(0, c15215.m36002());
                ((FilterOutputStream) this).out.write(byteBuffer.array());
            }
            c15215.m36005();
        }
        super.close();
    }
}
