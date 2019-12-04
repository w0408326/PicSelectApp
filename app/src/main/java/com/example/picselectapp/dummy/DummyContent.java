package com.example.picselectapp.dummy;

import android.graphics.drawable.Drawable;

import com.example.picselectapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem(createDummyItem(1, R.drawable.pat));
        addItem(createDummyItem(2, R.drawable.bob));
        addItem(createDummyItem(3, R.drawable.sqd));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int id,int imageName) {
        return new DummyItem(String.valueOf(id), imageName);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final int content;


        public DummyItem(String id, int content) {
            this.id = id;
            this.content = content;
        }


    }
}

