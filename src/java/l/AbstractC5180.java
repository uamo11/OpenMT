package l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: O5NM */
/* renamed from: l.ۚۜ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC5180 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC11507 f16211;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16212;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC9741 f16213;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f16214;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23315 f16215;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AbstractC4971 f16216;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6382 f16217;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10616 f16218;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C17174 f16220;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC9741 f16221;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f16222;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f16223;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Runnable f16224;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC9205 f16225;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f16226;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f16227;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC9205 f16228;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12027 f16229;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14142 f16230;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f16232;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16233;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22113 f16234;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f16237;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC15553 f16238;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16239;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16241;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20494 f16242;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayDeque f16243;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11815 f16244;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f16245;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f16246;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC9741 f16248;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f16249;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16219 = new ArrayList();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11530 f16235 = new C11530();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LayoutInflaterFactory2C13437 f16210 = new LayoutInflaterFactory2C13437(this);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC0525 f16247 = new C10825(this);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16236 = new AtomicInteger();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f16240 = C20195.synchronizedMap(new HashMap());

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f16231 = C20195.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v14, types: [l.᩺᩻֫] */
    /* JADX WARN: Type inference failed for: r0v15, types: [l.ܰ᩻֫] */
    public AbstractC5180() {
        C20195.synchronizedMap(new HashMap());
        this.f16218 = new C10616(this);
        this.f16246 = new CopyOnWriteArrayList();
        int i = 0;
        this.f16217 = new C6382(i, this);
        this.f16229 = new C12027(i, this);
        this.f16215 = new InterfaceC13041() { // from class: l.᩺᩻֫
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                AbstractC5180.m14844(AbstractC5180.this, (C16858) obj);
            }
        };
        this.f16230 = new InterfaceC13041() { // from class: l.ܰ᩻֫
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                AbstractC5180.m14843(AbstractC5180.this, (C7686) obj);
            }
        };
        this.f16211 = new C16468(this);
        this.f16249 = -1;
        this.f16242 = new C17880(this);
        this.f16220 = new C17174();
        this.f16243 = new ArrayDeque();
        this.f16224 = new RunnableC14351(this);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m14853(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14841(AbstractC5180 abstractC5180, Configuration configuration) {
        if (abstractC5180.m14849()) {
            abstractC5180.m14880(false, configuration);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14842(AbstractC5180 abstractC5180, Integer num) {
        if (abstractC5180.m14849() && num.intValue() == 80) {
            abstractC5180.m14879(false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14844(AbstractC5180 abstractC5180, C16858 c16858) {
        if (abstractC5180.m14849()) {
            abstractC5180.m14881(c16858.m39629(), false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14843(AbstractC5180 abstractC5180, C7686 c7686) {
        if (abstractC5180.m14849()) {
            abstractC5180.m14904(c7686.m20571(), false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14839(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C0654());
        AbstractC4971 abstractC4971 = this.f16216;
        try {
            if (abstractC4971 != null) {
                abstractC4971.mo14429(printWriter, new String[0]);
            } else {
                m14867(EnumC0121.f1143, (FileDescriptor) null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC16882 m14900() {
        return new C18105(this);
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m14846() {
        synchronized (this.f16219) {
            if (!this.f16219.isEmpty()) {
                this.f16247.m2240(true);
            } else {
                this.f16247.m2240(m14925() > 0 && m14856(this.f16225));
            }
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m14856(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205 == null) {
            return true;
        }
        AbstractC5180 abstractC5180 = componentCallbacksC9205.mFragmentManager;
        return componentCallbacksC9205.equals(abstractC5180.f16228) && m14856(abstractC5180.f16225);
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14888() {
        m14907(true);
        if (this.f16247.m2242()) {
            m14898();
        } else {
            this.f16244.m28892();
        }
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m14898() {
        return m14845(-1, 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14901(int i) {
        m14902(i, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14902(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Bad id: "));
        }
        m14877(new C0240(this, i), z);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14918(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Bad id: "));
        }
        m14845(i, 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m14845(int i, int i2) {
        m14907(false);
        m14852(true);
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16228;
        if (componentCallbacksC9205 != null && i < 0 && componentCallbacksC9205.getChildFragmentManager().m14898()) {
            return true;
        }
        boolean m14884 = m14884(this.f16233, this.f16239, i, i2);
        if (m14884) {
            this.f16223 = true;
            try {
                m14840(this.f16233, this.f16239);
            } finally {
                m14857();
            }
        }
        m14846();
        boolean z = this.f16214;
        C11530 c11530 = this.f16235;
        if (z) {
            this.f16214 = false;
            Iterator it = c11530.m28387().iterator();
            while (it.hasNext()) {
                m14869((C5885) it.next());
            }
        }
        c11530.m28376();
        return m14884;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m14925() {
        ArrayList arrayList = this.f16212;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8708 m14924() {
        return (InterfaceC8708) this.f16212.get(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14875(C11973 c11973) {
        if (this.f16226 == null) {
            this.f16226 = new ArrayList();
        }
        this.f16226.add(c11973);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14878(C21905 c21905) {
        View view;
        Iterator it = this.f16235.m28387().iterator();
        while (it.hasNext()) {
            C5885 c5885 = (C5885) it.next();
            ComponentCallbacksC9205 m16488 = c5885.m16488();
            if (m16488.mContainerId == c21905.getId() && (view = m16488.mView) != null && view.getParent() == null) {
                m16488.mContainer = c21905;
                c5885.m16475();
            }
        }
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List m14859() {
        return this.f16235.m28397();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3330 m14931(ComponentCallbacksC9205 componentCallbacksC9205) {
        return this.f16234.m49702(componentCallbacksC9205);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14903(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f16234.m49693(componentCallbacksC9205);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m14895(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f16234.m49699(componentCallbacksC9205);
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m14886() {
        return this.f16245;
    }

    public final String toString() {
        StringBuilder m32307 = C13325.m32307(128, "FragmentManager{");
        m32307.append(Integer.toHexString(System.identityHashCode(this)));
        m32307.append(" in ");
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16225;
        if (componentCallbacksC9205 != null) {
            m32307.append(componentCallbacksC9205.getClass().getSimpleName());
            m32307.append("{");
            m32307.append(Integer.toHexString(System.identityHashCode(this.f16225)));
            m32307.append(l.d);
        } else {
            AbstractC4971 abstractC4971 = this.f16216;
            if (abstractC4971 != null) {
                m32307.append(abstractC4971.getClass().getSimpleName());
                m32307.append("{");
                m32307.append(Integer.toHexString(System.identityHashCode(this.f16216)));
                m32307.append(l.d);
            } else {
                m32307.append("null");
            }
        }
        m32307.append("}}");
        return m32307.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14867(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String m37867 = C16014.m37867(str, ASN1Dump.TAB);
        this.f16235.m28378(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f16232;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) this.f16232.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC9205.toString());
            }
        }
        ArrayList arrayList2 = this.f16212;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C18105 c18105 = (C18105) this.f16212.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c18105.toString());
                c18105.m42226(m37867, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f16236.get());
        synchronized (this.f16219) {
            int size3 = this.f16219.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC19292 interfaceC19292 = (InterfaceC19292) this.f16219.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(interfaceC19292);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f16216);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f16238);
        if (this.f16225 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f16225);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f16249);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f16227);
        printWriter.print(" mStopped=");
        printWriter.print(this.f16237);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f16245);
        if (this.f16222) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f16222);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14869(C5885 c5885) {
        ComponentCallbacksC9205 m16488 = c5885.m16488();
        if (m16488.mDeferStart) {
            if (this.f16223) {
                this.f16214 = true;
            } else {
                m16488.mDeferStart = false;
                c5885.m16481();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14873(ComponentCallbacksC9205 componentCallbacksC9205, boolean z) {
        ViewGroup m14848 = m14848(componentCallbacksC9205);
        if (m14848 == null || !(m14848 instanceof C21905)) {
            return;
        }
        ((C21905) m14848).m49304(!z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14864(int i, boolean z) {
        AbstractC4971 abstractC4971;
        if (this.f16216 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f16249) {
            this.f16249 = i;
            C11530 c11530 = this.f16235;
            c11530.m28402();
            Iterator it = c11530.m28387().iterator();
            while (it.hasNext()) {
                m14869((C5885) it.next());
            }
            if (this.f16222 && (abstractC4971 = this.f16216) != null && this.f16249 == 7) {
                abstractC4971.mo14436();
                this.f16222 = false;
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5885 m14922(ComponentCallbacksC9205 componentCallbacksC9205) {
        String str = componentCallbacksC9205.mWho;
        C11530 c11530 = this.f16235;
        C5885 m28398 = c11530.m28398(str);
        if (m28398 != null) {
            return m28398;
        }
        C5885 c5885 = new C5885(this.f16218, c11530, componentCallbacksC9205);
        c5885.m16477(this.f16216.m14435().getClassLoader());
        c5885.m16476(this.f16249);
        return c5885;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5885 m14861(ComponentCallbacksC9205 componentCallbacksC9205) {
        String str = componentCallbacksC9205.mPreviousWho;
        if (str != null) {
            C23232.m51538(componentCallbacksC9205, str);
        }
        if (m14853(2)) {
            componentCallbacksC9205.toString();
        }
        C5885 m14922 = m14922(componentCallbacksC9205);
        componentCallbacksC9205.mFragmentManager = this;
        C11530 c11530 = this.f16235;
        c11530.m28380(m14922);
        if (!componentCallbacksC9205.mDetached) {
            c11530.m28381(componentCallbacksC9205);
            componentCallbacksC9205.mRemoving = false;
            if (componentCallbacksC9205.mView == null) {
                componentCallbacksC9205.mHiddenChanged = false;
            }
            if (m14855(componentCallbacksC9205)) {
                this.f16222 = true;
            }
        }
        return m14922;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m14897(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        boolean isInBackStack = componentCallbacksC9205.isInBackStack();
        if (componentCallbacksC9205.mDetached && isInBackStack) {
            return;
        }
        this.f16235.m28396(componentCallbacksC9205);
        if (m14855(componentCallbacksC9205)) {
            this.f16222 = true;
        }
        componentCallbacksC9205.mRemoving = true;
        m14837(componentCallbacksC9205);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m14892(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        if (componentCallbacksC9205.mHidden) {
            return;
        }
        componentCallbacksC9205.mHidden = true;
        componentCallbacksC9205.mHiddenChanged = true ^ componentCallbacksC9205.mHiddenChanged;
        m14837(componentCallbacksC9205);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m14921(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        if (componentCallbacksC9205.mDetached) {
            return;
        }
        componentCallbacksC9205.mDetached = true;
        if (componentCallbacksC9205.mAdded) {
            if (m14853(2)) {
                componentCallbacksC9205.toString();
            }
            this.f16235.m28396(componentCallbacksC9205);
            if (m14855(componentCallbacksC9205)) {
                this.f16222 = true;
            }
            m14837(componentCallbacksC9205);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14919(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (m14853(2)) {
            C11003.toString(componentCallbacksC9205);
        }
        if (componentCallbacksC9205.mDetached) {
            componentCallbacksC9205.mDetached = false;
            if (componentCallbacksC9205.mAdded) {
                return;
            }
            this.f16235.m28381(componentCallbacksC9205);
            if (m14853(2)) {
                componentCallbacksC9205.toString();
            }
            if (m14855(componentCallbacksC9205)) {
                this.f16222 = true;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14862(int i) {
        return this.f16235.m28388(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14899(String str) {
        return this.f16235.m28395(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14916(String str) {
        return this.f16235.m28400(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14863(String str) {
        return this.f16235.m28389(str);
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m14910() {
        return this.f16227 || this.f16237;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14877(InterfaceC19292 interfaceC19292, boolean z) {
        if (!z) {
            if (this.f16216 != null) {
                if (m14910()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else {
                if (this.f16245) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f16219) {
            if (this.f16216 == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f16219.add(interfaceC19292);
                m14908();
            }
        }
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14908() {
        synchronized (this.f16219) {
            if (this.f16219.size() == 1) {
                this.f16216.m14434().removeCallbacks(this.f16224);
                this.f16216.m14434().post(this.f16224);
                m14846();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14860() {
        return this.f16236.getAndIncrement();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m14852(boolean z) {
        if (this.f16223) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f16216 == null) {
            if (this.f16245) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (Looper.myLooper() == this.f16216.m14434().getLooper()) {
            if (!z && m14910()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.f16233 == null) {
                this.f16233 = new ArrayList();
                this.f16239 = new ArrayList();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14876(C18105 c18105, boolean z) {
        if (z && (this.f16216 == null || this.f16245)) {
            return;
        }
        m14852(z);
        c18105.mo1499(this.f16233, this.f16239);
        this.f16223 = true;
        try {
            m14840(this.f16233, this.f16239);
            m14857();
            m14846();
            boolean z2 = this.f16214;
            C11530 c11530 = this.f16235;
            if (z2) {
                this.f16214 = false;
                Iterator it = c11530.m28387().iterator();
                while (it.hasNext()) {
                    m14869((C5885) it.next());
                }
            }
            c11530.m28376();
        } catch (Throwable th) {
            m14857();
            throw th;
        }
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m14857() {
        this.f16223 = false;
        this.f16239.clear();
        this.f16233.clear();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14907(boolean z) {
        boolean z2;
        m14852(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f16233;
            ArrayList arrayList2 = this.f16239;
            synchronized (this.f16219) {
                if (this.f16219.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f16219.size();
                        boolean z4 = false;
                        for (int i = 0; i < size; i++) {
                            z4 |= ((InterfaceC19292) this.f16219.get(i)).mo1499(arrayList, arrayList2);
                        }
                        z2 = z4;
                    } finally {
                    }
                }
            }
            if (!z2) {
                break;
            }
            z3 = true;
            this.f16223 = true;
            try {
                m14840(this.f16233, this.f16239);
            } finally {
                m14857();
            }
        }
        m14846();
        if (this.f16214) {
            this.f16214 = false;
            Iterator it = this.f16235.m28387().iterator();
            while (it.hasNext()) {
                m14869((C5885) it.next());
            }
        }
        this.f16235.m28376();
        return z3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14840(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C18105) arrayList.get(i)).f51801) {
                if (i2 != i) {
                    m14850(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C18105) arrayList.get(i2)).f51801) {
                        i2++;
                    }
                }
                m14850(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m14850(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m14850(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C18105 c18105;
        C11530 c11530;
        ComponentCallbacksC9205 componentCallbacksC9205;
        C11530 c115302;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z = ((C18105) arrayList3.get(i)).f51801;
        ArrayList arrayList5 = this.f16241;
        if (arrayList5 == null) {
            this.f16241 = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f16241;
        C11530 c115303 = this.f16235;
        arrayList6.addAll(c115303.m28397());
        ComponentCallbacksC9205 componentCallbacksC92052 = this.f16228;
        boolean z2 = false;
        int i6 = i;
        while (true) {
            int i7 = 1;
            if (i6 < i2) {
                C18105 c181052 = (C18105) arrayList3.get(i6);
                if (!((Boolean) arrayList4.get(i6)).booleanValue()) {
                    ArrayList arrayList7 = this.f16241;
                    ArrayList arrayList8 = c181052.f51805;
                    int i8 = 0;
                    while (i8 < arrayList8.size()) {
                        C11239 c11239 = (C11239) arrayList8.get(i8);
                        int i9 = c11239.f33695;
                        if (i9 != i7) {
                            if (i9 != 2) {
                                if (i9 == 3 || i9 == 6) {
                                    arrayList7.remove(c11239.f33700);
                                    ComponentCallbacksC9205 componentCallbacksC92053 = c11239.f33700;
                                    if (componentCallbacksC92053 == componentCallbacksC92052) {
                                        arrayList8.add(i8, new C11239(componentCallbacksC92053, 9));
                                        i8++;
                                        i3 = 1;
                                        componentCallbacksC92052 = null;
                                        c115302 = c115303;
                                    }
                                } else if (i9 != 7) {
                                    if (i9 == 8) {
                                        arrayList8.add(i8, new C11239(9, componentCallbacksC92052, 0));
                                        c11239.f33698 = true;
                                        i8++;
                                        componentCallbacksC92052 = c11239.f33700;
                                    }
                                }
                                i3 = 1;
                                c115302 = c115303;
                            } else {
                                ComponentCallbacksC9205 componentCallbacksC92054 = c11239.f33700;
                                int i10 = componentCallbacksC92054.mContainerId;
                                int size = arrayList7.size() - 1;
                                boolean z3 = false;
                                while (size >= 0) {
                                    C11530 c115304 = c115303;
                                    ComponentCallbacksC9205 componentCallbacksC92055 = (ComponentCallbacksC9205) arrayList7.get(size);
                                    if (componentCallbacksC92055.mContainerId != i10) {
                                        i4 = i10;
                                    } else if (componentCallbacksC92055 == componentCallbacksC92054) {
                                        i4 = i10;
                                        z3 = true;
                                    } else {
                                        if (componentCallbacksC92055 == componentCallbacksC92052) {
                                            i4 = i10;
                                            i5 = 0;
                                            arrayList8.add(i8, new C11239(9, componentCallbacksC92055, 0));
                                            i8++;
                                            componentCallbacksC92052 = null;
                                        } else {
                                            i4 = i10;
                                            i5 = 0;
                                        }
                                        C11239 c112392 = new C11239(3, componentCallbacksC92055, i5);
                                        c112392.f33699 = c11239.f33699;
                                        c112392.f33696 = c11239.f33696;
                                        c112392.f33701 = c11239.f33701;
                                        c112392.f33702 = c11239.f33702;
                                        arrayList8.add(i8, c112392);
                                        arrayList7.remove(componentCallbacksC92055);
                                        i8++;
                                        componentCallbacksC92052 = componentCallbacksC92052;
                                    }
                                    size--;
                                    i10 = i4;
                                    c115303 = c115304;
                                }
                                c115302 = c115303;
                                if (z3) {
                                    arrayList8.remove(i8);
                                    i8--;
                                } else {
                                    c11239.f33695 = 1;
                                    c11239.f33698 = true;
                                    arrayList7.add(componentCallbacksC92054);
                                }
                                i3 = 1;
                            }
                            i8 += i3;
                            i7 = 1;
                            c115303 = c115302;
                        }
                        c115302 = c115303;
                        i3 = 1;
                        arrayList7.add(c11239.f33700);
                        i8 += i3;
                        i7 = 1;
                        c115303 = c115302;
                    }
                    c11530 = c115303;
                } else {
                    c11530 = c115303;
                    int i11 = 1;
                    ArrayList arrayList9 = this.f16241;
                    ArrayList arrayList10 = c181052.f51805;
                    int size2 = arrayList10.size() - 1;
                    while (size2 >= 0) {
                        C11239 c112393 = (C11239) arrayList10.get(size2);
                        int i12 = c112393.f33695;
                        if (i12 != i11) {
                            if (i12 != 3) {
                                switch (i12) {
                                    case 8:
                                        componentCallbacksC9205 = null;
                                        componentCallbacksC92052 = componentCallbacksC9205;
                                        break;
                                    case 9:
                                        componentCallbacksC9205 = c112393.f33700;
                                        componentCallbacksC92052 = componentCallbacksC9205;
                                        break;
                                    case 10:
                                        c112393.f33697 = c112393.f33703;
                                        break;
                                }
                                size2--;
                                i11 = 1;
                            }
                            arrayList9.add(c112393.f33700);
                            size2--;
                            i11 = 1;
                        }
                        arrayList9.remove(c112393.f33700);
                        size2--;
                        i11 = 1;
                    }
                }
                z2 = z2 || c181052.f51800;
                i6++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                c115303 = c11530;
            } else {
                C11530 c115305 = c115303;
                this.f16241.clear();
                if (!z && this.f16249 >= 1) {
                    for (int i13 = i; i13 < i2; i13++) {
                        Iterator it = ((C18105) arrayList.get(i13)).f51805.iterator();
                        while (it.hasNext()) {
                            ComponentCallbacksC9205 componentCallbacksC92056 = ((C11239) it.next()).f33700;
                            if (componentCallbacksC92056 != null && componentCallbacksC92056.mFragmentManager != null) {
                                c115305.m28380(m14922(componentCallbacksC92056));
                            }
                        }
                    }
                }
                for (int i14 = i; i14 < i2; i14++) {
                    C18105 c181053 = (C18105) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        c181053.m42225(-1);
                        AbstractC5180 abstractC5180 = c181053.f56359;
                        ArrayList arrayList11 = c181053.f51805;
                        boolean z4 = true;
                        for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                            C11239 c112394 = (C11239) arrayList11.get(size3);
                            ComponentCallbacksC9205 componentCallbacksC92057 = c112394.f33700;
                            if (componentCallbacksC92057 != null) {
                                componentCallbacksC92057.mBeingSaved = false;
                                componentCallbacksC92057.setPopDirection(z4);
                                int i15 = c181053.f51813;
                                int i16 = o.a.r;
                                if (i15 != 4097) {
                                    if (i15 != 8194) {
                                        i16 = o.a.d;
                                        if (i15 != 8197) {
                                            i16 = i15 != 4099 ? i15 != 4100 ? 0 : o.a.u : o.a.c;
                                        }
                                    } else {
                                        i16 = o.a.a;
                                    }
                                }
                                componentCallbacksC92057.setNextTransition(i16);
                                componentCallbacksC92057.setSharedElementNames(c181053.f51812, c181053.f51802);
                            }
                            switch (c112394.f33695) {
                                case 1:
                                    componentCallbacksC92057.setAnimations(c112394.f33699, c112394.f33701, c112394.f33696, c112394.f33702);
                                    z4 = true;
                                    abstractC5180.m14873(componentCallbacksC92057, true);
                                    abstractC5180.m14897(componentCallbacksC92057);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c112394.f33695);
                                case 3:
                                    componentCallbacksC92057.setAnimations(c112394.f33699, c112394.f33701, c112394.f33696, c112394.f33702);
                                    abstractC5180.m14861(componentCallbacksC92057);
                                    z4 = true;
                                case 4:
                                    componentCallbacksC92057.setAnimations(c112394.f33699, c112394.f33701, c112394.f33696, c112394.f33702);
                                    abstractC5180.getClass();
                                    if (m14853(2)) {
                                        C11003.toString(componentCallbacksC92057);
                                    }
                                    if (componentCallbacksC92057.mHidden) {
                                        componentCallbacksC92057.mHidden = false;
                                        componentCallbacksC92057.mHiddenChanged = !componentCallbacksC92057.mHiddenChanged;
                                    }
                                    z4 = true;
                                case 5:
                                    componentCallbacksC92057.setAnimations(c112394.f33699, c112394.f33701, c112394.f33696, c112394.f33702);
                                    abstractC5180.m14873(componentCallbacksC92057, true);
                                    abstractC5180.m14892(componentCallbacksC92057);
                                    z4 = true;
                                case 6:
                                    componentCallbacksC92057.setAnimations(c112394.f33699, c112394.f33701, c112394.f33696, c112394.f33702);
                                    abstractC5180.m14919(componentCallbacksC92057);
                                    z4 = true;
                                case 7:
                                    componentCallbacksC92057.setAnimations(c112394.f33699, c112394.f33701, c112394.f33696, c112394.f33702);
                                    abstractC5180.m14873(componentCallbacksC92057, true);
                                    abstractC5180.m14921(componentCallbacksC92057);
                                    z4 = true;
                                case 8:
                                    abstractC5180.m14915(null);
                                    z4 = true;
                                case 9:
                                    abstractC5180.m14915(componentCallbacksC92057);
                                    z4 = true;
                                case 10:
                                    abstractC5180.m14872(componentCallbacksC92057, c112394.f33703);
                                    z4 = true;
                            }
                        }
                    } else {
                        c181053.m42225(1);
                        AbstractC5180 abstractC51802 = c181053.f56359;
                        ArrayList arrayList12 = c181053.f51805;
                        int size4 = arrayList12.size();
                        int i17 = 0;
                        while (i17 < size4) {
                            C11239 c112395 = (C11239) arrayList12.get(i17);
                            ComponentCallbacksC9205 componentCallbacksC92058 = c112395.f33700;
                            if (componentCallbacksC92058 != null) {
                                componentCallbacksC92058.mBeingSaved = false;
                                componentCallbacksC92058.setPopDirection(false);
                                componentCallbacksC92058.setNextTransition(c181053.f51813);
                                componentCallbacksC92058.setSharedElementNames(c181053.f51802, c181053.f51812);
                            }
                            switch (c112395.f33695) {
                                case 1:
                                    c18105 = c181053;
                                    componentCallbacksC92058.setAnimations(c112395.f33699, c112395.f33701, c112395.f33696, c112395.f33702);
                                    abstractC51802.m14873(componentCallbacksC92058, false);
                                    abstractC51802.m14861(componentCallbacksC92058);
                                    i17++;
                                    c181053 = c18105;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c112395.f33695);
                                case 3:
                                    c18105 = c181053;
                                    componentCallbacksC92058.setAnimations(c112395.f33699, c112395.f33701, c112395.f33696, c112395.f33702);
                                    abstractC51802.m14897(componentCallbacksC92058);
                                    i17++;
                                    c181053 = c18105;
                                case 4:
                                    c18105 = c181053;
                                    componentCallbacksC92058.setAnimations(c112395.f33699, c112395.f33701, c112395.f33696, c112395.f33702);
                                    abstractC51802.m14892(componentCallbacksC92058);
                                    i17++;
                                    c181053 = c18105;
                                case 5:
                                    c18105 = c181053;
                                    componentCallbacksC92058.setAnimations(c112395.f33699, c112395.f33701, c112395.f33696, c112395.f33702);
                                    abstractC51802.m14873(componentCallbacksC92058, false);
                                    if (m14853(2)) {
                                        C11003.toString(componentCallbacksC92058);
                                    }
                                    if (componentCallbacksC92058.mHidden) {
                                        componentCallbacksC92058.mHidden = false;
                                        componentCallbacksC92058.mHiddenChanged = !componentCallbacksC92058.mHiddenChanged;
                                    }
                                    i17++;
                                    c181053 = c18105;
                                case 6:
                                    c18105 = c181053;
                                    componentCallbacksC92058.setAnimations(c112395.f33699, c112395.f33701, c112395.f33696, c112395.f33702);
                                    abstractC51802.m14921(componentCallbacksC92058);
                                    i17++;
                                    c181053 = c18105;
                                case 7:
                                    c18105 = c181053;
                                    componentCallbacksC92058.setAnimations(c112395.f33699, c112395.f33701, c112395.f33696, c112395.f33702);
                                    abstractC51802.m14873(componentCallbacksC92058, false);
                                    abstractC51802.m14919(componentCallbacksC92058);
                                    i17++;
                                    c181053 = c18105;
                                case 8:
                                    abstractC51802.m14915(componentCallbacksC92058);
                                    c18105 = c181053;
                                    i17++;
                                    c181053 = c18105;
                                case 9:
                                    abstractC51802.m14915(null);
                                    c18105 = c181053;
                                    i17++;
                                    c181053 = c18105;
                                case 10:
                                    abstractC51802.m14872(componentCallbacksC92058, c112395.f33697);
                                    c18105 = c181053;
                                    i17++;
                                    c181053 = c18105;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i18 = i; i18 < i2; i18++) {
                    C18105 c181054 = (C18105) arrayList.get(i18);
                    if (booleanValue) {
                        int size5 = c181054.f51805.size();
                        while (true) {
                            size5--;
                            if (size5 >= 0) {
                                ComponentCallbacksC9205 componentCallbacksC92059 = ((C11239) c181054.f51805.get(size5)).f33700;
                                if (componentCallbacksC92059 != null) {
                                    m14922(componentCallbacksC92059).m16481();
                                }
                            }
                        }
                    } else {
                        Iterator it2 = c181054.f51805.iterator();
                        while (it2.hasNext()) {
                            ComponentCallbacksC9205 componentCallbacksC920510 = ((C11239) it2.next()).f33700;
                            if (componentCallbacksC920510 != null) {
                                m14922(componentCallbacksC920510).m16481();
                            }
                        }
                    }
                }
                m14864(this.f16249, true);
                HashSet hashSet = new HashSet();
                for (int i19 = i; i19 < i2; i19++) {
                    Iterator it3 = ((C18105) arrayList.get(i19)).f51805.iterator();
                    while (it3.hasNext()) {
                        ComponentCallbacksC9205 componentCallbacksC920511 = ((C11239) it3.next()).f33700;
                        if (componentCallbacksC920511 != null && (viewGroup = componentCallbacksC920511.mContainer) != null) {
                            hashSet.add(AbstractC3477.m10636(viewGroup, m14926()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    AbstractC3477 abstractC3477 = (AbstractC3477) it4.next();
                    abstractC3477.f10997 = booleanValue;
                    abstractC3477.m10649();
                    abstractC3477.m10640();
                }
                for (int i20 = i; i20 < i2; i20++) {
                    C18105 c181055 = (C18105) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue() && c181055.f56360 >= 0) {
                        c181055.f56360 = -1;
                    }
                    c181055.getClass();
                }
                if (!z2 || this.f16226 == null) {
                    return;
                }
                for (int i21 = 0; i21 < this.f16226.size(); i21++) {
                    ((InterfaceC18586) this.f16226.get(i21)).mo29246();
                }
                return;
            }
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m14837(ComponentCallbacksC9205 componentCallbacksC9205) {
        ViewGroup m14848 = m14848(componentCallbacksC9205);
        if (m14848 == null || componentCallbacksC9205.getEnterAnim() + componentCallbacksC9205.getExitAnim() + componentCallbacksC9205.getPopEnterAnim() + componentCallbacksC9205.getPopExitAnim() <= 0) {
            return;
        }
        if (m14848.getTag(R.id.MT_Protector_res_0x7f0a0690) == null) {
            m14848.setTag(R.id.MT_Protector_res_0x7f0a0690, componentCallbacksC9205);
        }
        ((ComponentCallbacksC9205) m14848.getTag(R.id.MT_Protector_res_0x7f0a0690)).setPopDirection(componentCallbacksC9205.getPopDirection());
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private ViewGroup m14848(ComponentCallbacksC9205 componentCallbacksC9205) {
        ViewGroup viewGroup = componentCallbacksC9205.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC9205.mContainerId <= 0 || !this.f16238.mo7107()) {
            return null;
        }
        View mo7106 = this.f16238.mo7106(componentCallbacksC9205.mContainerId);
        if (mo7106 instanceof ViewGroup) {
            return (ViewGroup) mo7106;
        }
        return null;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private HashSet m14851() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f16235.m28387().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C5885) it.next()).m16488().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC3477.m10636(viewGroup, m14926()));
            }
        }
        return hashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14884(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f16212;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.f16212.size() - 1;
            } else {
                int size = this.f16212.size() - 1;
                while (size >= 0) {
                    C18105 c18105 = (C18105) this.f16212.get(size);
                    if (i >= 0 && i == c18105.f56360) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        C18105 c181052 = (C18105) this.f16212.get(i3 - 1);
                        if (i < 0 || i != c181052.f56360) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.f16212.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.f16212.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C18105) this.f16212.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Bundle m14890() {
        int i;
        C14576[] c14576Arr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m14851().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC3477 abstractC3477 = (AbstractC3477) it.next();
            if (abstractC3477.f10996) {
                m14853(2);
                abstractC3477.f10996 = false;
                abstractC3477.m10640();
            }
        }
        Iterator it2 = m14851().iterator();
        while (it2.hasNext()) {
            ((AbstractC3477) it2.next()).m10644();
        }
        m14907(true);
        this.f16227 = true;
        this.f16234.m49694(true);
        C11530 c11530 = this.f16235;
        ArrayList m28401 = c11530.m28401();
        ArrayList m28399 = c11530.m28399();
        if (m28399.isEmpty()) {
            m14853(2);
            return bundle;
        }
        ArrayList m28385 = c11530.m28385();
        ArrayList arrayList = this.f16212;
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            c14576Arr = null;
        } else {
            c14576Arr = new C14576[size];
            for (i = 0; i < size; i++) {
                c14576Arr[i] = new C14576((C18105) this.f16212.get(i));
                if (m14853(2)) {
                    C11003.toString(this.f16212.get(i));
                }
            }
        }
        C15056 c15056 = new C15056();
        c15056.f45952 = m28401;
        c15056.f45953 = m28385;
        c15056.f45951 = c14576Arr;
        c15056.f45947 = this.f16236.get();
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16228;
        if (componentCallbacksC9205 != null) {
            c15056.f45948 = componentCallbacksC9205.mWho;
        }
        ArrayList arrayList2 = c15056.f45946;
        Map map = this.f16240;
        arrayList2.addAll(map.keySet());
        c15056.f45950.addAll(map.values());
        c15056.f45949 = new ArrayList(this.f16243);
        bundle.putParcelable("state", c15056);
        Map map2 = this.f16231;
        for (String str : map2.keySet()) {
            bundle.putBundle(C20094.m46315("result_", str), (Bundle) map2.get(str));
        }
        Iterator it3 = m28399.iterator();
        while (it3.hasNext()) {
            C12940 c12940 = (C12940) it3.next();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("state", c12940);
            bundle.putBundle("fragment_" + c12940.f38811, bundle2);
        }
        return bundle;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14865(Parcelable parcelable) {
        C10616 c10616;
        int i;
        C5885 c5885;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f16216.m14435().getClassLoader());
                this.f16231.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f16216.m14435().getClassLoader());
                arrayList.add((C12940) bundle.getParcelable("state"));
            }
        }
        C11530 c11530 = this.f16235;
        c11530.m28390(arrayList);
        C15056 c15056 = (C15056) bundle3.getParcelable("state");
        if (c15056 == null) {
            return;
        }
        c11530.m28384();
        Iterator it = c15056.f45952.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c10616 = this.f16218;
            i = 2;
            if (!hasNext) {
                break;
            }
            C12940 m28375 = c11530.m28375((String) it.next(), null);
            if (m28375 != null) {
                ComponentCallbacksC9205 m49695 = this.f16234.m49695(m28375.f38811);
                if (m49695 != null) {
                    if (m14853(2)) {
                        m49695.toString();
                    }
                    c5885 = new C5885(c10616, c11530, m49695, m28375);
                } else {
                    c5885 = new C5885(this.f16218, this.f16235, this.f16216.m14435().getClassLoader(), m14889(), m28375);
                }
                ComponentCallbacksC9205 m16488 = c5885.m16488();
                m16488.mFragmentManager = this;
                if (m14853(2)) {
                    m16488.toString();
                }
                c5885.m16477(this.f16216.m14435().getClassLoader());
                c11530.m28380(c5885);
                c5885.m16476(this.f16249);
            }
        }
        Iterator it2 = this.f16234.m49701().iterator();
        while (it2.hasNext()) {
            ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) it2.next();
            if (!c11530.m28383(componentCallbacksC9205.mWho)) {
                if (m14853(2)) {
                    componentCallbacksC9205.toString();
                    C11003.toString(c15056.f45952);
                }
                this.f16234.m49699(componentCallbacksC9205);
                componentCallbacksC9205.mFragmentManager = this;
                C5885 c58852 = new C5885(c10616, c11530, componentCallbacksC9205);
                c58852.m16476(1);
                c58852.m16481();
                componentCallbacksC9205.mRemoving = true;
                c58852.m16481();
            }
        }
        c11530.m28379(c15056.f45953);
        if (c15056.f45951 != null) {
            this.f16212 = new ArrayList(c15056.f45951.length);
            int i2 = 0;
            while (true) {
                C14576[] c14576Arr = c15056.f45951;
                if (i2 >= c14576Arr.length) {
                    break;
                }
                C14576 c14576 = c14576Arr[i2];
                ArrayList arrayList2 = c14576.f44627;
                C18105 c18105 = new C18105(this);
                int[] iArr = c14576.f44625;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iArr.length) {
                    C11239 c11239 = new C11239();
                    int i5 = i3 + 1;
                    c11239.f33695 = iArr[i3];
                    if (m14853(i)) {
                        C11003.toString(c18105);
                        int i6 = iArr[i5];
                    }
                    c11239.f33703 = EnumC13728.values()[c14576.f44622[i4]];
                    c11239.f33697 = EnumC13728.values()[c14576.f44620[i4]];
                    int i7 = i3 + 2;
                    c11239.f33698 = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    c11239.f33699 = i8;
                    int i9 = iArr[i3 + 3];
                    c11239.f33701 = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    c11239.f33696 = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    c11239.f33702 = i12;
                    c18105.f51815 = i8;
                    c18105.f51803 = i9;
                    c18105.f51804 = i11;
                    c18105.f51808 = i12;
                    c18105.m39683(c11239);
                    i4++;
                    i = 2;
                }
                c18105.f51813 = c14576.f44619;
                c18105.f51814 = c14576.f44624;
                c18105.f51800 = true;
                c18105.f51810 = c14576.f44629;
                c18105.f51807 = c14576.f44621;
                c18105.f51809 = c14576.f44630;
                c18105.f51811 = c14576.f44631;
                c18105.f51802 = c14576.f44628;
                c18105.f51812 = c14576.f44623;
                c18105.f51801 = c14576.f44632;
                c18105.f56360 = c14576.f44626;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    String str3 = (String) arrayList2.get(i13);
                    if (str3 != null) {
                        ((C11239) c18105.f51805.get(i13)).f33700 = c11530.m28389(str3);
                    }
                }
                c18105.m42225(1);
                if (m14853(2)) {
                    c18105.toString();
                    PrintWriter printWriter = new PrintWriter(new C0654());
                    c18105.m42226(EnumC0121.f1143, printWriter, false);
                    printWriter.close();
                }
                this.f16212.add(c18105);
                i2++;
                i = 2;
            }
        } else {
            this.f16212 = null;
        }
        this.f16236.set(c15056.f45947);
        String str4 = c15056.f45948;
        if (str4 != null) {
            ComponentCallbacksC9205 m28389 = c11530.m28389(str4);
            this.f16228 = m28389;
            m14847(m28389);
        }
        ArrayList arrayList3 = c15056.f45946;
        if (arrayList3 != null) {
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                this.f16240.put((String) arrayList3.get(i14), (C6816) c15056.f45950.get(i14));
            }
        }
        this.f16243 = new ArrayDeque(c15056.f45949);
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC4971 m14893() {
        return this.f16216;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14930() {
        return this.f16225;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC15553 m14858() {
        return this.f16238;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14868(l.AbstractC4971 r4, l.AbstractC15553 r5, l.ComponentCallbacksC9205 r6) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC5180.m14868(l.ۙ᩻֫, l.ܶ᩻֫, l.ۡ᩻֫):void");
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m14909() {
        if (this.f16216 == null) {
            return;
        }
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.noteStateNotSaved();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14870(ComponentCallbacksC9205 componentCallbacksC9205, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.f16221 != null) {
            this.f16243.addLast(new C3769(componentCallbacksC9205.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f16221.mo8405(intent);
            return;
        }
        this.f16216.m14427(intent, i, bundle);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14871(ComponentCallbacksC9205 componentCallbacksC9205, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f16213 != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (m14853(2)) {
                    bundle.toString();
                    intent2.toString();
                    C11003.toString(componentCallbacksC9205);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            C5507 c5507 = new C5507(intentSender);
            c5507.m15642(intent2);
            c5507.m15641(i3, i2);
            C8329 m15640 = c5507.m15640();
            this.f16243.addLast(new C3769(componentCallbacksC9205.mWho, i));
            if (m14853(2)) {
                componentCallbacksC9205.toString();
            }
            this.f16213.mo8405(m15640);
            return;
        }
        this.f16216.m14428(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14874(ComponentCallbacksC9205 componentCallbacksC9205, String[] strArr, int i) {
        if (this.f16248 != null) {
            this.f16243.addLast(new C3769(componentCallbacksC9205.mWho, i));
            this.f16248.mo8405(strArr);
            return;
        }
        this.f16216.getClass();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m14923() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(0);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m14920() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(1);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m14887() {
        m14854(2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14917() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(4);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m14914() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(5);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m14894() {
        this.f16227 = false;
        this.f16237 = false;
        this.f16234.m49694(false);
        m14854(7);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14927() {
        m14854(5);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m14885() {
        this.f16237 = true;
        this.f16234.m49694(true);
        m14854(4);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m14932() {
        m14854(1);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14911() {
        boolean z = true;
        this.f16245 = true;
        m14907(true);
        Iterator it = m14851().iterator();
        while (it.hasNext()) {
            ((AbstractC3477) it.next()).m10644();
        }
        AbstractC4971 abstractC4971 = this.f16216;
        boolean z2 = abstractC4971 instanceof InterfaceC13207;
        C11530 c11530 = this.f16235;
        if (z2) {
            z = c11530.m28393().m49700();
        } else if (C12354.m29972(abstractC4971.m14435())) {
            z = true ^ ((Activity) this.f16216.m14435()).isChangingConfigurations();
        }
        if (z) {
            Iterator it2 = this.f16240.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C6816) it2.next()).f21141.iterator();
                while (it3.hasNext()) {
                    c11530.m28393().m49692((String) it3.next());
                }
            }
        }
        m14854(-1);
        Object obj = this.f16216;
        if (obj instanceof InterfaceC12876) {
            ((InterfaceC12876) obj).mo31307(this.f16229);
        }
        Object obj2 = this.f16216;
        if (obj2 instanceof InterfaceC2999) {
            ((InterfaceC2999) obj2).mo9144(this.f16217);
        }
        Object obj3 = this.f16216;
        if (obj3 instanceof InterfaceC10509) {
            ((InterfaceC10509) obj3).mo26414(this.f16215);
        }
        Object obj4 = this.f16216;
        if (obj4 instanceof InterfaceC6275) {
            ((InterfaceC6275) obj4).mo17287(this.f16230);
        }
        Object obj5 = this.f16216;
        if (obj5 instanceof InterfaceC19974) {
            ((InterfaceC19974) obj5).removeMenuProvider(this.f16211);
        }
        this.f16216 = null;
        this.f16238 = null;
        this.f16225 = null;
        if (this.f16244 != null) {
            this.f16247.m2243();
            this.f16244 = null;
        }
        AbstractC9741 abstractC9741 = this.f16221;
        if (abstractC9741 != null) {
            abstractC9741.mo8404();
            this.f16213.mo8404();
            this.f16248.mo8404();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m14854(int i) {
        try {
            this.f16223 = true;
            this.f16235.m28377(i);
            m14864(i, false);
            Iterator it = m14851().iterator();
            while (it.hasNext()) {
                ((AbstractC3477) it.next()).m10644();
            }
            this.f16223 = false;
            m14907(true);
        } catch (Throwable th) {
            this.f16223 = false;
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14881(boolean z, boolean z2) {
        if (z2 && (this.f16216 instanceof InterfaceC10509)) {
            m14839(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performMultiWindowModeChanged(z);
                if (z2) {
                    componentCallbacksC9205.mChildFragmentManager.m14881(z, true);
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14904(boolean z, boolean z2) {
        if (z2 && (this.f16216 instanceof InterfaceC6275)) {
            m14839(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performPictureInPictureModeChanged(z);
                if (z2) {
                    componentCallbacksC9205.mChildFragmentManager.m14904(z, true);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14880(boolean z, Configuration configuration) {
        if (z && (this.f16216 instanceof InterfaceC2999)) {
            m14839(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performConfigurationChanged(configuration);
                if (z) {
                    componentCallbacksC9205.mChildFragmentManager.m14880(true, configuration);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14879(boolean z) {
        if (z && (this.f16216 instanceof InterfaceC12876)) {
            m14839(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performLowMemory();
                if (z) {
                    componentCallbacksC9205.mChildFragmentManager.m14879(true);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14882(Menu menu, MenuInflater menuInflater) {
        if (this.f16249 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null && componentCallbacksC9205.isMenuVisible() && componentCallbacksC9205.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC9205);
                z = true;
            }
        }
        if (this.f16232 != null) {
            for (int i = 0; i < this.f16232.size(); i++) {
                ComponentCallbacksC9205 componentCallbacksC92052 = (ComponentCallbacksC9205) this.f16232.get(i);
                if (arrayList == null || !arrayList.contains(componentCallbacksC92052)) {
                    componentCallbacksC92052.onDestroyOptionsMenu();
                }
            }
        }
        this.f16232 = arrayList;
        return z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14905(Menu menu) {
        boolean z = false;
        if (this.f16249 < 1) {
            return false;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null && componentCallbacksC9205.isMenuVisible() && componentCallbacksC9205.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14906(MenuItem menuItem) {
        if (this.f16249 < 1) {
            return false;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null && componentCallbacksC9205.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14883(MenuItem menuItem) {
        if (this.f16249 < 1) {
            return false;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null && componentCallbacksC9205.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14866(Menu menu) {
        if (this.f16249 < 1) {
            return;
        }
        for (ComponentCallbacksC9205 componentCallbacksC9205 : this.f16235.m28397()) {
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m14915(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205 != null) {
            if (!componentCallbacksC9205.equals(this.f16235.m28389(componentCallbacksC9205.mWho)) || (componentCallbacksC9205.mHost != null && componentCallbacksC9205.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + componentCallbacksC9205 + " is not an active fragment of FragmentManager " + this);
            }
        }
        ComponentCallbacksC9205 componentCallbacksC92052 = this.f16228;
        this.f16228 = componentCallbacksC9205;
        m14847(componentCallbacksC92052);
        m14847(this.f16228);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m14847(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205 != null) {
            if (componentCallbacksC9205.equals(this.f16235.m28389(componentCallbacksC9205.mWho))) {
                componentCallbacksC9205.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m14896() {
        m14846();
        m14847(this.f16228);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14872(ComponentCallbacksC9205 componentCallbacksC9205, EnumC13728 enumC13728) {
        if (!componentCallbacksC9205.equals(this.f16235.m28389(componentCallbacksC9205.mWho)) || (componentCallbacksC9205.mHost != null && componentCallbacksC9205.mFragmentManager != this)) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC9205 + " is not an active fragment of FragmentManager " + this);
        }
        componentCallbacksC9205.mMaxState = enumC13728;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20494 m14889() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16225;
        if (componentCallbacksC9205 != null) {
            return componentCallbacksC9205.mFragmentManager.m14889();
        }
        return this.f16242;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC13354 m14926() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16225;
        if (componentCallbacksC9205 != null) {
            return componentCallbacksC9205.mFragmentManager.m14926();
        }
        return this.f16220;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10616 m14929() {
        return this.f16218;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14912(ComponentCallbacksC9205 componentCallbacksC9205) {
        Iterator it = this.f16246.iterator();
        while (it.hasNext()) {
            ((InterfaceC19997) it.next()).mo18099(componentCallbacksC9205);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m14891() {
        Iterator it = this.f16235.m28394().iterator();
        while (it.hasNext()) {
            ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) it.next();
            if (componentCallbacksC9205 != null) {
                componentCallbacksC9205.onHiddenChanged(componentCallbacksC9205.isHidden());
                componentCallbacksC9205.mChildFragmentManager.m14891();
            }
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m14855(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205.mHasMenu && componentCallbacksC9205.mMenuVisible) {
            return true;
        }
        Iterator it = componentCallbacksC9205.mChildFragmentManager.f16235.m28394().iterator();
        boolean z = false;
        while (it.hasNext()) {
            ComponentCallbacksC9205 componentCallbacksC92052 = (ComponentCallbacksC9205) it.next();
            if (componentCallbacksC92052 != null) {
                z = m14855(componentCallbacksC92052);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14928(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (componentCallbacksC9205.mAdded && m14855(componentCallbacksC9205)) {
            this.f16222 = true;
        }
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    private boolean m14849() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f16225;
        if (componentCallbacksC9205 == null) {
            return true;
        }
        return componentCallbacksC9205.isAdded() && this.f16225.getParentFragmentManager().m14849();
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final LayoutInflater.Factory2 m14913() {
        return this.f16210;
    }
}
