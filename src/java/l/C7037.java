package l;

import android.content.Context;
import android.content.pm.PackageManager;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* compiled from: G1PO */
/* renamed from: l.ۜ᩸ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7037 implements InterfaceC2343, InterfaceC23206, ISequentialOutStream, InterfaceC18862, InterfaceC23425, InterfaceC7550, InterfaceC20106 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21681;

    public /* synthetic */ C7037(Object obj) {
        this.f21681 = obj;
    }

    @Override // l.InterfaceC23206
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC23425
    /* renamed from: ֫ */
    public String mo10986(C3104 c3104) {
        return (String) this.f21681;
    }

    @Override // l.InterfaceC2343
    /* renamed from: ֫ */
    public void mo6264(int i) {
        ((C19032) this.f21681).mo11538(i);
    }

    @Override // l.InterfaceC20106
    /* renamed from: ֫ */
    public void mo13218(Object obj) {
        C5921.m16594((C5921) this.f21681, (Object[]) obj);
    }

    @Override // l.InterfaceC23206
    /* renamed from: ֫ */
    public void mo8486(String str) {
        ActivityC22062.m49624((ActivityC22062) this.f21681, str);
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) {
        if (((InterfaceC13883) this.f21681).mo1526()) {
            throw new SevenZipException("Canceled");
        }
        return byteBuffer.remaining();
    }

    @Override // l.InterfaceC7550
    /* renamed from: ֫ */
    public CharSequence mo7073(C2095 c2095) {
        String charSequence;
        Context context = (Context) this.f21681;
        String string = ApplicationC20075.f65008.getString("ais", "");
        if (string.isEmpty()) {
            return context.getString(R.string.MT_Protector_res_0x7f120aa3);
        }
        if (string.equals("com.android.vending")) {
            charSequence = context.getString(R.string.MT_Protector_res_0x7f120055);
        } else {
            PackageManager packageManager = context.getPackageManager();
            try {
                charSequence = packageManager.getApplicationInfo(string, 0).loadLabel(packageManager).toString();
            } catch (PackageManager.NameNotFoundException unused) {
                return string;
            }
        }
        return charSequence + " (" + string + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.InterfaceC18862
    /* renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        new DialogInterfaceOnClickListenerC19407((C16560) this.f21681, abstractC15440.mo23554());
    }
}
