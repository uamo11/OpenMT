package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import bin.mt.plus.R;

/* compiled from: D5UJ */
/* renamed from: l.۫᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12729 extends ContextWrapper {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Configuration f38285;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LayoutInflater f38286;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Configuration f38287;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Resources f38288;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38289;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Resources.Theme f38290;

    public C12729() {
        super(null);
    }

    public C12729(Context context, int i) {
        super(context);
        this.f38289 = i;
    }

    public C12729(Context context, Resources.Theme theme) {
        super(context);
        this.f38290 = theme;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31026(Configuration configuration) {
        if (this.f38288 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f38287 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f38287 = new Configuration(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(l.C12729.f38285) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f38288
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f38287
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = l.C12729.f38285
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            l.C12729.f38285 = r1
        L1c:
            android.content.res.Configuration r1 = l.C12729.f38285
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f38287
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f38288 = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f38288 = r0
        L38:
            android.content.res.Resources r0 = r3.f38288
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12729.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f38289 != i) {
            this.f38289 = i;
            m31024();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31025() {
        return this.f38289;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f38290;
        if (theme != null) {
            return theme;
        }
        if (this.f38289 == 0) {
            this.f38289 = R.style.MT_Protector_res_0x7f130292;
        }
        m31024();
        return this.f38290;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f38286 == null) {
                this.f38286 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f38286;
        }
        return getBaseContext().getSystemService(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31024() {
        if (this.f38290 == null) {
            this.f38290 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f38290.setTo(theme);
            }
        }
        this.f38290.applyStyle(this.f38289, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }
}
