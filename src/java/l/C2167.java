package l;

import android.media.browse.MediaBrowser;
import android.view.View;
import android.widget.CompoundButton;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 95XT */
/* renamed from: l.ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2167 {

    /* renamed from: ᩹۟ۘ, reason: not valid java name and contains not printable characters */
    public static int f7158;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaBrowser.ConnectionCallback f7159 = new C15571(this);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19101 f7160;

    /* renamed from: ֡᩹۫, reason: not valid java name and contains not printable characters */
    public static int m7147(Object obj) {
        return ((AtomicInteger) obj).get();
    }

    /* renamed from: ֨֫ۡ, reason: not valid java name and contains not printable characters */
    public static Object m7148(Object obj, Object obj2, Object obj3) {
        return ((IdentityHashMap) obj).put(obj2, obj3);
    }

    /* renamed from: ۘ᩻ۖ, reason: not valid java name and contains not printable characters */
    public static Throwable m7149(Object obj) {
        return ((Throwable) obj).getCause();
    }

    /* renamed from: ۙ֫ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7150(Object obj) {
        return ((InterfaceC17066) obj).mo1526();
    }

    /* renamed from: ۚۖܽ, reason: not valid java name and contains not printable characters */
    public static void m7151(Object obj) {
        C11233.m27799(obj);
    }

    /* renamed from: ۢܰۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17664 m7152(Object obj) {
        return C5378.stream((Collection) obj);
    }

    /* renamed from: ۢᩴۖ, reason: not valid java name and contains not printable characters */
    public static boolean m7153(Object obj, Object obj2) {
        return ((List) obj).add(obj2);
    }

    /* renamed from: ۧܺ᩹, reason: not valid java name and contains not printable characters */
    public static void m7154(Object obj, Object obj2) {
        ((Throwable) obj).addSuppressed((Throwable) obj2);
    }

    /* renamed from: ۨۙ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m7155() {
        return false;
    }

    /* renamed from: ܰ᩵۠, reason: not valid java name and contains not printable characters */
    public static C3545 m7156(Object obj, Object obj2) {
        return ((C18090) obj).getEntry((String) obj2);
    }

    /* renamed from: ܳ۠ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m7157(Object obj) {
        return ((CompoundButton) obj).isChecked();
    }

    /* renamed from: ܶ᩵۟, reason: not valid java name and contains not printable characters */
    public static void m7158(Object obj, int i) {
        ((View) obj).setBackgroundColor(i);
    }

    /* renamed from: ܽ֡ܶ, reason: not valid java name and contains not printable characters */
    public static String m7159(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ᩹۬ۖ, reason: not valid java name and contains not printable characters */
    public static void m7160(Object obj, boolean z) {
        ((CompoundButton) obj).setChecked(z);
    }

    /* renamed from: ᩺ۚۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7161(Object obj) {
        return ((List) obj).isEmpty();
    }

    /* renamed from: ᩻ۖܳ, reason: not valid java name and contains not printable characters */
    public static boolean m7162(Object obj) {
        return ((ArrayDeque) obj).isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7163() {
        throw null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo7164() {
        throw null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo7165() {
        throw null;
    }
}
