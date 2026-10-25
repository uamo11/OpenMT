package l;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: 4ASR */
/* renamed from: l.ᩴܳ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC18809 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC11753 f59356;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f59357;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f59358;

    /* renamed from: ֫ */
    public void mo1327(int i, int i2) {
    }

    /* renamed from: ֫ */
    public boolean mo24565(int i) {
        return true;
    }

    /* renamed from: ֫ */
    public boolean mo1328(C19515 c19515, int i, int i2) {
        return true;
    }

    @Deprecated
    /* renamed from: ۜ */
    public abstract String[] mo1329();

    /* renamed from: ܳ */
    public abstract String[] mo4239();

    /* renamed from: ܽ */
    public abstract C21631 mo1330();

    public AbstractC18809() {
        C3992 c3992 = new C3992();
        c3992.add(C11048.f33221);
        this.f59357 = c3992;
        this.f59358 = -1;
    }

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* renamed from: ᩷ */
    public C15279 mo1331() {
        String[] mo1329 = mo1329();
        if (mo1329 != null) {
            C15279 c15279 = C15279.f46873;
            if (mo1329.length != 0) {
                String[] strArr = (String[]) Arrays.copyOf(mo1329, mo1329.length);
                String[] strArr2 = (String[]) Arrays.copyOf(mo1329, mo1329.length);
                for (int i = 0; i < mo1329.length; i++) {
                    String str = mo1329[i];
                    if (str != null) {
                        if (!str.isEmpty()) {
                            char charAt = str.charAt(0);
                            if (charAt == '\'') {
                                strArr2[i] = null;
                            } else if (Character.isUpperCase(charAt)) {
                                strArr[i] = null;
                            }
                        }
                        strArr[i] = null;
                        strArr2[i] = null;
                    }
                }
                return new C15279(strArr, strArr2, mo1329);
            }
        }
        return C15279.f46873;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC11753 m43460() {
        return this.f59356;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43457(AbstractC11753 abstractC11753) {
        this.f59356 = abstractC11753;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43456(C6192 c6192) {
        ((CopyOnWriteArrayList) this.f59357).add(c6192);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m43458() {
        ((CopyOnWriteArrayList) this.f59357).clear();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15985 m43461() {
        return new C15985(this.f59357);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m43462() {
        return this.f59358;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43459(int i) {
        this.f59358 = i;
    }
}
