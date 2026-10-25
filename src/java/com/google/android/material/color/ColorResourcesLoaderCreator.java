package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class ColorResourcesLoaderCreator {
    public static final String TAG = "ColorResLoaderCreator";

    public static ResourcesLoader create(Context context, Map map) {
        FileDescriptor fileDescriptor;
        try {
            byte[] create = ColorResourcesTableCreator.create(context, map);
            int length = create.length;
            if (create.length != 0) {
                try {
                    fileDescriptor = Os.memfd_create("temp.arsc", 0);
                    if (fileDescriptor != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                            try {
                                fileOutputStream.write(create);
                                ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                                try {
                                    ResourcesLoader resourcesLoader = new ResourcesLoader();
                                    resourcesLoader.addProvider(ResourcesProvider.loadFromTable(dup, null));
                                    if (dup != null) {
                                        dup.close();
                                    }
                                    fileOutputStream.close();
                                    Os.close(fileDescriptor);
                                    return resourcesLoader;
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileDescriptor != null) {
                                Os.close(fileDescriptor);
                            }
                            throw th;
                        }
                    }
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = null;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
