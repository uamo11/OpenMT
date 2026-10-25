package l;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.UUID;

/* compiled from: CB3L */
/* renamed from: l.֫ۘᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC1582 extends ComponentCallbacksC9205 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12230 f5601;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14987 f5602;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20256 f5603;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f5604;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f5605;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bundle f5606;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9344 f5607;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public abstract void mo5405();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo5408(String... strArr);

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo5419();

    public AbstractC1582() {
        super(R.layout.MT_Protector_res_0x7f0d0054);
        this.f5604 = new Object();
        this.f5606 = new Bundle();
    }

    @Override // l.ComponentCallbacksC9205
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5603 = (C20256) new C4741((ActivityC16315) ((C22372) this).requireActivity()).m13885(C20256.class);
        this.f5601 = (C12230) new C4741(requireActivity()).m13885(C12230.class);
        this.f5607 = (C9344) new C4741(this).m13885(C9344.class);
        if (bundle != null) {
            try {
                m5424();
                return;
            } catch (IOException e) {
                m5421(true);
                Bundle bundle2 = this.f5606;
                if (!bundle2.containsKey("filePath")) {
                    bundle2.putString("filePath", "untitled");
                }
                this.f5603.m46502((Throwable) e);
            }
        }
        this.f5607.m24120(mo5419());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Drawable m5422() {
        if (this.f5605 == null) {
            this.f5605 = C4925.m14305(this.f5606.getInt("sideIconType", 0) == 0 ? R.drawable.MT_Protector_res_0x7f0802a0 : R.drawable.MT_Protector_res_0x7f08029f).mutate();
        }
        return this.f5605;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5415(String str) {
        String uuid = UUID.randomUUID().toString();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("state", uuid);
        setArguments(arguments);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m5412() {
        String string = requireArguments().getString("state");
        C11003.requireNonNull(string);
        return string;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m5413() {
        Bundle requireArguments = requireArguments();
        C11003.requireNonNull(requireArguments);
        return requireArguments.getBoolean("top", false);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m5418() {
        return C17852.m41822(m5412());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5406(int i) {
        Bundle bundle = this.f5606;
        if (i != bundle.getInt("sideIconType", 0)) {
            bundle.putInt("sideIconType", i);
            this.f5605 = null;
            m5425();
            mo5408("sideIconType");
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m5423() {
        int i = this.f5606.getInt("pageCount", -1);
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5417() {
        return this.f5606.getString("filePath") != null;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m5410() {
        String string = this.f5606.getString("filePath");
        return string == null || string.equals("untitled");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4733 m5420() {
        String string = this.f5606.getString("filePath");
        C11003.requireNonNull(string);
        return new C4733(C16999.m39866(string, new String[0]));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5409(boolean z) {
        return m5404("changed", z);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5421(boolean z) {
        m5404(d.O, z);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5416(boolean z) {
        m5404("checkFileExists", z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5407(long j) {
        Bundle bundle = this.f5606;
        if (bundle.getLong("fileTime") != j) {
            bundle.putLong("fileTime", j);
            mo5408("fileTime");
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m5414() {
        return this.f5606.getBoolean(d.O);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m5426() {
        return this.f5606.getBoolean("changed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m5404(String str, boolean z) {
        Bundle bundle = this.f5606;
        if (bundle.getBoolean(str) == z) {
            return false;
        }
        bundle.putBoolean(str, z);
        mo5408(str);
        return true;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m5425() {
        ActivityC0737 activity = ((C22372) this).getActivity();
        if (activity != null) {
            ((ActivityC16315) activity).m38450();
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m5424() {
        InterfaceC20758 m25230 = C10050.m25230(m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]));
        if (C20529.m47015(m25230)) {
            try {
                this.f5606.clear();
                this.f5606.putAll(C9240.m23680(m25230));
            } catch (IOException e) {
                if (!this.f5606.containsKey("filePath")) {
                    this.f5606.putString("filePath", "untitled");
                }
                C20256 c20256 = this.f5603;
                if (c20256 != null) {
                    c20256.m46502((Throwable) e);
                }
            }
            C9344 c9344 = this.f5607;
            if (c9344 != null) {
                c9344.m24120(mo5419());
                return;
            }
            return;
        }
        synchronized (m5411().f45700) {
            AbstractC15440 m41820 = C17852.m41820(m5412());
            if (m41820.mo23120()) {
                byte[] m36506 = m41820.m36506();
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(m36506, 0, m36506.length);
                obtain.setDataPosition(0);
                this.f5606.readFromParcel(obtain);
                obtain.recycle();
                C9344 c93442 = this.f5607;
                if (c93442 != null) {
                    c93442.m24120(mo5419());
                }
            }
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14987 m5411() {
        if (this.f5602 == null) {
            this.f5602 = C14987.m35511(C10050.m25230(m5412(), C6646.of(C17852.m41819().mo23554(), new String[0])));
        }
        return this.f5602;
    }

    @Override // l.ComponentCallbacksC9205
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo5405();
    }

    @Override // l.ComponentCallbacksC9205
    public void onPause() {
        super.onPause();
        mo5408(new String[0]);
    }
}
