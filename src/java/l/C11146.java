package l;

import android.R;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import bin.mt.json.JSONObject;

/* compiled from: NAVX */
/* renamed from: l.ۧܿܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C11146 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C7638 f33463 = new C7638();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4550 f33464;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C4550 f33465;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15293 f33466;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33467;

    /* renamed from: ֫ */
    public String mo14039() {
        return null;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean mo27661() {
        return this instanceof C4816;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject mo27664() {
        return null;
    }

    public C11146(int i) {
        this.f33467 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27662() {
        return this.f33467;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m27663() {
        return this.f33467 == 31;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String mo27660() {
        return m27658(this.f33467);
    }

    /* renamed from: ᩻ */
    public boolean mo14042() {
        int i = this.f33467;
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 7:
            case 8:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
                return false;
            case 2:
            case 3:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 30:
                return true;
            case 27:
            default:
                throw new IllegalArgumentException("type=" + i);
        }
    }

    /* renamed from: ֫ */
    public void mo14041(View view, C10235 c10235) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ֫ */
    public void mo14040(View view, InterfaceC1973 interfaceC1973) {
        C12392 mo6482 = interfaceC1973.mo6482();
        InterfaceC22602 mo6483 = interfaceC1973.mo6483();
        if (mo6482 == null || mo6483 == null) {
            return;
        }
        if (!mo6482.hasFocus()) {
            mo6482.requestFocus();
        }
        int i = this.f33467;
        int i2 = 0;
        switch (i) {
            case 1:
                C22975.m51114(mo6482);
                return;
            case 2:
                C22975.m51121(mo6482);
                return;
            case 3:
                C22975.m51128(mo6482);
                return;
            case 4:
                C22975.m51123(mo6482);
                return;
            case 5:
                C22975.m51130(mo6482);
                return;
            case 6:
                C22975.m51126(mo6482);
                return;
            case 7:
                C22975.m51116(mo6482, true);
                return;
            case 8:
                C22975.m51116(mo6482, false);
                return;
            case 9:
                C22975.m51131(mo6482);
                return;
            case 10:
                C22975.m51124(mo6482);
                return;
            case 11:
                C22975.m51118(mo6482);
                return;
            case 12:
                mo6483.mo11728();
                return;
            case 13:
                mo6482.m30495();
                return;
            case 14:
                mo6482.m30481();
                return;
            case 15:
                interfaceC1973.mo6484();
                return;
            case 16:
                C22975.m51127(mo6482, false);
                return;
            case 17:
                C22975.m51125(mo6482, false);
                return;
            case 18:
                mo6482.onKeyDown(21, null);
                return;
            case 19:
                mo6482.onKeyDown(22, null);
                return;
            case 20:
                mo6482.onKeyDown(19, null);
                return;
            case 21:
                mo6482.onKeyDown(20, null);
                return;
            case 22:
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent instanceof C10797) {
                            i2 = ((C10797) parent).m2038();
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                ApplicationC20075 applicationC20075 = C4925.f15522;
                applicationC20075.startActivity(new Intent(applicationC20075, (Class<?>) ActivityC0477.class).addFlags(268435456).putExtra("pageIndex", i2));
                return;
            case 23:
                C22975.m51129(mo6482, false);
                return;
            case 24:
                C22975.m51122(mo6482, false);
                return;
            case 25:
                mo6482.m30391();
                return;
            case 26:
                mo6482.m30522();
                return;
            case 27:
            default:
                throw new RuntimeException(C19370.m44628(i, "Unsupported type "));
            case 28:
                mo6482.m30466(R.id.copy);
                return;
            case 29:
                mo6482.m30466(R.id.cut);
                return;
            case 30:
                mo6482.m30466(R.id.paste);
                return;
            case 31:
                C15293 c15293 = this.f33466;
                if (c15293 == null) {
                    throw new RuntimeException("bindingFunction == null");
                }
                if (c15293.f46926.mo14042()) {
                    new RunnableC13987(this, view, interfaceC1973).run();
                    return;
                } else {
                    this.f33466.f46926.mo14040(view, interfaceC1973);
                    C4925.m14316(new RunnableC23160(), 200L);
                    return;
                }
            case 32:
                C22975.m51117(mo6482);
                return;
            case 33:
                C22975.m51119(mo6482);
                return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27659(boolean z) {
        int i = this.f33467;
        if (i < 0 || i >= 35) {
            return false;
        }
        return z || i != 31;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC19634 m27657(int i) {
        if (i == 0) {
            return C4816.f15238;
        }
        if (i == 27) {
            return C22455.f72732;
        }
        if (i == 34) {
            return C11872.f35407;
        }
        return f33463;
    }

    static {
        int[] iArr = {31, 0, 34, 27, 28, 29, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 32, 33, 12, 13, 14, 15, 16, 17, 23, 24, 18, 19, 20, 21, 25, 26, 22};
        f33465 = C13016.m31595(C15859.m37593(iArr));
        f33464 = C13016.m31595(new C15859(iArr, 0));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m27658(int i) {
        switch (i) {
            case 0:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1204ad);
            case 1:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205c5);
            case 2:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205c8);
            case 3:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205cb);
            case 4:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205d4);
            case 5:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205fb);
            case 6:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205d1);
            case 7:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205c1);
            case 8:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205c0);
            case 9:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205e2);
            case 10:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205c9);
            case 11:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120612);
            case 12:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205ff);
            case 13:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f12079f);
            case 14:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1206dc);
            case 15:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120949);
            case 16:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120a7e);
            case 17:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120a7c);
            case 18:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120637);
            case 19:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120638);
            case 20:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120639);
            case 21:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120636);
            case 22:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120a59);
            case 23:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120a7d);
            case 24:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120a7b);
            case 25:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120138);
            case 26:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120139);
            case 27:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1203e2);
            case 28:
                return C4925.m14327(R.string.copy);
            case 29:
                return C4925.m14327(R.string.cut);
            case 30:
                return C4925.m14327(R.string.paste);
            case 31:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120892);
            case 32:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f1205f4);
            case 33:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120608);
            case 34:
                return C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120a5d);
            default:
                return i + "???";
        }
    }
}
