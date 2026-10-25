package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: 81ID */
/* renamed from: l.֫۫᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1832 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f6273;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f6274;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20197 f6275;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f6276;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BaseAdapter f6277;

    public C1832(final ActivityC17169 activityC17169, C20197 c20197) {
        this.f6276 = activityC17169;
        this.f6275 = c20197;
        this.f6273 = c20197.m46433();
        C11730 c11730 = new C11730(this, activityC17169);
        this.f6277 = c11730;
        View m10216 = activityC17169.m10216(R.layout.MT_Protector_res_0x7f0d00cc);
        ListView listView = (ListView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        C4915.m14284(listView);
        listView.setAdapter((ListAdapter) c11730);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120265);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC17169);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
        c19258.m44440(R.string.MT_Protector_res_0x7f120266, new DialogInterface.OnClickListener() { // from class: l.۫۬᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                final C1832 c1832 = C1832.this;
                activityC17169.m40363(new Runnable() { // from class: l.ۛ۬᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1832.this.m6072(true);
                    }
                });
            }
        });
        this.f6274 = c19258.m44415();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6080() {
        if (this.f6273.isEmpty()) {
            this.f6276.m40363(new Runnable() { // from class: l.ۙ۬᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C1832.this.m6072(false);
                }
            });
        } else {
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f6274;
            dialogInterfaceC0206.m1449();
            C8960.m23097(dialogInterfaceC0206);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m6072(boolean z) {
        C13845 c13845 = new C13845(this, this.f6276, z);
        c13845.m31250((CharSequence) ApplicationC20075.f65008.getString("dex_backup_name", "backup"));
        c13845.m31258(R.string.MT_Protector_res_0x7f120266);
        c13845.m31279(6);
        c13845.m31256(R.string.MT_Protector_res_0x7f120267);
        c13845.m31281();
        c13845.m31266(true);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(final AdapterView adapterView, final View view, final int i, final long j) {
        C21282 c21282 = new C21282(this.f6276, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12026b, 0, R.string.MT_Protector_res_0x7f12026b);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120268, 0, R.string.MT_Protector_res_0x7f120268);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12026a, 0, R.string.MT_Protector_res_0x7f12026a);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۗ۬᩷
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C1832.m6069(C1832.this, adapterView, view, i, j, menuItem);
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6069(final C1832 c1832, AdapterView adapterView, View view, int i, long j, MenuItem menuItem) {
        ActivityC17169 activityC17169 = c1832.f6276;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f12026b) {
            c1832.onItemClick(adapterView, view, i, j);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f12026a) {
            C22313 c22313 = (C22313) c1832.f6273.get(i);
            C7496 c7496 = new C7496(c1832, activityC17169, c22313);
            c7496.m31258(R.string.MT_Protector_res_0x7f12026a);
            c7496.m31250((CharSequence) c22313.f72330);
            c7496.m31281();
            c7496.m31266(true);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f120268) {
            final C22313 c223132 = (C22313) c1832.f6273.get(i);
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC17169);
            c19258.m44433(R.string.MT_Protector_res_0x7f120268);
            c19258.m44424(activityC17169.getString(R.string.MT_Protector_res_0x7f120870, c223132.f72330));
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۤ۬᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C1832.m6071(C1832.this, c223132);
                }
            });
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44438();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6071(C1832 c1832, C22313 c22313) {
        c22313.f72329.mo23552();
        c22313.f72328.mo23552();
        c1832.f6273.remove(c22313);
        c1832.f6277.notifyDataSetChanged();
        if (c1832.f6273.isEmpty()) {
            c1832.f6274.dismiss();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        final C22313 c22313 = (C22313) this.f6273.get(i);
        int i2 = DialogInterfaceC0206.f1451;
        ActivityC17169 activityC17169 = this.f6276;
        C19258 c19258 = new C19258(activityC17169);
        c19258.m44433(R.string.MT_Protector_res_0x7f12026b);
        c19258.m44424(activityC17169.getString(R.string.MT_Protector_res_0x7f12026c, c22313.f72330));
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.۬۬᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C1832.m6074(C1832.this, c22313);
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m6074(C1832 c1832, C22313 c22313) {
        ActivityC17169 activityC17169 = c1832.f6276;
        try {
            c1832.f6275.m46435(c22313.f72329);
            c1832.f6274.dismiss();
            activityC17169.m40355(true);
        } catch (IOException e) {
            activityC17169.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
