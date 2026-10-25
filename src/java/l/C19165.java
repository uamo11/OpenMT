package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: B61E */
/* renamed from: l.᩵ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C19165 extends C12499 {

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public C5882 f60390;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C0113 f60391;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final int f60392;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final int f60393;

    public C19165(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f60393 = 21;
            this.f60392 = 22;
        } else {
            this.f60393 = 22;
            this.f60392 = 21;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44245(C0113 c0113) {
        this.f60391 = c0113;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C22110 c22110;
        C7999 c7999 = (C7999) getSelectedView();
        if (c7999 != null && i == this.f60393) {
            if (c7999.isEnabled() && c7999.getItemData().hasSubMenu()) {
                performItemClick(c7999, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (c7999 != null && i == this.f60392) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                c22110 = (C22110) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                c22110 = (C22110) adapter;
            }
            c22110.m49689().close(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // l.C12499, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C22110 c22110;
        int i;
        int pointToPosition;
        int i2;
        if (this.f60391 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c22110 = (C22110) headerViewListAdapter.getWrappedAdapter();
            } else {
                c22110 = (C22110) adapter;
                i = 0;
            }
            C5882 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c22110.getCount()) ? null : c22110.getItem(i2);
            C5882 c5882 = this.f60390;
            if (c5882 != item) {
                C3060 m49689 = c22110.m49689();
                if (c5882 != null) {
                    this.f60391.mo1114(m49689, (MenuItem) c5882);
                }
                this.f60390 = item;
                if (item != null) {
                    this.f60391.mo1115(m49689, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
