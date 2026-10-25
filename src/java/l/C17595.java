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
/* renamed from: l.ܿ᩷ۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17595 extends C13876 implements InterfaceC18383 {

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14772 f53766;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f53765 = C11266.m27878(17.0f);

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f53764 = C11266.m27878(20.0f);

    @Override // l.C13876
    /* renamed from: ۘ */
    public final boolean mo25497() {
        return true;
    }

    public C17595(C14772 c14772) {
        this.f53766 = c14772;
        m33262((InterfaceC18383) this);
    }

    @Override // l.C13876
    /* renamed from: ֫ */
    public final int mo25493(int i) {
        return i == 0 ? this.f53764 : this.f41370 * i;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m41122() {
        Stack stack;
        Stack stack2;
        Stack stack3;
        C14772 c14772 = this.f53766;
        stack = c14772.f45112;
        if (stack.isEmpty()) {
            return 1;
        }
        stack2 = c14772.f45112;
        int i = ((C0941) stack2.peek()).m3358() > 0 ? 3 : 1;
        stack3 = c14772.f45112;
        if (stack3.size() >= 2) {
            i++;
        }
        return i + 1;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m41124() {
        int m41122 = m41122();
        if (m41122 <= 2) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(0, m41122 + 2);
        }
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemCount() {
        Stack stack;
        stack = this.f53766.f45112;
        if (stack.isEmpty()) {
            return 2;
        }
        return m41122() + 2 + super.getItemCount();
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        int m41122 = m41122();
        if (i2 < m41122) {
            return 2;
        }
        int i3 = i2 - m41122;
        if (i3 == 0) {
            return 1;
        }
        return super.getItemViewType(i3 - 1);
    }

    @Override // l.C13876, l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C11537(C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d015a, viewGroup, false));
        }
        if (i == 1) {
            return new C11537(C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d015b, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        return new ViewOnClickListenerC11246(this.f53766, C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0131, viewGroup, false));
    }

    @Override // l.C13876, l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        Stack stack;
        Stack stack2;
        Stack stack3;
        int i2;
        Stack stack4;
        if (i == 0) {
            ((C11537) abstractC3255).f34448.setText(R.string.MT_Protector_res_0x7f120413);
            return;
        }
        int i3 = -1;
        int i4 = i - 1;
        int m41122 = m41122();
        C14772 c14772 = this.f53766;
        if (i4 >= m41122) {
            int i5 = i4 - m41122;
            if (i5 != 0) {
                super.onBindViewHolder(abstractC3255, i5 - 1);
                return;
            }
            C11537 c11537 = (C11537) abstractC3255;
            stack = c14772.f45112;
            final C0941 c0941 = (C0941) stack.peek();
            c11537.f34448.setText(c14772.getString(R.string.MT_Protector_res_0x7f120901, Integer.valueOf(c0941.m3358())) + " - " + C6554.m18061(300, c0941.m3360()));
            c11537.f34447.setOnClickListener(new View.OnClickListener() { // from class: l.ܽ᩷ۢ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C17595 c17595 = C17595.this;
                    C21282 c21282 = new C21282(c17595.f53766.requireContext(), view, 0);
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201a1, 0, R.string.MT_Protector_res_0x7f1201a1);
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12034e, 0, R.string.MT_Protector_res_0x7f12034e);
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120350, 0, R.string.MT_Protector_res_0x7f120350);
                    c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201f3, 0, R.string.MT_Protector_res_0x7f1201f3);
                    final C0941 c09412 = c0941;
                    c21282.m48302(new InterfaceC14930() { // from class: l.ᩳ᩷ۢ
                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            C17595.m41123(C17595.this, c09412, menuItem);
                            return true;
                        }
                    });
                    c21282.m48305();
                }
            });
            return;
        }
        ViewOnClickListenerC11246 viewOnClickListenerC11246 = (ViewOnClickListenerC11246) abstractC3255;
        int[] iArr = new int[5];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -1;
        iArr[3] = -1;
        iArr[4] = -1;
        stack2 = c14772.f45112;
        if (!stack2.isEmpty()) {
            stack3 = c14772.f45112;
            if (((C0941) stack3.peek()).m3358() > 0) {
                iArr[1] = 1;
                iArr[2] = 2;
                i2 = 3;
            } else {
                i2 = 1;
            }
            stack4 = c14772.f45112;
            if (stack4.size() >= 2) {
                iArr[i2] = 3;
                i2++;
            }
            iArr[i2] = 4;
        }
        if (i4 >= 0 && i4 < 5) {
            i3 = iArr[i4];
        }
        viewOnClickListenerC11246.f33715 = i3;
        TextView textView = viewOnClickListenerC11246.f33712;
        ImageView imageView = viewOnClickListenerC11246.f33714;
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

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41123(C17595 c17595, C0941 c0941, MenuItem menuItem) {
        C17595 c175952;
        C17595 c175953;
        C17595 c175954;
        C17595 c175955;
        C14772 c14772 = c17595.f53766;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f1201a1) {
            c175955 = c14772.f45115;
            c175955.m33275();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f12034e) {
            c175954 = c14772.f45115;
            c175954.m33264(true);
        } else if (itemId != R.string.MT_Protector_res_0x7f120350) {
            if (itemId == R.string.MT_Protector_res_0x7f1201f3) {
                C4925.m14314((CharSequence) C5378.stream(c0941.m3355()).sorted().map(new C3433(1)).collect(C22976.joining("\n")));
            }
        } else {
            c175952 = c14772.f45115;
            c175952.m33275();
            c175953 = c14772.f45115;
            c175953.m33264(false);
        }
    }

    @Override // l.C13876
    /* renamed from: ۜ */
    public final int mo15999() {
        return m41122() + 2;
    }

    @Override // l.C13876
    /* renamed from: ۧ */
    public final int mo25499(String str) {
        Stack stack;
        stack = this.f53766.f45112;
        C5175 m3356 = ((C0941) stack.peek()).m3356(str);
        if (m3356 == null) {
            return 0;
        }
        return m3356.f16179.size();
    }

    @Override // l.C13876
    /* renamed from: ֫ */
    public final AbstractC3255 mo25494(ViewGroup viewGroup) {
        C14772 c14772 = this.f53766;
        View inflate = LayoutInflater.from(c14772.requireContext()).inflate(R.layout.MT_Protector_res_0x7f0d014a, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate.getLayoutParams();
        marginLayoutParams.leftMargin = this.f41370 + this.f53765;
        inflate.setLayoutParams(marginLayoutParams);
        return new ViewOnClickListenerC5892(c14772, inflate);
    }

    @Override // l.C13876
    /* renamed from: ֫ */
    public final void mo25496(AbstractC3255 abstractC3255, String str, int i) {
        Stack stack;
        TextView textView;
        TextView textView2;
        C12366 c12366;
        Stack stack2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        C12366 c123662;
        TextView textView7;
        TextView textView8;
        ViewOnClickListenerC5892 viewOnClickListenerC5892 = (ViewOnClickListenerC5892) abstractC3255;
        C14772 c14772 = this.f53766;
        stack = c14772.f45112;
        C5175 m3356 = ((C0941) stack.peek()).m3356(str);
        C19287 c19287 = (C19287) m3356.f16179.get(i);
        SpannableString spannableString = new SpannableString(c19287.f60682);
        spannableString.setSpan(new BackgroundColorSpan(C21943.f70257 & (-1593835521)), c19287.f60676, c19287.f60677, 33);
        textView = viewOnClickListenerC5892.f18090;
        textView.setText(spannableString);
        viewOnClickListenerC5892.f18092 = m3356;
        viewOnClickListenerC5892.f18091 = c19287;
        viewOnClickListenerC5892.f18093 = i;
        textView2 = viewOnClickListenerC5892.f18090;
        TextPaint paint = textView2.getPaint();
        c12366 = c14772.f45110;
        if (c12366 != null) {
            c123662 = c14772.f45110;
            if (!c123662.m30058(str)) {
                textView7 = viewOnClickListenerC5892.f18090;
                textView7.setTextColor(C21943.f70273);
                textView8 = viewOnClickListenerC5892.f18090;
                textView8.setAlpha(1.0f);
                paint.setFlags(paint.getFlags() | 16);
                return;
            }
        }
        stack2 = c14772.f45112;
        if (((C0941) stack2.peek()).f3565.contains(str + " " + i)) {
            textView5 = viewOnClickListenerC5892.f18090;
            textView5.setTextColor(C21943.f70273);
            textView6 = viewOnClickListenerC5892.f18090;
            textView6.setAlpha(0.8f);
        } else {
            textView3 = viewOnClickListenerC5892.f18090;
            textView3.setTextColor(C21943.f70275);
            textView4 = viewOnClickListenerC5892.f18090;
            textView4.setAlpha(1.0f);
        }
        paint.setFlags(paint.getFlags() & (-17));
    }

    @Override // l.InterfaceC18383
    /* renamed from: ֫ */
    public final void mo25495(String str, ImageView imageView, TextView textView) {
        C12366 c12366;
        Stack stack;
        C12366 c123662;
        TextPaint paint = textView.getPaint();
        C14772 c14772 = this.f53766;
        c12366 = c14772.f45110;
        if (c12366 != null) {
            c123662 = c14772.f45110;
            if (!c123662.m30058(str)) {
                textView.setTextColor(C21943.f70273);
                textView.setAlpha(1.0f);
                paint.setFlags(paint.getFlags() | 16);
                return;
            }
        }
        stack = c14772.f45112;
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
