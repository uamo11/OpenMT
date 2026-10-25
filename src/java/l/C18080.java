package l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: U998 */
/* renamed from: l.ᩳ۬᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18080 extends AbstractC3723 {

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f56311 = new HashMap();

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56312 = 0;

    static {
        m42141(R.color.MT_Protector_res_0x7f06035f, R.style.MT_Protector_res_0x7f130016, "default");
        m42141(R.color.MT_Protector_res_0x7f060355, R.style.MT_Protector_res_0x7f130012, "black");
        m42141(R.color.MT_Protector_res_0x7f06037d, R.style.MT_Protector_res_0x7f130021, "purple");
        m42141(R.color.MT_Protector_res_0x7f060357, R.style.MT_Protector_res_0x7f130013, "blue");
        m42141(R.color.MT_Protector_res_0x7f060361, R.style.MT_Protector_res_0x7f130017, "dodger_blue");
        m42141(R.color.MT_Protector_res_0x7f06037f, R.style.MT_Protector_res_0x7f130022, "royal_blue");
        m42141(R.color.MT_Protector_res_0x7f06035b, R.style.MT_Protector_res_0x7f130014, "dark_salmon");
        m42141(R.color.MT_Protector_res_0x7f060379, R.style.MT_Protector_res_0x7f13001f, "orange");
        m42141(R.color.MT_Protector_res_0x7f06037b, R.style.MT_Protector_res_0x7f130020, "pink");
        m42141(R.color.MT_Protector_res_0x7f060363, R.style.MT_Protector_res_0x7f130018, "green");
        m42141(R.color.MT_Protector_res_0x7f06035d, R.style.MT_Protector_res_0x7f130015, "deep_green");
        m42141(R.color.MT_Protector_res_0x7f060381, R.style.MT_Protector_res_0x7f130023, "teal");
        m42141(R.color.MT_Protector_res_0x7f060369, R.style.MT_Protector_res_0x7f13001a, "light_gray");
        m42141(R.color.MT_Protector_res_0x7f060365, R.style.MT_Protector_res_0x7f130019, "light_blue");
        m42141(R.color.MT_Protector_res_0x7f06036d, R.style.MT_Protector_res_0x7f13001b, "light_salmon");
        m42141(R.color.MT_Protector_res_0x7f060373, R.style.MT_Protector_res_0x7f13001c, "monet1");
        m42141(R.color.MT_Protector_res_0x7f060375, R.style.MT_Protector_res_0x7f13001d, "monet2");
        m42141(R.color.MT_Protector_res_0x7f060377, R.style.MT_Protector_res_0x7f13001e, "monet3");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42141(int i, int i2, String str) {
        f56311.put(str, new C16668(str, i, i2));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C16668 m42143(String str) {
        if (str == null) {
            str = "default";
        }
        if (str.startsWith("monet") && Build.VERSION.SDK_INT < 31) {
            str = "default";
        }
        HashMap hashMap = f56311;
        C16668 c16668 = (C16668) hashMap.get(str);
        if (c16668 != null) {
            return c16668;
        }
        C16668 c166682 = (C16668) hashMap.get("default");
        C11003.requireNonNull(c166682);
        return c166682;
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static int m42142() {
        int i;
        i = m42143(ApplicationC20075.f65010.getString("theme", "default")).f51174;
        return i;
    }

    public C18080(Context context) {
        super(context);
    }

    public C18080(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C18080(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C18080(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // l.AbstractC3723
    /* renamed from: ֫ */
    public final void mo6161(final AbstractActivityC3346 abstractActivityC3346) {
        String str;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d0102);
        int i = 18;
        int[] iArr = {R.id.MT_Protector_res_0x7f0a061b, R.id.MT_Protector_res_0x7f0a0625, R.id.MT_Protector_res_0x7f0a0626, R.id.MT_Protector_res_0x7f0a0627, R.id.MT_Protector_res_0x7f0a0628, R.id.MT_Protector_res_0x7f0a0629, R.id.MT_Protector_res_0x7f0a062a, R.id.MT_Protector_res_0x7f0a062b, R.id.MT_Protector_res_0x7f0a062c, R.id.MT_Protector_res_0x7f0a061c, R.id.MT_Protector_res_0x7f0a061d, R.id.MT_Protector_res_0x7f0a061e, R.id.MT_Protector_res_0x7f0a0622, R.id.MT_Protector_res_0x7f0a0623, R.id.MT_Protector_res_0x7f0a0624, R.id.MT_Protector_res_0x7f0a061f, R.id.MT_Protector_res_0x7f0a0620, R.id.MT_Protector_res_0x7f0a0621};
        if (Build.VERSION.SDK_INT < 31) {
            m10216.findViewById(R.id.MT_Protector_res_0x7f0a03a7).setVisibility(8);
            m10216.findViewById(R.id.MT_Protector_res_0x7f0a03a6).setVisibility(8);
            i = 15;
        }
        C17374[] c17374Arr = new C17374[i];
        for (int i2 = 0; i2 < i; i2++) {
            c17374Arr[i2] = (C17374) m10216.findViewById(iArr[i2]);
        }
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۧ۬᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i3 = C18080.f56312;
                C17374 c17374 = (C17374) view;
                str2 = C18080.m42143(ApplicationC20075.f65010.getString("theme", "default")).f51173;
                if (!str2.equals(c17374.m40716())) {
                    ApplicationC20075.f65010.edit().putString("theme", c17374.m40716()).apply();
                    C11297.m27943(abstractActivityC3346);
                    C18080.this.m6893((Serializable) c17374.m40716());
                }
                m44438.dismiss();
            }
        };
        C16668 m42143 = m42143(ApplicationC20075.f65010.getString("theme", "default"));
        for (int i3 = 0; i3 < i; i3++) {
            C17374 c17374 = c17374Arr[i3];
            String m40716 = c17374.m40716();
            str = m42143.f51173;
            c17374.m40715(m40716.equals(str));
            c17374.setOnClickListener(onClickListener);
        }
    }
}
