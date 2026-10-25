package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: O4XG */
/* renamed from: l.֡᩻֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC0737 extends ActivityC23809 implements InterfaceC2811, InterfaceC4222 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2777 = 0;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f2778;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f2779;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C22610 f2780 = C22610.m50581(new C19789(this));

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C20765 f2782 = new C20765(this);

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f2781 = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۘ᩻֫] */
    public ActivityC0737() {
        getSavedStateRegistry().m36039("android:support:lifecycle", new InterfaceC8174() { // from class: l.ܺ᩻֫
            @Override // l.InterfaceC8174
            /* renamed from: ֫ */
            public final Bundle mo1940() {
                int i = ActivityC0737.f2777;
                ActivityC0737 activityC0737 = ActivityC0737.this;
                activityC0737.m2842();
                activityC0737.f2782.m47438(EnumC22901.ON_STOP);
                return new Bundle();
            }
        });
        mo9143(new InterfaceC13041() { // from class: l.ۖ᩻֫
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                ActivityC0737.this.f2780.m50586();
            }
        });
        m52495((C4266) new InterfaceC13041() { // from class: l.ۘ᩻֫
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                ActivityC0737.this.f2780.m50586();
            }
        });
        m52496(new InterfaceC14678() { // from class: l.ᩴ᩻֫
            @Override // l.InterfaceC14678
            /* renamed from: ֫ */
            public final void mo15594(ActivityC23809 activityC23809) {
                ActivityC0737.this.f2780.m50583();
            }
        });
    }

    @Override // l.ActivityC23809, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2780.m50586();
        super.onActivityResult(i, i2, intent);
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2782.m47438(EnumC22901.ON_CREATE);
        this.f2780.m50590();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m50582 = this.f2780.m50582(view, str, context, attributeSet);
        return m50582 == null ? super.onCreateView(view, str, context, attributeSet) : m50582;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m50582 = this.f2780.m50582(null, str, context, attributeSet);
        return m50582 == null ? super.onCreateView(str, context, attributeSet) : m50582;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2780.m50592();
        this.f2782.m47438(EnumC22901.ON_DESTROY);
    }

    @Override // l.ActivityC23809, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f2780.m50584(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2779 = false;
        this.f2780.m50591();
        this.f2782.m47438(EnumC22901.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2780.m50586();
    }

    @Override // android.app.Activity
    public void onResume() {
        C22610 c22610 = this.f2780;
        c22610.m50586();
        super.onResume();
        this.f2779 = true;
        c22610.m50593();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2782.m47438(EnumC22901.ON_RESUME);
        this.f2780.m50589();
    }

    @Override // android.app.Activity
    public void onStart() {
        C22610 c22610 = this.f2780;
        c22610.m50586();
        super.onStart();
        this.f2781 = false;
        if (!this.f2778) {
            this.f2778 = true;
            c22610.m50588();
        }
        c22610.m50593();
        this.f2782.m47438(EnumC22901.ON_START);
        c22610.m50594();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2781 = true;
        m2842();
        this.f2780.m50585();
        this.f2782.m47438(EnumC22901.ON_STOP);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L5d
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L5d
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L4d;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L24;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5d
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L5d
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L5d
            goto L5c
        L24:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L5d
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5d
            goto L5c
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L46:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L5d
            goto L5c
        L4d:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L5d
        L56:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L5d
        L5c:
            return
        L5d:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.f2778
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.f2779
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.f2781
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto Lb4
            l.ܿۖ֫ r1 = l.AbstractC17050.m40019(r2)
            r1.mo40021(r0, r4, r5, r6)
        Lb4:
            l.᩹᩻֫ r0 = r2.f2780
            l.ۚۜ֫ r0 = r0.m50587()
            r0.m14867(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC0737.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m2842() {
        while (m2841(this.f2780.m50587(), EnumC13728.CREATED)) {
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC5180 m2843() {
        return this.f2780.m50587();
    }

    @Override // l.ActivityC23809, android.app.Activity, l.InterfaceC2811
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2780.m50586();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m2841(AbstractC5180 abstractC5180, EnumC13728 enumC13728) {
        boolean z = false;
        for (ComponentCallbacksC9205 componentCallbacksC9205 : abstractC5180.m14859()) {
            if (componentCallbacksC9205 != null) {
                if (componentCallbacksC9205.getHost() != null) {
                    z |= m2841(componentCallbacksC9205.getChildFragmentManager(), enumC13728);
                }
                C2772 c2772 = componentCallbacksC9205.mViewLifecycleOwner;
                if (c2772 != null && c2772.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
                    componentCallbacksC9205.mViewLifecycleOwner.m8565(enumC13728);
                    z = true;
                }
                if (componentCallbacksC9205.mLifecycleRegistry.mo19832().m33028(EnumC13728.STARTED)) {
                    componentCallbacksC9205.mLifecycleRegistry.m47437(enumC13728);
                    z = true;
                }
            }
        }
        return z;
    }
}
