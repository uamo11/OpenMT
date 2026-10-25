package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: 31K1 */
/* renamed from: l.ܿۛ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ActivityC17169 extends AbstractActivityC3346 {

    /* renamed from: ֫ۤ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f52594 = {2939, -24690, -24695, -24690, -24685, 28, -7898, 8339, 16151, -9476, -15021, -7875, -20567, -20564, -20551, -20564, -20510, -20545, -20568, -20546, -20574, -20552, -20545, -20562, -20568, -20546, -20509, -20564, -20545, -20546, -20562, -11281, -1054, -2626, 11344, 12612, 12706};

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52595 = 0;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f52596;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C1556 f52597;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f52598;

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public C16557 f52599;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public boolean f52601;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public C8202 f52604;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public C13064 f52605;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C12366 f52606;

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public C3764 f52607;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public C12230 f52608;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public TextView f52609;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f52610;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f52611;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C9762 f52612;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C11649 f52613;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public boolean f52615;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C13132 f52617;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f52618;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public String f52619;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C11005 f52620;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C19452 f52621;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f52616 = new ArrayList();

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public LinkedList f52603 = new LinkedList();

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public C4650 f52602 = new C4650(1, this);

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f52614 = new AtomicReference();

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C8817 f52600 = C8817.m22787();

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "ProjectActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Boolean m40267(ActivityC17169 activityC17169, AbstractC14346 abstractC14346) {
        activityC17169.getClass();
        return Boolean.valueOf((abstractC14346 instanceof InterfaceC11525) && ((InterfaceC11525) abstractC14346).mo21122(activityC17169.f52621));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40274(ActivityC17169 activityC17169, int i, CheckBox checkBox) {
        activityC17169.getClass();
        ArrayList arrayList = new ArrayList(activityC17169.f52616.subList(0, i));
        C6055.m16891(arrayList, new C1771());
        boolean isChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C1647(activityC17169, linkedList, (AbstractC14346) it.next(), isChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Boolean m40305(ActivityC17169 activityC17169, AbstractC14346 abstractC14346) {
        activityC17169.getClass();
        return Boolean.valueOf((abstractC14346 instanceof InterfaceC3900) && ((InterfaceC3900) abstractC14346).mo11876(activityC17169.f52606));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40308(ActivityC17169 activityC17169, int i, CheckBox checkBox) {
        activityC17169.getClass();
        ArrayList arrayList = new ArrayList(activityC17169.f52616);
        arrayList.remove(i);
        C6055.m16891(arrayList, new C21608(1));
        boolean isChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C1647(activityC17169, linkedList, (AbstractC14346) it.next(), isChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m40319(ActivityC17169 activityC17169) {
        activityC17169.getClass();
        try {
            C20197.m46431(activityC17169.f52620);
            activityC17169.m40355(true);
        } catch (Throwable th) {
            activityC17169.m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40321(ActivityC17169 activityC17169, int i, CheckBox checkBox) {
        activityC17169.getClass();
        ArrayList arrayList = activityC17169.f52616;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C6055.m16891(arrayList2, new C13825());
        boolean isChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C1647(activityC17169, linkedList, (AbstractC14346) it.next(), isChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        m10241(R.layout.MT_Protector_res_0x7f0d0046);
        m10214();
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C1065 c1065 = new C1065(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c1065);
        m10244().m30602(2);
        m40264();
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        C9762 c97622 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a0173);
        this.f52612 = c97622;
        c97622.inflateMenu(R.menu.MT_Protector_res_0x7f0f0019);
        this.f52599 = new C16557(this.f52612, R.id.MT_Protector_res_0x7f0a0363, R.id.more);
        MenuItem findItem = this.f52612.getMenu().findItem(R.id.MT_Protector_res_0x7f0a0378);
        this.f52612.setOnMenuItemClickListener(new C16648(0, this));
        this.f52605 = (C13064) m10241(R.id.MT_Protector_res_0x7f0a0172);
        this.f52611 = (FloatingActionButton) m10241(R.id.MT_Protector_res_0x7f0a0211);
        m10229(this.f52605, m10241(R.id.MT_Protector_res_0x7f0a0171), this.f10584, m10241(R.id.MT_Protector_res_0x7f0a02db), this.f52612, this.f52611);
        this.f52605.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ᩳ۫᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC17169.m40298(ActivityC17169.this);
            }
        });
        C7623 c7623 = new C7623(this, this.f52605, this.f10584);
        c7623.m20413().m15982(C21943.f70298.getDefaultColor());
        this.f52605.m31651(c7623);
        c7623.m20414();
        this.f52605.m31651(new C5299(this));
        C3764 c3764 = (C3764) new C4741(this).m13885(C3764.class);
        this.f52607 = c3764;
        C5242 m11418 = c3764.m11418();
        C11003.requireNonNull(findItem);
        m11418.m1668(this, new C19323(findItem));
        this.f52607.m11419().m1668(this, new InterfaceC1008() { // from class: l.ܿ۫᩷
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C12366 c12366 = (C12366) obj;
                int i = ActivityC17169.f52595;
                if (c12366 != null) {
                    c12366.m30057(ActivityC17169.this);
                }
            }
        });
        this.f52607.m11392(this, this.f52602);
        this.f52607.m11390(this, new C7385(4, this));
        C5242 m11403 = this.f52607.m11403();
        C9762 c97623 = this.f52612;
        C11003.requireNonNull(c97623);
        m11403.m1668(this, new C14531(0, c97623));
        this.f52608 = (C12230) new C4741(this).m13885(C12230.class);
        this.f52604 = new C8202();
        C4925.m14316(new RunnableC23704(0, this), 500L);
        if (getIntent().hasExtra("bundle") && bundle == null) {
            Bundle extras = getIntent().getExtras();
            C11003.requireNonNull(extras);
            bundle = extras.getBundle("bundle");
            getIntent().getExtras().remove("bundle");
            C12171.m29644(this.f52607.m11419().m1662());
            C12171.m29644(this.f52607.m11411().m1662());
        }
        if (bundle != null) {
            this.f52620 = (C11005) bundle.getSerializable("projectRootDir");
            String[] stringArray = bundle.getStringArray("backStack");
            this.f52618 = bundle.getInt("currentFragment", 0);
            this.f52619 = bundle.getString("outputPath", null);
            if (this.f52620 == null || stringArray == null) {
                finish();
                return;
            }
            LinkedList linkedList = this.f52603;
            linkedList.clear();
            Collections.addAll(linkedList, stringArray);
            try {
                m40322(false);
                C12366 c12366 = this.f52606;
                ArrayList arrayList = this.f52616;
                if (c12366 != null) {
                    ComponentCallbacksC9205 m14899 = m2843().m14899("000000-0000-0000-0000-000000000000");
                    if (m14899 == null) {
                        m14899 = new C23840();
                        this.f52618 = 0;
                        AbstractC16882 m14900 = m2843().m14900();
                        m14900.m39682(m14899, "000000-0000-0000-0000-000000000000");
                        m14900.mo39685();
                    }
                    arrayList.add((AbstractC14346) m14899);
                }
                if (this.f52621 != null) {
                    ComponentCallbacksC9205 m148992 = m2843().m14899("000000-0000-0000-0000-000000000001");
                    if (m148992 == null) {
                        m148992 = new C4966();
                        if (this.f52606 == null) {
                            this.f52618 = 0;
                            AbstractC16882 m149002 = m2843().m14900();
                            m149002.m39682(m148992, "000000-0000-0000-0000-000000000001");
                            m149002.mo39685();
                        }
                    }
                    arrayList.add((AbstractC14346) m148992);
                }
                m40327(true);
                if (this.f52621 == null && m40371() && C5378.stream(arrayList).noneMatch(new C2538(0))) {
                    arrayList.add(1, new C16688());
                    m40331();
                }
                m40293();
                m40296();
            } catch (IOException e) {
                m10224((Throwable) e, true);
            }
            m10241(R.id.MT_Protector_res_0x7f0a045d).setVisibility(8);
            if (bundle.getBoolean("hideProjectLoadingView", false)) {
                m40360();
                return;
            }
            return;
        }
        new C15175(this).m20274();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40298(ActivityC17169 activityC17169) {
        int width = (activityC17169.f52605.getWidth() - activityC17169.f52605.getChildAt(1).getWidth()) - activityC17169.f52611.getWidth();
        int m27878 = C11266.m27878(36.0f);
        float f = -(width > m27878 * 2 ? width - m27878 : width / 2);
        if (activityC17169.f52611.getTranslationX() != f) {
            activityC17169.f52611.setTranslationX(f);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40279(ActivityC17169 activityC17169, String str) {
        ArrayList arrayList = activityC17169.f52616;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((AbstractC14346) arrayList.get(i)).m34232().equals(str)) {
                activityC17169.m40268(i, true, false);
                return;
            }
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m40264();
    }

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    private void m40264() {
        if (getResources().getConfiguration().orientation == 2) {
            m10244().m30599(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m10244().m30604(1);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40340(CharSequence charSequence) {
        this.f10584.setSubtitle(charSequence);
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final TextView m40364() {
        if (this.f52609 == null) {
            try {
                Field declaredField = C9762.class.getDeclaredField("mSubtitleTextView");
                declaredField.setAccessible(true);
                this.f52609 = (TextView) declaredField.get(this.f10584);
            } catch (Exception unused) {
            }
        }
        return this.f52609;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m40365(int i) {
        C8202 c8202 = this.f52604;
        if (c8202 != null) {
            c8202.m21700(this, i);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View m40367(int i) {
        C8202 c8202 = this.f52604;
        if (c8202 != null) {
            return c8202.m21699(i);
        }
        return null;
    }

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final void m40360() {
        View m10241 = m10241(R.id.MT_Protector_res_0x7f0a045e);
        if (m10241.getVisibility() != 8) {
            m10241.setVisibility(8);
        }
        this.f52596 = true;
    }

    @Override // l.ActivityC2124
    /* renamed from: ᩴ */
    public final void mo2954() {
        m40345(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40345(boolean z) {
        C12366 c12366 = this.f52606;
        if (c12366 == null || !c12366.m30043(this, this.f52607)) {
            C19452 c19452 = this.f52621;
            if (c19452 == null || !c19452.m44832(this, this.f52607)) {
                if (z && this.f52600.m22791()) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f12079b);
                } else {
                    finish();
                }
            }
        }
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final void m40351() {
        C12366 c12366;
        int i = 0;
        boolean z = !(this.f52621 == null || this.f52606 == null) || ((c12366 = this.f52606) != null && c12366.m30048());
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this);
        c19258.m44433(R.string.MT_Protector_res_0x7f120491);
        c19258.m44416(z ? R.string.MT_Protector_res_0x7f1203d6 : R.string.MT_Protector_res_0x7f120395);
        c19258.m44442(R.string.MT_Protector_res_0x7f1208c6, new DialogInterfaceOnClickListenerC20883(i, this));
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector_res_0x7f120319, new DialogInterfaceOnClickListenerC9594(0, this));
        c19258.m44438();
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hideProjectLoadingView", this.f52596);
        bundle.putStringArray("backStack", (String[]) this.f52603.toArray(new String[0]));
        C11005 c11005 = this.f52620;
        if (c11005 != null) {
            bundle.putSerializable("projectRootDir", c11005);
            bundle.putInt("currentFragment", this.f52618);
            bundle.putString("outputPath", this.f52619);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40277(ActivityC17169 activityC17169, Exception exc) {
        activityC17169.m10223(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C1783) {
            C1783 c1783 = (C1783) exc;
            C19287 m44466 = C19287.m44466(c1783.f6159, c1783.f6160);
            m44466.f60678 = false;
            activityC17169.m40343(c1783.m5935(), m44466);
            C12366 c12366 = activityC17169.f52606;
            C11003.requireNonNull(c12366);
            c12366.m30026(c1783.m5935());
            return;
        }
        if (exc instanceof C5672) {
            C5672 c5672 = (C5672) exc;
            C19287 m444662 = C19287.m44466(c5672.f17514, c5672.f17513);
            m444662.f60678 = false;
            activityC17169.m40354(c5672.m15979(), m444662);
            C19452 c19452 = activityC17169.f52621;
            C11003.requireNonNull(c19452);
            c19452.m44818(c5672.m15979());
        }
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static void m40337(ActivityC17169 activityC17169) {
        if (activityC17169.f52621 == null || !activityC17169.f52610) {
            return;
        }
        activityC17169.f52610 = false;
        new C22232(activityC17169, (C20765) activityC17169.getLifecycle()).m20274();
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final void m40347() {
        C11649 c11649 = this.f52613;
        if (c11649 != null) {
            c11649.notifyDataSetChanged();
        }
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40358() {
        if (this.f52605.m31666(8388611)) {
            this.f52605.m31647(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public void m40293() {
        this.f52613 = new C11649(this);
        C13132 c13132 = (C13132) findViewById(R.id.MT_Protector_res_0x7f0a0486);
        this.f52617 = c13132;
        c13132.setAdapter(this.f52613);
        this.f52617.setLayoutManager(new C6495(this));
        this.f52617.getItemAnimator().m50782(200L);
        this.f52617.getItemAnimator().m50792(200L);
        this.f52617.getItemAnimator().m50789(200L);
        this.f52617.getItemAnimator().m50786(200L);
        this.f52611.setOnClickListener(new ViewOnClickListenerC9841(6, this));
        this.f52617.addOnScrollListener(new C20116(this));
        C13132 c131322 = this.f52617;
        C16557 c16557 = this.f52599;
        C11003.requireNonNull(c16557);
        c131322.addOnItemTouchListener(new C5248(c131322, new C23496(c16557)));
        C1556 c1556 = new C1556(new C3182(this));
        this.f52597 = c1556;
        c1556.m5322(this.f52617);
        this.f52599.m38952(this.f52613);
        this.f52599.m38950(this.f52597);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m40323(ActivityC17169 activityC17169, AbstractC14346 abstractC14346) {
        return ((abstractC14346 instanceof C23840) || (abstractC14346 instanceof C4966) || (abstractC14346 instanceof C16688)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public void m40296() {
        boolean m31666 = this.f52605.m31666(8388611);
        C6495 c6495 = (C6495) this.f52617.getLayoutManager();
        C11003.requireNonNull(c6495);
        int findFirstVisibleItemPosition = c6495.findFirstVisibleItemPosition();
        int childCount = c6495.getChildCount() + findFirstVisibleItemPosition;
        int i = this.f52618;
        if (i < findFirstVisibleItemPosition || i >= childCount) {
            if (this.f52601) {
                return;
            }
            this.f52601 = true;
            if (m31666) {
                this.f52611.setVisibility(0);
                this.f52611.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f52611, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f52601) {
            this.f52601 = false;
            if (m31666) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f52611, "alpha", 1.0f, 0.0f);
                ofFloat.addListener(new C13059(this));
                ofFloat.setDuration(200L).start();
            }
        }
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m40313(ActivityC17169 activityC17169) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (AbstractC15440 abstractC15440 : C16293.f50111.mo23549(true)) {
            if (abstractC15440.getName().endsWith(".project") && abstractC15440.mo23113()) {
                arrayList.add(abstractC15440);
            }
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            C1802.f6208.submit(new RunnableC1126(i, arrayList));
        }
        activityC17169.f52620 = new C11005(C16293.f50111.m36535(".project"));
        Bundle extras = activityC17169.getIntent().getExtras();
        C11003.requireNonNull(extras);
        if (extras.containsKey("dexFiles")) {
            ArrayList arrayList2 = new ArrayList();
            C12951 m31486 = C12951.m31486(extras.getByteArray("dexFiles"));
            while (m31486.available() > 0) {
                arrayList2.add(C16999.m39866(m31486.m31506(), new String[0]));
            }
            C6016 c6016 = new C6016();
            C11661.m28544(arrayList2, activityC17169.f52620.m27340(), c6016, new C8182(activityC17169));
            if (c6016.m16828()) {
                activityC17169.m10218(R.string.MT_Protector_res_0x7f120491, activityC17169.getString(R.string.MT_Protector_res_0x7f12068d, c6016.toString()), false);
            }
            activityC17169.f52619 = ((AbstractC15440) arrayList2.get(0)).getParent();
            z = true;
        } else {
            z = false;
        }
        if (extras.containsKey("arscFile")) {
            String string = extras.getString("arscFile");
            C11003.requireNonNull(string);
            AbstractC15440 m39866 = C16999.m39866(string, new String[0]);
            C12395.m30552(m39866, activityC17169.f52620.m27340());
            activityC17169.f52610 = true;
            activityC17169.f52619 = m39866.getParent();
        } else {
            z2 = z;
        }
        if (!z2) {
            throw new RuntimeException();
        }
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m40371() {
        return this.f52620.m27330("data/resources.arsc").mo23120();
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m40350() {
        int i;
        if (this.f52621 != null || this.f52598) {
            return true;
        }
        C11005 c11005 = this.f52620;
        if (c11005 == null) {
            return false;
        }
        AbstractC15440 m27330 = c11005.m27330("data/resources.arsc");
        if (!m27330.mo23120()) {
            return false;
        }
        AbstractC5180 m2843 = m2843();
        if (m2843.m14886() || (i = this.f52618) < 0) {
            return false;
        }
        ArrayList arrayList = this.f52616;
        if (i >= arrayList.size()) {
            return false;
        }
        AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(this.f52618);
        if (!(abstractC14346 instanceof C16688) || m2843.m14899("000000-0000-0000-0000-000000000001") != null) {
            return false;
        }
        if (!C23196.m51460()) {
            m10235(R.string.MT_Protector_res_0x7f120757);
            return true;
        }
        if (!C23196.m51454()) {
            m10235(R.string.MT_Protector_res_0x7f120415);
            return true;
        }
        this.f52598 = true;
        new C10238(this, m27330, (C16688) abstractC14346).m20274();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40285(ActivityC17169 activityC17169, C19452 c19452) {
        c19452.m44828(activityC17169, activityC17169.f52602);
        c19452.m44829(activityC17169, new C20296(activityC17169));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m40322(boolean z) {
        C11005 c11005 = this.f52620;
        boolean z2 = false;
        boolean z3 = c11005 != null && c11005.m27330("dex").mo23113();
        C11005 c110052 = this.f52620;
        boolean z4 = c110052 != null && c110052.m27330("arsc").mo23113();
        if (!z3 && !z4) {
            throw new C19401("No a dex or arsc project.");
        }
        if (!z) {
            C12366 c12366 = this.f52606;
            if (z3 && c12366 != null) {
                if (!c12366.m36266().equals(this.f52620)) {
                    throw new RuntimeException("dex");
                }
                runOnUiThread(new RunnableC14191(3, this, c12366));
                z3 = false;
            }
            final C19452 c19452 = this.f52621;
            if (!z4 || c19452 == null) {
                z2 = z4;
            } else {
                if (!c19452.m36266().equals(this.f52620)) {
                    throw new RuntimeException("arsc");
                }
                runOnUiThread(new Runnable() { // from class: l.ܶ۫᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        c19452.m44828(r0, ActivityC17169.this.f52602);
                    }
                });
            }
            if (!z3 && !z2) {
                this.f52607.m11418().mo1664(Boolean.valueOf(m40373()));
                this.f52607.m11403().mo1664((Object) (m40373() ? getString(R.string.MT_Protector_res_0x7f120a32) : this.f52620.getName()));
                return;
            }
            z4 = z2;
        }
        if (z3) {
            C12366 m30021 = C12366.m30021(this.f52620);
            this.f52606 = m30021;
            runOnUiThread(new RunnableC22293(0, this, m30021));
            this.f52607.m11419().mo1664(m30021);
        }
        if (z4) {
            C19452 m44813 = C19452.m44813(this.f52620);
            this.f52621 = m44813;
            runOnUiThread(new RunnableC8425(2, this, m44813));
            this.f52607.m11411().mo1664(m44813);
        }
        this.f52607.m11418().mo1664(Boolean.valueOf(m40373()));
        this.f52607.m11403().mo1664((Object) (m40373() ? getString(R.string.MT_Protector_res_0x7f120a32) : this.f52620.getName()));
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean m40373() {
        C11005 c11005 = this.f52620;
        return c11005 != null && c11005.m27340().m36504(C16293.f50111);
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final String m40346() {
        return this.f52619;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40344(AbstractC14346 abstractC14346) {
        ArrayList arrayList = this.f52616;
        int indexOf = arrayList.indexOf(abstractC14346);
        C12171.m29642(indexOf != -1);
        int i = this.f52618;
        LinkedList linkedList = this.f52603;
        if (indexOf == i) {
            String str = (String) linkedList.pop();
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (i2 != this.f52618 && ((AbstractC14346) arrayList.get(i2)).m34232().equals(str)) {
                        m40268(i2, false, true);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (indexOf == this.f52618) {
                m40268(0, false, true);
            }
            C12171.m29642(indexOf != this.f52618);
        }
        ComponentCallbacksC9205 m14899 = m2843().m14899(abstractC14346.m34232());
        if (m14899 != null) {
            C12171.m29642(abstractC14346 == m14899);
            AbstractC16882 m14900 = m2843().m14900();
            m14900.mo39690(abstractC14346);
            m14900.mo39685();
        } else {
            if (!abstractC14346.isAdded() && !abstractC14346.isDetached()) {
                r3 = true;
            }
            C12171.m29642(r3);
        }
        linkedList.removeAll(Collections.singleton(((AbstractC14346) arrayList.remove(indexOf)).m34232()));
        int i3 = this.f52618;
        if (indexOf < i3) {
            this.f52618 = i3 - 1;
            m40296();
        }
        m40329();
        this.f52613.notifyItemRemoved(indexOf);
        C11005 m40356 = m40356();
        abstractC14346.m34233(m40356).m27333();
        C5753.m16200(abstractC14346.m34236(m40356).m27340()).m10915((InterfaceC21423) new C15942(0));
        abstractC14346.m34226(m40356).m27333();
        m40331();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (l.C1047.m3599() >= 0) goto L10;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m40271(l.InterfaceC9922 r25) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC17169.m40271(l.ۢ᩻ܽ):void");
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final void m40370() {
        if (this.f52621 == null) {
            return;
        }
        m40270(new Function() { // from class: l.ᩴ۫᩷
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivityC17169.m40267(ActivityC17169.this, (AbstractC14346) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final void m40349() {
        if (this.f52606 == null) {
            return;
        }
        m40270(new C8888(0, this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40270(Function function) {
        int i = this.f52618;
        ArrayList arrayList = this.f52616;
        AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC14346 abstractC143462 = (AbstractC14346) it.next();
            if (((Boolean) function.apply(abstractC143462)).booleanValue()) {
                if (abstractC14346 == abstractC143462) {
                    abstractC14346 = null;
                }
                arrayList2.add(abstractC143462);
                arrayList3.add(abstractC143462.m34232());
                it.remove();
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f52603.removeAll(arrayList3);
        if (abstractC14346 == null) {
            this.f52618 = 0;
        } else {
            this.f52618 = arrayList.indexOf(abstractC14346);
        }
        m40329();
        C11005 m40356 = m40356();
        AbstractC5180 m2843 = m2843();
        AbstractC16882 m14900 = m2843.m14900();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AbstractC14346 abstractC143463 = (AbstractC14346) it2.next();
            ComponentCallbacksC9205 m14899 = m2843.m14899(abstractC143463.m34232());
            if (m14899 != null) {
                C12171.m29642(abstractC143463 == m14899);
                m14900.mo39690(abstractC143463);
            } else {
                C12171.m29642((abstractC143463.isAdded() || abstractC143463.isDetached()) ? false : true);
            }
            abstractC143463.m34233(m40356).m27333();
            C5753.m16200(abstractC143463.m34236(m40356).m27340()).m10915((InterfaceC21423) new C20177());
            abstractC143463.m34226(m40356).m27333();
        }
        m14900.mo39689();
        m40331();
        this.f52613.notifyDataSetChanged();
        m40296();
    }

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    private void m40329() {
        String m34232 = ((AbstractC14346) this.f52616.get(this.f52618)).m34232();
        LinkedList linkedList = this.f52603;
        linkedList.push(m34232);
        Iterator it = linkedList.iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str != null && str.equals(str2)) {
                it.remove();
            } else {
                str = str2;
            }
        }
        linkedList.pop();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m40326(ActivityC17169 activityC17169, AbstractC14346 abstractC14346) {
        int indexOf = activityC17169.f52616.indexOf(abstractC14346);
        if (indexOf != -1) {
            activityC17169.m40268(indexOf, true, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40275(ActivityC17169 activityC17169, int i, boolean z) {
        activityC17169.m40268(i, z, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40268(int i, boolean z, boolean z2) {
        InputMethodManager inputMethodManager;
        InterfaceC18581 mo17431;
        if (i >= 0) {
            ArrayList arrayList = this.f52616;
            if (i < arrayList.size()) {
                AbstractC5180 m2843 = m2843();
                if (m2843.m14910() || m2843.m14886()) {
                    return;
                }
                int i2 = this.f52618;
                if (i2 != i) {
                    AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i2);
                    AbstractC14346 abstractC143462 = (AbstractC14346) arrayList.get(i);
                    if (!z2 && (mo17431 = abstractC14346.mo17431()) != null) {
                        if (this.f52608.m29735()) {
                            this.f52608.m29733((Runnable) new RunnableC19472(0, mo17431));
                        } else {
                            mo17431.mo9498();
                            this.f52608.m29733((Runnable) new RunnableC3741(mo17431));
                        }
                    }
                    AbstractC16882 m14900 = m2843.m14900();
                    if (this.f52618 < i) {
                        m14900.m39678(R.anim.MT_Protector_res_0x7f01003b, R.anim.MT_Protector_res_0x7f01003a);
                    } else {
                        m14900.m39678(R.anim.MT_Protector_res_0x7f010039, R.anim.MT_Protector_res_0x7f01003c);
                    }
                    if (abstractC14346.mo34231()) {
                        m14900.mo39676(abstractC14346);
                    } else {
                        m14900.mo39686((ComponentCallbacksC9205) abstractC14346);
                    }
                    if (abstractC143462.isAdded()) {
                        m14900.mo39687(abstractC143462);
                    } else if (abstractC143462.isDetached()) {
                        m14900.m39681((ComponentCallbacksC9205) abstractC143462);
                    } else {
                        m14900.m39682(abstractC143462, abstractC143462.m34232());
                    }
                    m14900.mo39689();
                    this.f52618 = i;
                    m40296();
                    this.f52613.notifyDataSetChanged();
                    if (abstractC14346.mo17432() && !abstractC143462.mo17432() && (inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method")) != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                    }
                    if (z) {
                        C12171.m29642(!z2);
                        String m34232 = abstractC14346.m34232();
                        LinkedList linkedList = this.f52603;
                        linkedList.push(m34232);
                        while (linkedList.size() > 5) {
                            linkedList.remove(linkedList.size() - 2);
                        }
                        return;
                    }
                    return;
                }
                ((AbstractC14346) arrayList.get(i2)).mo34241();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40343(String str, C19287 c19287) {
        C12366 c12366 = this.f52606;
        C6306 c6306 = null;
        if (c12366 != null) {
            try {
                if (!c12366.m30058(str)) {
                    throw new C19401("Class not found: " + str.replace('/', '.'));
                }
            } catch (IOException e) {
                m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f52616;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
            if (abstractC14346 instanceof C6306) {
                C6306 c63062 = (C6306) abstractC14346;
                if (str.equals(c63062.m17420())) {
                    c6306 = c63062;
                    break;
                }
            }
            i++;
        }
        if (c6306 == null) {
            c6306 = new C6306();
            c6306.m17430(str);
            i = m40266(this.f52618 + 1, false);
            arrayList.add(i, c6306);
            m40331();
        }
        c6306.m17425(c19287);
        if (c19287 == null && i == this.f52618) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12003e);
        }
        m40268(i, true, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40354(String str, C19287 c19287) {
        C19452 c19452 = this.f52621;
        C7864 c7864 = null;
        if (c19452 != null) {
            try {
                if (!c19452.m44838(str)) {
                    throw new C19401("Xml not found: " + str);
                }
            } catch (IOException e) {
                m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f52616;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
            if (abstractC14346 instanceof C7864) {
                C7864 c78642 = (C7864) abstractC14346;
                if (str.equals(c78642.m21123())) {
                    c7864 = c78642;
                    break;
                }
            }
            i++;
        }
        if (c7864 == null) {
            c7864 = new C7864();
            c7864.m21125(str);
            i = m40266(this.f52618 + 1, false);
            arrayList.add(i, c7864);
            m40331();
        }
        c7864.m21121(c19287);
        if (c19287 == null && i == this.f52618) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12003f);
        }
        m40268(i, true, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40341(String str, String str2) {
        C16266 c16266;
        ArrayList arrayList = this.f52616;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c16266 = null;
                i = -1;
                break;
            }
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
            if (abstractC14346 instanceof C16266) {
                c16266 = (C16266) abstractC14346;
                if (str.equals(c16266.m38278()) && str2.equals(c16266.requireArguments().getString(e.s))) {
                    if (c16266.m38280()) {
                        c16266.m38281();
                    }
                }
            }
            i++;
        }
        if (c16266 == null) {
            C16266 c162662 = new C16266();
            c162662.m38279(str, str2);
            int m40266 = m40266(this.f52618 + 1, false);
            arrayList.add(m40266, c162662);
            m40331();
            i = m40266;
        }
        m40268(i, true, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40342(final String str, final String str2, ArrayList arrayList, final boolean z) {
        int m40304;
        C12366 c12366 = this.f52606;
        if (c12366 == null) {
            return;
        }
        if (str2 != null) {
            m40269(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (!z && (m40304 = m40304(str, (String) null)) >= 0) {
            m40268(m40304, true, false);
            return;
        }
        final ArrayList m30050 = c12366.m30050(str);
        if (m30050.isEmpty()) {
            m40269(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (arrayList == null) {
            arrayList = m30050;
        }
        CharSequence[] charSequenceArr = new CharSequence[m30050.size()];
        final boolean[] zArr = new boolean[m30050.size()];
        for (int i = 0; i < m30050.size(); i++) {
            String str3 = (String) m30050.get(i);
            charSequenceArr[i] = C14336.m34210(str3);
            zArr[i] = arrayList.contains(str3);
        }
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d00cc);
        ListView listView = (ListView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
        C4915.m14284(listView);
        listView.setDivider(null);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f12092c);
        listView.setAdapter((ListAdapter) new C6004(charSequenceArr, zArr));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳۤ᩷
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                int i3 = ActivityC17169.f52595;
                boolean[] zArr2 = zArr;
                boolean z2 = !zArr2[i2];
                zArr2[i2] = z2;
                ((CheckedTextView) view).setChecked(z2);
            }
        });
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ܿۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17169.m40287(ActivityC17169.this, zArr, m30050, str, str2, z);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f120918, (DialogInterface.OnClickListener) null);
        buildDialog.m44438().m1448().setOnClickListener(new ViewOnClickListenerC14470(zArr, listView, 0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40287(ActivityC17169 activityC17169, boolean[] zArr, ArrayList arrayList, String str, String str2, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                arrayList2.add((String) arrayList.get(i));
            }
        }
        activityC17169.m40269(str, str2, (List) arrayList2, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40269(String str, String str2, List list, boolean z) {
        boolean m38821;
        int m40304 = m40304(str, str2);
        ArrayList arrayList = this.f52616;
        C16475 c16475 = m40304 >= 0 ? (C16475) arrayList.get(m40304) : null;
        if (c16475 == null) {
            C16475 c164752 = new C16475();
            c164752.m38820(str, str2, list);
            m40304 = m40266(this.f52618 + 1, false);
            arrayList.add(m40304, c164752);
            m38821 = true;
        } else {
            m38821 = c16475.m38821(list, z);
        }
        if (m38821) {
            m40331();
        }
        m40268(m40304, true, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m40304(String str, String str2) {
        ArrayList arrayList = this.f52616;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
            if (abstractC14346 instanceof C16475) {
                C16475 c16475 = (C16475) abstractC14346;
                if (str.equals(c16475.m38819()) && C11003.equals(str2, c16475.requireArguments().getString(e.s))) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m40266(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f52616;
            if (i >= arrayList.size()) {
                break;
            }
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
            if (!(abstractC14346 instanceof C23840) && !(abstractC14346 instanceof C4966) && !(abstractC14346 instanceof C16688) && (z || !abstractC14346.m34230())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public void m40331() {
        int i;
        AbstractC15440 m27330 = m40356().m27330("list");
        C10130 m43030 = C18515.m43030(1736577895);
        Iterator it = this.f52616.iterator();
        while (it.hasNext()) {
            AbstractC14346 abstractC14346 = (AbstractC14346) it.next();
            if (!(abstractC14346 instanceof C23840) && !(abstractC14346 instanceof C4966)) {
                if (abstractC14346 instanceof C6306) {
                    i = 16;
                } else if (abstractC14346 instanceof C16475) {
                    i = 17;
                } else if (abstractC14346 instanceof C16266) {
                    i = 20;
                } else if (abstractC14346 instanceof C7864) {
                    i = 18;
                } else {
                    if (!(abstractC14346 instanceof C16688)) {
                        throw new RuntimeException(abstractC14346.getClass().getSimpleName());
                    }
                    i = 19;
                }
                m43030.writeByte(i);
                abstractC14346.getClass();
                Parcel obtain = Parcel.obtain();
                abstractC14346.requireArguments().writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                m43030.m25434(marshall);
            }
        }
        try {
            m27330.mo35195();
            m27330.m36496(m43030);
        } catch (IOException e) {
            this.f52607.m11384((Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m40327(boolean z) {
        Class cls;
        C11005 m40356 = m40356();
        AbstractC15440 m27330 = m40356.m27330("list");
        if (m27330.mo23120()) {
            try {
                C12951 c12951 = new C12951(m27330.m36506());
                C22124.m49722((InterfaceC20008) c12951, 1736577895);
                while (c12951.available() > 0) {
                    int readByte = c12951.readByte() & 255;
                    byte[] m31496 = c12951.m31496();
                    switch (readByte) {
                        case 16:
                            cls = C6306.class;
                            break;
                        case 17:
                            cls = C16475.class;
                            break;
                        case 18:
                            cls = C7864.class;
                            break;
                        case 19:
                            cls = C16688.class;
                            break;
                        case 20:
                            cls = C16266.class;
                            break;
                        default:
                            throw new RuntimeException("StateType: " + readByte);
                    }
                    AbstractC14346 abstractC14346 = (AbstractC14346) cls.newInstance();
                    abstractC14346.mo34229(m31496);
                    ComponentCallbacksC9205 m14899 = m2843().m14899(abstractC14346.m34232());
                    ArrayList arrayList = this.f52616;
                    if (!z) {
                        C12171.m29644(m14899);
                        arrayList.add(abstractC14346);
                        abstractC14346.m34240(m40356);
                    } else if (m14899 != null) {
                        arrayList.add((AbstractC14346) m14899);
                    } else {
                        arrayList.add(abstractC14346);
                        abstractC14346.m34240(m40356);
                    }
                }
            } catch (Exception e) {
                this.f52607.m11384((Throwable) e);
            }
        }
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C11005 m40356() {
        C11005 c11005 = this.f52620;
        C11003.requireNonNull(c11005);
        return new C11005(c11005, "state");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40339(MenuItem menuItem) {
        if (C13876.f41361.m22793()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector_res_0x7f0a016c) {
            this.f52599.m38953(true);
            return;
        }
        if (this.f52599.m38954()) {
            return;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0376) {
            m40353((Runnable) null);
            return;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0363) {
            startActivity(new Intent(this, (Class<?>) ActivityC16315.class));
            return;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0378) {
            m40361();
            return;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a032d) {
            new C1832(this, new C20197(this.f52620)).m6080();
            return;
        }
        if (itemId != R.id.MT_Protector_res_0x7f0a0374) {
            if (itemId == R.id.MT_Protector_res_0x7f0a033c) {
                m40345(false);
                return;
            }
            return;
        }
        C19258 buildDialog = buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1208b6);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f1208b7);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֡۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC17169.m40319(ActivityC17169.this);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f120265, new DialogInterface.OnClickListener() { // from class: l.ۚ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                new C1832(r1, new C20197(ActivityC17169.this.f52620)).m6080();
            }
        });
        buildDialog.m44438();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m40333(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f52616;
        if (i >= arrayList.size()) {
            return null;
        }
        return C6554.m18061(50, ((AbstractC14346) arrayList.get(i)).mo14421());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10820 m40306(ActivityC17169 activityC17169, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = activityC17169.f52616;
        C10820 c10820 = new C10820();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i6);
            if (abstractC14346.m34237()) {
                i2 = c10820.f32544;
                c10820.f32544 = i2 + 1;
                if (!abstractC14346.mo17426()) {
                    i5 = c10820.f32546;
                    c10820.f32546 = i5 + 1;
                }
                if (i6 < i) {
                    i4 = c10820.f32543;
                    c10820.f32543 = i4 + 1;
                } else if (i6 > i) {
                    i3 = c10820.f32545;
                    c10820.f32545 = i3 + 1;
                }
            }
        }
        return c10820;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m40348(final int i) {
        String m40333 = m40333(i);
        if (m40333 == null) {
            return;
        }
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d00e5);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(getString(R.string.MT_Protector_res_0x7f1207d7, m40333));
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۛ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17169.m40308(ActivityC17169.this, i, checkBox);
            }
        };
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, onClickListener);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40276(ActivityC17169 activityC17169, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC17169.f52616);
        C6055.m16891(arrayList, new C7476());
        boolean isChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C1647(activityC17169, linkedList, (AbstractC14346) it.next(), isChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40302(ActivityC17169 activityC17169) {
        Iterator it = new ArrayList(activityC17169.f52616).iterator();
        while (it.hasNext()) {
            AbstractC14346 abstractC14346 = (AbstractC14346) it.next();
            if (abstractC14346.m34237() && !abstractC14346.mo17426()) {
                abstractC14346.m34228(activityC17169);
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40359(final int i) {
        String m40333 = m40333(i);
        if (m40333 == null) {
            return;
        }
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d00e5);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(getString(R.string.MT_Protector_res_0x7f1207d0, m40333));
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.۬۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17169.m40274(ActivityC17169.this, i, checkBox);
            }
        };
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, onClickListener);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m40372(int i) {
        String m40333 = m40333(i);
        if (m40333 == null) {
            return;
        }
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d00e5);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(getString(R.string.MT_Protector_res_0x7f1207d4, m40333));
        DialogInterfaceOnClickListenerC15734 dialogInterfaceOnClickListenerC15734 = new DialogInterfaceOnClickListenerC15734(this, i, (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9), 1);
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, dialogInterfaceOnClickListenerC15734);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40366() {
        Iterator it = new ArrayList(this.f52616).iterator();
        while (it.hasNext()) {
            AbstractC14346 abstractC14346 = (AbstractC14346) it.next();
            if ((abstractC14346 instanceof C6306) && abstractC14346.f43260.getBoolean("changed", false)) {
                return true;
            }
            if ((abstractC14346 instanceof C7864) && abstractC14346.f43260.getBoolean("changed", false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40363(final Runnable runnable) {
        if (m40366()) {
            this.f52605.m31665(8388611);
            C19258 buildDialog = buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f120724);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f1208c5, new DialogInterface.OnClickListener() { // from class: l.ۜ۫᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC17169.m40278(ActivityC17169.this, runnable);
                }
            });
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
            return;
        }
        runnable.run();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40278(ActivityC17169 activityC17169, Runnable runnable) {
        activityC17169.f52605.m31647(8388611);
        activityC17169.m40353(runnable);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40353(Runnable runnable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = new ArrayList(this.f52616).iterator();
        while (it.hasNext()) {
            AbstractC14346 abstractC14346 = (AbstractC14346) it.next();
            if ((abstractC14346 instanceof C6306) && abstractC14346.f43260.getBoolean("changed", false)) {
                linkedList.add(((C6306) abstractC14346).m17429(this));
            } else if ((abstractC14346 instanceof C7864) && abstractC14346.f43260.getBoolean("changed", false)) {
                linkedList.add(((C7864) abstractC14346).m21124(this));
            }
        }
        if (!linkedList.isEmpty()) {
            new C23643(this, linkedList, runnable).m20274();
        } else if (runnable != null) {
            runnable.run();
        } else {
            C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
        }
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40357() {
        C12366 c12366 = this.f52606;
        int i = 0;
        if (c12366 != null && c12366.m30044().m27330("strings_changed").mo23120()) {
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44433(R.string.MT_Protector_res_0x7f120b7b);
            c19258.m44416(R.string.MT_Protector_res_0x7f120a01);
            c19258.m44442(R.string.MT_Protector_res_0x7f120b8b, new DialogInterfaceOnClickListenerC10299(this, i));
            c19258.m44440(R.string.MT_Protector_res_0x7f1201d9, new DialogInterfaceOnClickListenerC10944(i, this));
            c19258.m44438();
            return;
        }
        C19452 c19452 = this.f52621;
        if (c19452 != null && c19452.m44854().m27330("strings_changed").mo23120()) {
            int i3 = DialogInterfaceC0206.f1451;
            C19258 c192582 = new C19258(this);
            c192582.m44433(R.string.MT_Protector_res_0x7f120b7b);
            c192582.m44416(R.string.MT_Protector_res_0x7f120a01);
            c192582.m44442(R.string.MT_Protector_res_0x7f120b8b, new DialogInterfaceOnClickListenerC22555(4, this));
            c192582.m44440(R.string.MT_Protector_res_0x7f1201d9, new DialogInterface.OnClickListener() { // from class: l.ܽۤ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC17169.m40272(ActivityC17169.this);
                }
            });
            c192582.m44438();
            return;
        }
        m40288(false, true);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40324(ActivityC17169 activityC17169) {
        activityC17169.f52607.m11413(3);
        activityC17169.f52607.m11412();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40334(ActivityC17169 activityC17169) {
        activityC17169.f52607.m11404(3);
        activityC17169.f52607.m11402();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40281(ActivityC17169 activityC17169, C3929 c3929) {
        C19287 m44466 = C19287.m44466(c3929.f12541, c3929.f12539);
        m44466.f60678 = false;
        String str = c3929.f12540;
        activityC17169.m40354(str, m44466);
        C19452 c19452 = activityC17169.f52621;
        C11003.requireNonNull(c19452);
        c19452.m44818(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40272(ActivityC17169 activityC17169) {
        activityC17169.m40288(false, true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40307(ActivityC17169 activityC17169) {
        activityC17169.m40288(true, true);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m40338(ActivityC17169 activityC17169) {
        activityC17169.m40288(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40288(final boolean z, final boolean z2) {
        m40353(new Runnable() { // from class: l.ۘ۫᩷
            @Override // java.lang.Runnable
            public final void run() {
                int i = ActivityC17169.f52595;
                new C2477(ActivityC17169.this, z2, z).m20274();
            }
        });
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m40362(String str) {
        Iterator it = this.f52616.iterator();
        while (it.hasNext()) {
            AbstractC14346 abstractC14346 = (AbstractC14346) it.next();
            if (abstractC14346 instanceof C6306) {
                C6306 c6306 = (C6306) abstractC14346;
                if (c6306.m17420().equals(str)) {
                    return c6306.m17421(this.f52606, this.f52608);
                }
            }
        }
        C12366 c12366 = this.f52606;
        C11003.requireNonNull(c12366);
        return c12366.m30052(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m40368(String str) {
        Iterator it = this.f52616.iterator();
        while (it.hasNext()) {
            AbstractC14346 abstractC14346 = (AbstractC14346) it.next();
            if (abstractC14346 instanceof C7864) {
                C7864 c7864 = (C7864) abstractC14346;
                if (c7864.m21123().equals(str)) {
                    return c7864.m21120(this.f52621, this.f52608);
                }
            }
        }
        C19452 c19452 = this.f52621;
        C11003.requireNonNull(c19452);
        return c19452.m44856(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c6, code lost:
    
        if (l.C1420.m4917(r3) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (l.C1047.f3863 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (l.C0714.f2697 < 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (l.C1504.f5354 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        if (l.C4117.f13076 > 0) goto L33;
     */
    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m40352() {
        /*
            Method dump skipped, instructions count: 1846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC17169.m40352():void");
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final void m40361() {
        AbstractC15440 abstractC15440 = C0684.f2624;
        if (!abstractC15440.mo23120()) {
            abstractC15440.mo23546();
        }
        int i = 1;
        while (true) {
            if (!abstractC15440.m36526("Project" + i).mo23120()) {
                C18705 c18705 = new C18705(this, this, abstractC15440);
                c18705.m31258(R.string.MT_Protector_res_0x7f1207aa);
                c18705.m31250((CharSequence) ("Project" + i));
                c18705.m31244();
                c18705.m31279(6);
                c18705.m31281();
                c18705.m31256(R.string.MT_Protector_res_0x7f1208c9);
                c18705.m31266(true);
                return;
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f52615 = true;
        if (m40373()) {
            try {
                ExecutorService executorService = C1802.f6208;
                final C11005 c11005 = this.f52620;
                C11003.requireNonNull(c11005);
                executorService.submit(new Callable() { // from class: l.᩸۫᩷
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(C11005.this.m27333());
                    }
                }).get(100L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            if (this.f52607.f11863) {
                C4925.m14312(new Intent("ACTION_MT_CLOSE_RESOURCE_QUERIER"));
            }
        }
        super.finish();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40355(boolean z) {
        if (!z && m40366()) {
            throw new RuntimeException("hasModifiedFiles");
        }
        new C19411(this).m20274();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m40320(ActivityC17169 activityC17169, int i) {
        int i2;
        ArrayList arrayList = activityC17169.f52616;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
        if (abstractC14346.m34230()) {
            i2 = activityC17169.m40266(0, false);
            Bundle requireArguments = abstractC14346.requireArguments();
            C11003.requireNonNull(requireArguments);
            requireArguments.putBoolean("top", false);
            while (i2 < arrayList.size() && ((AbstractC14346) arrayList.get(i2)).m34230()) {
                i2++;
            }
        } else {
            int m40266 = activityC17169.m40266(0, true);
            Bundle requireArguments2 = abstractC14346.requireArguments();
            C11003.requireNonNull(requireArguments2);
            requireArguments2.putBoolean("top", true);
            i2 = m40266;
        }
        if (i != i2) {
            AbstractC14346 abstractC143462 = (AbstractC14346) arrayList.get(activityC17169.f52618);
            if (i < i2) {
                i2--;
            }
            arrayList.remove(i);
            arrayList.add(i2, abstractC14346);
            activityC17169.f52618 = arrayList.indexOf(abstractC143462);
            activityC17169.m40296();
        }
        activityC17169.m40331();
        activityC17169.f52613.notifyDataSetChanged();
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C3764 m40369() {
        return this.f52607;
    }
}
