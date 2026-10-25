package l;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Q5JO */
/* renamed from: l.᩵ۖ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19166 extends C18460 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60394 = Pattern.compile("(.*?);([0-9]{1,20})\\s{0,80}.{0,80}");

    @Override // l.AbstractC11795, l.InterfaceC6150
    /* renamed from: ֫ */
    public final List mo11132(LinkedList linkedList) {
        Pattern pattern;
        HashMap hashMap = new HashMap();
        ListIterator listIterator = linkedList.listIterator();
        while (true) {
            boolean hasNext = listIterator.hasNext();
            pattern = f60394;
            if (!hasNext) {
                break;
            }
            Matcher matcher = pattern.matcher(((String) listIterator.next()).trim());
            if (matcher.matches()) {
                MatchResult matchResult = matcher.toMatchResult();
                String group = matchResult.group(1);
                Integer valueOf = Integer.valueOf(matchResult.group(2));
                Integer num = (Integer) hashMap.get(group);
                if (num != null && valueOf.intValue() < num.intValue()) {
                    listIterator.remove();
                } else {
                    hashMap.put(group, valueOf);
                }
            }
        }
        while (listIterator.hasPrevious()) {
            Matcher matcher2 = pattern.matcher(((String) listIterator.previous()).trim());
            if (matcher2.matches()) {
                MatchResult matchResult2 = matcher2.toMatchResult();
                String group2 = matchResult2.group(1);
                int parseInt = Integer.parseInt(matchResult2.group(2));
                Integer num2 = (Integer) hashMap.get(group2);
                if (num2 != null && parseInt < num2.intValue()) {
                    listIterator.remove();
                }
            }
        }
        return linkedList;
    }
}
