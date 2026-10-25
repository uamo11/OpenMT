package l;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: DB30 */
/* renamed from: l.ۜᩳ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6921 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static volatile C6921 f21363;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Object f21364 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11155 f21365;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17504 f21366;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23106 f21367;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Handler f21368;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18955 f21369;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f21370;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f21371;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1982 f21372;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f21373;

    public C6921(AbstractC7584 abstractC7584) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f21371 = reentrantReadWriteLock;
        this.f21370 = 3;
        InterfaceC17504 interfaceC17504 = abstractC7584.f23458;
        this.f21366 = interfaceC17504;
        int i = abstractC7584.f23457;
        this.f21373 = i;
        this.f21365 = abstractC7584.f23456;
        this.f21368 = new Handler(Looper.getMainLooper());
        this.f21369 = new C18955();
        this.f21372 = new C1982();
        C23106 c23106 = new C23106(this);
        this.f21367 = c23106;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f21370 = 0;
            } catch (Throwable th) {
                this.f21371.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m18718() == 0) {
            try {
                interfaceC17504.mo8407(new C11818(c23106));
            } catch (Throwable th2) {
                m18721(th2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0044, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0081, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0074, code lost:
    
        if (r11 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L72;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m18714(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6921.m18714(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18712(AbstractC7584 abstractC7584) {
        if (f21363 == null) {
            synchronized (f21364) {
                if (f21363 == null) {
                    f21363 = new C6921(abstractC7584);
                }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m18716() {
        return f21363 != null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C6921 m18717() {
        C6921 c6921;
        synchronized (f21364) {
            c6921 = f21363;
            if (!(c6921 != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return c6921;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18723() {
        if (!(this.f21373 == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m18718() == 1) {
            return;
        }
        this.f21371.writeLock().lock();
        try {
            if (this.f21370 == 0) {
                return;
            }
            this.f21370 = 0;
            this.f21371.writeLock().unlock();
            C23106 c23106 = this.f21367;
            C6921 c6921 = c23106.f41609;
            try {
                c6921.f21366.mo8407(new C11818(c23106));
            } catch (Throwable th) {
                c6921.m18721(th);
            }
        } finally {
            this.f21371.writeLock().unlock();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18725() {
        ArrayList arrayList = new ArrayList();
        this.f21371.writeLock().lock();
        try {
            this.f21370 = 1;
            arrayList.addAll(this.f21369);
            this.f21369.clear();
            this.f21371.writeLock().unlock();
            this.f21368.post(new RunnableC18210(arrayList, this.f21370, null));
        } catch (Throwable th) {
            this.f21371.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18721(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f21371.writeLock().lock();
        try {
            this.f21370 = 2;
            arrayList.addAll(this.f21369);
            this.f21369.clear();
            this.f21371.writeLock().unlock();
            this.f21368.post(new RunnableC18210(arrayList, this.f21370, th));
        } catch (Throwable th2) {
            this.f21371.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18722(AbstractC16798 abstractC16798) {
        C13746.m33055(abstractC16798, "initCallback cannot be null");
        this.f21371.writeLock().lock();
        try {
            if (this.f21370 != 1 && this.f21370 != 2) {
                this.f21369.add(abstractC16798);
            }
            this.f21368.post(new RunnableC18210(Arrays.asList(abstractC16798), this.f21370, null));
        } finally {
            this.f21371.writeLock().unlock();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18724(AbstractC16798 abstractC16798) {
        C13746.m33055(abstractC16798, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f21371;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f21369.remove(abstractC16798);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18718() {
        this.f21371.readLock().lock();
        try {
            return this.f21370;
        } finally {
            this.f21371.readLock().unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m18719(int i, int i2, CharSequence charSequence) {
        if (!(m18718() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        C13746.m33056("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        C13746.m33056("start should be < than charSequence length", i <= charSequence.length());
        C13746.m33056("end should be < than charSequence length", i2 <= charSequence.length());
        return (charSequence.length() == 0 || i == i2) ? charSequence : this.f21367.m51292(charSequence, i, i2, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18720(EditorInfo editorInfo) {
        if (m18718() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f21367.m51293(editorInfo);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18713(Editable editable, int i, KeyEvent keyEvent) {
        return C21738.m49062(editable, i, keyEvent);
    }
}
