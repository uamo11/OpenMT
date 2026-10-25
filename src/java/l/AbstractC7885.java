package l;

import java.io.IOException;

/* compiled from: N5NV */
/* renamed from: l.۠ۖۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC7885 extends AbstractRunnableC21333 {
    public AbstractC7885(C19922 c19922, String str) {
        super(c19922);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21167(String str, boolean z) {
        String sb;
        C19922 c19922 = this.f68752;
        AbstractC15440 m48364 = AbstractRunnableC21333.m48364(c19922, str);
        C23411 c23411 = null;
        c23411 = null;
        c23411 = null;
        c23411 = null;
        c23411 = null;
        String str2 = null;
        if (m48366(m48364)) {
            sb = "550 Invalid name or chroot violation\r\n";
        } else if (m48364.mo23113()) {
            sb = "451 Can't overwrite a directory\r\n";
        } else if (c19922.f64496 >= 0 && z) {
            sb = "555 Append can not be used after a REST command\r\n";
        } else if (c19922.m45863()) {
            c19922.m45860("150 Data socket ready\r\n");
            try {
                C23411 m36513 = m48364.m36513("rw");
                try {
                    if (z) {
                        m36513.seek(m36513.length());
                    } else {
                        long j = c19922.f64496;
                        if (j >= 0) {
                            m36513.seek(j);
                            c19922.f64496 = -1L;
                            c19922.f64491 = -1L;
                        } else {
                            m36513.setLength(0L);
                        }
                    }
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int m45840 = c19922.m45840(bArr);
                        if (m45840 == -2) {
                            str2 = "425 Could not connect data socket\r\n";
                            break;
                        }
                        if (m45840 != -1) {
                            if (m45840 == 0) {
                                str2 = "426 Couldn't receive data\r\n";
                                break;
                            }
                            try {
                                int i = 0;
                                if (c19922.m45858()) {
                                    m36513.write(bArr, 0, m45840);
                                } else {
                                    int i2 = 0;
                                    while (i < m45840) {
                                        if (bArr[i] == 13) {
                                            m36513.write(bArr, i2, i - i2);
                                            i2 = i + 1;
                                        }
                                        i++;
                                    }
                                    if (i2 < m45840) {
                                        m36513.write(bArr, i2, i - i2);
                                    }
                                }
                            } catch (IOException unused) {
                                str2 = "451 File IO problem\r\n";
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException unused2) {
                    str2 = "451 Unable to seek in file to append\r\n";
                }
                String str3 = str2;
                c23411 = m36513;
                sb = str3;
            } catch (IOException unused3) {
                StringBuilder m9834 = C3200.m9834("451 Couldn't open file \"", str, "\" aka \"");
                m9834.append(m48364.mo23554());
                m9834.append("\" for writing\r\n");
                sb = m9834.toString();
            }
        } else {
            sb = "425 Couldn't open data socket\r\n";
        }
        if (c23411 != null) {
            try {
                c23411.close();
            } catch (IOException unused4) {
            }
        }
        if (sb != null) {
            c19922.m45860(sb);
        } else {
            c19922.m45860("226 Transmission complete\r\n");
            C14463.m34555(m48364);
        }
        c19922.m45841();
    }
}
