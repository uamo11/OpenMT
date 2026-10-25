package l;

import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: H8OV */
/* renamed from: l.ᩴۛ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C18566 implements InterfaceC7961, InterfaceC21423, InterfaceC1702 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57620;

    public /* synthetic */ C18566(int i) {
        this.f57620 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m43105(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        Long l2 = (Long) obj;
        return l2.longValue() >= 0 ? EnumC13555.COMPACTED : l2.longValue() == -2 ? EnumC13555.LOW_GAIN : l2.longValue() == -3 ? EnumC13555.BUDGET_EXHAUSTED : EnumC13555.SKIPPED;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f57620) {
            case 4:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43106(InterfaceC0220 interfaceC0220, InterfaceC0220 interfaceC02202) {
        if (interfaceC0220 == interfaceC02202) {
            return;
        }
        if (interfaceC02202 != null) {
            interfaceC02202.mo1470((C15036) null);
        }
        if (interfaceC0220 != null) {
            interfaceC0220.mo1472(null);
        }
    }

    @Override // l.InterfaceC1702
    /* renamed from: ֫ */
    public void mo5714(TextView textView) {
        textView.setText("0");
    }
}
