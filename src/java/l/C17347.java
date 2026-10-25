package l;

import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: A940 */
/* renamed from: l.ܿ۫ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17347 implements InterfaceC14930 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f53140;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f53141;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19902 f53142;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f53143;

    public C17347(ArrayList arrayList, boolean z, View view, AbstractC19902 abstractC19902) {
        this.f53143 = arrayList;
        this.f53141 = z;
        this.f53140 = view;
        this.f53142 = abstractC19902;
    }

    @Override // l.InterfaceC14930
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = this.f53143;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int itemId = menuItem.getItemId();
        boolean z = this.f53141;
        if (itemId == R.string.MT_Protector_res_0x7f1209b7) {
            C7489.m20119(arrayList, 0, z);
        } else if (itemId == R.string.MT_Protector_res_0x7f1209b6) {
            C7489.m20119(arrayList, 1, z);
        } else if (itemId == R.string.MT_Protector_res_0x7f1209b8) {
            C7489.m20119(arrayList, 2, z);
        } else if (itemId == R.string.MT_Protector_res_0x7f1209b9) {
            C7489.m20119(arrayList, 3, z);
        } else if (itemId == R.string.MT_Protector_res_0x7f1209ba) {
            Collections.reverse(arrayList);
            menuItem.setChecked(!z);
            this.f53140.setTag(R.id.MT_Protector_res_0x7f0a0540, !z ? Object.class : null);
        }
        C20649.m47228(new C18053(this, arrayList2)).m40148(this.f53142);
        return true;
    }
}
