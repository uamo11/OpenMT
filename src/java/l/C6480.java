package l;

import android.text.SpannableString;
import android.widget.Filter;
import java.util.Iterator;
import java.util.List;

/* compiled from: U5MD */
/* renamed from: l.ۜۖᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6480 extends Filter {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20009;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f20010;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20592 f20012;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f20011 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23866 f20013 = new C23866();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7637 f20008 = new C7637(2);

    public C6480(C20592 c20592) {
        this.f20012 = c20592;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ab, code lost:
    
        if (r10.equals(r16.f20010) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x010d  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r17) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6480.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17875(InterfaceC9922 interfaceC9922, boolean z) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            boolean z2 = interfaceC4277.mo12858() == 1;
            Iterator it = interfaceC4277.mo12850().iterator();
            while (it.hasNext()) {
                String typeName = ((InterfaceC0748) it.next()).getTypeName();
                C23866 c23866 = this.f20013;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z2) {
                            c23866.m52575(new SpannableString("?android:attr/"));
                        } else {
                            c23866.m52575(new SpannableString("?attr/"));
                        }
                    }
                } else if (!typeName.equals("attr")) {
                    if (z2) {
                        c23866.m52575(new SpannableString(C4860.m14172("@android:", typeName, "/")));
                    } else {
                        c23866.m52575(new SpannableString(C4860.m14172("@", typeName, "/")));
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17874(InterfaceC9922 interfaceC9922, int i, String str) {
        InterfaceC21211 mo2346;
        if (interfaceC9922 == null) {
            return;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.getTypeName().equals(this.f20010)) {
                        int mo2878 = interfaceC0748.mo2878();
                        for (int i2 = 0; i2 < mo2878; i2++) {
                            Iterator it = interfaceC0748.mo2872().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    InterfaceC7099 interfaceC7099 = (InterfaceC7099) it.next();
                                    if (interfaceC7099.mo2347(i2) && (mo2346 = interfaceC7099.mo2346(i2)) != null) {
                                        StringBuilder m15339 = C5368.m15339(str);
                                        m15339.append(mo2346.mo29406());
                                        this.f20013.m52575(new SpannableString(m15339.toString()));
                                        break;
                                    }
                                }
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null) {
            return;
        }
        List list = (List) filterResults.values;
        C20592 c20592 = this.f20012;
        c20592.f66289 = list;
        if (filterResults.count > 0) {
            c20592.notifyDataSetChanged();
        } else {
            c20592.notifyDataSetInvalidated();
        }
    }
}
