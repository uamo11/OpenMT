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
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.stream.DocumentReader;

/* compiled from: I1KV */
/* renamed from: l.᩸ܰ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ViewOnClickListenerC21628 extends ComponentCallbacksC9205 implements View.OnClickListener, InterfaceC15287, InterfaceC8233, InterfaceC0440 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C13132 f69421;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6273 f69422;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f69423;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f69424;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f69425;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f69426;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C3764 f69427;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13328 f69428;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f69429;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f69430;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AnimatorSet f69431;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19452 f69432;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13876 f69433;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f69434;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C6273 f69435;

    public ViewOnClickListenerC21628() {
        super(R.layout.MT_Protector_res_0x7f0d01ce);
        this.f69425 = -1;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        final byte[] bArr;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f69423 = bundle.getBoolean("batchExportMode", false);
            bArr = bundle.getByteArray("selection");
        } else {
            bArr = null;
        }
        C15982 c15982 = new C15982(this, C13876.m33247("<>"));
        this.f69433 = c15982;
        c15982.m33271(!this.f69423);
        this.f69433.m33259((InterfaceC15287) this);
        this.f69433.m33258((InterfaceC8233) this);
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f69427 = c3764;
        c3764.m11411().m1668(this, new InterfaceC1008() { // from class: l.ۢܰ᩷
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                ViewOnClickListenerC21628.m48878(ViewOnClickListenerC21628.this, bArr, (C19452) obj);
            }
        });
        C13328 m44079 = ViewOnClickListenerC19121.m44079((ComponentCallbacksC9205) this, (InterfaceC11918) new C17245(3, this));
        m44079.m36541("project_import_init_path");
        this.f69428 = m44079;
        C6273 m44073 = ViewOnClickListenerC19121.m44073(this, new C5975(2, this));
        m44073.m36541("project_import_init_path");
        this.f69435 = m44073;
        C6273 m440732 = ViewOnClickListenerC19121.m44073(this, new C14422(this));
        m440732.m36541("project_export_init_path");
        this.f69422 = m440732;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48878(ViewOnClickListenerC21628 viewOnClickListenerC21628, byte[] bArr, C19452 c19452) {
        viewOnClickListenerC21628.f69432 = c19452;
        C1802.f6208.execute(new RunnableC8928(viewOnClickListenerC21628, c19452, bArr, 0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48877(ViewOnClickListenerC21628 viewOnClickListenerC21628, C17159 c17159, byte[] bArr, C19452 c19452) {
        viewOnClickListenerC21628.f69433.m33260(c17159);
        viewOnClickListenerC21628.f69425 = 0;
        C13876 c13876 = viewOnClickListenerC21628.f69433;
        HashSet hashSet = new HashSet();
        C19452 c194522 = viewOnClickListenerC21628.f69432;
        if (c194522 != null) {
            AbstractC15440 m27330 = c194522.m44854().m27330("explorer");
            if (!m27330.mo23120()) {
                Iterator it = c17159.m40251().iterator();
                while (it.hasNext()) {
                    hashSet.add(((C17159) it.next()).m40256() + "/");
                }
            } else {
                try {
                    C12951 m36528 = m27330.m36528();
                    if (m36528.readInt() == 305419897) {
                        viewOnClickListenerC21628.f69425 = m36528.readInt();
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
        C13132 c13132 = viewOnClickListenerC21628.f69421;
        if (c13132 != null) {
            c13132.scrollToPosition(viewOnClickListenerC21628.f69425);
            viewOnClickListenerC21628.f69425 = -1;
        }
        if (bArr != null) {
            if (bArr.length == 0) {
                AbstractC15440 m273302 = c19452.m44839().m27330("selection");
                try {
                    viewOnClickListenerC21628.f69433.m33265(m273302.m36506());
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    m273302.mo27929();
                    throw th;
                }
                m273302.mo27929();
            } else {
                viewOnClickListenerC21628.f69433.m33265(bArr);
            }
        }
        viewOnClickListenerC21628.f69434 = true;
        ActivityC0737 activity = viewOnClickListenerC21628.getActivity();
        if (activity instanceof ActivityC17169) {
            ((ActivityC17169) activity).m40360();
        }
        if (viewOnClickListenerC21628.getView() != null) {
            viewOnClickListenerC21628.f69427.m11410(viewOnClickListenerC21628.getViewLifecycleOwner(), new C18100(viewOnClickListenerC21628));
            if (viewOnClickListenerC21628.f69433.m33267()) {
                viewOnClickListenerC21628.m48888();
            }
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        this.f69421 = c13132;
        c13132.setTag("RecyclerView0");
        this.f69430 = (FloatingActionButton) view.findViewById(R.id.MT_Protector_res_0x7f0a0205);
        this.f69429 = (FloatingActionButton) view.findViewById(R.id.MT_Protector_res_0x7f0a0208);
        this.f69424 = (FloatingActionButton) view.findViewById(R.id.MT_Protector_res_0x7f0a0213);
        this.f69426 = (FloatingActionButton) view.findViewById(R.id.MT_Protector_res_0x7f0a020c);
        this.f69421.setAdapter(this.f69433);
        int i = this.f69425;
        if (i != -1) {
            this.f69421.scrollToPosition(i);
            this.f69425 = -1;
        }
        if (this.f69434) {
            ActivityC0737 activity = getActivity();
            if (activity instanceof ActivityC17169) {
                ((ActivityC17169) activity).m40360();
            }
            this.f69427.m11410(getViewLifecycleOwner(), new C18100(this));
            if (this.f69433.m33267()) {
                m48888();
            }
        }
        C3764 c3764 = this.f69427;
        InterfaceC23586 viewLifecycleOwner = getViewLifecycleOwner();
        C13876 c13876 = this.f69433;
        C11003.requireNonNull(c13876);
        c3764.m11398(viewLifecycleOwner, new RunnableC20699(6, c13876));
        this.f69427.m11393(getViewLifecycleOwner(), new C6001(5, this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48870(ViewOnClickListenerC21628 viewOnClickListenerC21628, Integer num) {
        if (num.intValue() != R.id.MT_Protector_res_0x7f0a033f) {
            if (num.intValue() == R.id.MT_Protector_res_0x7f0a0354) {
                if (viewOnClickListenerC21628.f69433.m33267()) {
                    viewOnClickListenerC21628.f69433.mo33251();
                }
                C6273 c6273 = viewOnClickListenerC21628.f69435;
                c6273.getClass();
                C6273.m17283(c6273, R.string.MT_Protector_res_0x7f1205e1, null, new String[]{"zip"}, 8);
                return;
            }
            return;
        }
        if (viewOnClickListenerC21628.f69433.m33267()) {
            if (viewOnClickListenerC21628.f69423) {
                return;
            } else {
                viewOnClickListenerC21628.f69433.mo33251();
            }
        }
        viewOnClickListenerC21628.f69423 = true;
        viewOnClickListenerC21628.f69433.m33271(false);
        viewOnClickListenerC21628.f69433.m33248();
        viewOnClickListenerC21628.m48884();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("batchExportMode", this.f69423);
        byte[] m33280 = this.f69433.m33280();
        if (m33280 != null) {
            if (m33280.length > 20480) {
                try {
                    AbstractC15440 m27330 = this.f69432.m44839().m27330("selection");
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
        this.f69421.setAdapter(null);
        this.f69421 = null;
        this.f69430 = null;
        this.f69429 = null;
        this.f69424 = null;
        this.f69426 = null;
    }

    @Override // l.InterfaceC0440
    /* renamed from: ֫ */
    public final boolean mo1996() {
        if (!this.f69433.m33267()) {
            return false;
        }
        this.f69433.mo33251();
        return true;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onPause() {
        super.onPause();
        C19452 c19452 = this.f69432;
        if (c19452 != null && c19452.m36266().m27336()) {
            C10130 m43030 = C18515.m43030(305419897);
            HashSet m33273 = this.f69433.m33273();
            m43030.writeInt(((C6495) this.f69421.getLayoutManager()).findFirstVisibleItemPosition());
            m43030.writeInt(m33273.size());
            Iterator it = m33273.iterator();
            while (it.hasNext()) {
                m43030.m25423((CharSequence) it.next());
            }
            try {
                this.f69432.m44854().m27330("explorer").m36496(m43030);
            } catch (IOException e) {
                C3764 c3764 = this.f69427;
                if (c3764 != null) {
                    c3764.m11384((Throwable) e);
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48890() {
        if (this.f69432 != null) {
            HashSet m33273 = this.f69433.m33273();
            this.f69433.m33260(this.f69432.m44834());
            this.f69433.m33255(m33273);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48891(String str) {
        C13876 c13876 = this.f69433;
        c13876.getClass();
        c13876.m33254((Collection) Collections.singletonList(str));
    }

    @Override // l.InterfaceC15287
    /* renamed from: ۧ */
    public final void mo16606(C16971 c16971) {
        ((ActivityC17169) requireActivity()).m40354(c16971.m39805(), (C19287) null);
        this.f69432.m44818(c16971.m39805());
    }

    @Override // l.InterfaceC8233
    /* renamed from: ֫ */
    public final boolean mo16605(C16971 c16971) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C21282 c21282 = new C21282(requireContext(), c16971.m39802(), 0);
        if (!c16971.m39807()) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ff, 0, R.string.MT_Protector_res_0x7f1205ff);
        }
        if (c16971.m39807()) {
            if (c16971.m39799() != 1 || !c16971.m39805().endsWith("/package-info")) {
                if (c16971.m39799() != 2) {
                    z = false;
                    z2 = true;
                    z3 = false;
                    z4 = false;
                    z5 = false;
                    z6 = false;
                } else if (!c16971.m39805().endsWith("/type-info")) {
                    z = false;
                    z2 = true;
                    z3 = false;
                    z4 = true;
                    z5 = true;
                    z6 = false;
                }
            }
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        } else {
            z = c16971.m39799() == 1;
            z2 = c16971.m39804() != 0 || this.f69433.m33283().m27987().size() > 1;
            z3 = true;
            z4 = false;
            z5 = false;
            z6 = true;
        }
        if (z3) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ad, 0, R.string.MT_Protector_res_0x7f1205ad);
        }
        if (z) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205e1, 0, R.string.MT_Protector_res_0x7f1205e1);
        }
        if (z4) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205f9, 0, R.string.MT_Protector_res_0x7f1205f9);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205c2, 0, R.string.MT_Protector_res_0x7f1205c2);
        }
        if (z2) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca);
        }
        if (z5) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120120, 0, R.string.MT_Protector_res_0x7f120120);
        }
        if (z6) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12011a, 0, R.string.MT_Protector_res_0x7f12011a);
        }
        c21282.m48302(new C4129(this, c16971));
        if (c21282.m48304().size() > 0) {
            this.f69421.suppressLayout(true);
            c21282.m48301(new InterfaceC7875() { // from class: l.ܿܰ᩷
                @Override // l.InterfaceC7875
                /* renamed from: ֫ */
                public final void mo6265(C21282 c212822) {
                    ViewOnClickListenerC21628.m48880(ViewOnClickListenerC21628.this);
                }
            });
            c21282.m48305();
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48876(ViewOnClickListenerC21628 viewOnClickListenerC21628, C16971 c16971, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f1205ff) {
            new ViewOnClickListenerC7788(viewOnClickListenerC21628, c16971.m39805()).m20816();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205c2) {
            String m39805 = c16971.m39805();
            String m24404 = C9523.m24404(m39805);
            String m24406 = C9523.m24406(m39805);
            C11003.requireNonNull(m24406);
            String m244042 = C9523.m24404(m24406);
            C8222 c8222 = new C8222(viewOnClickListenerC21628, (AbstractActivityC3346) viewOnClickListenerC21628.requireActivity(), m24404, m244042, m39805, m24406);
            c8222.m31258(R.string.MT_Protector_res_0x7f1205c2);
            c8222.m31250((CharSequence) m24404);
            c8222.m31244();
            c8222.m31279(6);
            c8222.m31246(m244042.length(), m24404.length());
            c8222.m31266(true);
            c8222.m31249(new C15276(m244042, c8222));
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205f9) {
            String m398052 = c16971.m39805();
            String m244043 = C9523.m24404(m398052);
            String m244062 = C9523.m24406(m398052);
            C11003.requireNonNull(m244062);
            String m244044 = C9523.m24404(m244062);
            C1166 c1166 = new C1166(viewOnClickListenerC21628, (AbstractActivityC3346) viewOnClickListenerC21628.requireActivity(), m244043, m244044, m398052, m244062);
            c1166.m31258(R.string.MT_Protector_res_0x7f1205f9);
            c1166.m31250((CharSequence) m244043);
            c1166.m31244();
            c1166.m31242();
            c1166.m31279(6);
            c1166.m31266(true);
            c1166.m31249(new C15276(m244044, c1166));
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ad) {
            int m39799 = c16971.m39799();
            if (m39799 != 0) {
                if (m39799 != 1) {
                    return;
                }
                viewOnClickListenerC21628.m48867(R.string.MT_Protector_res_0x7f1205ad, c16971.m39805(), "<?xml version='1.0' encoding='utf-8' ?>\n<resources>\n    \n</resources>\n");
                return;
            } else {
                C3989 c3989 = new C3989(viewOnClickListenerC21628, (AbstractActivityC3346) viewOnClickListenerC21628.requireActivity(), c16971.m39805());
                c3989.m31258(R.string.MT_Protector_res_0x7f1205ad);
                c3989.m31265("attr, string, style...");
                c3989.m31244();
                c3989.m31279(6);
                c3989.m31266(true);
                return;
            }
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205e1) {
            Bundle bundle = new Bundle();
            bundle.putString(MotionUtils.EASING_TYPE_PATH, c16971.m39805());
            viewOnClickListenerC21628.f69428.m36540(1, R.string.MT_Protector_res_0x7f1205e1, null, null, new String[]{DocumentReader.RESERVED}, bundle);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
            Context requireContext = viewOnClickListenerC21628.requireContext();
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(requireContext);
            c19258.m44433(R.string.MT_Protector_res_0x7f1205ca);
            c19258.m44424(viewOnClickListenerC21628.getString(R.string.MT_Protector_res_0x7f120870, c16971.m39801()));
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC3785(1, viewOnClickListenerC21628, c16971));
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f120120) {
            viewOnClickListenerC21628.f69423 = false;
            viewOnClickListenerC21628.f69433.m33271(true);
            c16971.m39806();
            viewOnClickListenerC21628.m48884();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f12011a) {
            viewOnClickListenerC21628.f69423 = true;
            viewOnClickListenerC21628.f69433.m33271(false);
            c16971.m39806();
            viewOnClickListenerC21628.m48884();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48875(ViewOnClickListenerC21628 viewOnClickListenerC21628, C16971 c16971) {
        c16971.m39800();
        if (c16971.m39807()) {
            C19452 c19452 = viewOnClickListenerC21628.f69432;
            String m39805 = c16971.m39805();
            c19452.getClass();
            c19452.m44820(Collections.singleton(m39805));
        } else {
            viewOnClickListenerC21628.f69432.m44855(c16971.m39805());
        }
        ((ActivityC17169) viewOnClickListenerC21628.requireActivity()).m40370();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48880(ViewOnClickListenerC21628 viewOnClickListenerC21628) {
        C13132 c13132 = viewOnClickListenerC21628.f69421;
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
            c19258.m44424(getString(R.string.MT_Protector_res_0x7f12087a, Integer.valueOf(this.f69433.m33268())));
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC9594(3, this));
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a0208) {
            C6273 c6273 = this.f69422;
            c6273.getClass();
            C6273.m17282(c6273, R.string.MT_Protector_res_0x7f1205d5, (String) null, "arsc.zip", new String[]{"zip"}, 16);
        } else if (id == R.id.MT_Protector_res_0x7f0a020c) {
            this.f69433.mo33251();
        } else if (id == R.id.MT_Protector_res_0x7f0a0213) {
            this.f69433.m33263(new C21639());
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m48888() {
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2 = this.f69426;
        FloatingActionButton floatingActionButton3 = this.f69424;
        if (this.f69423) {
            floatingActionButton = this.f69429;
            this.f69430.setVisibility(4);
        } else {
            floatingActionButton = this.f69430;
            this.f69429.setVisibility(4);
        }
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
        floatingActionButton.setTranslationY(0.0f);
        floatingActionButton.setAlpha(0.8f);
        floatingActionButton2.setTranslationY(0.0f);
        floatingActionButton2.setAlpha(0.8f);
        floatingActionButton3.setTranslationY(0.0f);
        floatingActionButton3.setAlpha(0.8f);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48884() {
        FloatingActionButton floatingActionButton;
        AnimatorSet animatorSet = this.f69431;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        FloatingActionButton floatingActionButton2 = this.f69426;
        FloatingActionButton floatingActionButton3 = this.f69424;
        if (this.f69423) {
            floatingActionButton = this.f69429;
            this.f69430.setVisibility(4);
        } else {
            floatingActionButton = this.f69430;
            this.f69429.setVisibility(4);
        }
        floatingActionButton.setOnClickListener(this);
        floatingActionButton2.setOnClickListener(this);
        floatingActionButton3.setOnClickListener(this);
        floatingActionButton.setVisibility(0);
        floatingActionButton2.setVisibility(0);
        floatingActionButton3.setVisibility(0);
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
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
        float height3 = floatingActionButton3.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
        floatingActionButton3.setTranslationY(height3);
        floatingActionButton3.setAlpha(0.8f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", height3, 0.0f);
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.playTogether(ofFloat, ofFloat2, ofFloat3);
        duration.start();
        this.f69431 = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m48879(boolean z) {
        FloatingActionButton floatingActionButton;
        AnimatorSet animatorSet = this.f69431;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        FloatingActionButton floatingActionButton2 = this.f69426;
        FloatingActionButton floatingActionButton3 = this.f69424;
        if (this.f69423) {
            floatingActionButton = this.f69429;
            this.f69430.setVisibility(4);
        } else {
            floatingActionButton = this.f69430;
            this.f69429.setVisibility(4);
        }
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 0.8f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton3, "alpha", 0.8f, 0.0f));
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, floatingActionButton.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) floatingActionButton2.getLayoutParams();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, floatingActionButton2.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) floatingActionButton3.getLayoutParams();
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", 0.0f, floatingActionButton3.getHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(ofFloat, ofFloat2, ofFloat3);
        }
        duration.addListener(new C2578(floatingActionButton, floatingActionButton2, floatingActionButton3));
        duration.start();
        this.f69431 = duration;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48869(ViewOnClickListenerC21628 viewOnClickListenerC21628) {
        if (viewOnClickListenerC21628.f69432 == null) {
            return;
        }
        if (!C23196.m51454()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120415);
            return;
        }
        viewOnClickListenerC21628.f69432.m44820(viewOnClickListenerC21628.f69433.m33269());
        viewOnClickListenerC21628.f69433.m33281();
        viewOnClickListenerC21628.m48879(true);
        ((ActivityC17169) viewOnClickListenerC21628.requireActivity()).m40370();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48885(ViewOnClickListenerC21628 viewOnClickListenerC21628, String str) {
        if (viewOnClickListenerC21628.f69432 == null) {
            return;
        }
        new C19512(viewOnClickListenerC21628, str, viewOnClickListenerC21628.f69433.m33269()).m20274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m48868(Runnable runnable) {
        if (this.f69434) {
            runnable.run();
        } else {
            C4925.m14316(new RunnableC20923(0, this, runnable), 100L);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48871(ViewOnClickListenerC21628 viewOnClickListenerC21628, Runnable runnable) {
        if (viewOnClickListenerC21628.isResumed()) {
            viewOnClickListenerC21628.m48868(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m48867(int i, String str, String str2) {
        String m24404 = C9523.m24404(str);
        C5400 c5400 = new C5400(this, (AbstractActivityC3346) requireActivity(), m24404, str, str2);
        c5400.m31258(i);
        c5400.m31250((CharSequence) (m24404 + "-"));
        c5400.m31244();
        c5400.m31242();
        c5400.m31279(6);
        c5400.m31266(true);
        c5400.m31249(new C15276(m24404, c5400));
    }
}
