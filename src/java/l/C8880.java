package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.pqc.crypto.newhope.Params;

/* compiled from: V5QL */
/* renamed from: l.ۡ۫ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8880 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f27031;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f27032;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27033;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27034;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f27035;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22946() {
        int i = this.f27031;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f27033;
            int i4 = this.f27034;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & UMErrorCode.E_UM_BE_DEFLATE_FAILED) != 0) {
            int i5 = this.f27033;
            int i6 = this.f27035;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & Params.POLY_BYTES) != 0) {
            int i7 = this.f27032;
            int i8 = this.f27034;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & UMModuleRegister.SHARE_EVENT_VALUE_HIGH) != 0) {
            int i9 = this.f27032;
            int i10 = this.f27035;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
