package l;

import android.app.Person;
import android.content.Context;

/* compiled from: 374 */
/* renamed from: l.᩺᩶, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23208 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14035 m51503(Person person) {
        CharSequence name = person.getName();
        C4656 m13627 = person.getIcon() != null ? C4656.m13627(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        C14035 c14035 = new C14035();
        c14035.f42434 = name;
        c14035.f42430 = m13627;
        c14035.f42432 = uri;
        c14035.f42435 = key;
        c14035.f42431 = isBot;
        c14035.f42433 = isImportant;
        return c14035;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Person m51502(C14035 c14035) {
        Person.Builder name = new Person.Builder().setName(c14035.f42434);
        C4656 c4656 = c14035.f42430;
        return name.setIcon(c4656 != null ? c4656.m13633((Context) null) : null).setUri(c14035.f42432).setKey(c14035.f42435).setBot(c14035.f42431).setImportant(c14035.f42433).build();
    }
}
