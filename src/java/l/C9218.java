package l;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Process;
import bin.mt.plus.Features;
import net.sf.sevenzipjbinding.SevenZip;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: T731 */
/* renamed from: l.ۡ᩻ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9218 implements SevenZip.ExtractMemoryUsageProvider {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C9218 f27907 = new C9218();

    @Override // net.sf.sevenzipjbinding.SevenZip.ExtractMemoryUsageProvider
    public final long getExtractMemoryUsage() {
        boolean z;
        ActivityManager activityManager = (ActivityManager) C4925.f15522.getSystemService("activity");
        if (activityManager == null) {
            return 268435456L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        if (Build.VERSION.SDK_INT >= 23) {
            z = Process.is64Bit();
        } else {
            String abi = Features.getABI();
            z = "arm64-v8a".equals(abi) || "x86_64".equals(abi);
        }
        long j = memoryInfo.totalMem;
        long j2 = memoryInfo.availMem;
        long j3 = memoryInfo.threshold;
        boolean z2 = memoryInfo.lowMemory;
        long max = Math.max(0L, j);
        long max2 = Math.max(0L, j2);
        long max3 = Math.max(0L, j3);
        long j4 = isLowRamDevice ? 268435456L : 134217728L;
        long j5 = max2 > max3 ? max2 - max3 : 0L;
        long j6 = j5 > j4 ? j5 - j4 : 0L;
        long min = Math.min(j6, Math.min(max / 8, 1073741824L));
        long j7 = C13132.FOREVER_NS;
        if (j6 <= C13132.FOREVER_NS - min) {
            j7 = j6 + min;
        }
        long min2 = Math.min(j7, Math.min(isLowRamDevice ? 536870912L : max <= Blake2xsDigest.MAX_NUMBER_BLOCKS ? 805306368L : max <= 6442450944L ? 1342177280L : 2415919104L, z ? 2415919104L : 805306368L));
        if (z2) {
            min2 = Math.min(min2, 268435456L);
        }
        return (min2 / 1048576) * 1048576;
    }
}
