package yuu.industrial_evolution.init;

import cofh.core.util.core.IInitializer;
import yuu.industrial_evolution.Item.ItemIngot;

import java.util.ArrayList;

public class IEitems {

    public static final IEitems INSTANCE = new IEitems();

    private IEitems() {

    }
    public static void preInit() {
        ItemIngot = new ItemIngot();
        initList.add(ItemIngot);

        for (IInitializer init : initList) {
            init.preInit();
        }

    }
    private static ArrayList<IInitializer> initList = new ArrayList<>();
    public static ItemIngot ItemIngot;
}
