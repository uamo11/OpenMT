package l;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.system.StructTimespec;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: Q6SD */
/* renamed from: l.ۙᩴᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4838 implements InterfaceC20900 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC3322 f15282;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f15283;

    public C4838(AbstractC3322 abstractC3322) {
        this.f15282 = abstractC3322;
        this.f15283 = "file:".concat(C14460.m34531(C14460.m34534().digest(((C4733) abstractC3322).f15019.mo23554().getBytes(StandardCharsets.UTF_8))));
    }

    @Override // l.InterfaceC20900
    public final C6788 identity() {
        StructTimespec structTimespec;
        long j;
        StructTimespec structTimespec2;
        long j2;
        StructTimespec structTimespec3;
        long j3;
        StructTimespec structTimespec4;
        long j4;
        AbstractC3322 abstractC3322 = this.f15282;
        AbstractC15440 abstractC15440 = ((C4733) abstractC3322).f15019;
        if ((abstractC15440 instanceof C15587) || ((abstractC15440 instanceof C11293) && C16999.m39884(((C4733) abstractC3322).f15019.mo23554()))) {
            String m29018 = abstractC15440 instanceof C11893 ? ((C11893) abstractC15440).m29018() : ((C4733) abstractC3322).f15019.mo23554();
            try {
                Map readAttributes = C17229.readAttributes(C6646.of(m29018, new String[0]), "unix:dev,ino,size,mode,lastModifiedTime,ctime", new EnumC14406[0]);
                if ((((Number) readAttributes.get("mode")).intValue() & 61440) != 32768) {
                    return new C6788(this.f15283, "", -1L, false);
                }
                return new C6788(this.f15283, readAttributes.get("dev") + ":" + readAttributes.get("ino") + ":" + readAttributes.get("lastModifiedTime") + ":" + readAttributes.get("ctime"), ((Number) readAttributes.get("size")).longValue(), true);
            } catch (UnsupportedOperationException unused) {
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        StructStat stat = Os.stat(m29018);
                        if (!OsConstants.S_ISREG(stat.st_mode)) {
                            return new C6788(this.f15283, "", -1L, false);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(stat.st_dev);
                        sb.append(":");
                        sb.append(stat.st_ino);
                        sb.append(":");
                        structTimespec = stat.st_mtim;
                        j = structTimespec.tv_sec;
                        sb.append(j);
                        sb.append(":");
                        structTimespec2 = stat.st_mtim;
                        j2 = structTimespec2.tv_nsec;
                        sb.append(j2);
                        sb.append(":");
                        structTimespec3 = stat.st_ctim;
                        j3 = structTimespec3.tv_sec;
                        sb.append(j3);
                        sb.append(":");
                        structTimespec4 = stat.st_ctim;
                        j4 = structTimespec4.tv_nsec;
                        sb.append(j4);
                        return new C6788(this.f15283, sb.toString(), stat.st_size, true);
                    } catch (ErrnoException e) {
                        throw new IOException("Cannot stat text source", e);
                    }
                }
            }
        }
        return new C6788(this.f15283, "", -1L, false);
    }

    @Override // l.InterfaceC20900
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream mo14081() {
        return ((C4733) this.f15282).f15019.m36518();
    }
}
