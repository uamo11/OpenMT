package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* compiled from: 969A */
/* renamed from: l.ۧ᩷ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11248 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f33718;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Stack f33719 = new Stack();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Stack f33717 = new Stack();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2727 f33716 = new C2727();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27825(C2075 c2075) {
        this.f33718++;
        Stack stack = this.f33717;
        stack.push(c2075);
        this.f33719.clear();
        if (stack.size() > 100) {
            stack.remove(0);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27824() {
        Iterator it = this.f33719.iterator();
        while (it.hasNext()) {
            if (((C2075) it.next()).f6926.startsWith("//SEARCH//")) {
                it.remove();
            }
        }
        Iterator it2 = this.f33717.iterator();
        while (it2.hasNext()) {
            if (((C2075) it2.next()).f6926.startsWith("//SEARCH//")) {
                it2.remove();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27823() {
        return !this.f33719.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27821() {
        return !this.f33717.isEmpty();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2075 m27822(C2075 c2075) {
        this.f33718++;
        this.f33717.push(c2075);
        return (C2075) this.f33719.pop();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2075 m27818(C2075 c2075) {
        this.f33718++;
        this.f33719.push(c2075);
        return (C2075) this.f33717.pop();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27819(C10130 c10130) {
        Stack stack = this.f33719;
        c10130.mo13231(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            C2075 c2075 = (C2075) it.next();
            c10130.m25439(c2075.f6926);
            c10130.writeInt(c2075.f6927);
            c10130.m25425(c2075.f6924);
            c10130.m25439(c2075.f6925);
        }
        Stack stack2 = this.f33717;
        c10130.mo13231(stack2.size());
        Iterator it2 = stack2.iterator();
        while (it2.hasNext()) {
            C2075 c20752 = (C2075) it2.next();
            c10130.m25439(c20752.f6926);
            c10130.writeInt(c20752.f6927);
            c10130.m25425(c20752.f6924);
            c10130.m25439(c20752.f6925);
        }
        C2727 c2727 = this.f33716;
        c10130.mo13231(c2727.size());
        for (Map.Entry entry : c2727.entrySet()) {
            c10130.m25439((String) entry.getKey());
            c10130.writeInt(((Integer) entry.getValue()).intValue());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27820(C12951 c12951) {
        Stack stack = this.f33719;
        stack.clear();
        Stack stack2 = this.f33717;
        stack2.clear();
        C2727 c2727 = this.f33716;
        c2727.clear();
        int m31494 = c12951.m31494();
        for (int i = 0; i < m31494; i++) {
            stack.add(new C2075(c12951));
        }
        int m314942 = c12951.m31494();
        for (int i2 = 0; i2 < m314942; i2++) {
            stack2.add(new C2075(c12951));
        }
        int m314943 = c12951.m31494();
        for (int i3 = 0; i3 < m314943; i3++) {
            c2727.put(c12951.m31506(), Integer.valueOf(c12951.readInt()));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27826() {
        return this.f33718;
    }
}
