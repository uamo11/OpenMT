package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: P1K8 */
/* renamed from: l.ܳۛ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC14346 extends ComponentCallbacksC9205 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f43258;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AtomicReference f43259;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Bundle f43260;

    /* renamed from: ֡ */
    public abstract boolean mo14418();

    /* renamed from: ۖ */
    public boolean mo17426() {
        return false;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean mo34231() {
        return this instanceof C4966;
    }

    /* renamed from: ۜ */
    public abstract String mo14419();

    /* renamed from: ۡ */
    public C12392 mo17427() {
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo34235() {
        return !(this instanceof C4966);
    }

    /* renamed from: ܳ */
    public abstract int mo14420();

    /* renamed from: ܺ */
    public abstract String mo14421();

    /* renamed from: ᩳ */
    public InterfaceC18581 mo17431() {
        return null;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo34241() {
    }

    /* renamed from: ᩵ */
    public boolean mo17432() {
        return this instanceof C7864;
    }

    /* renamed from: ᩷ */
    public abstract String mo14422();

    public AbstractC14346() {
        this.f43260 = new Bundle();
    }

    public AbstractC14346(int i) {
        super(i);
        this.f43260 = new Bundle();
    }

    @Override // l.ComponentCallbacksC9205
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43259 = ((ActivityC17169) requireActivity()).f52614;
        if (bundle == null || !bundle.containsKey("stateDir")) {
            return;
        }
        try {
            m34240((C11005) bundle.getSerializable("stateDir"));
        } catch (IOException e) {
            ((ActivityC17169) requireActivity()).m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.ComponentCallbacksC9205
    public void onResume() {
        super.onResume();
        this.f43259.set(getClass());
    }

    @Override // l.ComponentCallbacksC9205
    public void onHiddenChanged(boolean z) {
        if (z || !isResumed()) {
            return;
        }
        this.f43259.set(getClass());
    }

    /* renamed from: ֫ */
    public void mo17424(ActivityC17169 activityC17169, boolean z, Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34237() {
        return !m34230() && mo34235();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Drawable m34238() {
        if (this.f43258 == null) {
            this.f43258 = C4925.m14305(mo14420()).mutate();
        }
        return this.f43258;
    }

    /* renamed from: ֫ */
    public void mo17423(C3764 c3764) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34234(String str) {
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("state", str);
        setArguments(arguments);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m34232() {
        String string = requireArguments().getString("state");
        C11003.requireNonNull(string);
        return string;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m34230() {
        Bundle requireArguments = requireArguments();
        C11003.requireNonNull(requireArguments);
        return requireArguments.getBoolean("top", false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo34229(byte[] bArr) {
        if (getArguments() != null) {
            throw new RuntimeException("Arguments is not null.");
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle bundle = new Bundle();
        bundle.readFromParcel(obtain);
        setArguments(bundle);
        obtain.recycle();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11005 m34233(C11005 c11005) {
        return new C11005(c11005, m34232().concat(".dat"));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11005 m34236(C11005 c11005) {
        return new C11005(c11005, m34232().concat(".tat"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11005 m34226(C11005 c11005) {
        return new C11005(c11005, m34232().concat(".lit"));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34240(C11005 c11005) {
        C11005 m34226 = m34226(c11005);
        if (m34226.m27336()) {
            byte[] m27337 = m34226.m27337();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(m27337, 0, m27337.length);
            obtain.setDataPosition(0);
            this.f43260.readFromParcel(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m34239(C11005 c11005) {
        C11005 m34226 = m34226(c11005);
        Bundle bundle = this.f43260;
        if (bundle.isEmpty()) {
            m34226.m27333();
            return;
        }
        m34226.m27338();
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        m34226.m27332(marshall);
    }

    @Override // l.ComponentCallbacksC9205
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            C11005 m40356 = ((ActivityC17169) requireActivity()).m40356();
            if (!this.f43260.isEmpty()) {
                bundle.putSerializable("stateDir", m40356);
            }
            m34239(m40356);
        } catch (IOException unused) {
        }
    }

    @Override // l.ComponentCallbacksC9205
    public void onPause() {
        super.onPause();
        try {
            m34239(((ActivityC17169) requireActivity()).m40356());
        } catch (IOException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34227(Consumer consumer) {
        ActivityC0737 activity = getActivity();
        if (activity != null) {
            consumer.accept((ActivityC17169) activity);
        }
    }

    /* renamed from: ۧ */
    public void mo17428(ActivityC17169 activityC17169) {
        if (!mo34235()) {
            throw new RuntimeException();
        }
        m34228(activityC17169);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34228(ActivityC17169 activityC17169) {
        if (!mo34235()) {
            throw new RuntimeException();
        }
        activityC17169.m40344(this);
    }
}
