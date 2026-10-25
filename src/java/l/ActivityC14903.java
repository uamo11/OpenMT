package l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* compiled from: G135 */
/* renamed from: l.ܶ֨ܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ActivityC14903 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45464 = 0;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public TextView f45465;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C7848 f45467;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public List f45468 = Collections.EMPTY_LIST;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C13309 f45466 = new C13309();

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
    }

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "OpenMethodManager";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.string.MT_Protector_res_0x7f120714);
        m10241(R.layout.MT_Protector_res_0x7f0d0034);
        this.f10584 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        TextView textView = (TextView) m10241(R.id.MT_Protector_res_0x7f0a0190);
        this.f45465 = textView;
        textView.setText(R.string.MT_Protector_res_0x7f1206ec);
        ListView listView = (ListView) m10241(android.R.id.list);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC16718(1, this));
        C7848 c7848 = new C7848(this);
        this.f45467 = c7848;
        listView.setAdapter((ListAdapter) c7848);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        this.f45467.registerDataSetObserver(new C0792(this));
        this.f45465.setVisibility(this.f45467.getCount() == 0 ? 0 : 8);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f45468 = C2204.m7309();
        this.f45466.m32285();
        this.f45467.notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C21282 c21282 = new C21282(this, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e6);
        c21282.m48306();
        c21282.m48302(new InterfaceC14930() { // from class: l.ۚ֨ܿ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC14903.m35361(ActivityC14903.this, i);
                return true;
            }
        });
        C18342.m42767(view, c21282);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35361(ActivityC14903 activityC14903, int i) {
        C2204 c2204 = (C2204) activityC14903.f45468.remove(i);
        activityC14903.f45466.m32288(i);
        C2204.m7308(c2204.m7319());
        activityC14903.f45467.notifyDataSetChanged();
    }
}
