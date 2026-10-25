package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: I1KV */
/* renamed from: l.۟ܳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ViewOnClickListenerC7528 extends ComponentCallbacksC9205 implements View.OnClickListener, InterfaceC15287, InterfaceC8233, InterfaceC0440 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f23159;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13328 f23160;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C6273 f23161;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3764 f23162;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f23163;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f23164;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f23165;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f23166;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C13132 f23167;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12366 f23168;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13876 f23169;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f23170;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f23171;

    public ViewOnClickListenerC7528() {
        super(R.layout.MT_Protector_res_0x7f0d01d3);
        this.f23171 = -1;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        final byte[] bArr;
        super.onCreate(bundle);
        C15288 c15288 = new C15288(this);
        this.f23169 = c15288;
        c15288.m33259((InterfaceC15287) this);
        this.f23169.m33258((InterfaceC8233) this);
        if (bundle != null) {
            this.f23164 = bundle.getString("importParent");
            bArr = bundle.getByteArray("selection");
        } else {
            bArr = null;
        }
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f23162 = c3764;
        c3764.m11419().m1668(this, new InterfaceC1008() { // from class: l.ᩳܳۢ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                ViewOnClickListenerC7528.m20204((C12366) obj, ViewOnClickListenerC7528.this, bArr);
            }
        });
        C6273 m44073 = ViewOnClickListenerC19121.m44073(this, new C2742(4, this));
        m44073.m36541("project_import_init_path");
        this.f23161 = m44073;
        C13328 m44079 = ViewOnClickListenerC19121.m44079(this, new C16648(6, this));
        m44079.m36541("project_export_init_path");
        this.f23160 = m44079;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20204(final C12366 c12366, final ViewOnClickListenerC7528 viewOnClickListenerC7528, final byte[] bArr) {
        viewOnClickListenerC7528.f23168 = c12366;
        C1802.f6208.execute(new Runnable() { // from class: l.ܿܳۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C12366 c123662 = c12366;
                final C17159 m30053 = c123662.m30053();
                final ViewOnClickListenerC7528 viewOnClickListenerC75282 = viewOnClickListenerC7528;
                final byte[] bArr2 = bArr;
                C4925.m14315(new Runnable() { // from class: l.ܳܳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC7528.m20202(ViewOnClickListenerC7528.this, m30053, bArr2, c123662);
                    }
                });
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20202(ViewOnClickListenerC7528 viewOnClickListenerC7528, C17159 c17159, byte[] bArr, C12366 c12366) {
        viewOnClickListenerC7528.f23169.m33260(c17159);
        viewOnClickListenerC7528.f23171 = 0;
        C13876 c13876 = viewOnClickListenerC7528.f23169;
        HashSet hashSet = new HashSet();
        C12366 c123662 = viewOnClickListenerC7528.f23168;
        if (c123662 != null) {
            AbstractC15440 m27330 = c123662.m30044().m27330("explorer");
            if (m27330.mo23120()) {
                try {
                    C12951 m36528 = m27330.m36528();
                    if (m36528.readInt() == 305419897) {
                        viewOnClickListenerC7528.f23171 = m36528.readInt();
                        int readInt = m36528.readInt();
                        for (int i = 0; i < readInt; i++) {
                            hashSet.add(m36528.m31504());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        c13876.m33255(hashSet);
        C13132 c13132 = viewOnClickListenerC7528.f23167;
        if (c13132 != null) {
            c13132.scrollToPosition(viewOnClickListenerC7528.f23171);
            viewOnClickListenerC7528.f23171 = -1;
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                AbstractC15440 m273302 = c12366.m30047().m27330("selection");
                try {
                    viewOnClickListenerC7528.f23169.m33265(m273302.m36506());
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    m273302.mo27929();
                    throw th;
                }
                m273302.mo27929();
            } else {
                viewOnClickListenerC7528.f23169.m33265(bArr);
            }
        }
        viewOnClickListenerC7528.f23170 = true;
        ActivityC0737 activity = viewOnClickListenerC7528.getActivity();
        if (activity instanceof ActivityC17169) {
            ((ActivityC17169) activity).m40360();
        }
        if (viewOnClickListenerC7528.getView() != null) {
            viewOnClickListenerC7528.f23162.m11396(viewOnClickListenerC7528.getViewLifecycleOwner(), new C5412(viewOnClickListenerC7528));
            if (viewOnClickListenerC7528.f23169.m33267()) {
                viewOnClickListenerC7528.m20211();
            }
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        this.f23167 = c13132;
        c13132.setTag("RecyclerView0");
        this.f23159 = (FloatingActionButton) view.findViewById(R.id.MT_Protector_res_0x7f0a0205);
        this.f23163 = (FloatingActionButton) view.findViewById(R.id.MT_Protector_res_0x7f0a0213);
        this.f23165 = (FloatingActionButton) view.findViewById(R.id.MT_Protector_res_0x7f0a0212);
        this.f23166 = (FloatingActionButton) view.findViewById(R.id.MT_Protector_res_0x7f0a020c);
        this.f23167.setAdapter(this.f23169);
        int i = this.f23171;
        if (i != -1) {
            this.f23167.scrollToPosition(i);
            this.f23171 = -1;
        }
        if (this.f23170) {
            ActivityC0737 activity = getActivity();
            if (activity instanceof ActivityC17169) {
                ((ActivityC17169) activity).m40360();
            }
            this.f23162.m11396(getViewLifecycleOwner(), new C5412(this));
            if (this.f23169.m33267()) {
                m20211();
            }
        }
        this.f23167.addOnScrollListener(this.f23169.m33250(new C1178(0, this)));
    }

    @Override // l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("importParent", this.f23164);
        byte[] m33280 = this.f23169.m33280();
        if (m33280 != null) {
            if (m33280.length > 20480) {
                try {
                    AbstractC15440 m27330 = this.f23168.m30047().m27330("selection");
                    m27330.getClass();
                    m27330.m36503(m33280, 0, m33280.length);
                    bundle.putByteArray("selection", new byte[0]);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            bundle.putByteArray("selection", m33280);
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f23167.setAdapter(null);
        this.f23167 = null;
        this.f23159 = null;
        this.f23163 = null;
        this.f23165 = null;
        this.f23166 = null;
    }

    @Override // l.InterfaceC0440
    /* renamed from: ֫ */
    public final boolean mo1996() {
        if (!this.f23169.m33267()) {
            return false;
        }
        this.f23169.mo33251();
        return true;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onPause() {
        super.onPause();
        C12366 c12366 = this.f23168;
        if (c12366 != null && c12366.m36266().m27336()) {
            C10130 m43030 = C18515.m43030(305419897);
            HashSet m33273 = this.f23169.m33273();
            m43030.writeInt(((C6495) this.f23167.getLayoutManager()).findFirstVisibleItemPosition());
            m43030.writeInt(m33273.size());
            Iterator it = m33273.iterator();
            while (it.hasNext()) {
                m43030.m25423((CharSequence) it.next());
            }
            try {
                this.f23168.m30044().m27330("explorer").m36496(m43030);
            } catch (IOException e) {
                C3764 c3764 = this.f23162;
                if (c3764 != null) {
                    c3764.m11384((Throwable) e);
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20215() {
        if (this.f23168 != null) {
            HashSet m33273 = this.f23169.m33273();
            this.f23169.m33260(this.f23168.m30053());
            this.f23169.m33255(m33273);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20216(String str) {
        C13876 c13876 = this.f23169;
        c13876.getClass();
        c13876.m33254((Collection) Collections.singletonList(str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20214(Collection collection) {
        this.f23169.m33254(collection);
    }

    @Override // l.InterfaceC15287
    /* renamed from: ۧ */
    public final void mo16606(C16971 c16971) {
        ((ActivityC17169) requireActivity()).m40343(c16971.m39805(), (C19287) null);
        this.f23168.m30026(c16971.m39805());
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0069, code lost:
    
        if ((r7.m39805() + "/").startsWith("# TOO_LONG_NAME/") == false) goto L10;
     */
    @Override // l.InterfaceC8233
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo16605(final l.C16971 r7) {
        /*
            r6 = this;
            l.᩸ۖ r0 = new l.᩸ۖ
            android.content.Context r1 = r6.requireContext()
            android.view.View r2 = r7.m39802()
            r3 = 0
            r0.<init>(r1, r2, r3)
            boolean r1 = r7.m39807()
            r2 = 1
            if (r1 == 0) goto L1f
            l.᩺ᩳۢ r1 = new l.᩺ᩳۢ
            java.lang.String r4 = r7.m39805()
            r1.<init>(r0, r4, r2)
            goto L2a
        L1f:
            l.ۗۜ r1 = r0.m48304()
            r4 = 2131887615(0x7f1205ff, float:1.9409842E38)
            r1.add(r3, r4, r3, r4)
            r1 = 0
        L2a:
            l.ۗۜ r4 = r0.m48304()
            r5 = 2131887533(0x7f1205ad, float:1.9409676E38)
            r4.add(r3, r5, r3, r5)
            l.ۗۜ r4 = r0.m48304()
            r5 = 2131887585(0x7f1205e1, float:1.9409781E38)
            r4.add(r3, r5, r3, r5)
            l.ۗۜ r4 = r0.m48304()
            r5 = 2131887562(0x7f1205ca, float:1.9409735E38)
            r4.add(r3, r5, r3, r5)
            boolean r4 = r7.m39807()
            if (r4 != 0) goto L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r7.m39805()
            r4.append(r5)
            java.lang.String r5 = "/"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "# TOO_LONG_NAME/"
            boolean r4 = r4.startsWith(r5)
            if (r4 != 0) goto L75
        L6b:
            l.ۗۜ r4 = r0.m48304()
            r5 = 2131887609(0x7f1205f9, float:1.940983E38)
            r4.add(r3, r5, r3, r5)
        L75:
            l.ۗۜ r4 = r0.m48304()
            r5 = 2131886367(0x7f12011f, float:1.940731E38)
            r4.add(r3, r5, r3, r5)
            l.۠ܳۢ r3 = new l.۠ܳۢ
            r3.<init>()
            r0.m48302(r3)
            l.۬۬ۧ r7 = r6.f23167
            r7.suppressLayout(r2)
            l.ۛۤᩳ r7 = new l.ۛۤᩳ
            r1 = 6
            r7.<init>(r1, r6)
            r0.m48301(r7)
            r0.m48305()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7528.mo16605(l.ܽ᩻ۡ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20203(final ViewOnClickListenerC7528 viewOnClickListenerC7528, C23155 c23155, final C16971 c16971, MenuItem menuItem) {
        if (c23155 == null || !c23155.m51333(menuItem)) {
            int itemId = menuItem.getItemId();
            if (itemId == R.string.MT_Protector_res_0x7f1205ff) {
                new ViewOnClickListenerC16700(viewOnClickListenerC7528, c16971.m39805()).m39263();
                return;
            }
            if (itemId == R.string.MT_Protector_res_0x7f1205f9) {
                ((ActivityC17169) viewOnClickListenerC7528.requireActivity()).m40363(new Runnable() { // from class: l.᩻ܳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC7528 viewOnClickListenerC75282 = ViewOnClickListenerC7528.this;
                        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) viewOnClickListenerC75282.requireActivity();
                        C16971 c169712 = c16971;
                        C4706 c4706 = new C4706(viewOnClickListenerC75282, abstractActivityC3346, abstractActivityC3346, c169712);
                        c4706.m31258(R.string.MT_Protector_res_0x7f1205f9);
                        c4706.m31250((CharSequence) c169712.m39805());
                        c4706.m31244();
                        c4706.m31242();
                        c4706.m31279(6);
                        c4706.m31266(true);
                    }
                });
                return;
            }
            if (itemId == R.string.MT_Protector_res_0x7f1205e1) {
                if (c16971.m39807()) {
                    viewOnClickListenerC7528.f23164 = c16971.m39803();
                } else {
                    viewOnClickListenerC7528.f23164 = c16971.m39805();
                }
                C6273 c6273 = viewOnClickListenerC7528.f23161;
                c6273.getClass();
                C6273.m17283(c6273, R.string.MT_Protector_res_0x7f1205e1, null, new String[]{"smali", "zip", "dex"}, 8);
                C21374.m48457(R.string.MT_Protector_res_0x7f120a81);
                return;
            }
            if (itemId == R.string.MT_Protector_res_0x7f1205ad) {
                if (c16971.m39807()) {
                    viewOnClickListenerC7528.m20190(R.string.MT_Protector_res_0x7f1205ad, c16971.m39803(), "", false, new C20935());
                    return;
                } else {
                    viewOnClickListenerC7528.m20190(R.string.MT_Protector_res_0x7f1205ad, c16971.m39805(), "", false, new C20935());
                    return;
                }
            }
            int i = 1;
            if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
                Context requireContext = viewOnClickListenerC7528.requireContext();
                int i2 = DialogInterfaceC0206.f1451;
                C19258 c19258 = new C19258(requireContext);
                c19258.m44433(R.string.MT_Protector_res_0x7f1205ca);
                c19258.m44424(viewOnClickListenerC7528.getString(R.string.MT_Protector_res_0x7f120870, c16971.m39801()));
                c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC22998(i, viewOnClickListenerC7528, c16971));
                c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                c19258.m44438();
                return;
            }
            if (itemId == R.string.MT_Protector_res_0x7f12011f) {
                c16971.m39806();
                FloatingActionButton floatingActionButton = viewOnClickListenerC7528.f23159;
                FloatingActionButton floatingActionButton2 = viewOnClickListenerC7528.f23166;
                FloatingActionButton floatingActionButton3 = viewOnClickListenerC7528.f23165;
                FloatingActionButton floatingActionButton4 = viewOnClickListenerC7528.f23163;
                floatingActionButton.setOnClickListener(viewOnClickListenerC7528);
                floatingActionButton2.setOnClickListener(viewOnClickListenerC7528);
                floatingActionButton3.setOnClickListener(viewOnClickListenerC7528);
                floatingActionButton4.setOnClickListener(viewOnClickListenerC7528);
                floatingActionButton.setVisibility(0);
                floatingActionButton2.setVisibility(0);
                floatingActionButton3.setVisibility(0);
                floatingActionButton4.setVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
                float height = floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                floatingActionButton.setTranslationY(height);
                floatingActionButton.setAlpha(0.8f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", height, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
                float height2 = floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                floatingActionButton2.setTranslationY(height2);
                floatingActionButton2.setAlpha(0.8f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", height2, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton4.getLayoutParams();
                float height3 = floatingActionButton4.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                floatingActionButton4.setTranslationY(height3);
                floatingActionButton4.setAlpha(0.8f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", height3, 0.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
                float height4 = floatingActionButton3.getHeight() + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                floatingActionButton3.setTranslationY(height4);
                floatingActionButton3.setAlpha(0.8f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", height4, 0.0f);
                AnimatorSet duration = new AnimatorSet().setDuration(200L);
                duration.setInterpolator(new DecelerateInterpolator());
                duration.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                duration.start();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20201(ViewOnClickListenerC7528 viewOnClickListenerC7528, C16971 c16971) {
        c16971.m39800();
        if (c16971.m39807()) {
            C12366 c12366 = viewOnClickListenerC7528.f23168;
            String m39805 = c16971.m39805();
            c12366.getClass();
            c12366.m30031(Collections.singleton(m39805));
        } else {
            viewOnClickListenerC7528.f23168.m30068(c16971.m39805());
        }
        ((ActivityC17169) viewOnClickListenerC7528.requireActivity()).m40349();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20206(ViewOnClickListenerC7528 viewOnClickListenerC7528) {
        C13132 c13132 = viewOnClickListenerC7528.f23167;
        if (c13132 != null) {
            c13132.suppressLayout(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.MT_Protector_res_0x7f0a0205) {
            Context requireContext = requireContext();
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(requireContext);
            c19258.m44433(R.string.MT_Protector_res_0x7f1205ca);
            c19258.m44424(getString(R.string.MT_Protector_res_0x7f120879, Integer.valueOf(this.f23169.m33268())));
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ᩴܳۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC7528.m20192(ViewOnClickListenerC7528.this);
                }
            });
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a020c) {
            CharSequence[] charSequenceArr = {getString(R.string.MT_Protector_res_0x7f120354, "Smali"), getString(R.string.MT_Protector_res_0x7f120354, "Dex"), getString(R.string.MT_Protector_res_0x7f120354, "Jar")};
            Context requireContext2 = requireContext();
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c192582 = new C19258(requireContext2);
            c192582.m44430(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.᩵ܳۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ViewOnClickListenerC7528.m20193(ViewOnClickListenerC7528.this, i3);
                }
            });
            c192582.m44438();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a0213) {
            this.f23169.m33263(new C21639());
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a0212) {
            final Set<String> m30069 = this.f23168.m30069();
            if (m30069.isEmpty()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1206fc);
                return;
            }
            this.f23169.m33263(new InterfaceC23049() { // from class: l.֡ܳۢ
                @Override // l.InterfaceC23049
                /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final int mo2075(String str, boolean z) {
                    return m30069.contains(str) ? 2 : 1;
                }
            });
            HashSet hashSet = new HashSet();
            for (String str : m30069) {
                while (true) {
                    int lastIndexOf = str.lastIndexOf(47);
                    if (lastIndexOf != -1) {
                        str = str.substring(0, lastIndexOf);
                        hashSet.add(str + "/");
                    }
                }
            }
            this.f23169.m33255(hashSet);
            C21374.m48457(R.string.MT_Protector_res_0x7f12003c);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20193(ViewOnClickListenerC7528 viewOnClickListenerC7528, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        if (i == 0) {
            C13328 c13328 = viewOnClickListenerC7528.f23160;
            c13328.getClass();
            C13328.m32310(c13328, R.string.MT_Protector_res_0x7f1205d5, bundle, null, "smali.zip", new String[]{"zip"}, 32);
        } else if (i == 1) {
            C13328 c133282 = viewOnClickListenerC7528.f23160;
            c133282.getClass();
            C13328.m32310(c133282, R.string.MT_Protector_res_0x7f1205d5, bundle, null, "classes.dex", new String[]{"dex"}, 32);
        } else {
            if (i != 2) {
                return;
            }
            C13328 c133283 = viewOnClickListenerC7528.f23160;
            c133283.getClass();
            C13328.m32310(c133283, R.string.MT_Protector_res_0x7f1205d5, bundle, null, "classes.jar", new String[]{"jar"}, 32);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20211() {
        FloatingActionButton floatingActionButton = this.f23159;
        FloatingActionButton floatingActionButton2 = this.f23166;
        FloatingActionButton floatingActionButton3 = this.f23165;
        FloatingActionButton floatingActionButton4 = this.f23163;
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton4.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
        floatingActionButton4.setVisibility(0);
        floatingActionButton.setTranslationY(0.0f);
        floatingActionButton.setAlpha(0.8f);
        floatingActionButton2.setTranslationY(0.0f);
        floatingActionButton2.setAlpha(0.8f);
        floatingActionButton3.setTranslationY(0.0f);
        floatingActionButton3.setAlpha(0.8f);
        floatingActionButton4.setTranslationY(0.0f);
        floatingActionButton4.setAlpha(0.8f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m20205(boolean z) {
        FloatingActionButton floatingActionButton = this.f23159;
        FloatingActionButton floatingActionButton2 = this.f23166;
        FloatingActionButton floatingActionButton3 = this.f23165;
        FloatingActionButton floatingActionButton4 = this.f23163;
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton4, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton3, "alpha", 0.8f, 0.0f));
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton4.getLayoutParams();
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", 0.0f, floatingActionButton4.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", 0.0f, floatingActionButton3.getHeight() + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin);
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        }
        duration.addListener(new C3295(floatingActionButton, floatingActionButton2, floatingActionButton4, floatingActionButton3));
        duration.start();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20192(ViewOnClickListenerC7528 viewOnClickListenerC7528) {
        if (viewOnClickListenerC7528.f23168 == null) {
            return;
        }
        viewOnClickListenerC7528.f23168.m30031(viewOnClickListenerC7528.f23169.m33269());
        viewOnClickListenerC7528.f23169.m33281();
        viewOnClickListenerC7528.m20205(true);
        ((ActivityC17169) viewOnClickListenerC7528.requireActivity()).m40349();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m20191(Runnable runnable) {
        if (this.f23170) {
            runnable.run();
        } else {
            C4925.m14316(new RunnableC9149(3, this, runnable), 100L);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20195(ViewOnClickListenerC7528 viewOnClickListenerC7528, Runnable runnable) {
        if (viewOnClickListenerC7528.isResumed()) {
            viewOnClickListenerC7528.m20191(runnable);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m20208(ViewOnClickListenerC7528 viewOnClickListenerC7528, String str, Bundle bundle) {
        if (viewOnClickListenerC7528.f23168 == null) {
            return;
        }
        new C13172(viewOnClickListenerC7528, bundle.getInt("type"), viewOnClickListenerC7528.f23169.m33269(), str).m20274();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20199(final ViewOnClickListenerC7528 viewOnClickListenerC7528, final String str, final ArrayList arrayList, final boolean z) {
        final AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) viewOnClickListenerC7528.requireActivity();
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d0099);
        final RadioButton radioButton = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479);
        RadioButton radioButton2 = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        ViewOnClickListenerC8940 viewOnClickListenerC8940 = new ViewOnClickListenerC8940(radioButton, radioButton2, editText, 0);
        radioButton.setOnClickListener(viewOnClickListenerC8940);
        radioButton2.setOnClickListener(viewOnClickListenerC8940);
        final Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        editText.setText(viewOnClickListenerC7528.f23164);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = viewOnClickListenerC7528.f23168.m30067().iterator();
        while (it.hasNext()) {
            arrayList2.add(((String) it.next()) + ".dex");
        }
        if (arrayList2.size() > 1) {
            spinner.setAdapter((SpinnerAdapter) new C20065(viewOnClickListenerC7528.requireContext(), arrayList2));
        } else {
            m10216.findViewById(R.id.MT_Protector_res_0x7f0a0058).setVisibility(8);
        }
        Context requireContext = viewOnClickListenerC7528.requireContext();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(requireContext);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.ܺܳۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (z) {
                    C16999.m39866(str, new String[0]).mo23552();
                }
            }
        });
        c19258.m44419(new DialogInterfaceOnCancelListenerC6514(z, str));
        final DialogInterfaceC0206 m44438 = c19258.m44438();
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۖܳۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String replace;
                m44438.dismiss();
                if (radioButton.isChecked()) {
                    replace = "";
                } else {
                    replace = editText.getText().toString().replace('.', '/');
                    if (replace.startsWith("/")) {
                        replace = replace.substring(1);
                    }
                    if (!replace.isEmpty() && !replace.endsWith("/")) {
                        replace = replace.concat("/");
                    }
                }
                new C11762(ViewOnClickListenerC7528.this, abstractActivityC3346, spinner, str, arrayList, replace, z).m20274();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m20190(int i, String str, String str2, final boolean z, final InterfaceC19763 interfaceC19763) {
        if (str == null) {
            str = "";
        }
        String replace = str.replace('/', '.');
        if (replace.endsWith(".")) {
            replace = C15472.m36561(1, 0, replace);
        }
        View m10216 = ((AbstractActivityC3346) requireActivity()).m10216(R.layout.MT_Protector_res_0x7f0d0098);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(i);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final EditText editText2 = (EditText) m10216.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        editText.setText(replace);
        editText2.setText(str2);
        editText2.setSelection(editText2.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23168.m30067().iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()) + ".dex");
        }
        if (arrayList.size() > 1) {
            spinner.setAdapter((SpinnerAdapter) new C20065(requireContext(), arrayList));
        } else {
            m10216.findViewById(R.id.MT_Protector_res_0x7f0a0058).setVisibility(8);
        }
        Context requireContext = requireContext();
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(requireContext);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = c19258.m44438();
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۢܳۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC7528.m20194(ViewOnClickListenerC7528.this, editText2, editText, z, m44438, interfaceC19763, spinner);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20194(final ViewOnClickListenerC7528 viewOnClickListenerC7528, EditText editText, EditText editText2, boolean z, final DialogInterfaceC0206 dialogInterfaceC0206, final InterfaceC19763 interfaceC19763, Spinner spinner) {
        if (editText.getText().toString().isEmpty()) {
            editText.requestFocus();
            C21374.m48457(R.string.MT_Protector_res_0x7f120303);
            return;
        }
        String replace = editText2.getText().toString().replace('.', '/');
        if (replace.startsWith("/")) {
            replace = replace.substring(1);
        }
        if (!replace.isEmpty() && !replace.endsWith("/")) {
            replace = replace.concat("/");
        }
        String obj = editText.getText().toString();
        if (C11459.m28260("[./\\s]").matcher((CharSequence) obj).find()) {
            editText.requestFocus();
            C21374.m48457(R.string.MT_Protector_res_0x7f120172);
            return;
        }
        final String m37867 = C16014.m37867(replace, obj);
        if (!viewOnClickListenerC7528.f23168.m30058(m37867)) {
            String str = (String) viewOnClickListenerC7528.f23168.m30067().get(Math.max(0, spinner.getSelectedItemPosition()));
            try {
                viewOnClickListenerC7528.f23168.m30028(str, m37867, (String) interfaceC19763.mo6973(str, m37867));
                viewOnClickListenerC7528.m20215();
                viewOnClickListenerC7528.m20216(m37867);
                dialogInterfaceC0206.dismiss();
                return;
            } catch (Exception e) {
                viewOnClickListenerC7528.f23162.m11384((Throwable) e);
                return;
            }
        }
        if (!z) {
            editText.requestFocus();
            C21374.m48459((CharSequence) viewOnClickListenerC7528.getString(R.string.MT_Protector_res_0x7f12016e, m37867.replace('/', '.')));
            return;
        }
        Context requireContext = viewOnClickListenerC7528.requireContext();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(requireContext);
        c19258.m44433(R.string.MT_Protector_res_0x7f1203a1);
        c19258.m44424(viewOnClickListenerC7528.getString(R.string.MT_Protector_res_0x7f12016e, m37867.replace('/', '.')));
        c19258.m44442(R.string.MT_Protector_res_0x7f12015e, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f1205fa, new DialogInterface.OnClickListener() { // from class: l.ۘܳۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ViewOnClickListenerC7528.m20200(ViewOnClickListenerC7528.this, dialogInterfaceC0206, interfaceC19763, m37867);
            }
        });
        c19258.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20200(ViewOnClickListenerC7528 viewOnClickListenerC7528, DialogInterfaceC0206 dialogInterfaceC0206, InterfaceC19763 interfaceC19763, String str) {
        dialogInterfaceC0206.dismiss();
        try {
            viewOnClickListenerC7528.f23168.m30027(str, (String) interfaceC19763.mo6973(null, str));
            viewOnClickListenerC7528.m20215();
            viewOnClickListenerC7528.m20216(str);
        } catch (Exception e) {
            viewOnClickListenerC7528.f23162.m11384((Throwable) e);
        }
    }
}
