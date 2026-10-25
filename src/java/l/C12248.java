package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.github.luben.zstd.Zstd;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: O6WV */
/* renamed from: l.۫ۜᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12248 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile byte[] f36505;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29747(AbstractC15440 abstractC15440) {
        AbstractC15440 m36526 = abstractC15440.m36526("format.json.tmp");
        AbstractC15440 m365262 = abstractC15440.m36526("format.json");
        if (!m36526.mo23120() && m365262.mo23120()) {
            try {
                JSONObject jSONObject = new JSONObject(new String(m365262.m36506(), StandardCharsets.UTF_8));
                if (jSONObject.getInt("version", -1) == 1 && "zstd".equals(jSONObject.getString("codec", null)) && jSONObject.getBoolean("checksum", false) && jSONObject.getBoolean("contentSize", false) && jSONObject.getLong("dictionaryId", -1L) == 1773473561) {
                    if ("38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351".equals(jSONObject.getString("dictionarySha256", null))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29750(AbstractC15440 abstractC15440) {
        m29751();
        abstractC15440.m36508();
        AbstractC15440 m36526 = abstractC15440.m36526("format.json.tmp");
        AbstractC15440 m365262 = abstractC15440.m36526("format.json");
        if (m36526.mo23120() && !m36526.mo23552()) {
            throw new IOException("Unable to delete stale smali cache format temp file");
        }
        m36526.m36502(JSON.object().add("version", 1).add("codec", "zstd").add("checksum", true).add("contentSize", true).add("dictionaryId", 1773473561L).add("dictionarySha256", "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351").toString().getBytes(StandardCharsets.UTF_8));
        if (m365262.mo23120() && !m365262.mo23552()) {
            throw new IOException("Unable to replace smali cache format file");
        }
        if (!m36526.mo23551(m365262)) {
            throw new IOException("Unable to publish smali cache format file");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m29751() {
        byte[] bArr = f36505;
        if (bArr != null) {
            return bArr;
        }
        synchronized (C12248.class) {
            byte[] bArr2 = f36505;
            if (bArr2 != null) {
                return bArr2;
            }
            byte[] bArr3 = new byte[32768];
            try {
                InputStream open = C4925.m14325().open("9");
                int i = 0;
                while (i < 32768) {
                    try {
                        int read = open.read(bArr3, i, 32768 - i);
                        if (read < 0) {
                            throw new IOException("Smali cache dictionary is truncated");
                        }
                        if (read == 0) {
                            int read2 = open.read();
                            if (read2 < 0) {
                                throw new IOException("Smali cache dictionary is truncated");
                            }
                            bArr3[i] = (byte) read2;
                            i++;
                        } else {
                            i += read;
                        }
                    } finally {
                    }
                }
                if (open.read() != -1) {
                    throw new IOException("Smali cache dictionary length is invalid");
                }
                open.close();
                if (!"38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351".equals(C14460.m34531(C14460.m34534().digest(bArr3))) || Zstd.getDictIdFromDict(bArr3) != 1773473561) {
                    throw new IOException("Smali cache dictionary identity is invalid");
                }
                f36505 = bArr3;
                return bArr3;
            } catch (RuntimeException e) {
                throw new IOException("Unable to open smali cache dictionary", e);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29745(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt < 0 || readInt > 1048576) {
            throw new IOException("Invalid smali record name length");
        }
        byte[] bArr = new byte[readInt];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29746(OutputStream outputStream, int i) {
        outputStream.write((i >>> 24) & 255);
        outputStream.write((i >>> 16) & 255);
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29749(OutputStream outputStream, int i) {
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }
}
