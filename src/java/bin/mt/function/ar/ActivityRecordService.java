package bin.mt.function.ar;

import android.accessibilityservice.AccessibilityService;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import l.ApplicationC20075;
import l.C14507;
import l.C18080;
import l.C21282;
import l.C22870;
import l.C23680;
import l.C3060;
import l.C4925;
import l.C6001;
import l.C6554;
import l.C8091;
import l.InterfaceC12344;
import l.InterfaceC14930;

/* loaded from: classes.dex */
public class ActivityRecordService extends AccessibilityService implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static C23680 f14;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static volatile WeakReference f17;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f18;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f19;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f20;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f21;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f22;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8091 f23;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f24;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final LinkedList f16 = new LinkedList();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f15 = ApplicationC20075.f65008.getBoolean("activity_record", false);

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m46() {
        return f15;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42(boolean z) {
        if (f15 != z) {
            f15 = z;
            C22870.m50970(ApplicationC20075.f65008, "activity_record", z);
            ActivityRecordService m40 = m40();
            if (m40 != null) {
                if (z) {
                    m40.f24 = false;
                }
                if (z && ApplicationC20075.f65008.getBoolean("activity_record_floating_enable", true)) {
                    m40.f23.m21466();
                } else {
                    m40.f23.m21475();
                }
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m49() {
        ActivityRecordService m40 = m40();
        if (m40 != null) {
            m40.m43();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m45() {
        ActivityRecordService m40 = m40();
        if (m40 != null) {
            m40.f23.m21466();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44() {
        ActivityRecordService m40 = m40();
        if (m40 != null) {
            m40.f23.m21475();
            m40.f24 = false;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48() {
        ActivityRecordService m40 = m40();
        if (m40 != null) {
            return m40.f23.isAttachedToWindow();
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ActivityRecordService m40() {
        WeakReference weakReference = f17;
        if (weakReference != null) {
            return (ActivityRecordService) weakReference.get();
        }
        return null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m47() {
        return m40() != null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C18080.m42142());
        C8091 c8091 = (C8091) LayoutInflater.from(this).inflate(R.layout.MT_Protector_res_0x7f0d01d5, (ViewGroup) null);
        this.f23 = c8091;
        this.f22 = (TextView) c8091.findViewById(R.id.textView0);
        this.f19 = (TextView) this.f23.findViewById(R.id.textView1);
        this.f18 = (TextView) this.f23.findViewById(R.id.textView2);
        this.f21 = (TextView) this.f23.findViewById(R.id.textView3);
        this.f20 = (TextView) this.f23.findViewById(R.id.textView4);
        if (!ApplicationC20075.f65008.getBoolean("activity_record_floating_show_single", true)) {
            onClick(this.f23);
        }
        this.f23.setOnClickListener(this);
        this.f23.setOnLongClickListener(this);
        m43();
        if (f15 && ApplicationC20075.f65008.getBoolean("activity_record_floating_enable", true)) {
            this.f23.m21466();
        }
        f17 = new WeakReference(this);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m43() {
        LinkedList linkedList = f16;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            if (it.hasNext()) {
                C23680 c23680 = (C23680) it.next();
                this.f22.setText(c23680.f76709);
                this.f19.setText(c23680.f76708);
            } else {
                this.f22.setText(R.string.MT_Protector_res_0x7f120028);
                this.f19.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f18.setText(((C23680) it.next()).f76708);
            } else {
                this.f18.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f21.setText(((C23680) it.next()).f76708);
            } else {
                this.f21.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f20.setText(((C23680) it.next()).f76708);
            } else {
                this.f20.setText((CharSequence) null);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        WeakReference weakReference = f17;
        if (weakReference != null && weakReference.get() == this) {
            f17 = null;
        }
        this.f23.m21475();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50(ActivityInfo activityInfo) {
        CharSequence loadLabel = activityInfo.loadLabel(getPackageManager());
        if (TextUtils.isEmpty(loadLabel) || loadLabel.toString().trim().isEmpty()) {
            return m51(activityInfo.packageName);
        }
        return loadLabel.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m51(String str) {
        PackageManager packageManager = getPackageManager();
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (Exception unused) {
            return "null";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.accessibilityservice.AccessibilityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent r15) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bin.mt.function.ar.ActivityRecordService.onAccessibilityEvent(android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12344 interfaceC12344;
        boolean z = false;
        if (this.f18.getVisibility() == 0) {
            this.f18.setVisibility(8);
            this.f21.setVisibility(8);
            this.f20.setVisibility(8);
            interfaceC12344 = ApplicationC20075.f65008;
        } else {
            this.f18.setVisibility(0);
            this.f21.setVisibility(0);
            this.f20.setVisibility(0);
            interfaceC12344 = ApplicationC20075.f65008;
            z = true;
        }
        C22870.m50970(interfaceC12344, "activity_record_floating_show_single", z);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C21282 c21282 = new C21282(this, view, 0);
        C3060 m48304 = c21282.m48304();
        if (this.f18.getVisibility() == 0 && this.f19.length() > 0) {
            SubMenu addSubMenu = m48304.addSubMenu(R.string.MT_Protector_res_0x7f1205c2);
            addSubMenu.add(0, 1, 0, this.f19.getText());
            if (this.f18.length() > 0) {
                addSubMenu.add(0, 2, 0, C6554.m18061(30, this.f18.getText().toString()));
            }
            if (this.f21.length() > 0) {
                addSubMenu.add(0, 3, 0, C6554.m18061(30, this.f21.getText().toString()));
            }
            if (this.f20.length() > 0) {
                addSubMenu.add(0, 4, 0, C6554.m18061(30, this.f20.getText().toString()));
            }
        } else {
            m48304.add(0, 1, 0, R.string.MT_Protector_res_0x7f1205c2).setEnabled(this.f19.length() > 0);
        }
        m48304.add(0, 15, 0, this.f24 ? R.string.MT_Protector_res_0x7f1208bb : R.string.MT_Protector_res_0x7f12073f);
        m48304.add(0, 16, 0, R.string.MT_Protector_res_0x7f12044a);
        m48304.add(0, 17, 0, R.string.MT_Protector_res_0x7f120183);
        m48304.add(0, 18, 0, R.string.MT_Protector_res_0x7f1209e1);
        c21282.m48302((InterfaceC14930) new C6001(2, this));
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41(ActivityRecordService activityRecordService, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C4925.m14314((CharSequence) activityRecordService.f19.getText().toString());
            return;
        }
        if (itemId == 2) {
            C4925.m14314((CharSequence) activityRecordService.f18.getText().toString());
            return;
        }
        if (itemId == 3) {
            C4925.m14314((CharSequence) activityRecordService.f21.getText().toString());
            return;
        }
        if (itemId == 4) {
            C4925.m14314((CharSequence) activityRecordService.f20.getText().toString());
            return;
        }
        switch (itemId) {
            case 15:
                boolean z = activityRecordService.f24;
                activityRecordService.f24 = !z;
                menuItem.setTitle(!z ? R.string.MT_Protector_res_0x7f1208bb : R.string.MT_Protector_res_0x7f12073f);
                return;
            case 16:
                activityRecordService.f23.m21475();
                return;
            case 17:
                LinkedList linkedList = f16;
                synchronized (linkedList) {
                    linkedList.clear();
                    m49();
                }
                f14 = null;
                return;
            case 18:
                C14507.m34660();
                return;
            default:
                return;
        }
    }
}
