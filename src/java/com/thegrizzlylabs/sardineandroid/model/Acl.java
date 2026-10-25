package com.thegrizzlylabs.sardineandroid.model;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Namespace(prefix = "D", reference = "DAV:")
@Root
/* loaded from: classes.dex */
public class Acl {

    @ElementList(inline = true, required = false, type = Ace.class)
    public List ace;

    public List getAce() {
        return this.ace;
    }

    public void setAce(List list) {
        this.ace = list;
    }
}
