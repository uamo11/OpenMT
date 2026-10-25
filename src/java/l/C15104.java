package l;

import android.os.PowerManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CAJ3 */
/* renamed from: l.ܶ۠ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15104 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f46193 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final PowerManager.WakeLock f46194;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Iterable f46195;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final CopyOnWriteArrayList f46196;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final CopyOnWriteArrayList f46197;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Set f46198;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C5242 f46199;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f46197 = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        f46196 = copyOnWriteArrayList2;
        Iterable m22948 = C8882.m22948(copyOnWriteArrayList, copyOnWriteArrayList2);
        f46195 = m22948;
        f46199 = new C5242(m22948);
        f46198 = C20195.synchronizedSet(new HashSet());
        PowerManager powerManager = (PowerManager) C4925.m14335().getSystemService("power");
        if (powerManager == null) {
            f46194 = null;
        } else {
            f46194 = powerManager.newWakeLock(1, C4925.m14337().concat(":Task"));
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C5242 m35788() {
        return f46199;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m35797() {
        return f46197.size();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m35798() {
        return f46196.size();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m35794(AbstractC3817 abstractC3817) {
        return f46196.remove(abstractC3817);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m35791() {
        f46196.clear();
        f46199.mo1669(f46195);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3817 m35784(int i) {
        if (i <= 0) {
            return null;
        }
        Iterator it = f46197.iterator();
        while (it.hasNext()) {
            AbstractC3817 abstractC3817 = (AbstractC3817) it.next();
            if (abstractC3817.m11544() == i) {
                return abstractC3817;
            }
        }
        return null;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static AbstractC3817 m35786() {
        Iterator it = f46197.iterator();
        while (it.hasNext()) {
            AbstractC3817 abstractC3817 = (AbstractC3817) it.next();
            if (C23807.class.isInstance(abstractC3817)) {
                return abstractC3817;
            }
        }
        return null;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m35792() {
        f46197.clear();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35785(AbstractC3817 abstractC3817) {
        if (!abstractC3817.m11516()) {
            throw new IllegalStateException("Task is not finished.");
        }
        f46196.add(0, abstractC3817.m11554());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m35790(AbstractC3817 abstractC3817) {
        f46198.remove(Integer.valueOf(abstractC3817.m11544()));
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m35787() {
        return !f46198.isEmpty();
    }
}
