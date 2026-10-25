package l;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* compiled from: 27BV */
/* renamed from: l.᩹֡ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC21934 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f70235;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile LinkedHashMap f70237;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19818 f70239;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f70234 = new Object();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f70236 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f70233 = false;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f70238 = 0;

    /* renamed from: ᩳ */
    public abstract void mo2920();

    public AbstractC21934(C19818 c19818, String str, LinkedHashMap linkedHashMap) {
        this.f70239 = c19818;
        this.f70235 = str;
        this.f70237 = new LinkedHashMap(linkedHashMap);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49403(AbstractC21934 abstractC21934) {
        try {
            abstractC21934.mo2920();
            if (abstractC21934.f70233 || abstractC21934.f70236) {
                return;
            }
            abstractC21934.m49405();
        } catch (RuntimeException unused) {
            if (abstractC21934.f70233 || abstractC21934.f70236) {
                return;
            }
            abstractC21934.m49405();
        } catch (Throwable th) {
            if (!abstractC21934.f70233 && !abstractC21934.f70236) {
                abstractC21934.m49405();
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49407(int i, int i2, long j, boolean z) {
        if (this.f70233) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f70237);
        linkedHashMap.put("sizeBytes", Long.valueOf(j));
        linkedHashMap.put("fileCount", Integer.valueOf(i));
        linkedHashMap.put("folderCount", Integer.valueOf(i2));
        this.f70237 = linkedHashMap;
        if (z) {
            m49405();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m49405() {
        this.f70236 = true;
        this.f70238 = SystemClock.uptimeMillis();
        C1802.m5990(this.f70234, 300000L, new Runnable() { // from class: l.᩸֡ۢ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC21934.m49404(AbstractC21934.this);
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49404(AbstractC21934 abstractC21934) {
        ConcurrentMapC10942 concurrentMapC10942;
        concurrentMapC10942 = abstractC21934.f70239.f64027;
        concurrentMapC10942.remove(abstractC21934.f70235, abstractC21934);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49409() {
        this.f70233 = true;
        C1802.m5993().removeCallbacksAndMessages(this.f70234);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m49406() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("taskId", this.f70235);
        linkedHashMap.put("done", Boolean.valueOf(this.f70236));
        linkedHashMap.put("property", this.f70237);
        return linkedHashMap;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m49410() {
        return this.f70233;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49408(long j) {
        return this.f70236 && this.f70238 > 0 && j - this.f70238 >= 300000;
    }
}
