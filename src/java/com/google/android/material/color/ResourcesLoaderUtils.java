package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

/* loaded from: classes.dex */
public final class ResourcesLoaderUtils {
    public static boolean isColorResource(int i) {
        return 28 <= i && i <= 31;
    }

    public static boolean addResourcesLoaderToContext(Context context, Map map) {
        ResourcesLoader create = ColorResourcesLoaderCreator.create(context, map);
        if (create == null) {
            return false;
        }
        context.getResources().addLoaders(create);
        return true;
    }
}
