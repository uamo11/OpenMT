package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: 75NJ */
/* renamed from: l.ܽ֨ᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ActivityC16315 extends AbstractActivityC3346 {

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50233 = 0;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public C13132 f50234;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C13136 f50235;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f50236;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C1556 f50237;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C9762 f50239;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50240;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public boolean f50242;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public C16557 f50244;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C10091 f50247;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C8202 f50248;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f50249;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public C12230 f50251;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C20256 f50252;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C13064 f50253;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public static final Object f50232 = new Object();

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public static final Object f50231 = new Object();

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C1700 f50245 = new C1700(this, 1);

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f50241 = new ArrayList();

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f50246 = -1;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f50243 = false;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C8817 f50250 = C8817.m22787();

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public boolean f50238 = false;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "TextEditor";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38415(ActivityC16315 activityC16315, int i, CheckBox checkBox) {
        activityC16315.getClass();
        ArrayList arrayList = activityC16315.f50241;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C6055.m16891(arrayList2, new C2330());
        boolean isChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C13617(activityC16315, linkedList, (C22372) it.next(), isChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC16315.f50243 = true;
        ((C13617) linkedList.removeFirst()).m32733();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38429(ActivityC16315 activityC16315, int i, CheckBox checkBox) {
        activityC16315.getClass();
        ArrayList arrayList = new ArrayList(activityC16315.f50241.subList(0, i));
        C6055.m16891(arrayList, new C2330());
        boolean isChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C13617(activityC16315, linkedList, (C22372) it.next(), isChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC16315.f50243 = true;
        ((C13617) linkedList.removeFirst()).m32733();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38436(ActivityC16315 activityC16315, int i, CheckBox checkBox) {
        activityC16315.getClass();
        ArrayList arrayList = new ArrayList(activityC16315.f50241);
        arrayList.remove(i);
        C6055.m16891(arrayList, new C2330());
        boolean isChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C13617(activityC16315, linkedList, (C22372) it.next(), isChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC16315.f50243 = true;
        ((C13617) linkedList.removeFirst()).m32733();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] bArr;
        C12951 c12951;
        int m38437;
        super.onCreate(bundle);
        setTitle("");
        m10241(R.layout.MT_Protector_res_0x7f0d0055);
        m10214();
        m10244().m30602(2);
        m38446();
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C22085 c22085 = new C22085(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c22085);
        m10241(R.id.MT_Protector_res_0x7f0a03a3).setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۚᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC16315.f50233;
                ActivityC16315.this.m38449(false);
            }
        });
        C9762 c97622 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a0173);
        this.f50239 = c97622;
        c97622.setTitle(R.string.MT_Protector_res_0x7f120a57);
        this.f50239.inflateMenu(R.menu.MT_Protector_res_0x7f0f001f);
        this.f50244 = new C16557(this.f50239, R.id.MT_Protector_res_0x7f0a0336, R.id.more);
        this.f50239.setOnMenuItemClickListener(new C19264(this));
        this.f50253 = (C13064) m10241(R.id.MT_Protector_res_0x7f0a0172);
        this.f50249 = (FloatingActionButton) m10241(R.id.MT_Protector_res_0x7f0a0211);
        m10229(this.f50253, m10241(R.id.MT_Protector_res_0x7f0a0171), this.f10584, m10241(R.id.MT_Protector_res_0x7f0a02db), this.f50239, this.f50249);
        this.f50253.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.֡ۚᩳ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC16315.m38413(ActivityC16315.this);
            }
        });
        C7623 c7623 = new C7623(this, this.f50253, this.f10584);
        c7623.m20413().m15982(C21943.f70298.getDefaultColor());
        this.f50253.m31651(c7623);
        c7623.m20414();
        this.f50253.m31651(new C21380(this));
        C20256 c20256 = (C20256) new C4741(this).m13885(C20256.class);
        this.f50252 = c20256;
        c20256.m46503(this, this.f50245);
        this.f50251 = (C12230) new C4741(this).m13885(C12230.class);
        this.f50248 = new C8202();
        C4925.m14316(new RunnableC5152(0, this), 500L);
        boolean z = bundle != null;
        synchronized (f50232) {
            AbstractC15440 m41823 = C17852.m41823();
            if (m41823.mo23120()) {
                try {
                    bArr = m41823.m36506();
                } catch (Exception e) {
                    this.f50252.m46502((Throwable) e);
                    bArr = null;
                }
                if (bArr != null) {
                    try {
                        c12951 = new C12951(bArr);
                        C22124.m49722((InterfaceC20008) c12951, 1736577895);
                    } catch (Exception e2) {
                        this.f50252.m46502((Throwable) e2);
                    }
                    while (c12951.available() > 0) {
                        byte[] m31496 = c12951.m31496();
                        C22372 c22372 = new C22372();
                        if (c22372.getArguments() != null) {
                            throw new RuntimeException("Arguments is not null.");
                        }
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(m31496, 0, m31496.length);
                        obtain.setDataPosition(0);
                        Bundle bundle2 = new Bundle();
                        bundle2.readFromParcel(obtain);
                        c22372.setArguments(bundle2);
                        obtain.recycle();
                        ComponentCallbacksC9205 m14899 = m2843().m14899(c22372.m5412());
                        if (!z) {
                            C12171.m29644(m14899);
                            c22372.m5424();
                            if (c22372.m5417()) {
                                this.f50241.add(c22372);
                            }
                        } else if (m14899 != null) {
                            C22372 c223722 = (C22372) m14899;
                            if (!c223722.m5417()) {
                                try {
                                    c223722.m5424();
                                } catch (Exception e3) {
                                    this.f50252.m46502((Throwable) e3);
                                }
                            }
                            if (c223722.m5417()) {
                                this.f50241.add(c223722);
                            }
                        } else {
                            c22372.m5424();
                            if (c22372.m5417()) {
                                this.f50241.add(c22372);
                            }
                        }
                        this.f50252.m46502((Throwable) e2);
                    }
                }
                C20256 c202562 = this.f50252;
                if (c202562.f65495) {
                    c202562.f65495 = false;
                    List mo23549 = C17852.m41819().mo23549(true);
                    final ArrayList arrayList = new ArrayList();
                    arrayList.add(C11459.m28260("current|list").matcher((CharSequence) ""));
                    for (int i = 0; i < this.f50241.size(); i++) {
                        arrayList.add(C11459.m28260(C3939.m11985(((C22372) this.f50241.get(i)).m5412()) + "((-\\d+)?\\.dat|\\.tat|\\.lit|\\.e2)").matcher((CharSequence) ""));
                    }
                    C5378.stream(mo23549).filter(new Predicate() { // from class: l.ܶۚᩳ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19285.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public /* synthetic */ Predicate mo4928negate() {
                            return C19285.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19285.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i2 = ActivityC16315.f50233;
                            String name = ((AbstractC15440) obj).getName();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C12164 c12164 = (C12164) it.next();
                                c12164.m29615reset((CharSequence) name);
                                if (c12164.matches()) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }).forEach(new C23581(1));
                }
            }
        }
        this.f50247 = new C10091(this);
        C13132 c13132 = (C13132) findViewById(R.id.MT_Protector_res_0x7f0a0486);
        this.f50234 = c13132;
        c13132.setAdapter(this.f50247);
        this.f50234.setLayoutManager(new C6495(this));
        this.f50234.getItemAnimator().m50782(200L);
        this.f50234.getItemAnimator().m50792(200L);
        this.f50234.getItemAnimator().m50789(200L);
        this.f50234.getItemAnimator().m50786(200L);
        this.f50249.setOnClickListener(new View.OnClickListener() { // from class: l.ܳۚᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r1.f50234.smoothScrollToPosition(ActivityC16315.this.f50246);
            }
        });
        this.f50234.addOnScrollListener(new C4446(this));
        C13132 c131322 = this.f50234;
        C16557 c16557 = this.f50244;
        C11003.requireNonNull(c16557);
        c131322.addOnItemTouchListener(new C5248(c131322, new C23496(c16557)));
        C1556 c1556 = new C1556(new C12912(this));
        this.f50237 = c1556;
        c1556.m5322(this.f50234);
        this.f50244.m38952(this.f50247);
        this.f50244.m38950(this.f50237);
        m38423();
        if ((bundle == null ? m38419(getIntent(), false, true) : false) || this.f50246 != -1 || (m38437 = m38437()) == -1) {
            return;
        }
        m38426(m38437, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38413(ActivityC16315 activityC16315) {
        int width = (activityC16315.f50253.getWidth() - activityC16315.f50253.getChildAt(1).getWidth()) - activityC16315.f50249.getWidth();
        int m27878 = C11266.m27878(36.0f);
        float f = -(width > m27878 * 2 ? width - m27878 : width / 2);
        if (activityC16315.f50249.getTranslationX() != f) {
            activityC16315.f50249.setTranslationX(f);
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        this.f50242 = false;
        super.onStop();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m38446();
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    private void m38446() {
        if (getResources().getConfiguration().orientation == 2) {
            m10244().m30599(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m10244().m30604(1);
        }
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f50236) {
            return;
        }
        m38419(intent, false, false);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38458(Intent intent) {
        m38419(intent, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m38419(android.content.Intent r9, boolean r10, final boolean r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC16315.m38419(android.content.Intent, boolean, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38416(ActivityC16315 activityC16315, Intent intent, boolean z) {
        int m38437;
        C13136 c13136 = activityC16315.f50235;
        if (c13136 != null) {
            c13136.m31857();
            activityC16315.f50235 = null;
        }
        activityC16315.f50236 = false;
        AbstractC5180 m2843 = activityC16315.m2843();
        if (activityC16315.isFinishing() || activityC16315.isDestroyed() || m2843.m14910() || m2843.m14886()) {
            return;
        }
        activityC16315.m38419(intent, true, false);
        if (z && activityC16315.f50246 == -1 && (m38437 = activityC16315.m38437()) != -1) {
            activityC16315.m38426(m38437, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38412(CharSequence charSequence) {
        C17622.f53840 = charSequence;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m38459(int i) {
        C8202 c8202 = this.f50248;
        if (c8202 != null) {
            c8202.m21700(this, R.layout.MT_Protector_res_0x7f0d0054);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View m38460(int i) {
        C8202 c8202 = this.f50248;
        if (c8202 != null) {
            return c8202.m21699(R.layout.MT_Protector_res_0x7f0d0054);
        }
        return null;
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m38452() {
        if (ApplicationC20075.f65010.getBoolean("double_confirm_before_exit", false)) {
            return this.f50250.m22791();
        }
        return false;
    }

    @Override // l.ActivityC2124
    /* renamed from: ᩴ */
    public final void mo2954() {
        this.f50242 = false;
        m38449(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38449(boolean z) {
        if (z && m38452()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12079b);
            return;
        }
        System.out.println("exitToExternalApp=" + this.f50242);
        m38439();
        finish();
        if (this.f50242) {
            moveTaskToBack(true);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38454(boolean z) {
        if (this.f50238) {
            return;
        }
        boolean z2 = true;
        this.f50238 = true;
        ArrayList arrayList = this.f50241;
        if (z) {
            C22372 c22372 = (C22372) arrayList.get(this.f50246);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C22372 c223722 = (C22372) it.next();
                if (c223722.mo5419() && c223722 != c22372 && !c223722.m5426()) {
                    arrayList2.add(c223722);
                }
            }
            boolean isEmpty = arrayList2.isEmpty();
            boolean z3 = !isEmpty;
            if (!isEmpty) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C22372) it2.next()).m50233();
                }
                arrayList.removeAll(arrayList2);
                this.f50246 = arrayList.indexOf(c22372);
            }
            if (c22372.mo5419()) {
                arrayList.remove(this.f50246);
                int i = this.f50246;
                if (i > 0) {
                    this.f50246 = i - 1;
                }
                c22372.m50233();
            } else {
                z2 = z3;
            }
            if (z2) {
                m38441();
                m38432();
            }
        } else {
            C22372 c223723 = (C22372) arrayList.get(this.f50246);
            if (c223723.mo5419()) {
                arrayList.remove(this.f50246);
                int i2 = this.f50246;
                if (i2 > 0) {
                    this.f50246 = i2 - 1;
                }
                c223723.m50233();
                m38441();
                m38432();
            }
        }
        m38449(false);
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m38439();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onPause() {
        super.onPause();
        m38439();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38447(MenuItem menuItem) {
        if (C13876.f41361.m22793()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector_res_0x7f0a016c) {
            this.f50244.m38953(true);
            return;
        }
        if (this.f50244.m38954()) {
            return;
        }
        ArrayList arrayList = this.f50241;
        if (itemId != R.id.MT_Protector_res_0x7f0a0376) {
            if (itemId == R.id.MT_Protector_res_0x7f0a0336) {
                m38461();
                m38455();
                return;
            } else {
                if (itemId == R.id.MT_Protector_res_0x7f0a0380) {
                    ((C22372) arrayList.get(this.f50246)).onOptionsItemSelected(menuItem);
                    return;
                }
                return;
            }
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            C22372 c22372 = (C22372) it.next();
            if (c22372.m5426() && !c22372.m5410()) {
                linkedList.add(new C15315(c22372, this));
            }
        }
        if (linkedList.isEmpty()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
        } else {
            new C19969(this, linkedList).m20274();
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m38443(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f50241;
        if (i >= arrayList.size()) {
            return null;
        }
        return C6554.m18061(50, ((C22372) arrayList.get(i)).m5420().f15019.getName());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38418(ActivityC16315 activityC16315, C3060 c3060, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList = activityC16315.f50241;
        C7268 c7268 = new C7268();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            C22372 c22372 = (C22372) arrayList.get(i12);
            if (!c22372.m5413()) {
                i8 = c7268.f22337;
                c7268.f22337 = i8 + 1;
                if (!c22372.m5426()) {
                    i11 = c7268.f22339;
                    c7268.f22339 = i11 + 1;
                }
                if (i12 < i) {
                    i10 = c7268.f22336;
                    c7268.f22336 = i10 + 1;
                } else if (i12 > i) {
                    i9 = c7268.f22338;
                    c7268.f22338 = i9 + 1;
                }
            }
        }
        if (C7268.m19512(c7268)) {
            SubMenu addSubMenu = c3060.addSubMenu(0, R.id.MT_Protector_res_0x7f0a0367, 0, activityC16315.getString(R.string.MT_Protector_res_0x7f120189) + "…");
            addSubMenu.getItem().setIcon(R.drawable.MT_Protector_res_0x7f0801de);
            addSubMenu.setHeaderTitle(R.string.MT_Protector_res_0x7f1207ce);
            MenuItem add = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a036b, 0, R.string.MT_Protector_res_0x7f1207d6);
            i2 = c7268.f22336;
            i3 = c7268.f22338;
            add.setEnabled(i2 + i3 > 0);
            MenuItem add2 = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a0369, 0, R.string.MT_Protector_res_0x7f1207d1);
            i4 = c7268.f22337;
            add2.setEnabled(i4 > 0);
            MenuItem add3 = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a036c, 0, R.string.MT_Protector_res_0x7f1207d8);
            i5 = c7268.f22339;
            add3.setEnabled(i5 > 0);
            MenuItem add4 = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a0368, 0, R.string.MT_Protector_res_0x7f1207cf);
            i6 = c7268.f22336;
            add4.setEnabled(i6 > 0);
            MenuItem add5 = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a036a, 0, R.string.MT_Protector_res_0x7f1207d3);
            i7 = c7268.f22338;
            add5.setEnabled(i7 > 0);
        }
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38456() {
        return this.f50243;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m38451(final int i) {
        String m38443 = m38443(i);
        if (m38443 == null) {
            return;
        }
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d00e5);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(getString(R.string.MT_Protector_res_0x7f1207d7, m38443));
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۜۚᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC16315.m38436(ActivityC16315.this, i, checkBox);
            }
        };
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, onClickListener);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38417(ActivityC16315 activityC16315, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC16315.f50241);
        C6055.m16891(arrayList, new C2330());
        boolean isChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C13617(activityC16315, linkedList, (C22372) it.next(), isChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC16315.f50243 = true;
        ((C13617) linkedList.removeFirst()).m32733();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38427(ActivityC16315 activityC16315) {
        activityC16315.f50243 = true;
        try {
            Iterator it = new ArrayList(activityC16315.f50241).iterator();
            while (it.hasNext()) {
                C22372 c22372 = (C22372) it.next();
                if (!c22372.m5426() && !c22372.m5413()) {
                    activityC16315.m38448(c22372);
                }
            }
        } finally {
            activityC16315.f50243 = false;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m38457(int i) {
        String m38443 = m38443(i);
        if (m38443 == null) {
            return;
        }
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d00e5);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(getString(R.string.MT_Protector_res_0x7f1207d0, m38443));
        DialogInterfaceOnClickListenerC15734 dialogInterfaceOnClickListenerC15734 = new DialogInterfaceOnClickListenerC15734(this, i, (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9), 0);
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, dialogInterfaceOnClickListenerC15734);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m38462(final int i) {
        String m38443 = m38443(i);
        if (m38443 == null) {
            return;
        }
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d00e5);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(getString(R.string.MT_Protector_res_0x7f1207d4, m38443));
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۢۚᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC16315.m38415(ActivityC16315.this, i, checkBox);
            }
        };
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, onClickListener);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m38450() {
        C10091 c10091 = this.f50247;
        if (c10091 != null) {
            c10091.notifyDataSetChanged();
        }
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m38461() {
        if (this.f50253.m31666(8388611)) {
            this.f50253.m31647(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public void m38423() {
        boolean m31666 = this.f50253.m31666(8388611);
        C6495 c6495 = (C6495) this.f50234.getLayoutManager();
        C11003.requireNonNull(c6495);
        int findFirstVisibleItemPosition = c6495.findFirstVisibleItemPosition();
        int childCount = c6495.getChildCount() + findFirstVisibleItemPosition;
        int i = this.f50246;
        if (i < findFirstVisibleItemPosition || i >= childCount) {
            if (this.f50240) {
                return;
            }
            this.f50240 = true;
            if (m31666) {
                this.f50249.setVisibility(0);
                this.f50249.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f50249, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f50240) {
            this.f50240 = false;
            if (m31666) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f50249, "alpha", 1.0f, 0.0f);
                ofFloat.addListener(new C12207(this));
                ofFloat.setDuration(200L).start();
            }
        }
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38455() {
        C22372 c22372 = new C22372();
        c22372.m5415((String) null);
        c22372.f5606.putString("filePath", "untitled");
        ArrayList arrayList = this.f50241;
        if (arrayList.isEmpty()) {
            this.f50246 = -1;
        }
        int m38411 = m38411(this.f50246 + 1, false);
        arrayList.add(m38411, c22372);
        m38432();
        c22372.mo5408(new String[0]);
        m38426(m38411, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38448(C22372 c22372) {
        int i;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f50241;
        int indexOf = arrayList.indexOf(c22372);
        C12171.m29642(indexOf != -1);
        if (arrayList.size() > 1 && indexOf == (i = this.f50246)) {
            if (i > 0) {
                m38426(i - 1, true);
            } else {
                m38426(i + 1, true);
            }
            C12171.m29642(indexOf != this.f50246);
        }
        ComponentCallbacksC9205 m14899 = m2843().m14899(c22372.m5412());
        if (m14899 != null) {
            C12171.m29642(c22372 == m14899);
            AbstractC16882 m14900 = m2843().m14900();
            m14900.mo39690(c22372);
            m14900.mo39685();
        } else {
            C12171.m29642((c22372.isAdded() || c22372.isDetached()) ? false : true);
        }
        arrayList.remove(indexOf);
        int i2 = this.f50246;
        if (indexOf < i2) {
            this.f50246 = i2 - 1;
            m38441();
            m38423();
        }
        this.f50247.notifyItemRemoved(indexOf);
        c22372.m50233();
        m38432();
        if (arrayList.isEmpty()) {
            m38449(false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38453(C22372 c22372) {
        int indexOf = this.f50241.indexOf(c22372);
        if (indexOf != -1) {
            m38426(indexOf, false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38428(ActivityC16315 activityC16315, int i) {
        activityC16315.m38426(i, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38426(int i, boolean z) {
        InterfaceC18581 m50235;
        if (i >= 0) {
            ArrayList arrayList = this.f50241;
            if (i < arrayList.size()) {
                AbstractC5180 m2843 = m2843();
                if (m2843.m14910() || m2843.m14886()) {
                    return;
                }
                int i2 = this.f50246;
                if (i2 == -1) {
                    C22372 c22372 = (C22372) arrayList.get(i);
                    AbstractC16882 m14900 = m2843.m14900();
                    m14900.m39679(R.id.MT_Protector_res_0x7f0a010f, c22372, c22372.m5412());
                    m14900.mo39685();
                    this.f50246 = i;
                    m38441();
                    m38423();
                    this.f50247.notifyDataSetChanged();
                    return;
                }
                if (i2 != i) {
                    C22372 c223722 = (C22372) arrayList.get(i2);
                    C22372 c223723 = (C22372) arrayList.get(i);
                    if (!z && (m50235 = c223722.m50235()) != null) {
                        if (this.f50251.m29735()) {
                            this.f50251.m29733((Runnable) new RunnableC0918(0, m50235));
                        } else {
                            m50235.mo9498();
                            this.f50251.m29733((Runnable) new RunnableC3741(m50235));
                        }
                    }
                    AbstractC16882 m149002 = m2843.m14900();
                    if (this.f50246 < i) {
                        m149002.m39678(R.anim.MT_Protector_res_0x7f01003b, R.anim.MT_Protector_res_0x7f01003a);
                    } else {
                        m149002.m39678(R.anim.MT_Protector_res_0x7f010039, R.anim.MT_Protector_res_0x7f01003c);
                    }
                    m149002.mo39686(c223722);
                    if (c223723.isDetached()) {
                        m149002.m39681(c223723);
                    } else {
                        m149002.m39682(c223723, c223723.m5412());
                    }
                    m149002.mo39689();
                    this.f50246 = i;
                    m38441();
                    m38423();
                    this.f50247.notifyDataSetChanged();
                    return;
                }
                ((C22372) arrayList.get(i2)).m50237();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m38411(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f50241;
            if (i >= arrayList.size()) {
                break;
            }
            C22372 c22372 = (C22372) arrayList.get(i);
            if (z || !c22372.m5413()) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void m38432() {
        AbstractC15440 m41823 = C17852.m41823();
        C10130 m43030 = C18515.m43030(1736577895);
        Iterator it = this.f50241.iterator();
        while (it.hasNext()) {
            C22372 c22372 = (C22372) it.next();
            c22372.getClass();
            Parcel obtain = Parcel.obtain();
            c22372.requireArguments().writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            m43030.m25434(marshall);
        }
        try {
            new RunnableC8450(m41823, m43030, f50232).m22126();
        } catch (IOException unused) {
        }
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private void m38439() {
        InterfaceC18581 m50235;
        int i = this.f50246;
        if (i != -1) {
            ArrayList arrayList = this.f50241;
            if (i >= arrayList.size() || (m50235 = ((C22372) arrayList.get(this.f50246)).m50235()) == null) {
                return;
            }
            m50235.mo9498();
            this.f50251.m29733((Runnable) new RunnableC3741(m50235));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public void m38441() {
        C10130 c10130 = new C10130(4);
        c10130.writeInt(this.f50246);
        AbstractC15440 m41821 = C17852.m41821();
        Object obj = f50231;
        C1802.m5991(new RunnableC8450(m41821, c10130, obj), obj, 200L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m38437() {
        /*
            r4 = this;
            r0 = -1
            l.ܶ᩵ܿ r1 = l.C17852.m41821()     // Catch: java.lang.Exception -> L24
            java.lang.Object r2 = l.ActivityC16315.f50231     // Catch: java.lang.Exception -> L24
            monitor-enter(r2)     // Catch: java.lang.Exception -> L24
            boolean r3 = r1.mo23120()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L17
            l.۬ۜܽ r1 = r1.m36528()     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.readInt()     // Catch: java.lang.Throwable -> L1c
            goto L18
        L17:
            r1 = -1
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            goto L2c
        L1a:
            r3 = move-exception
            goto L20
        L1c:
            r1 = move-exception
            r3 = -1
            r3 = r1
            r1 = -1
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Exception -> L22
        L22:
            r2 = move-exception
            goto L27
        L24:
            r1 = move-exception
            r2 = r1
            r1 = -1
        L27:
            l.᩶ܶᩳ r3 = r4.f50252
            r3.m46502(r2)
        L2c:
            java.util.ArrayList r2 = r4.f50241
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L35
            goto L43
        L35:
            if (r1 < 0) goto L42
            java.util.ArrayList r0 = r4.f50241
            int r0 = r0.size()
            if (r1 < r0) goto L40
            goto L42
        L40:
            r0 = r1
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC16315.m38437():int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m38435(ActivityC16315 activityC16315, int i) {
        int i2;
        ArrayList arrayList = activityC16315.f50241;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        C22372 c22372 = (C22372) arrayList.get(i);
        if (c22372.m5413()) {
            i2 = activityC16315.m38411(0, false);
            Bundle requireArguments = c22372.requireArguments();
            C11003.requireNonNull(requireArguments);
            requireArguments.putBoolean("top", false);
            while (i2 < arrayList.size() && ((C22372) arrayList.get(i2)).m5413()) {
                i2++;
            }
        } else {
            int m38411 = activityC16315.m38411(0, true);
            Bundle requireArguments2 = c22372.requireArguments();
            C11003.requireNonNull(requireArguments2);
            requireArguments2.putBoolean("top", true);
            c22372.m50232();
            i2 = m38411;
        }
        if (i != i2) {
            C22372 c223722 = (C22372) arrayList.get(activityC16315.f50246);
            if (i < i2) {
                i2--;
            }
            arrayList.remove(i);
            arrayList.add(i2, c22372);
            activityC16315.f50246 = arrayList.indexOf(c223722);
            activityC16315.m38441();
            activityC16315.m38423();
        }
        activityC16315.m38432();
        activityC16315.f50247.notifyDataSetChanged();
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38430() {
        return ApplicationC20075.f65008.getBoolean("axml_id_2_name", true);
    }
}
