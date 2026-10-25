package l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* compiled from: O6RT */
/* renamed from: l.ۢ֡ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9240 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23681(InterfaceC20758 interfaceC20758, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("filePath", bundle.getString("filePath"));
        bundle2.putBoolean("changed", bundle.getBoolean("changed"));
        bundle2.putBoolean("temp", bundle.getBoolean("temp"));
        bundle2.putInt("sideIconType", bundle.getInt("sideIconType"));
        String string = bundle.getString("remark");
        if (string != null) {
            int min = Math.min(string.length(), 512);
            if (min > 0 && min < string.length() && Character.isHighSurrogate(string.charAt(min - 1))) {
                min--;
            }
            bundle2.putString("remark", string.substring(0, min));
        }
        byte[] m44356 = C19222.m44353(65520, bundle2).m44356(65520);
        C10130 c10130 = new C10130(m44356.length + 16);
        c10130.writeInt(843666245);
        c10130.writeInt(1);
        c10130.m25434(m44356);
        CRC32 crc32 = new CRC32();
        crc32.update(c10130.m25438(), 0, c10130.size());
        c10130.writeInt((int) crc32.getValue());
        InterfaceC20758 resolve = interfaceC20758.resolve("app-index.tmp");
        InterfaceC20758 resolve2 = interfaceC20758.resolve("app-index");
        if (C17229.exists(resolve, EnumC14406.NOFOLLOW_LINKS)) {
            C10050.m25231(resolve);
            C17229.delete(resolve);
        }
        C2994.m9133(resolve, c10130.m25444());
        C17229.move(resolve, resolve2, EnumC2413.ATOMIC_MOVE, EnumC2413.REPLACE_EXISTING);
        InterfaceC23015.f74090.mo28630(interfaceC20758);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m23680(InterfaceC20758 interfaceC20758) {
        int i;
        InterfaceC20758 resolve = interfaceC20758.resolve("app-index");
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isRegularFile(resolve, enumC14406)) {
            throw new IOException("Session startup index is missing");
        }
        long size = C17229.size(resolve);
        if (size < 16 || size > 65536) {
            throw new IOException("Invalid session startup index length");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        InputStream newInputStream = C17229.newInputStream(resolve, enumC14406);
        int i3 = 0;
        while (i3 < i2) {
            try {
                int read = newInputStream.read(bArr, i3, i2 - i3);
                if (read <= 0) {
                    throw new IOException("Truncated session startup index");
                }
                i3 += read;
            } catch (Throwable th) {
                if (newInputStream != null) {
                    try {
                        newInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (newInputStream.read() != -1) {
            throw new IOException("Trailing session startup index bytes");
        }
        newInputStream.close();
        C12951 c12951 = new C12951(bArr);
        CRC32 crc32 = new CRC32();
        int i4 = i2 - 4;
        crc32.update(bArr, 0, i4);
        c12951.seek(i4);
        if (c12951.readInt() != ((int) crc32.getValue())) {
            throw new IOException("Invalid session startup index checksum");
        }
        c12951.seek(0L);
        if (c12951.readInt() != 843666245 || c12951.readInt() != 1 || c12951.readInt() != i2 - 16) {
            throw new IOException("Unsupported session startup index");
        }
        return C19222.m44352(65536, i, new ByteArrayInputStream(bArr, 12, i)).m44358();
    }
}
