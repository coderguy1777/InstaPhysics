package com.example.lolzk.instaphysicss.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {
    public String id;
    public String content;
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "Rutherford Scattering","Rutherford Scattering is"));
        addItem(new DummyItem("2", "Decay Constant","Decay Constant is"));
        addItem(new DummyItem("3", "Effective Dose","Effective Dose is"));
        addItem(new DummyItem("4", "Bateman's Equations","Bateman's Equations are"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Formula " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nFormula Information.");
        }
        return builder.toString();
    }

    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
