package l;

import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: 3BJB */
/* renamed from: l.ܿᩳܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17515 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C17515 f53492 = new C17515(null);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f53493;

    public C17515(InterfaceC9922 interfaceC9922) {
        if (interfaceC9922 == null) {
            this.f53493 = Collections.EMPTY_LIST;
            return;
        }
        ArrayList arrayList = new ArrayList(interfaceC9922.mo14956());
        Iterator it = interfaceC9922.mo21936().iterator();
        while (it.hasNext()) {
            arrayList.add(new C18221((InterfaceC4277) it.next()));
        }
        this.f53493 = C20195.unmodifiableList(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16809 m40930(String str) {
        Iterator it = this.f53493.iterator();
        while (it.hasNext()) {
            C16809 m42444 = ((C18221) it.next()).m42444(str);
            if (m42444 != null) {
                return m42444;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16809 m40929(int i) {
        Iterator it = this.f53493.iterator();
        while (it.hasNext()) {
            C16809 m42443 = ((C18221) it.next()).m42443(i);
            if (m42443 != null) {
                return m42443;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16809 m40932(String str, boolean z) {
        C16809 m42444;
        if (z) {
            for (C18221 c18221 : this.f53493) {
                if (c18221.m42446() == 1 && (m42444 = c18221.m42444(str)) != null) {
                    return m42444;
                }
            }
            return C11166.m27704().m40930(str);
        }
        return m40930(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16809 m40933(int i) {
        C16809 m42443;
        int i2 = (i >>> 24) & 255;
        if (i2 != 1) {
            return m40929(i);
        }
        if (i2 != 1) {
            throw new IllegalArgumentException();
        }
        for (C18221 c18221 : this.f53493) {
            if (c18221.m42446() == 1 && (m42443 = c18221.m42443(i)) != null) {
                return m42443;
            }
        }
        return C11166.m27704().m40929(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16809 m40931(String str, String str2, Map map) {
        boolean equals = Chip.NAMESPACE_ANDROID.equals(str);
        C16809 m40932 = m40932(str2, equals);
        if (m40932 == null && str2.length() == 10 && str2.startsWith("id")) {
            String substring = str2.substring(2);
            if (C9896.m24990(substring)) {
                m40932 = m40933(C9896.m24993(substring));
            }
        }
        if (m40932 == null && map != null) {
            m40932 = (C16809) map.get(str + ":" + str2);
        }
        return (m40932 != null || equals) ? m40932 : C11166.m27704().m40930(str2);
    }
}
