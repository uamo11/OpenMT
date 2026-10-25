package l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import bin.mt.plus.R;

/* compiled from: O5LX */
/* renamed from: l.ܰܶۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnCreateContextMenuListenerC13899 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2095 f41422;

    public ViewOnCreateContextMenuListenerC13899(C2095 c2095) {
        this.f41422 = c2095;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C2095 c2095 = this.f41422;
        CharSequence mo6907 = c2095.mo6907();
        if (!c2095.m6939() || TextUtils.isEmpty(mo6907)) {
            return;
        }
        contextMenu.setHeaderTitle(mo6907);
        contextMenu.add(0, 0, 0, R.string.MT_Protector_res_0x7f1201f2).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C2095 c2095 = this.f41422;
        ClipboardManager clipboardManager = (ClipboardManager) c2095.m6886().getSystemService("clipboard");
        CharSequence mo6907 = c2095.mo6907();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", mo6907));
        Toast.makeText(c2095.m6886(), c2095.m6886().getString(R.string.MT_Protector_res_0x7f120796, mo6907), 0).show();
        return true;
    }
}
