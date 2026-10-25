package l;

import com.thegrizzlylabs.sardineandroid.model.Propstat;
import com.thegrizzlylabs.sardineandroid.model.Resourcetype;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/* compiled from: SA89 */
/* renamed from: l.֨᩹ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1404 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Long f5055;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f5056;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Date f5057;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f5058;

    public C1404(C8460 c8460, Response response) {
        String str;
        String str2;
        List list;
        Resourcetype resourcetype;
        List<Propstat> propstat = response.getPropstat();
        String str3 = null;
        if (!propstat.isEmpty()) {
            for (Propstat propstat2 : propstat) {
                if (propstat2.getProp() != null) {
                    str = propstat2.getProp().getCreationdate();
                    break;
                }
            }
        }
        str = null;
        C14746.m35047(str);
        List<Propstat> propstat3 = response.getPropstat();
        if (!propstat3.isEmpty()) {
            for (Propstat propstat4 : propstat3) {
                if (propstat4.getProp() != null) {
                    str2 = propstat4.getProp().getGetlastmodified();
                    break;
                }
            }
        }
        str2 = null;
        this.f5057 = C14746.m35047(str2);
        List propstat5 = response.getPropstat();
        if (!propstat5.isEmpty()) {
            Iterator it = propstat5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str3 = "application/octet-stream";
                    break;
                }
                Propstat propstat6 = (Propstat) it.next();
                if (propstat6.getProp() != null) {
                    Resourcetype resourcetype2 = propstat6.getProp().getResourcetype();
                    if (resourcetype2 != null && resourcetype2.getCollection() != null) {
                        str3 = "httpd/unix-directory";
                        break;
                    } else if (propstat6.getProp().getGetcontenttype() != null) {
                        str3 = propstat6.getProp().getGetcontenttype();
                        break;
                    }
                }
            }
        }
        this.f5056 = str3;
        this.f5055 = Long.valueOf(C8460.m22141(c8460, response));
        List propstat7 = response.getPropstat();
        if (!propstat7.isEmpty()) {
            Iterator it2 = propstat7.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Propstat propstat8 = (Propstat) it2.next();
                if (propstat8.getProp() != null) {
                    propstat8.getProp().getGetetag();
                    break;
                }
            }
        }
        List propstat9 = response.getPropstat();
        if (!propstat9.isEmpty()) {
            Iterator it3 = propstat9.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Propstat propstat10 = (Propstat) it3.next();
                if (propstat10.getProp() != null) {
                    propstat10.getProp().getDisplayname();
                    break;
                }
            }
        }
        List<Propstat> propstat11 = response.getPropstat();
        if (propstat11.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Propstat propstat12 : propstat11) {
                if (propstat12.getProp() != null && (resourcetype = propstat12.getProp().getResourcetype()) != null) {
                    if (resourcetype.getCollection() != null) {
                        arrayList.add(new QName("DAV:", "collection", "D"));
                    }
                    if (resourcetype.getPrincipal() != null) {
                        arrayList.add(new QName("DAV:", "principal", "D"));
                    }
                    Iterator it4 = resourcetype.getAny().iterator();
                    while (it4.hasNext()) {
                        arrayList.add(C14746.m35048((Element) it4.next()));
                    }
                }
            }
            list = arrayList;
        }
        this.f5058 = list;
        List propstat13 = response.getPropstat();
        if (!propstat13.isEmpty()) {
            Iterator it5 = propstat13.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Propstat propstat14 = (Propstat) it5.next();
                if (propstat14.getProp() != null) {
                    Resourcetype resourcetype3 = propstat14.getProp().getResourcetype();
                    if (resourcetype3 == null || resourcetype3.getCollection() == null) {
                        propstat14.getProp().getGetcontentlanguage();
                    }
                }
            }
        }
        List<Propstat> propstat15 = response.getPropstat();
        if (!propstat15.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (Propstat propstat16 : propstat15) {
                if (propstat16.getProp() != null) {
                    for (Element element : propstat16.getProp().getAny()) {
                        hashMap.put(C14746.m35048(element), element.getTextContent());
                    }
                }
            }
        }
        List propstat17 = response.getPropstat();
        if (!propstat17.isEmpty()) {
            Iterator it6 = propstat17.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Propstat propstat18 = (Propstat) it6.next();
                if (propstat18.getProp() != null) {
                    propstat18.getProp().getLockdiscovery();
                    break;
                }
            }
        }
        List<Propstat> propstat19 = response.getPropstat();
        if (propstat19.isEmpty()) {
            return;
        }
        for (Propstat propstat20 : propstat19) {
            if (propstat20.getProp() != null) {
                propstat20.getProp().getSupportedlock();
                return;
            }
        }
    }
}
