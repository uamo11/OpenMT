package org.simpleframework.xml.core;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class ModelMap extends LinkedHashMap implements Iterable {
    public final Detail detail;

    public ModelMap(Detail detail) {
        this.detail = detail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelMap getModels() {
        ModelMap modelMap = new ModelMap(this.detail);
        for (K k : keySet()) {
            ModelList modelList = (ModelList) get(k);
            if (modelList != null) {
                modelList = modelList.build();
            }
            if (modelMap.containsKey(k)) {
                throw new PathException("Path with name '%s' is a duplicate in %s ", k, this.detail);
            }
            modelMap.put(k, modelList);
        }
        return modelMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Model lookup(String str, int i) {
        ModelList modelList = (ModelList) get(str);
        if (modelList != null) {
            return modelList.lookup(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void register(String str, Model model) {
        ModelList modelList = (ModelList) get(str);
        if (modelList == null) {
            modelList = new ModelList();
            put(str, modelList);
        }
        modelList.register(model);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }
}
