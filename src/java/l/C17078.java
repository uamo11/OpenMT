package l;

import android.view.View;
import java.util.List;

/* compiled from: K4ND */
/* renamed from: l.ܿۗۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17078 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52355;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52356;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f52357;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f52358;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52359;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f52360;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f52361;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52362;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52363;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52364;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f52365;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f52366;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m40078(C2550 c2550) {
        List list = this.f52357;
        if (list == null) {
            View m8075 = c2550.m8075(this.f52359);
            this.f52359 += this.f52363;
            return m8075;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC3255) this.f52357.get(i)).itemView;
            C14543 c14543 = (C14543) view.getLayoutParams();
            if (!c14543.f44554.isRemoved() && this.f52359 == c14543.f44554.getLayoutPosition()) {
                m40079(view);
                return view;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40079(View view) {
        int layoutPosition;
        int size = this.f52357.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC3255) this.f52357.get(i2)).itemView;
            C14543 c14543 = (C14543) view3.getLayoutParams();
            if (view3 != view && !c14543.f44554.isRemoved() && (layoutPosition = (c14543.f44554.getLayoutPosition() - this.f52359) * this.f52363) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f52359 = -1;
        } else {
            this.f52359 = ((C14543) view2.getLayoutParams()).f44554.getLayoutPosition();
        }
    }
}
