package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.zip.CRC32;

/* compiled from: H1VX */
/* renamed from: l.۫ܿᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12557 extends AbstractC13262 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f37858;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f37859;

    public C12557(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402) {
        this.f37859 = abstractC15440;
        this.f37858 = abstractC154402;
    }

    @Override // l.AbstractC13262
    /* renamed from: ۘ */
    public final String mo10324() {
        return this.f37858.m36517();
    }

    @Override // l.AbstractC13262
    /* renamed from: ۜ */
    public final byte[] mo10325() {
        return this.f37859.m36506();
    }

    @Override // l.AbstractC13262
    /* renamed from: ᩷ */
    public final byte[] mo10326() {
        return this.f37858.m36506();
    }

    @Override // l.AbstractC13262
    /* renamed from: ۖ */
    public final String mo14002() {
        return this.f37858.getName() + "\n" + this.f37859.getName();
    }

    @Override // l.AbstractC13262
    /* renamed from: ۢ */
    public final String mo14004() {
        return this.f37858.getName();
    }

    @Override // l.AbstractC13262
    /* renamed from: ܳ */
    public final String mo14006() {
        return this.f37858.m36517();
    }

    @Override // l.AbstractC13262
    /* renamed from: ֫ */
    public final String mo14001(String str) {
        String concat = str.concat(".pk8");
        AbstractC15440 abstractC15440 = this.f37858;
        AbstractC15440 m36524 = abstractC15440.m36524(concat);
        String concat2 = str.concat(".x509.pem");
        AbstractC15440 abstractC154402 = this.f37859;
        AbstractC15440 m365242 = abstractC154402.m36524(concat2);
        String m39861 = C16999.m39861(abstractC15440, m36524);
        if (m39861 != null) {
            return m39861;
        }
        String m398612 = C16999.m39861(abstractC154402, m365242);
        if (m398612 == null) {
            return null;
        }
        C16999.m39861(m36524, abstractC15440);
        return m398612;
    }

    @Override // l.AbstractC13262
    /* renamed from: ۧ */
    public final void mo14005() {
        this.f37858.mo27929();
        this.f37859.mo27929();
    }

    @Override // l.AbstractC13262
    /* renamed from: ܿ */
    public final String mo14007() {
        return this.f37858.m36517() + ".key";
    }

    @Override // l.AbstractC13262
    /* renamed from: ᩳ */
    public final byte[] mo14008() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] encoded = m32197().getEncoded();
        byte[] encoded2 = m32193().getEncoded();
        CRC32 crc32 = new CRC32();
        crc32.update(encoded);
        crc32.update(encoded2);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(-1395514453);
            dataOutputStream.writeInt(encoded.length);
            dataOutputStream.write(encoded);
            dataOutputStream.writeInt(encoded2.length);
            dataOutputStream.write(encoded2);
            dataOutputStream.writeLong(crc32.getValue());
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
