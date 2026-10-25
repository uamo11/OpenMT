package l;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: V6B4 */
/* renamed from: l.ۙܽ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4761 extends AbstractC5467 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m13927() {
        int i;
        int m35434;
        C20826 c20826;
        boolean z;
        Iterator it = this.f17810.iterator();
        i = 0;
        while (it.hasNext()) {
            InterfaceC23712 interfaceC23712 = (InterfaceC23712) it.next();
            C20826 c208262 = null;
            try {
                try {
                    ((C0527) this.f17809).mo11947(interfaceC23712);
                    c20826 = new C20826((C0527) this.f17809);
                } catch (FileNotFoundException e) {
                    ((C0527) this.f17809).m45771(e);
                    ((C0527) this.f17809).mo11946("No such file: {0}", interfaceC23712);
                    i = 1;
                    ((C14957) ((C0527) this.f17809).m45770()).m35435();
                    return i;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (ClassFormatError e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (Exception e5) {
                e = e5;
            }
            try {
                try {
                    if (!c20826.f29330 && !c20826.f29336) {
                        z = false;
                        interfaceC23712.mo6121(z);
                        DataInputStream mo6119 = interfaceC23712.mo6119(C16646.of(this.f17809));
                        c20826.m47638(mo6119, C8763.get(interfaceC23712.getName(), new String[0]));
                        mo6119.close();
                        ((C0527) this.f17809).m45762(new C20284());
                        ((C0527) this.f17809).m45780().mo1969(c20826.f67419, C16646.of(".jasm"), this.f17809);
                        c20826.mo3021();
                        ((C0527) this.f17809).m45780().mo1971(c20826.f67419);
                        ((C0527) this.f17809).m45774().flush();
                        i += ((C14957) ((C0527) this.f17809).m45770()).m35434(i, interfaceC23712);
                        ((C14957) ((C0527) this.f17809).m45770()).m35435();
                    }
                    c20826.m47638(mo6119, C8763.get(interfaceC23712.getName(), new String[0]));
                    mo6119.close();
                    ((C0527) this.f17809).m45762(new C20284());
                    ((C0527) this.f17809).m45780().mo1969(c20826.f67419, C16646.of(".jasm"), this.f17809);
                    c20826.mo3021();
                    ((C0527) this.f17809).m45780().mo1971(c20826.f67419);
                    ((C0527) this.f17809).m45774().flush();
                    i += ((C14957) ((C0527) this.f17809).m45770()).m35434(i, interfaceC23712);
                    ((C14957) ((C0527) this.f17809).m45770()).m35435();
                } finally {
                }
                z = true;
                interfaceC23712.mo6121(z);
                DataInputStream mo61192 = interfaceC23712.mo6119(C16646.of(this.f17809));
            } catch (IOException e6) {
                e = e6;
                c208262 = c20826;
                c208262.m47643();
                ((C0527) this.f17809).m45761(e);
                ((C0527) this.f17809).m45771(e);
                m35434 = ((C14957) ((C0527) this.f17809).m45770()).m35434(i, interfaceC23712);
                i += m35434;
                ((C14957) ((C0527) this.f17809).m45770()).m35435();
                return i;
            } catch (ClassFormatError e7) {
                e = e7;
                c208262 = c20826;
                c208262.m47643();
                ((C0527) this.f17809).m45761(e);
                ((C0527) this.f17809).m45771(e);
                m35434 = ((C14957) ((C0527) this.f17809).m45770()).m35434(i, interfaceC23712);
                i += m35434;
                ((C14957) ((C0527) this.f17809).m45770()).m35435();
                return i;
            } catch (Error e8) {
                e = e8;
                c208262 = c20826;
                c208262.m47643();
                ((C0527) this.f17809).m45761(e);
                ((C0527) this.f17809).m45771(e);
                m35434 = ((C14957) ((C0527) this.f17809).m45770()).m35434(i, interfaceC23712);
                i += m35434;
                ((C14957) ((C0527) this.f17809).m45770()).m35435();
                return i;
            } catch (Exception e9) {
                e = e9;
                c208262 = c20826;
                c208262.m47643();
                ((C0527) this.f17809).m45761(e);
                ((C0527) this.f17809).m45771(e);
                m35434 = ((C14957) ((C0527) this.f17809).m45770()).m35434(i, interfaceC23712);
                i += m35434;
                ((C14957) ((C0527) this.f17809).m45770()).m35435();
                return i;
            }
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018b A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:9:0x0028, B:11:0x0030, B:13:0x0193, B:14:0x0037, B:16:0x003f, B:18:0x0046, B:20:0x004e, B:22:0x005b, B:24:0x0063, B:26:0x006a, B:28:0x0072, B:30:0x0079, B:32:0x0081, B:34:0x0088, B:36:0x0090, B:38:0x009a, B:40:0x00a2, B:42:0x00b1, B:44:0x00b9, B:46:0x00c6, B:48:0x00ce, B:50:0x00e6, B:52:0x00ee, B:54:0x00f3, B:56:0x00fb, B:58:0x0104, B:60:0x010c, B:62:0x0115, B:64:0x011b, B:66:0x0120, B:68:0x0128, B:70:0x012e, B:72:0x0134, B:74:0x013a, B:79:0x0145, B:80:0x014a, B:82:0x014b, B:84:0x0151, B:89:0x015c, B:90:0x0161, B:91:0x0162, B:93:0x0168, B:98:0x0173, B:99:0x0178, B:101:0x0179, B:102:0x018a, B:103:0x018b, B:106:0x0196, B:109:0x019d, B:110:0x01ac), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134 A[Catch: IllegalArgumentException -> 0x01ad, TryCatch #0 {IllegalArgumentException -> 0x01ad, blocks: (B:3:0x0013, B:4:0x0018, B:6:0x001b, B:9:0x0028, B:11:0x0030, B:13:0x0193, B:14:0x0037, B:16:0x003f, B:18:0x0046, B:20:0x004e, B:22:0x005b, B:24:0x0063, B:26:0x006a, B:28:0x0072, B:30:0x0079, B:32:0x0081, B:34:0x0088, B:36:0x0090, B:38:0x009a, B:40:0x00a2, B:42:0x00b1, B:44:0x00b9, B:46:0x00c6, B:48:0x00ce, B:50:0x00e6, B:52:0x00ee, B:54:0x00f3, B:56:0x00fb, B:58:0x0104, B:60:0x010c, B:62:0x0115, B:64:0x011b, B:66:0x0120, B:68:0x0128, B:70:0x012e, B:72:0x0134, B:74:0x013a, B:79:0x0145, B:80:0x014a, B:82:0x014b, B:84:0x0151, B:89:0x015c, B:90:0x0161, B:91:0x0162, B:93:0x0168, B:98:0x0173, B:99:0x0178, B:101:0x0179, B:102:0x018a, B:103:0x018b, B:106:0x0196, B:109:0x019d, B:110:0x01ac), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4761(l.C0428 r9, l.C21596 r10, l.C1840 r11, java.lang.String... r12) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4761.<init>(l.֡۬ۚ, l.᩸۬ۚ, l.֫۬ۚ, java.lang.String[]):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m13926(String str, String str2, String str3, EnumC1960 enumC1960) {
        String substring = str2.substring(str.length());
        int length = substring.length();
        int i = 0;
        while (true) {
            AbstractC19898 abstractC19898 = this.f17809;
            if (i >= length) {
                if (enumC1960.m6453()) {
                    enumC1960.m6452();
                    return true;
                }
                ((C0527) abstractC19898).mo11946("Not implemented yet: {0}", str.concat(":all"));
                return false;
            }
            int codePointAt = substring.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                if (!substring.matches("^[:=-]+.*")) {
                    ((C0527) abstractC19898).mo11946("Not implemented yet: {0}", str.concat(substring));
                    return false;
                }
                String[] split = substring.substring(1).split(",");
                for (int i2 = 0; i2 < split.length; i2++) {
                    EnumC1960 m6444 = EnumC1960.m6444(str3, split[i2]);
                    if (m6444 == null || !m6444.name().startsWith(str3)) {
                        ((C0527) abstractC19898).mo11946("Invalid parameter \"{0}\" of option: {1}", split[i2], str);
                        return false;
                    }
                    if (!m6444.m6453()) {
                        ((C0527) abstractC19898).mo11946("Not implemented yet: {0}", C22870.m50967(str, ":", split[i2]));
                        return false;
                    }
                    m6444.m6452();
                    if (m6444.equals(enumC1960)) {
                        break;
                    }
                }
                return true;
            }
            i += Character.charCount(codePointAt);
        }
    }
}
