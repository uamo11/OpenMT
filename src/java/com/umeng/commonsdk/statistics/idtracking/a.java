package com.umeng.commonsdk.statistics.idtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: L4JT */
/* loaded from: classes.dex */
public abstract class a {
    public final int a = 10;
    public final int b = 100;
    public final String c;
    public List d;
    public com.umeng.commonsdk.statistics.proto.b e;

    public abstract String f();

    public a(String str) {
        this.c = str;
    }

    public boolean a() {
        return g();
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.e;
        return bVar == null || bVar.h() <= 100;
    }

    private boolean g() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.e;
        String b = bVar == null ? null : bVar.b();
        int h = bVar == null ? 0 : bVar.h();
        String a = a(f());
        if (a == null || a.equals(b)) {
            return false;
        }
        if (bVar == null) {
            bVar = new com.umeng.commonsdk.statistics.proto.b();
        }
        bVar.a(a);
        bVar.a(System.currentTimeMillis());
        bVar.a(h + 1);
        com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
        aVar.a(this.c);
        aVar.c(a);
        aVar.b(b);
        aVar.a(bVar.e());
        if (this.d == null) {
            this.d = new ArrayList(2);
        }
        this.d.add(aVar);
        if (this.d.size() > 10) {
            this.d.remove(0);
        }
        this.e = bVar;
        return true;
    }

    public com.umeng.commonsdk.statistics.proto.b d() {
        return this.e;
    }

    public void a(com.umeng.commonsdk.statistics.proto.b bVar) {
        this.e = bVar;
    }

    public List e() {
        return this.d;
    }

    public void a(List list) {
        this.d = list;
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || "0".equals(trim) || "unknown".equals(trim.toLowerCase(Locale.US))) {
            return null;
        }
        return trim;
    }

    public void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        this.e = (com.umeng.commonsdk.statistics.proto.b) cVar.c().get(this.c);
        List<com.umeng.commonsdk.statistics.proto.a> h = cVar.h();
        if (h == null || h.size() <= 0) {
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        for (com.umeng.commonsdk.statistics.proto.a aVar : h) {
            if (this.c.equals(aVar.a)) {
                this.d.add(aVar);
            }
        }
    }
}
