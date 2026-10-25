package l;

import com.umeng.analytics.pro.cb;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: 27ZX */
/* renamed from: l.֫ۜۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1654 extends C13439 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C16261 f5766;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Hashtable f5767;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f5768;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InputStream f5769;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f5770;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C8087 f5771;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Charset f5772;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f5773;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16261 f5774;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f5775;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C8087 f5777;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C7795 f5779;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f5780;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C19660 f5781;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f5778 = 1;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f5776 = 3;

    @Override // l.AbstractC19791
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo5591() {
    }

    static {
        String str = File.separator;
        char c = File.separatorChar;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5590(boolean z) {
        this.f5768 = z;
    }

    public C1654() {
        String.valueOf(3);
        this.f5767 = null;
        this.f5769 = null;
        this.f5770 = false;
        this.f5772 = StandardCharsets.UTF_8;
        this.f5780 = true;
        this.f5768 = true;
        this.f5779 = new C7795(this);
        this.f63924 = 2097152;
        this.f63913 = 2097152;
        this.f63925 = 32768;
    }

    @Override // l.AbstractC19791
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo5598() {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.f63917.f63667 = pipedOutputStream;
            C2857 c2857 = new C2857(pipedOutputStream, this.f5779.f24090.length * this.f63911);
            this.f63917.f63666 = c2857;
            this.f5769 = c2857;
            C13025 c13025 = new C13025();
            c13025.m46274(true);
            c13025.mo9572(m45497(), this);
            C16261 c16261 = new C16261(this.f63925);
            this.f5774 = c16261;
            this.f5777 = new C8087(c16261);
            C16261 c162612 = new C16261(this.f63911);
            this.f5766 = c162612;
            this.f5771 = new C8087(c162612);
            this.f5777.m21457();
            m5555((byte) 1, 5);
            this.f5774.m38245(3);
            m45497().m19862(this.f5777, this, 9);
            C16261 c162613 = this.f5774;
            c162613.f50018 = 0;
            m5551(0, 9, c162613.f50016);
            int m38250 = c162613.m38250() - 5;
            c162613.m38233();
            int m382502 = c162613.m38250();
            if (m38250 > 262144) {
                throw new C16532(4, "Received message is too long: " + m38250);
            }
            this.f5776 = m382502;
            this.f5767 = new Hashtable();
            if (m38250 > 0) {
                m5564(this.f5774, m38250);
                while (m38250 > 0) {
                    byte[] m38257 = this.f5774.m38257();
                    int length = m38250 - (m38257.length + 4);
                    byte[] m382572 = this.f5774.m38257();
                    m38250 = length - (m382572.length + 4);
                    Hashtable hashtable = this.f5767;
                    int length2 = m38257.length;
                    Charset charset = StandardCharsets.UTF_8;
                    hashtable.put(new String(m38257, 0, length2, charset), new String(m382572, 0, m382572.length, charset));
                }
            }
            if (this.f5767.get("posix-rename@openssh.com") != null && ((String) this.f5767.get("posix-rename@openssh.com")).equals("1")) {
                this.f5770 = true;
            }
            if (this.f5767.get("statvfs@openssh.com") != null) {
                ((String) this.f5767.get("statvfs@openssh.com")).equals("2");
            }
            if (this.f5767.get("hardlink@openssh.com") != null) {
                ((String) this.f5767.get("hardlink@openssh.com")).equals("1");
            }
            new File(".").getCanonicalPath();
        } catch (Exception e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            throw new C12651(e.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m5565(C16261 c16261, C6384 c6384) {
        c16261.f50018 = 0;
        m5551(0, 9, c16261.f50016);
        c6384.f19747 = c16261.m38250() - 5;
        c6384.f19749 = c16261.m38233() & 255;
        c6384.f19748 = c16261.m38250();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        return new l.C12734(r4, r4.f5774.m38257(), new long[]{0});
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.OutputStream m5592(java.lang.String r5) {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.f5769     // Catch: java.lang.Exception -> L8b
            l.ۖ᩻ۘ r0 = (l.C2857) r0     // Catch: java.lang.Exception -> L8b
            r0.m8744()     // Catch: java.lang.Exception -> L8b
            java.lang.String r5 = r4.m5573(r5)     // Catch: java.lang.Exception -> L8b
            java.lang.String r5 = r4.m5582(r5)     // Catch: java.lang.Exception -> L8b
            boolean r0 = r4.m5572(r5)     // Catch: java.lang.Exception -> L8b
            r1 = 4
            if (r0 != 0) goto L74
            java.nio.charset.Charset r0 = r4.f5772     // Catch: java.lang.Exception -> L8b
            byte[] r5 = l.C19356.m44592(r5, r0)     // Catch: java.lang.Exception -> L8b
            r0 = 26
            r4.m5556(r0, r5)     // Catch: java.lang.Exception -> L8b
            l.ܺ᩻ۘ r5 = r4.f5774     // Catch: java.lang.Exception -> L8b
            r0 = 0
            r5.f50018 = r0     // Catch: java.lang.Exception -> L8b
            byte[] r2 = r5.f50016     // Catch: java.lang.Exception -> L8b
            r3 = 9
            r4.m5551(r0, r3, r2)     // Catch: java.lang.Exception -> L8b
            int r2 = r5.m38250()     // Catch: java.lang.Exception -> L8b
            int r2 = r2 + (-5)
            int r3 = r5.m38233()     // Catch: java.lang.Exception -> L8b
            r3 = r3 & 255(0xff, float:3.57E-43)
            r5.m38250()     // Catch: java.lang.Exception -> L8b
            l.ܺ᩻ۘ r5 = r4.f5774     // Catch: java.lang.Exception -> L8b
            r4.m5564(r5, r2)     // Catch: java.lang.Exception -> L8b
            r5 = 101(0x65, float:1.42E-43)
            if (r3 == r5) goto L52
            r2 = 102(0x66, float:1.43E-43)
            if (r3 != r2) goto L4a
            goto L52
        L4a:
            l.ܽۡۘ r5 = new l.ܽۡۘ     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = ""
            r5.<init>(r1, r0)     // Catch: java.lang.Exception -> L8b
            throw r5     // Catch: java.lang.Exception -> L8b
        L52:
            if (r3 == r5) goto L67
            l.ܺ᩻ۘ r5 = r4.f5774     // Catch: java.lang.Exception -> L8b
            byte[] r5 = r5.m38257()     // Catch: java.lang.Exception -> L8b
            r1 = 1
            long[] r1 = new long[r1]     // Catch: java.lang.Exception -> L8b
            r2 = 0
            r1[r0] = r2     // Catch: java.lang.Exception -> L8b
            l.۫᩻ۘ r0 = new l.۫᩻ۘ     // Catch: java.lang.Exception -> L8b
            r0.<init>(r4, r5, r1)     // Catch: java.lang.Exception -> L8b
            return r0
        L67:
            l.ܺ᩻ۘ r5 = r4.f5774     // Catch: java.lang.Exception -> L8b
            int r5 = r5.m38250()     // Catch: java.lang.Exception -> L8b
            l.ܺ᩻ۘ r0 = r4.f5774     // Catch: java.lang.Exception -> L8b
            r4.m5575(r0, r5)     // Catch: java.lang.Exception -> L8b
            r5 = 0
            throw r5     // Catch: java.lang.Exception -> L8b
        L74:
            l.ܽۡۘ r0 = new l.ܽۡۘ     // Catch: java.lang.Exception -> L8b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8b
            r2.<init>()     // Catch: java.lang.Exception -> L8b
            r2.append(r5)     // Catch: java.lang.Exception -> L8b
            java.lang.String r5 = " is a directory"
            r2.append(r5)     // Catch: java.lang.Exception -> L8b
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L8b
            r0.<init>(r1, r5)     // Catch: java.lang.Exception -> L8b
            throw r0     // Catch: java.lang.Exception -> L8b
        L8b:
            r5 = move-exception
            boolean r0 = r5 instanceof l.C16532
            if (r0 == 0) goto L93
            l.ܽۡۘ r5 = (l.C16532) r5
            throw r5
        L93:
            l.ܽۡۘ r0 = new l.ܽۡۘ
            java.lang.String r1 = r5.toString()
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1654.m5592(java.lang.String):java.io.OutputStream");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r6 = r3.f5774.m38257();
        r1 = r3.f5779;
        r1.f24088 = 0;
        r1.f24089 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        return new l.C10618(r3, r4, r6);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream m5585(long r4, java.lang.String r6) {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f5769     // Catch: java.lang.Exception -> L6f
            l.ۖ᩻ۘ r0 = (l.C2857) r0     // Catch: java.lang.Exception -> L6f
            r0.m8744()     // Catch: java.lang.Exception -> L6f
            java.lang.String r6 = r3.m5573(r6)     // Catch: java.lang.Exception -> L6f
            java.lang.String r6 = r3.m5582(r6)     // Catch: java.lang.Exception -> L6f
            java.nio.charset.Charset r0 = r3.f5772     // Catch: java.lang.Exception -> L6f
            byte[] r6 = l.C19356.m44592(r6, r0)     // Catch: java.lang.Exception -> L6f
            r3.m5553(r6)     // Catch: java.lang.Exception -> L6f
            r0 = 1
            r3.m5556(r0, r6)     // Catch: java.lang.Exception -> L6f
            l.ܺ᩻ۘ r6 = r3.f5774     // Catch: java.lang.Exception -> L6f
            r0 = 0
            r6.f50018 = r0     // Catch: java.lang.Exception -> L6f
            byte[] r1 = r6.f50016     // Catch: java.lang.Exception -> L6f
            r2 = 9
            r3.m5551(r0, r2, r1)     // Catch: java.lang.Exception -> L6f
            int r1 = r6.m38250()     // Catch: java.lang.Exception -> L6f
            int r1 = r1 + (-5)
            int r2 = r6.m38233()     // Catch: java.lang.Exception -> L6f
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6.m38250()     // Catch: java.lang.Exception -> L6f
            l.ܺ᩻ۘ r6 = r3.f5774     // Catch: java.lang.Exception -> L6f
            r3.m5564(r6, r1)     // Catch: java.lang.Exception -> L6f
            r6 = 101(0x65, float:1.42E-43)
            if (r2 == r6) goto L4e
            r1 = 102(0x66, float:1.43E-43)
            if (r2 != r1) goto L45
            goto L4e
        L45:
            l.ܽۡۘ r4 = new l.ܽۡۘ     // Catch: java.lang.Exception -> L6f
            java.lang.String r5 = ""
            r6 = 4
            r4.<init>(r6, r5)     // Catch: java.lang.Exception -> L6f
            throw r4     // Catch: java.lang.Exception -> L6f
        L4e:
            if (r2 == r6) goto L62
            l.ܺ᩻ۘ r6 = r3.f5774     // Catch: java.lang.Exception -> L6f
            byte[] r6 = r6.m38257()     // Catch: java.lang.Exception -> L6f
            l.۟᩻ۘ r1 = r3.f5779     // Catch: java.lang.Exception -> L6f
            r1.f24088 = r0     // Catch: java.lang.Exception -> L6f
            r1.f24089 = r0     // Catch: java.lang.Exception -> L6f
            l.ۤ᩻ۘ r0 = new l.ۤ᩻ۘ     // Catch: java.lang.Exception -> L6f
            r0.<init>(r3, r4, r6)     // Catch: java.lang.Exception -> L6f
            return r0
        L62:
            l.ܺ᩻ۘ r4 = r3.f5774     // Catch: java.lang.Exception -> L6f
            int r4 = r4.m38250()     // Catch: java.lang.Exception -> L6f
            l.ܺ᩻ۘ r5 = r3.f5774     // Catch: java.lang.Exception -> L6f
            r3.m5575(r5, r4)     // Catch: java.lang.Exception -> L6f
            r4 = 0
            throw r4     // Catch: java.lang.Exception -> L6f
        L6f:
            r4 = move-exception
            boolean r5 = r4 instanceof l.C16532
            if (r5 == 0) goto L77
            l.ܽۡۘ r4 = (l.C16532) r4
            throw r4
        L77:
            l.ܽۡۘ r5 = new l.ܽۡۘ
            java.lang.String r6 = r4.toString()
            r5.<init>(r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1654.m5585(long, java.lang.String):java.io.InputStream");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00be, code lost:
    
        m5564(r16.f5774, r12);
        r2 = r16.f5774.m38250();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c9, code lost:
    
        if (r2 != r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cb, code lost:
    
        m5566(r7, r10);
        m5569((int[]) r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d2, code lost:
    
        m5575(r16.f5774, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d7, code lost:
    
        throw r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Vector m5586(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1654.m5586(java.lang.String):java.util.Vector");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m5595(String str) {
        try {
            if (this.f5776 < 3) {
                throw new C16532(8, "The remote sshd is too old to support symlink operation.");
            }
            ((C2857) this.f5769).m8744();
            m5566(C19356.m44592(m5582(m5573(str)), this.f5772), (byte) 19);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int m38250 = c16261.m38250() - 5;
            int m38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, m38250);
            if (m38233 != 101 && m38233 != 104) {
                throw new C16532(4, "");
            }
            byte[] bArr = null;
            if (m38233 == 104) {
                int m382502 = this.f5774.m38250();
                for (int i = 0; i < m382502; i++) {
                    bArr = this.f5774.m38257();
                    if (this.f5776 <= 3) {
                        this.f5774.m38257();
                    }
                    C1716.m5757(this.f5774);
                }
                return new String(bArr, 0, bArr.length, this.f5772);
            }
            m5575(this.f5774, this.f5774.m38250());
            throw null;
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5587(String str, String str2) {
        String m44600;
        if (this.f5776 < 2) {
            throw new C16532(8, "The remote sshd is too old to support rename operation.");
        }
        try {
            ((C2857) this.f5769).m8744();
            String m5573 = m5573(str);
            String m55732 = m5573(str2);
            String m5582 = m5582(m5573);
            Vector m5583 = m5583(m55732);
            int size = m5583.size();
            if (size >= 2) {
                throw new C16532(4, m5583.toString());
            }
            if (size == 1) {
                m44600 = (String) m5583.elementAt(0);
            } else {
                if (m5570(m55732, (byte[][]) null)) {
                    throw new C16532(4, m55732);
                }
                m44600 = C19356.m44600(m55732);
            }
            m5568(C19356.m44592(m5582, this.f5772), C19356.m44592(m44600, this.f5772));
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int m38250 = c16261.m38250() - 5;
            int m38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, m38250);
            if (m38233 != 101) {
                throw new C16532(4, "");
            }
            int m382502 = this.f5774.m38250();
            if (m382502 == 0) {
                return;
            }
            m5575(this.f5774, m382502);
            throw null;
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m5597(String str) {
        try {
            ((C2857) this.f5769).m8744();
            Vector m5583 = m5583(m5573(str));
            int size = m5583.size();
            for (int i = 0; i < size; i++) {
                m5566(C19356.m44592((String) m5583.elementAt(i), this.f5772), cb.k);
                C16261 c16261 = this.f5774;
                c16261.f50018 = 0;
                m5551(0, 9, c16261.f50016);
                int m38250 = c16261.m38250() - 5;
                int m38233 = c16261.m38233() & 255;
                c16261.m38250();
                m5564(this.f5774, m38250);
                if (m38233 != 101) {
                    throw new C16532(4, "");
                }
                int m382502 = this.f5774.m38250();
                if (m382502 != 0) {
                    m5575(this.f5774, m382502);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m5572(String str) {
        int m38233;
        try {
            m5566(C19356.m44592(str, this.f5772), (byte) 17);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int m38250 = c16261.m38250() - 5;
            m38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, m38250);
        } catch (Exception unused) {
        }
        if (m38233 != 105) {
            return false;
        }
        return C1716.m5757(this.f5774).m5764();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m5596(String str) {
        try {
            ((C2857) this.f5769).m8744();
            Vector m5583 = m5583(m5573(str));
            int size = m5583.size();
            for (int i = 0; i < size; i++) {
                m5566(C19356.m44592((String) m5583.elementAt(i), this.f5772), (byte) 15);
                C16261 c16261 = this.f5774;
                c16261.f50018 = 0;
                m5551(0, 9, c16261.f50016);
                int m38250 = c16261.m38250() - 5;
                int m38233 = c16261.m38233() & 255;
                c16261.m38250();
                m5564(this.f5774, m38250);
                if (m38233 != 101) {
                    throw new C16532(4, "");
                }
                int m382502 = this.f5774.m38250();
                if (m382502 != 0) {
                    m5575(this.f5774, m382502);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5588(String str, C1716 c1716) {
        try {
            ((C2857) this.f5769).m8744();
            m5567(C19356.m44592(m5573(str), this.f5772), c1716);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int m38250 = c16261.m38250() - 5;
            int m38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, m38250);
            if (m38233 != 101) {
                throw new C16532(4, "");
            }
            int m382502 = this.f5774.m38250();
            if (m382502 == 0) {
                return;
            }
            m5575(this.f5774, m382502);
            throw null;
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1716 m5594(String str) {
        try {
            ((C2857) this.f5769).m8744();
            return m5553(C19356.m44592(m5582(m5573(str)), this.f5772));
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private byte[] m5571() {
        Charset charset = this.f5772;
        byte[] bArr = C19356.f62660;
        m5566("".getBytes(charset), (byte) 16);
        C16261 c16261 = this.f5774;
        c16261.f50018 = 0;
        m5551(0, 9, c16261.f50016);
        int m38250 = c16261.m38250() - 5;
        int m38233 = c16261.m38233() & 255;
        c16261.m38250();
        m5564(this.f5774, m38250);
        if (m38233 != 101 && m38233 != 104) {
            throw new C16532(4, "");
        }
        byte[] bArr2 = null;
        if (m38233 == 101) {
            m5575(this.f5774, this.f5774.m38250());
            throw null;
        }
        int m382502 = this.f5774.m38250();
        while (true) {
            int i = m382502 - 1;
            if (m382502 <= 0) {
                return bArr2;
            }
            bArr2 = this.f5774.m38257();
            if (this.f5776 <= 3) {
                this.f5774.m38257();
            }
            C1716.m5757(this.f5774);
            m382502 = i;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5593(String str, C1716 c1716) {
        try {
            ((C2857) this.f5769).m8744();
            Vector m5583 = m5583(m5573(str));
            int size = m5583.size();
            for (int i = 0; i < size; i++) {
                m5579((String) m5583.elementAt(i), c1716);
            }
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m5579(String str, C1716 c1716) {
        try {
            m5576(C19356.m44592(str, this.f5772), c1716);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int m38250 = c16261.m38250() - 5;
            int m38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, m38250);
            if (m38233 != 101) {
                throw new C16532(4, "");
            }
            int m382502 = this.f5774.m38250();
            if (m382502 == 0) {
                return;
            }
            m5575(this.f5774, m382502);
            throw null;
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m5584() {
        if (this.f5775 == null) {
            try {
                ((C2857) this.f5769).m8744();
                byte[] m5571 = m5571();
                this.f5775 = new String(m5571, 0, m5571.length, this.f5772);
            } catch (Exception e) {
                if (e instanceof C16532) {
                    throw ((C16532) e);
                }
                throw new C16532(e.toString(), e);
            }
        }
        return this.f5775;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m5569(int[] iArr, C6384 c6384) {
        m5565(this.f5774, c6384);
        int i = c6384.f19747;
        int i2 = c6384.f19749;
        if (iArr != null) {
            iArr[0] = c6384.f19748;
        }
        m5564(this.f5774, i);
        if (i2 != 101) {
            throw new C16532(4, "");
        }
        int m38250 = this.f5774.m38250();
        if (m38250 == 0) {
            return;
        }
        m5575(this.f5774, m38250);
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C1716 m5553(byte[] bArr) {
        try {
            m5566(bArr, (byte) 17);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int m38250 = c16261.m38250() - 5;
            int m38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, m38250);
            if (m38233 == 105) {
                return C1716.m5757(this.f5774);
            }
            if (m38233 == 101) {
                m5575(this.f5774, this.f5774.m38250());
                throw null;
            }
            throw new C16532(4, "");
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5576(byte[] bArr, C1716 c1716) {
        this.f5777.m21457();
        m5555((byte) 9, bArr.length + 9 + c1716.m5766());
        C16261 c16261 = this.f5774;
        int i = this.f5778;
        this.f5778 = i + 1;
        c16261.m38245(i);
        C16261 c162612 = this.f5774;
        c162612.getClass();
        c162612.m38252(0, bArr.length, bArr);
        c1716.m5762(this.f5774);
        m45497().m19862(this.f5777, this, bArr.length + 9 + c1716.m5766() + 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5567(byte[] bArr, C1716 c1716) {
        this.f5777.m21457();
        m5555(cb.f77931l, bArr.length + 9 + c1716.m5766());
        C16261 c16261 = this.f5774;
        int i = this.f5778;
        this.f5778 = i + 1;
        c16261.m38245(i);
        C16261 c162612 = this.f5774;
        c162612.getClass();
        c162612.m38252(0, bArr.length, bArr);
        c1716.m5762(this.f5774);
        m45497().m19862(this.f5777, this, bArr.length + 9 + c1716.m5766() + 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5568(byte[] bArr, byte[] bArr2) {
        String str = this.f5770 ? "posix-rename@openssh.com" : null;
        this.f5777.m21457();
        int length = bArr.length + 13 + bArr2.length;
        if (str == null) {
            m5555((byte) 18, length);
            C16261 c16261 = this.f5774;
            int i = this.f5778;
            this.f5778 = i + 1;
            c16261.m38245(i);
        } else {
            length += str.length() + 4;
            m5555((byte) -56, length);
            C16261 c162612 = this.f5774;
            int i2 = this.f5778;
            this.f5778 = i2 + 1;
            c162612.m38245(i2);
            C16261 c162613 = this.f5774;
            byte[] bArr3 = C19356.f62660;
            c162613.m38256(str.getBytes(StandardCharsets.UTF_8));
        }
        C16261 c162614 = this.f5774;
        c162614.getClass();
        c162614.m38252(0, bArr.length, bArr);
        C16261 c162615 = this.f5774;
        c162615.getClass();
        c162615.m38252(0, bArr2.length, bArr2);
        m45497().m19862(this.f5777, this, length + 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5562(C1654 c1654, byte[] bArr, C6384 c6384) {
        c1654.m5566(bArr, (byte) 4);
        c1654.m5569((int[]) null, c6384);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5556(int i, byte[] bArr) {
        this.f5777.m21457();
        m5555((byte) 3, bArr.length + 17);
        C16261 c16261 = this.f5774;
        int i2 = this.f5778;
        this.f5778 = i2 + 1;
        c16261.m38245(i2);
        C16261 c162612 = this.f5774;
        c162612.getClass();
        c162612.m38252(0, bArr.length, bArr);
        this.f5774.m38245(i);
        this.f5774.m38245(0);
        m45497().m19862(this.f5777, this, bArr.length + 21);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5566(byte[] bArr, byte b) {
        this.f5777.m21457();
        int length = bArr.length;
        m5555(b, length + 9);
        C16261 c16261 = this.f5774;
        int i = this.f5778;
        this.f5778 = i + 1;
        c16261.m38245(i);
        C16261 c162612 = this.f5774;
        c162612.getClass();
        c162612.m38252(0, bArr.length, bArr);
        m45497().m19862(this.f5777, this, length + 13);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5552(C1654 c1654, byte[] bArr, long j, byte[] bArr2, int i, int i2) {
        c1654.f5771.m21457();
        C7381 m45497 = c1654.m45497();
        int m19874 = m45497.m19874();
        C16261 c16261 = c1654.f5766;
        byte[] bArr3 = c16261.f50016;
        int length = bArr3.length;
        int i3 = c16261.f50017 + 34;
        if (length < C19373.m44633(i3, bArr.length, i2, m19874)) {
            i2 = bArr3.length - ((i3 + bArr.length) + m19874);
        }
        int length2 = bArr.length + 21 + i2;
        c16261.m38234((byte) 94);
        c16261.m38245(c1654.f63918);
        c16261.m38245(length2 + 4);
        c16261.m38245(length2);
        c16261.m38234((byte) 6);
        C16261 c162612 = c1654.f5766;
        int i4 = c1654.f5778;
        c1654.f5778 = i4 + 1;
        c162612.m38245(i4);
        C16261 c162613 = c1654.f5766;
        c162613.getClass();
        c162613.m38252(0, bArr.length, bArr);
        c1654.f5766.m38237(j);
        C16261 c162614 = c1654.f5766;
        if (c162614.f50016 != bArr2) {
            c162614.m38252(i, i2, bArr2);
        } else {
            c162614.m38245(i2);
            c1654.f5766.m38251(i2);
        }
        m45497.m19862(c1654.f5771, c1654, C19373.m44633(bArr.length, 21, i2, 4));
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5561(C1654 c1654, byte[] bArr, long j, int i, C7795 c7795) {
        c1654.f5777.m21457();
        c1654.m5555((byte) 5, bArr.length + 21);
        C16261 c16261 = c1654.f5774;
        int i2 = c1654.f5778;
        c1654.f5778 = i2 + 1;
        c16261.m38245(i2);
        C16261 c162612 = c1654.f5774;
        c162612.getClass();
        c162612.m38252(0, bArr.length, bArr);
        c1654.f5774.m38237(j);
        c1654.f5774.m38245(i);
        c1654.m45497().m19862(c1654.f5777, c1654, bArr.length + 25);
        if (c7795 != null) {
            int i3 = c1654.f5778 - 1;
            int i4 = c7795.f24088;
            if (i4 == 0) {
                c7795.f24089 = 0;
            }
            int i5 = c7795.f24089 + i4;
            C14144[] c14144Arr = c7795.f24090;
            if (i5 >= c14144Arr.length) {
                i5 -= c14144Arr.length;
            }
            C14144 c14144 = c14144Arr[i5];
            c14144.f42689 = i3;
            c14144.f42691 = j;
            c14144.f42690 = i;
            c7795.f24088 = i4 + 1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5555(byte b, int i) {
        C16261 c16261 = this.f5774;
        c16261.m38234((byte) 94);
        c16261.m38245(this.f63918);
        c16261.m38245(i + 4);
        c16261.m38245(i);
        c16261.m38234(b);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private Vector m5583(String str) {
        byte[] bArr;
        String str2;
        Vector vector = new Vector();
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf < 0) {
            vector.addElement(C19356.m44600(str));
            return vector;
        }
        String substring = str.substring(0, lastIndexOf == 0 ? 1 : lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        String m44600 = C19356.m44600(substring);
        byte[][] bArr2 = new byte[1][];
        if (!m5570(substring2, bArr2)) {
            if (!m44600.equals("/")) {
                m44600 = m44600.concat("/");
            }
            StringBuilder m15339 = C5368.m15339(m44600);
            m15339.append(C19356.m44600(substring2));
            vector.addElement(m15339.toString());
            return vector;
        }
        byte[] bArr3 = bArr2[0];
        m5566(C19356.m44592(m44600, this.f5772), (byte) 11);
        C6384 c6384 = new C6384();
        m5565(this.f5774, c6384);
        int i = c6384.f19747;
        int i2 = c6384.f19749;
        m5564(this.f5774, i);
        byte b = 4;
        int i3 = 101;
        if (i2 != 101 && i2 != 102) {
            throw new C16532(4, "");
        }
        int[] iArr = null;
        if (i2 == 101) {
            m5575(this.f5774, this.f5774.m38250());
            throw null;
        }
        byte[] m38257 = this.f5774.m38257();
        String str3 = null;
        while (true) {
            m5566(m38257, (byte) 12);
            m5565(this.f5774, c6384);
            int i4 = c6384.f19747;
            int i5 = c6384.f19749;
            if (i5 != i3 && i5 != 104) {
                throw new C16532(b, "");
            }
            if (i5 == i3) {
                m5564(this.f5774, i4);
                m5566(m38257, b);
                m5569(iArr, c6384);
                return vector;
            }
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, b, c16261.f50016);
            int i6 = i4 - 4;
            this.f5774.m38242();
            for (int m38250 = this.f5774.m38250(); m38250 > 0; m38250--) {
                if (i6 > 0) {
                    C16261 c162612 = this.f5774;
                    int i7 = c162612.f50018;
                    if (i7 != 0) {
                        byte[] bArr4 = c162612.f50016;
                        System.arraycopy(bArr4, i7, bArr4, 0, c162612.f50017 - i7);
                        c162612.f50017 -= c162612.f50018;
                        c162612.f50018 = 0;
                    }
                    C16261 c162613 = this.f5774;
                    byte[] bArr5 = c162613.f50016;
                    int length = bArr5.length;
                    int i8 = c162613.f50017;
                    int read = this.f5769.read(bArr5, i8, length > i8 + i6 ? i6 : bArr5.length - i8);
                    if (read <= 0) {
                        break;
                    }
                    this.f5774.f50017 += read;
                    i6 -= read;
                }
                byte[] m382572 = this.f5774.m38257();
                if (this.f5776 <= 3) {
                    this.f5774.m38257();
                }
                C1716.m5757(this.f5774);
                if (this.f5780) {
                    bArr = m382572;
                    str2 = null;
                } else {
                    str2 = new String(m382572, 0, m382572.length, this.f5772);
                    bArr = str2.getBytes(StandardCharsets.UTF_8);
                }
                if (C19356.m44602(bArr3, bArr)) {
                    if (str2 == null) {
                        str2 = new String(m382572, 0, m382572.length, this.f5772);
                    }
                    if (str3 == null) {
                        str3 = !m44600.endsWith("/") ? m44600.concat("/") : m44600;
                    }
                    vector.addElement(str3 + str2);
                }
            }
            b = 4;
            i3 = 101;
            iArr = null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5575(C16261 c16261, int i) {
        if (this.f5776 >= 3 && c16261.m38255() >= 4) {
            byte[] m38257 = c16261.m38257();
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArr = C19356.f62660;
            throw new C16532(i, new String(m38257, 0, m38257.length, charset));
        }
        throw new C16532(i, "Failure");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5570(String str, byte[][] bArr) {
        int i;
        byte[] m44592 = C19356.m44592(str, StandardCharsets.UTF_8);
        if (bArr != null) {
            bArr[0] = m44592;
        }
        int length = m44592.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = m44592[i2];
            if (b == 42 || b == 63) {
                return true;
            }
            if (b == 92 && (i = i2 + 1) < length) {
                i2 = i;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m5564(C16261 c16261, int i) {
        c16261.m38242();
        m5551(0, i, c16261.f50016);
        c16261.m38251(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m5551(int i, int i2, byte[] bArr) {
        int i3 = i;
        while (i2 > 0) {
            int read = this.f5769.read(bArr, i3, i2);
            if (read <= 0) {
                throw new IOException("inputstream is closed");
            }
            i3 += read;
            i2 -= read;
        }
        return i3 - i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5557(C1654 c1654, long j) {
        while (j > 0) {
            long skip = c1654.f5769.skip(j);
            if (skip <= 0) {
                return;
            } else {
                j -= skip;
            }
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private String m5573(String str) {
        if (str.charAt(0) == '/') {
            return str;
        }
        if (this.f5773 == null) {
            this.f5773 = m5584();
        }
        String str2 = this.f5773;
        return str2.endsWith("/") ? str2.concat(str) : C22870.m50967(str2, "/", str);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m5582(String str) {
        Vector m5583 = m5583(str);
        if (m5583.size() == 1) {
            return (String) m5583.elementAt(0);
        }
        StringBuilder m19190 = C7166.m19190(str, " is not unique: ");
        m19190.append(m5583.toString());
        throw new C16532(4, m19190.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5589(Charset charset) {
        this.f5772 = charset;
        this.f5780 = charset.equals(StandardCharsets.UTF_8);
    }
}
