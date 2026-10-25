package l;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* compiled from: SB10 */
/* renamed from: l.ۙ۫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4636 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14723;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14723) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                PackageInfo packageInfo = (PackageInfo) obj;
                PackageInfo packageInfo2 = (PackageInfo) obj2;
                boolean z = (packageInfo.applicationInfo.flags & 129) == 0;
                return z == ((packageInfo2.applicationInfo.flags & 129) == 0) ? packageInfo.packageName.compareToIgnoreCase(packageInfo2.packageName) : z ? -1 : 1;
        }
    }
}
