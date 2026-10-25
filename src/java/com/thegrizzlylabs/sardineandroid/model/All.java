package com.thegrizzlylabs.sardineandroid.model;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Namespace(prefix = "D", reference = "DAV:")
@Root(name = ProviderConfigurationPermission.ALL_STR)
/* loaded from: classes.dex */
public class All implements SimplePrivilege {
}
