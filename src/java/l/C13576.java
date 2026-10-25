package l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.zip.CRC32;

/* compiled from: 36NN */
/* renamed from: l.ܰۘᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13576 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f40496;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f40497;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f40498;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f40499;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f40500;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f40501;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Bundle f40503;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40505;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f40506;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f40507;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f40502 = new Object();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f40504 = FutureC3575.m10905(null);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22749 m32649(int i, CharSequence charSequence, C6417 c6417) {
        int i2 = this.f40499;
        this.f40499 = i2 + 1;
        if (i2 == 0) {
            this.f40504 = new FutureC3575();
        }
        return new C22749(this, i, charSequence, c6417);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m32651() {
        return this.f40499 != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m32652(int i) {
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.f40496;
            if (i2 >= zArr.length) {
                return false;
            }
            if (i2 != i && zArr[i2]) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized Bundle m32653() {
        return new Bundle(this.f40503);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC3575 m32655() {
        return this.f40504.m10921((InterfaceC21423) new C5368());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized C23077 m32657() {
        return new C23077(0, this.f40500, false, 0, null, null, null);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized String m32658() {
        return this.f40497;
    }

    public C13576(InterfaceC20758 interfaceC20758, String str, List list, boolean[] zArr, Bundle bundle, int i, int i2, String str2) {
        this.f40498 = interfaceC20758;
        this.f40501 = str;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C11003.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f40507 = C20195.unmodifiableList(arrayList);
        this.f40496 = zArr;
        this.f40503 = new Bundle(bundle);
        this.f40505 = i;
        this.f40500 = i2;
        this.f40497 = str2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m32654(int i) {
        if (i < 0 || i >= this.f40507.size()) {
            throw new IndexOutOfBoundsException("Invalid text page index");
        }
        return this.f40498.resolve(this.f40501).resolve(Integer.toString(i));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32656() {
        return this.f40507.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11915 m32648(C6417 c6417, int i, InterfaceC17066 interfaceC17066) {
        int i2;
        synchronized (this) {
            i2 = this.f40505;
        }
        return m32647(i2, c6417, i, interfaceC17066, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13576 m32640(InterfaceC20758 interfaceC20758) {
        InterfaceC20758 resolve = interfaceC20758.resolve("app-pages");
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isRegularFile(resolve, enumC14406)) {
            throw new IOException("Invalid text page directory");
        }
        long size = C17229.size(resolve);
        if (size < 40 || size > 2097152) {
            throw new IOException("Invalid text page directory length");
        }
        int i = (int) size;
        byte[] bArr = new byte[i];
        InputStream newInputStream = C17229.newInputStream(resolve, enumC14406);
        int i2 = 0;
        while (i2 < i) {
            try {
                int read = newInputStream.read(bArr, i2, i - i2);
                if (read <= 0) {
                    throw new IOException("Truncated text page directory");
                }
                i2 += read;
            } finally {
            }
        }
        if (newInputStream.read() != -1) {
            throw new IOException("Trailing text page directory data");
        }
        newInputStream.close();
        try {
            C12951 c12951 = new C12951(bArr);
            CRC32 crc32 = new CRC32();
            int i3 = i - 4;
            crc32.update(bArr, 0, i3);
            c12951.seek(i3);
            if (c12951.readInt() != ((int) crc32.getValue())) {
                throw new IOException("Invalid text page directory checksum");
            }
            c12951.seek(0L);
            if (c12951.readInt() != 827344709 || c12951.readInt() != 1) {
                throw new IOException("Unsupported text page directory");
            }
            String str = "pages-" + new UUID(c12951.readLong(), c12951.readLong());
            int readInt = c12951.readInt();
            int readInt2 = c12951.readInt();
            int readInt3 = c12951.readInt();
            int readInt4 = c12951.readInt();
            if (readInt < 1 || readInt > (i - 40) / 17 || readInt2 < 0 || readInt2 >= readInt || readInt4 < 0 || readInt4 > 2) {
                throw new IOException("Invalid text page directory fields");
            }
            C14776.m35151(readInt3);
            ArrayList arrayList = new ArrayList(readInt);
            boolean[] zArr = new boolean[readInt];
            for (int i4 = 0; i4 < readInt; i4++) {
                arrayList = arrayList;
                arrayList.add(new UUID(c12951.readLong(), c12951.readLong()));
                zArr[i4] = c12951.m31498();
            }
            int readInt5 = c12951.readInt();
            if (readInt5 >= 0) {
                long j = readInt5;
                if (j == c12951.available() - 4) {
                    byte[] bArr2 = new byte[readInt5];
                    c12951.m31489(readInt5, bArr2);
                    return new C13576(interfaceC20758, str, arrayList, zArr, C19222.m44352(2097152, j, new ByteArrayInputStream(bArr2)).m44358(), readInt2, readInt3, readInt4 == 1 ? "\r" : readInt4 == 2 ? "\r\n" : "\n");
                }
            }
            throw new IOException("Invalid text page configuration length");
        } catch (RuntimeException e) {
            throw new IOException("Invalid text page directory", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m32645() {
        Bundle bundle;
        boolean[] zArr;
        int i;
        int i2;
        String str;
        synchronized (this.f40502) {
            synchronized (this) {
                bundle = new Bundle(this.f40503);
                zArr = (boolean[]) this.f40496.clone();
                i = this.f40505;
                i2 = this.f40500;
                str = this.f40497;
            }
            C10130 c10130 = new C10130();
            UUID fromString = UUID.fromString(this.f40501.substring(6));
            c10130.writeInt(827344709);
            c10130.writeInt(1);
            c10130.m25431(fromString.getMostSignificantBits());
            c10130.m25431(fromString.getLeastSignificantBits());
            c10130.writeInt(this.f40507.size());
            c10130.writeInt(i);
            c10130.writeInt(i2);
            c10130.writeInt("\r".equals(str) ? 1 : "\r\n".equals(str) ? 2 : 0);
            for (int i3 = 0; i3 < this.f40507.size(); i3++) {
                UUID uuid = (UUID) this.f40507.get(i3);
                c10130.m25431(uuid.getMostSignificantBits());
                c10130.m25431(uuid.getLeastSignificantBits());
                c10130.m25425(zArr[i3]);
            }
            c10130.m25434(C19222.m44353(2097152, bundle).m44356(2097152));
            if (c10130.size() > 2097148) {
                throw new IOException("Text page directory exceeds limit");
            }
            CRC32 crc32 = new CRC32();
            crc32.update(c10130.m25438(), 0, c10130.size());
            c10130.writeInt((int) crc32.getValue());
            InterfaceC20758 resolve = this.f40498.resolve("app-pages.tmp");
            if (C17229.exists(resolve, EnumC14406.NOFOLLOW_LINKS)) {
                C10050.m25231(resolve);
                C17229.delete(resolve);
            }
            C2994.m9133(resolve, c10130.m25444());
            C17229.move(resolve, this.f40498.resolve("app-pages"), EnumC2413.ATOMIC_MOVE, EnumC2413.REPLACE_EXISTING);
            this.f40506 = true;
            InterfaceC23015.f74090.mo28630(this.f40498);
            C9240.m23681(this.f40498, bundle);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32650(int i, Bundle bundle, boolean z, int i2, String str) {
        synchronized (this.f40502) {
            synchronized (this) {
                this.f40500 = i2;
                this.f40497 = str;
                this.f40496[i] = z;
                this.f40503 = new Bundle(bundle);
                boolean z2 = false;
                for (boolean z3 : this.f40496) {
                    z2 |= z3;
                }
                this.f40503.putBoolean("changed", z2);
            }
            m32645();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11915 m32647(int i, C6417 c6417, int i2, InterfaceC17066 interfaceC17066, boolean z) {
        C11915 m29053 = C11915.m29053(m32654(i), c6417.f19851, c6417.f19853, c6417.f19852, i2, interfaceC17066, (String) null);
        try {
            if (!((UUID) this.f40507.get(i)).equals(m29053.f35630.mo1601().m52352())) {
                throw new IOException("Text page identity changed");
            }
            m29053.m29077(this, i, i2);
            if (!z) {
                return m29053;
            }
            synchronized (this.f40502) {
                synchronized (this) {
                    if (this.f40499 != 0) {
                        throw new IOException("Text document is being read");
                    }
                    this.f40505 = i;
                }
                m32645();
            }
            return m29053;
        } catch (IOException | Error | RuntimeException e) {
            try {
                m29053.m29068().m10930();
            } catch (Throwable th) {
                e.addSuppressed(th);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7744 m32646(int i, C6417 c6417) {
        C17371 m52316 = C23721.m52316(m32654(i), c6417.f19851, c6417.f19853);
        try {
            if (!((UUID) this.f40507.get(i)).equals(m52316.m40711())) {
                throw new IOException("Text page identity changed");
            }
            C7744 m20753 = C7744.m20753(m52316.m40714());
            m52316.close();
            return m20753;
        } catch (Throwable th) {
            try {
                m52316.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C11915 m32634(l.C11915 r40, l.InterfaceC20758 r41, l.AbstractC3322 r42, int r43, l.C6417 r44, l.InterfaceC17066 r45, long r46) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13576.m32634(l.ۨ᩵ᩳ, l.᩷۠ᩴ, l.ۗܶᩳ, int, l.ۜ֡ᩳ, l.ܿۖ᩷, long):l.ۨ᩵ᩳ");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11915 m32633(l.C11915 r26, l.C4733 r27, boolean r28, l.C11273 r29, l.C6417 r30, l.InterfaceC17066 r31, long r32) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13576.m32633(l.ۨ᩵ᩳ, l.ۙܶᩳ, boolean, l.ۧ᩸ᩳ, l.ۜ֡ᩳ, l.ܿۖ᩷, long):l.ۨ᩵ᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32637(InterfaceC20758 interfaceC20758) {
        InterfaceC17664 walk = C17229.walk(interfaceC20758, new EnumC10880[0]);
        try {
            Iterator it = walk.sorted(C8200.reverseOrder()).toList().iterator();
            while (it.hasNext()) {
                C17229.delete((InterfaceC20758) it.next());
            }
            walk.close();
        } catch (Throwable th) {
            if (walk != null) {
                try {
                    walk.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32636(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new CancellationException("Text pagination is canceled");
        }
    }
}
