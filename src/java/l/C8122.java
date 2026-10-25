package l;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: M6WW */
/* renamed from: l.۠ۤ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8122 extends AbstractC3255 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextView f25088;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f25089;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f25090;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15176 f25091;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8122(C15176 c15176, View view) {
        super(view);
        this.f25091 = c15176;
        C19890.m45741(view);
        this.f25090 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f25088 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a013d);
        View findViewById = view.findViewById(R.id.drag);
        this.f25089 = findViewById;
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۚۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ArrayList arrayList;
                ArrayList arrayList2;
                C8122 c8122 = C8122.this;
                C15176 c151762 = c8122.f25091;
                int bindingAdapterPosition = c8122.getBindingAdapterPosition();
                if (bindingAdapterPosition > 0) {
                    arrayList = c151762.f46366;
                    if (bindingAdapterPosition <= arrayList.size()) {
                        arrayList2 = c151762.f46366;
                        C15176.m35887(c151762, (C13732) arrayList2.get(bindingAdapterPosition - 1), false);
                    }
                }
            }
        });
        findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: l.֨ۤ᩻
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C1556 c1556;
                C8122 c8122 = C8122.this;
                C15176 c151762 = c8122.f25091;
                if (motionEvent.getActionMasked() != 0 || !C15176.m35891(c151762, c8122.getBindingAdapterPosition())) {
                    return false;
                }
                c1556 = c151762.f46367;
                c1556.m5326(c8122);
                return false;
            }
        });
    }
}
