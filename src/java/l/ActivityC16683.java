package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: G16V */
/* renamed from: l.ܽܰܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ActivityC16683 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51209 = 0;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public List f51210 = Collections.EMPTY_LIST;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C11040 f51211;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "SchemeManagerActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.string.MT_Protector_res_0x7f1208d9);
        m10241(R.layout.MT_Protector_res_0x7f0d0034);
        this.f10584 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        ListView listView = (ListView) m10241(android.R.id.list);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC3420(this, 1));
        this.f51210 = C16249.m38218();
        C11040 c11040 = new C11040(this);
        this.f51211 = c11040;
        listView.setAdapter((ListAdapter) c11040);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f51210 = C16249.m38218();
        this.f51211.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector_res_0x7f0f001c, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector_res_0x7f0a011f) {
            C14132 c14132 = new C14132(this, this);
            c14132.m31258(R.string.MT_Protector_res_0x7f1204a7);
            c14132.m31244();
            c14132.m31279(6);
            c14132.m31266(true);
            return true;
        }
        if (itemId != R.id.MT_Protector_res_0x7f0a0289) {
            return false;
        }
        try {
            C12951 m31485 = C12951.m31485(Base64.decode(C4925.m14330().trim(), 3));
            C22124.m49722((InterfaceC20008) m31485, -2106428910);
            String m31506 = m31485.m31506();
            String m315062 = m31485.m31506();
            if (m315062.hashCode() != m31485.readInt()) {
                throw new Exception();
            }
            C9195 c9195 = new C9195(C16249.m38222(m31506));
            c9195.m23630(new JSONObject(m315062));
            C16249.m38217(c9195);
            this.f51210 = C16249.m38218();
            this.f51211.notifyDataSetChanged();
            C21374.m48457(R.string.MT_Protector_res_0x7f120487);
            return true;
        } catch (Exception unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120474);
            return true;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.f51210.get(i);
        Intent intent = new Intent(this, (Class<?>) ActivityC6372.class);
        intent.putExtra("schemeName", str);
        startActivity(intent);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C21282 c21282 = new C21282(this, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205f9, 0, R.string.MT_Protector_res_0x7f1205f9);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205c2, 0, R.string.MT_Protector_res_0x7f1205c2);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12035a, 0, R.string.MT_Protector_res_0x7f12035a);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۨ᩺ܽ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC16683.m39213(ActivityC16683.this, i, menuItem);
                return true;
            }
        });
        C18342.m42767(view, c21282);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39213(final ActivityC16683 activityC16683, int i, MenuItem menuItem) {
        final String str = (String) activityC16683.f51210.get(i);
        int i2 = 3;
        if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f12035a) {
            try {
                String jSONObject = C16249.m38221(str).m23632().toString();
                C10130 c10130 = new C10130();
                c10130.writeInt(-2106428910);
                c10130.m25439(str);
                c10130.m25439(jSONObject);
                c10130.writeInt(jSONObject.hashCode());
                C4925.m14314((CharSequence) Base64.encodeToString(c10130.m25429(), 3));
                return;
            } catch (Exception e) {
                activityC16683.m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f1205f9) {
            C7783 c7783 = new C7783(activityC16683, activityC16683, str);
            c7783.m31258(R.string.MT_Protector_res_0x7f1205f9);
            c7783.m31250((CharSequence) str);
            c7783.m31244();
            c7783.m31279(6);
            c7783.m31281();
            c7783.m31266(true);
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f1205ca) {
            int i3 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC16683);
            c19258.m44433(R.string.MT_Protector_res_0x7f1205ca);
            c19258.m44424(activityC16683.getString(R.string.MT_Protector_res_0x7f120870, str));
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩺᩺ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC16683.m39214(ActivityC16683.this, str);
                }
            });
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        String str2 = str + 2;
        while (C16249.m38219(str2)) {
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(i2);
            str2 = m15339.toString();
            i2++;
        }
        C1867 c1867 = new C1867(activityC16683, activityC16683, str);
        c1867.m31258(R.string.MT_Protector_res_0x7f1205c2);
        c1867.m31250((CharSequence) str2);
        c1867.m31244();
        c1867.m31279(6);
        c1867.m31281();
        c1867.m31266(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39214(ActivityC16683 activityC16683, String str) {
        C16249.m38215(str);
        activityC16683.f51210 = C16249.m38218();
        activityC16683.f51211.notifyDataSetChanged();
    }
}
