package com.example.lolzk.instaphysicss.ParticlePhysicsFormulas;

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
        addItem(new DummyItem("5", "Radiation Flux", "Radiation flux is the"));
        addItem(new DummyItem("6", "Mott Scattering","Mott Scattering employs the"));
        addItem(new DummyItem("7", "Strong Force", "Strong force is the force"));
        addItem(new DummyItem("8", "Electroweak Interaction", "Electroweak Interaction is the"));
        addItem(new DummyItem("9", "Breit-Weigner Formula", "The Breit-Weigner Formula defines"));
        addItem(new DummyItem("10", "Born Scattering", "Born Scattering is when"));
        addItem(new DummyItem("11", "Decay Rate", "Decay Rate defines the rate of"));
        addItem(new DummyItem("12", "Nuclear Binding Energy", "Nuclear Binding Energy is"));
        addItem(new DummyItem("13", "Number of Atoms", "Finding the Formula for the Number of Atoms works by"));
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
