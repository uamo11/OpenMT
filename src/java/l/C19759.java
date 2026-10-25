package l;

import android.widget.ListView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* compiled from: P676 */
/* renamed from: l.᩵᩹ܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19759 extends AbstractViewOnClickListenerC16166 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63816;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f63817;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19759(ActivityC21107 activityC21107, ActivityC21107 activityC211072, boolean z) {
        super(activityC211072);
        this.f63817 = activityC21107;
        this.f63816 = z;
    }

    @Override // l.AbstractViewOnClickListenerC16166
    /* renamed from: ֫ */
    public final void mo2796(Pattern pattern, String str) {
        C18284 c18284;
        C18284 c182842;
        Collection values;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        ListView listView;
        ActivityC21107 activityC21107 = this.f63817;
        c18284 = activityC21107.f68093;
        if (!c18284.f56846.isEmpty()) {
            c182847 = activityC21107.f68093;
            C0644 c0644 = (C0644) c182847.f56846.peek();
            listView = activityC21107.f68089;
            c0644.f2493 = listView.getFirstVisiblePosition();
        }
        if (this.f63816) {
            c182846 = activityC21107.f68093;
            values = ((C0644) c182846.f56846.peek()).f2492;
        } else {
            c182842 = activityC21107.f68093;
            values = c182842.f56832.values();
        }
        C0644 c06442 = new C0644();
        c06442.f2494 = str;
        RunnableC19053 runnableC19053 = new RunnableC19053(new ConcurrentLinkedQueue(values), pattern, c06442, 0);
        LinkedList linkedList = new LinkedList();
        int i = C17615.f53826 / 2;
        for (int i2 = 0; i2 < i; i2++) {
            Thread thread = new Thread(runnableC19053);
            thread.start();
            linkedList.add(thread);
        }
        runnableC19053.run();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            try {
                ((Thread) it.next()).join();
            } catch (InterruptedException unused) {
            }
        }
        c182843 = activityC21107.f68093;
        c182843.f56846.push(c06442);
        c182844 = activityC21107.f68093;
        c182845 = activityC21107.f68093;
        c182844.f56833 = c182845.m42621();
    }

    @Override // l.AbstractViewOnClickListenerC16166
    /* renamed from: ֫ */
    public final void mo2795() {
        C18284 c18284;
        ActivityC21107 activityC21107 = this.f63817;
        c18284 = activityC21107.f68093;
        activityC21107.setTitle(((C0644) c18284.f56846.peek()).f2494);
        activityC21107.m48049(EnumC6995.SEARCH_RESULT_CLASS);
    }
}
