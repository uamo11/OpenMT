package l;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Stack;

/* compiled from: O1JS */
/* renamed from: l.ۤ۟᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10155 extends C13876 implements InterfaceC18383 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f30537;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f30538;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5921 f30539;

    @Override // l.C13876
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean mo25497() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10155(C5921 c5921) {
        super(C13876.m33247("<>"));
        this.f30539 = c5921;
        this.f30538 = C11266.m27878(17.0f);
        this.f30537 = C11266.m27878(20.0f);
        m33262((InterfaceC18383) this);
    }

    @Override // l.C13876
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo25493(int i) {
        return i == 0 ? this.f30537 : this.f41370 * i;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m25492() {
        Stack stack;
        Stack stack2;
        Stack stack3;
        C5921 c5921 = this.f30539;
        stack = c5921.f18158;
        if (stack.isEmpty()) {
            return 1;
        }
        stack2 = c5921.f18158;
        int i = ((C0941) stack2.peek()).m3358() > 0 ? 3 : 1;
        stack3 = c5921.f18158;
        if (stack3.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m25498() {
        int m25492 = m25492();
        if (m25492 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, m25492 + 2);
        }
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemCount() {
        Stack stack;
        stack = this.f30539.f18158;
        if (stack.isEmpty()) {
            return 2;
        }
        return m25492() + 2 + super.getItemCount();
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int m25492 = m25492();
        if (i2 < m25492) {
            return 2;
        }
        int i3 = i2 - m25492;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // l.C13876, l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C15092(C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d015a, viewGroup, false));
        }
        if (i == 1) {
            return new C15092(C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d015b, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC3099(this.f30539, C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0131, viewGroup, false));
    }

    @Override // l.C13876, l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        Stack stack;
        Stack stack2;
        Stack stack3;
        int i2;
        Stack stack4;
        if (i == 0) {
            ((C15092) abstractC3255).f46096.setText(R.string.MT_Protector_res_0x7f120413);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int m25492 = m25492();
        C5921 c5921 = this.f30539;
        if (i4 >= m25492) {
            int i5 = i4 - m25492;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC3255, i5 - 1);
                return;
            }
            C15092 c15092 = (C15092) abstractC3255;
            stack = c5921.f18158;
            C0941 c0941 = (C0941) stack.peek();
            c15092.f46096.setText(c5921.getString(R.string.MT_Protector_res_0x7f120901, Integer.valueOf(c0941.m3358())) + " - " + c0941.m3360());
            c15092.f46095.setOnClickListener(new View.OnClickListener() { // from class: l.۬۟᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C10155 c10155 = C10155.this;
                    C21282 c21282 = new C21282(c10155.f30539.requireContext(), view, 0);
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201a1, 0, R.string.MT_Protector_res_0x7f1201a1);
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12034e, 0, R.string.MT_Protector_res_0x7f12034e);
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120350, 0, R.string.MT_Protector_res_0x7f120350);
                    c21282.m48302(new InterfaceC14930() { // from class: l.۫۟᩷
                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C10155 c101552;
                            C10155 c101553;
                            C10155 c101554;
                            C10155 c101555;
                            C5921 c59212 = C10155.this.f30539;
                            int itemId = menuItem.getItemId();
                            if (itemId == R.string.MT_Protector_res_0x7f1201a1) {
                                c101555 = c59212.f18161;
                                c101555.m33275();
                                return true;
                            }
                            if (itemId == R.string.MT_Protector_res_0x7f12034e) {
                                c101554 = c59212.f18161;
                                c101554.m33264(true);
                                return true;
                            }
                            if (itemId == R.string.MT_Protector_res_0x7f120350) {
                                c101552 = c59212.f18161;
                                c101552.m33275();
                                c101553 = c59212.f18161;
                                c101553.m33264(false);
                            }
                            return true;
                        }
                    });
                    c21282.m48305();
                }
            });
            return;
        }
        ViewOnClickListenerC3099 viewOnClickListenerC3099 = (ViewOnClickListenerC3099) abstractC3255;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        stack2 = c5921.f18158;
        if (!stack2.isEmpty()) {
            stack3 = c5921.f18158;
            if (((C0941) stack3.peek()).m3358() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            stack4 = c5921.f18158;
            if (stack4.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC3099.f9696 = i3;
        TextView textView = viewOnClickListenerC3099.f9693;
        ImageView imageView = viewOnClickListenerC3099.f9695;
        if (i3 == 0) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080237);
            textView.setText(R.string.MT_Protector_res_0x7f1209d1);
            return;
        }
        if (i3 == 1) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080237);
            textView.setText(R.string.MT_Protector_res_0x7f1208f9);
            return;
        }
        if (i3 == 2) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080232);
            textView.setText(R.string.MT_Protector_res_0x7f120898);
        } else if (i3 == 3) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f08024e);
            textView.setText(R.string.MT_Protector_res_0x7f120aab);
        } else {
            if (i3 != 4) {
                throw new RuntimeException(C19370.m44628(i3, "MenuType = "));
            }
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f0801dd);
            textView.setText(R.string.MT_Protector_res_0x7f120184);
        }
    }

    @Override // l.C13876
    /* renamed from: ۜ */
    public final int mo15999() {
        return m25492() + 2;
    }

    @Override // l.C13876
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo25499(String str) {
        Stack stack;
        stack = this.f30539.f18158;
        C5175 m3356 = ((C0941) stack.peek()).m3356(str);
        if (m3356 == null) {
            return 0;
        }
        return m3356.f16179.size();
    }

    @Override // l.C13876
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3255 mo25494(ViewGroup viewGroup) {
        C5921 c5921 = this.f30539;
        View inflate = LayoutInflater.from(c5921.requireContext()).inflate(R.layout.MT_Protector_res_0x7f0d014a, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f41370 + this.f30538;
        inflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC8038(c5921, inflate);
    }

    @Override // l.C13876
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25496(AbstractC3255 abstractC3255, String str, int i) {
        Stack stack;
        TextView textView;
        TextView textView2;
        C19452 c19452;
        Stack stack2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        C19452 c194522;
        TextView textView7;
        TextView textView8;
        ViewOnClickListenerC8038 viewOnClickListenerC8038 = (ViewOnClickListenerC8038) abstractC3255;
        C5921 c5921 = this.f30539;
        stack = c5921.f18158;
        C5175 m3356 = ((C0941) stack.peek()).m3356(str);
        C19287 c19287 = (C19287) m3356.f16179.get(i);
        SpannableString spannableString = new SpannableString(c19287.f60682);
        spannableString.setSpan(new BackgroundColorSpan(C21943.f70257 & (-1593835521)), c19287.f60676, c19287.f60677, 33);
        textView = viewOnClickListenerC8038.f24777;
        textView.setText(spannableString);
        viewOnClickListenerC8038.f24780 = m3356;
        viewOnClickListenerC8038.f24778 = c19287;
        viewOnClickListenerC8038.f24779 = i;
        textView2 = viewOnClickListenerC8038.f24777;
        TextPaint paint = textView2.getPaint();
        c19452 = c5921.f18162;
        if (c19452 != null) {
            c194522 = c5921.f18162;
            if (!c194522.m44838(str)) {
                textView7 = viewOnClickListenerC8038.f24777;
                textView7.setTextColor(C21943.f70273);
                textView8 = viewOnClickListenerC8038.f24777;
                textView8.setAlpha(1.0f);
                paint.setFlags(paint.getFlags() | 16);
                return;
            }
        }
        stack2 = c5921.f18158;
        if (((C0941) stack2.peek()).f3565.contains(str + " " + i)) {
            textView5 = viewOnClickListenerC8038.f24777;
            textView5.setTextColor(C21943.f70273);
            textView6 = viewOnClickListenerC8038.f24777;
            textView6.setAlpha(0.8f);
        } else {
            textView3 = viewOnClickListenerC8038.f24777;
            textView3.setTextColor(C21943.f70275);
            textView4 = viewOnClickListenerC8038.f24777;
            textView4.setAlpha(1.0f);
        }
        paint.setFlags(paint.getFlags() & (-17));
    }

    @Override // l.InterfaceC18383
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25495(String str, ImageView imageView, TextView textView) {
        C19452 c19452;
        Stack stack;
        C19452 c194522;
        TextPaint paint = textView.getPaint();
        C5921 c5921 = this.f30539;
        c19452 = c5921.f18162;
        if (c19452 != null) {
            c194522 = c5921.f18162;
            if (!c194522.m44838(str)) {
                textView.setTextColor(C21943.f70273);
                textView.setAlpha(1.0f);
                paint.setFlags(paint.getFlags() | 16);
                return;
            }
        }
        stack = c5921.f18158;
        if (((C0941) stack.peek()).f3565.contains(str)) {
            textView.setTextColor(C21943.f70273);
            textView.setAlpha(0.8f);
        } else {
            textView.setTextColor(C21943.f70275);
            textView.setAlpha(1.0f);
        }
        paint.setFlags(paint.getFlags() & (-17));
    }
}
