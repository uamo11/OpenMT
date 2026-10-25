package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 31PG */
/* renamed from: l.ۨۢۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11620 extends BroadcastReceiver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f34632;

    public C11620(ActivityC7365 activityC7365) {
        this.f34632 = activityC7365;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        C15831 c15831;
        List list;
        List list2;
        C2447 c2447;
        C2447 c24472;
        C15831 c158312;
        String action = intent.getAction();
        C11003.requireNonNull(action);
        switch (action.hashCode()) {
            case -1507732668:
                if (action.equals("bin.mt.protect.ProtectUploadService.ACTION_SUCCESS")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -301891519:
                if (action.equals("bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 110553949:
                if (action.equals("bin.mt.protect.ProtectUploadService.ACTION_FAIL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        ActivityC7365 activityC7365 = this.f34632;
        switch (c) {
            case 0:
                String stringExtra = intent.getStringExtra("taskID");
                int intExtra = intent.getIntExtra("id", -1);
                C16742 m19803 = ActivityC7365.m19803(activityC7365, stringExtra);
                if (m19803 != null) {
                    m19803.f51388 = intExtra;
                    m19803.f51392 = 0;
                    list = activityC7365.f22625;
                    ArrayList arrayList = new ArrayList(list);
                    list2 = activityC7365.f22617;
                    ArrayList arrayList2 = new ArrayList(list2);
                    arrayList.remove(m19803);
                    arrayList2.add(0, m19803);
                    activityC7365.f22625 = C20195.unmodifiableList(arrayList);
                    activityC7365.f22617 = C20195.unmodifiableList(arrayList2);
                    new RunnableC19361(activityC7365);
                }
                c15831 = activityC7365.f22624;
                c15831.notifyDataSetChanged();
                break;
            case 1:
                String stringExtra2 = intent.getStringExtra("taskID");
                c2447 = activityC7365.f22622;
                TextView textView = (TextView) c2447.findViewWithTag(stringExtra2);
                C16742 m198032 = ActivityC7365.m19803(activityC7365, stringExtra2);
                if (textView != null && m198032 != null) {
                    m198032.f51392 = -1;
                    ActivityC7365.m19799(activityC7365, m198032, textView);
                    break;
                }
                break;
            case 2:
                String stringExtra3 = intent.getStringExtra("taskID");
                if (!ServiceC8982.f27296.contains(stringExtra3)) {
                    Bundle extras = intent.getExtras();
                    C11003.requireNonNull(extras);
                    if (extras.containsKey("message")) {
                        C21374.m48464(intent.getStringExtra("message"));
                    }
                }
                c24472 = activityC7365.f22622;
                TextView textView2 = (TextView) c24472.findViewWithTag(stringExtra3);
                C16742 m198033 = ActivityC7365.m19803(activityC7365, stringExtra3);
                if (textView2 != null && m198033 != null) {
                    m198033.f51392 = -3;
                    c158312 = activityC7365.f22624;
                    c158312.notifyDataSetChanged();
                    break;
                }
                break;
        }
    }
}
