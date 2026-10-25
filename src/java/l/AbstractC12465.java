package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: U7M7 */
/* renamed from: l.۫ܳ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC12465 implements InterfaceC18278 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37474 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21017 f37475;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37476;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f37477;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC7145 f37473 = C1707.getDefault();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final boolean f37472 = System.getProperty("os.name", "").contains("OS X");

    /* renamed from: ֫ */
    public abstract String mo10092(Collection collection);

    /* renamed from: ֫ */
    public abstract AbstractC12465 mo10093(String str);

    public AbstractC12465(AbstractC21017 abstractC21017, InterfaceC20758 interfaceC20758) {
        C11003.requireNonNull(abstractC21017);
        this.f37475 = abstractC21017;
        if (C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
            throw new IllegalArgumentException("directories not supported");
        }
        this.f37477 = interfaceC20758;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String mo30626() {
        return this.f37477.getFileName().toString();
    }

    @Override // l.InterfaceC18278
    /* renamed from: ֫ */
    public EnumC16866 mo21321() {
        Set set = AbstractC21017.f67841;
        return AbstractC21017.m47830(this.f37477.getFileName().toString());
    }

    @Override // l.InterfaceC18278
    /* renamed from: ֫ */
    public boolean mo21322(String str, EnumC16866 enumC16866) {
        return m30624(this.f37477, str, enumC16866);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (java.text.Normalizer.normalize(r6, r0).equals(r5) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (l.AbstractC21017.m47830(r4.getFileName().toString()) != r6) goto L25;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m30624(l.InterfaceC20758 r4, java.lang.String r5, l.EnumC16866 r6) {
        /*
            l.C11003.requireNonNull(r6)
            l.ܽ᩶۠ r0 = l.EnumC16866.OTHER
            r1 = 0
            if (r6 != r0) goto L19
            java.util.Set r0 = l.AbstractC21017.f67841
            l.᩷۠ᩴ r0 = r4.getFileName()
            java.lang.String r0 = r0.toString()
            l.ܽ᩶۠ r0 = l.AbstractC21017.m47830(r0)
            if (r0 == r6) goto L19
            goto L7a
        L19:
            java.lang.StringBuilder r5 = l.C5368.m15339(r5)
            java.lang.String r6 = r6.f51754
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            l.᩷۠ᩴ r6 = r4.getFileName()
            java.lang.String r6 = r6.toString()
            boolean r0 = r6.equals(r5)
            r2 = 1
            if (r0 == 0) goto L36
            goto L5c
        L36:
            l.۟֨ᩴ r0 = r4.getFileSystem()
            l.۟֨ᩴ r3 = l.AbstractC12465.f37473
            if (r0 != r3) goto L7a
            boolean r0 = l.AbstractC12465.f37472
            if (r0 == 0) goto L5d
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFD
            boolean r0 = java.text.Normalizer.isNormalized(r6, r0)
            if (r0 == 0) goto L5d
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFC
            boolean r3 = java.text.Normalizer.isNormalized(r5, r0)
            if (r3 == 0) goto L5d
            java.lang.String r0 = java.text.Normalizer.normalize(r6, r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L5d
        L5c:
            return r2
        L5d:
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L7a
            l.ܳ۠ᩴ[] r6 = new l.EnumC14406[r2]     // Catch: java.io.IOException -> L7a
            l.ܳ۠ᩴ r0 = l.EnumC14406.NOFOLLOW_LINKS     // Catch: java.io.IOException -> L7a
            r6[r1] = r0     // Catch: java.io.IOException -> L7a
            l.᩷۠ᩴ r4 = r4.toRealPath(r6)     // Catch: java.io.IOException -> L7a
            l.᩷۠ᩴ r4 = r4.getFileName()     // Catch: java.io.IOException -> L7a
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L7a
            boolean r4 = r4.equals(r5)     // Catch: java.io.IOException -> L7a
            return r4
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC12465.m30624(l.᩷۠ᩴ, java.lang.String, l.ܽ᩶۠):boolean");
    }

    @Override // l.InterfaceC7757
    public URI toUri() {
        return this.f37477.toUri();
    }

    @Override // l.InterfaceC7757
    /* renamed from: ۧ */
    public final InputStream mo20795() {
        this.f37475.m47835();
        return C17229.newInputStream(this.f37477, new InterfaceC23579[0]);
    }

    @Override // l.InterfaceC7757
    /* renamed from: ܿ */
    public final OutputStream mo20797() {
        AbstractC21017 abstractC21017 = this.f37475;
        abstractC21017.m47835();
        abstractC21017.f67843.remove(this);
        m30625();
        return C17229.newOutputStream(this.f37477, new InterfaceC23579[0]);
    }

    @Override // l.InterfaceC7757
    /* renamed from: ֫ */
    public final CharSequence mo7388(boolean z) {
        AbstractC21017 abstractC21017 = this.f37475;
        HashMap hashMap = abstractC21017.f67843;
        C6905 c6905 = (C6905) hashMap.get(this);
        CharBuffer charBuffer = null;
        if (c6905 != null) {
            if (c6905.f21314 != mo20798()) {
                hashMap.remove(this);
            } else {
                charBuffer = (CharBuffer) c6905.f21313.get();
            }
        }
        if (charBuffer != null) {
            return charBuffer;
        }
        InputStream mo20795 = mo20795();
        try {
            ByteBuffer m47832 = abstractC21017.m47832(mo20795);
            InterfaceC18278 m7284 = abstractC21017.f67846.m7284(this);
            try {
                CharBuffer m47833 = abstractC21017.m47833(m47832, z);
                abstractC21017.f67846.m7284(m7284);
                abstractC21017.m47834(m47832);
                if (!z) {
                    abstractC21017.f67843.put(this, new C6905(this, m47833));
                }
                mo20795.close();
                return m47833;
            } catch (Throwable th) {
                abstractC21017.f67846.m7284(m7284);
                throw th;
            }
        } catch (Throwable th2) {
            if (mo20795 != null) {
                try {
                    mo20795.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // l.InterfaceC7757
    /* renamed from: ܽ */
    public final Writer mo20796() {
        AbstractC21017 abstractC21017 = this.f37475;
        abstractC21017.m47835();
        abstractC21017.f67843.remove(this);
        m30625();
        return new OutputStreamWriter(C17229.newOutputStream(this.f37477, new InterfaceC23579[0]), abstractC21017.m47831());
    }

    @Override // l.InterfaceC7757
    /* renamed from: ᩳ */
    public final long mo20798() {
        try {
            return C17229.getLastModifiedTime(this.f37477, new EnumC14406[0]).toMillis();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // l.InterfaceC7757
    public final boolean delete() {
        try {
            C17229.delete(this.f37477);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC12465) && this.f37477.equals(((AbstractC12465) obj).f37477);
    }

    public final int hashCode() {
        return this.f37477.hashCode();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f37477 + "]";
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m30625() {
        if (this.f37476) {
            return;
        }
        InterfaceC20758 parent = this.f37477.getParent();
        if (parent != null && !C17229.isDirectory(parent, new EnumC14406[0])) {
            try {
                C17229.createDirectories(parent, new InterfaceC22168[0]);
            } catch (IOException e) {
                throw new IOException("could not create parent directories", e);
            }
        }
        this.f37476 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30623(InterfaceC20758 interfaceC20758) {
        String interfaceC207582 = interfaceC20758.toString();
        String separator = interfaceC20758.getFileSystem().getSeparator();
        int lastIndexOf = interfaceC207582.lastIndexOf(".");
        if (lastIndexOf != -1) {
            interfaceC207582 = interfaceC207582.substring(0, lastIndexOf);
        }
        return interfaceC207582.replace(separator, ".");
    }
}
