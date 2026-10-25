package l;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.motion.MotionUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: 41GJ */
/* renamed from: l.ۨۜ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11530 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22113 f34428;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34427 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f34426 = new HashMap();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f34429 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28382(C22113 c22113) {
        this.f34428 = c22113;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22113 m28393() {
        return this.f34428;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m28384() {
        this.f34426.clear();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28379(ArrayList arrayList) {
        this.f34427.clear();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC9205 m28389 = m28389(str);
                if (m28389 == null) {
                    throw new IllegalStateException(C4860.m14172("No instantiated fragment for (", str, MotionUtils.EASING_TYPE_FORMAT_END));
                }
                if (AbstractC5180.m14853(2)) {
                    m28389.toString();
                }
                m28381(m28389);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28380(C5885 c5885) {
        ComponentCallbacksC9205 m16488 = c5885.m16488();
        if (m28383(m16488.mWho)) {
            return;
        }
        this.f34426.put(m16488.mWho, c5885);
        if (m16488.mRetainInstanceChangedWhileDetached) {
            if (m16488.mRetainInstance) {
                this.f34428.m49693(m16488);
            } else {
                this.f34428.m49699(m16488);
            }
            m16488.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC5180.m14853(2)) {
            m16488.toString();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28381(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (this.f34427.contains(componentCallbacksC9205)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC9205);
        }
        synchronized (this.f34427) {
            this.f34427.add(componentCallbacksC9205);
        }
        componentCallbacksC9205.mAdded = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28377(int i) {
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null) {
                c5885.m16476(i);
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m28402() {
        HashMap hashMap;
        Iterator it = this.f34427.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f34426;
            if (!hasNext) {
                break;
            }
            C5885 c5885 = (C5885) hashMap.get(((ComponentCallbacksC9205) it.next()).mWho);
            if (c5885 != null) {
                c5885.m16481();
            }
        }
        for (C5885 c58852 : hashMap.values()) {
            if (c58852 != null) {
                c58852.m16481();
                ComponentCallbacksC9205 m16488 = c58852.m16488();
                if (m16488.mRemoving && !m16488.isInBackStack()) {
                    if (m16488.mBeingSaved && !this.f34429.containsKey(m16488.mWho)) {
                        c58852.m16484();
                    }
                    m28391(c58852);
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28396(ComponentCallbacksC9205 componentCallbacksC9205) {
        synchronized (this.f34427) {
            this.f34427.remove(componentCallbacksC9205);
        }
        componentCallbacksC9205.mAdded = false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28391(C5885 c5885) {
        ComponentCallbacksC9205 m16488 = c5885.m16488();
        if (m16488.mRetainInstance) {
            this.f34428.m49699(m16488);
        }
        if (((C5885) this.f34426.put(m16488.mWho, null)) != null && AbstractC5180.m14853(2)) {
            m16488.toString();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28376() {
        this.f34426.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12940 m28392(String str) {
        return (C12940) this.f34429.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12940 m28375(String str, C12940 c12940) {
        HashMap hashMap = this.f34429;
        if (c12940 != null) {
            return (C12940) hashMap.put(str, c12940);
        }
        return (C12940) hashMap.remove(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28390(ArrayList arrayList) {
        HashMap hashMap = this.f34429;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12940 c12940 = (C12940) it.next();
            hashMap.put(c12940.f38811, c12940);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28399() {
        return new ArrayList(this.f34429.values());
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m28401() {
        HashMap hashMap = this.f34426;
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (C5885 c5885 : hashMap.values()) {
            if (c5885 != null) {
                ComponentCallbacksC9205 m16488 = c5885.m16488();
                c5885.m16484();
                arrayList.add(m16488.mWho);
                if (AbstractC5180.m14853(2)) {
                    m16488.toString();
                    C11003.toString(m16488.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28385() {
        synchronized (this.f34427) {
            if (this.f34427.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f34427.size());
            Iterator it = this.f34427.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) it.next();
                arrayList.add(componentCallbacksC9205.mWho);
                if (AbstractC5180.m14853(2)) {
                    componentCallbacksC9205.toString();
                }
            }
            return arrayList;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28387() {
        ArrayList arrayList = new ArrayList();
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null) {
                arrayList.add(c5885);
            }
        }
        return arrayList;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m28397() {
        ArrayList arrayList;
        if (this.f34427.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f34427) {
            arrayList = new ArrayList(this.f34427);
        }
        return arrayList;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28394() {
        ArrayList arrayList = new ArrayList();
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null) {
                arrayList.add(c5885.m16488());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m28388(int i) {
        ArrayList arrayList = this.f34427;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) arrayList.get(size);
                if (componentCallbacksC9205 != null && componentCallbacksC9205.mFragmentId == i) {
                    return componentCallbacksC9205;
                }
            } else {
                for (C5885 c5885 : this.f34426.values()) {
                    if (c5885 != null) {
                        ComponentCallbacksC9205 m16488 = c5885.m16488();
                        if (m16488.mFragmentId == i) {
                            return m16488;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m28395(String str) {
        if (str != null) {
            ArrayList arrayList = this.f34427;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) arrayList.get(size);
                if (componentCallbacksC9205 != null && str.equals(componentCallbacksC9205.mTag)) {
                    return componentCallbacksC9205;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null) {
                ComponentCallbacksC9205 m16488 = c5885.m16488();
                if (str.equals(m16488.mTag)) {
                    return m16488;
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28383(String str) {
        return this.f34426.get(str) != null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5885 m28398(String str) {
        return (C5885) this.f34426.get(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m28400(String str) {
        ComponentCallbacksC9205 findFragmentByWho;
        for (C5885 c5885 : this.f34426.values()) {
            if (c5885 != null && (findFragmentByWho = c5885.m16488().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m28389(String str) {
        C5885 c5885 = (C5885) this.f34426.get(str);
        if (c5885 != null) {
            return c5885.m16488();
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m28386(ComponentCallbacksC9205 componentCallbacksC9205) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        ArrayList arrayList = this.f34427;
        int indexOf = arrayList.indexOf(componentCallbacksC9205);
        for (int i = indexOf - 1; i >= 0; i--) {
            ComponentCallbacksC9205 componentCallbacksC92052 = (ComponentCallbacksC9205) arrayList.get(i);
            if (componentCallbacksC92052.mContainer == viewGroup && (view2 = componentCallbacksC92052.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= arrayList.size()) {
                return -1;
            }
            ComponentCallbacksC9205 componentCallbacksC92053 = (ComponentCallbacksC9205) arrayList.get(indexOf);
            if (componentCallbacksC92053.mContainer == viewGroup && (view = componentCallbacksC92053.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28378(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String m37867 = C16014.m37867(str, ASN1Dump.TAB);
        HashMap hashMap = this.f34426;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C5885 c5885 : hashMap.values()) {
                printWriter.print(str);
                if (c5885 != null) {
                    ComponentCallbacksC9205 m16488 = c5885.m16488();
                    printWriter.println(m16488);
                    m16488.dump(m37867, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = this.f34427;
        int size = arrayList.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC9205.toString());
            }
        }
    }
}
