package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* compiled from: 75NJ */
/* renamed from: l.ܰۚᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13617 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f40617;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22372 f40618;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedList f40619;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f40620;

    public C13617() {
        throw null;
    }

    public C13617(ActivityC16315 activityC16315, LinkedList linkedList, C22372 c22372, boolean z) {
        this.f40620 = activityC16315;
        this.f40619 = linkedList;
        this.f40618 = c22372;
        this.f40617 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32733() {
        if (!this.f40617) {
            C22372 c22372 = this.f40618;
            if (c22372.m5426()) {
                ActivityC16315 activityC16315 = this.f40620;
                activityC16315.m38461();
                activityC16315.m38453(c22372);
                C19258 buildDialog = activityC16315.buildDialog();
                buildDialog.m44436(c22372.m5420().f15019.getName());
                buildDialog.m44416(R.string.MT_Protector_res_0x7f1208cd);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f1208c4, new DialogInterface.OnClickListener() { // from class: l.ۛۚᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final C13617 c13617 = C13617.this;
                        c13617.f40618.m50222(c13617.f40620, new Runnable() { // from class: l.᩺ۚᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13617.this.m32731();
                            }
                        });
                    }
                });
                buildDialog.m44434(R.string.MT_Protector_res_0x7f1202c2, new DialogInterface.OnClickListener() { // from class: l.ۨۚᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C13617.this.m32731();
                    }
                });
                buildDialog.m44440(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                buildDialog.m44438();
                return;
            }
        }
        m32731();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m32731() {
        C20256 c20256;
        ActivityC16315 activityC16315 = this.f40620;
        try {
            C22372 c22372 = this.f40618;
            c22372.getClass();
            activityC16315.m38448(c22372);
        } catch (Throwable th) {
            c20256 = activityC16315.f50252;
            c20256.m46502(th);
        }
        LinkedList linkedList = this.f40619;
        if (!linkedList.isEmpty()) {
            ((C13617) linkedList.removeFirst()).m32733();
        } else {
            activityC16315.f50243 = false;
        }
    }
}
