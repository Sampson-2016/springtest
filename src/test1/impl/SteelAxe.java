package test1.impl;

import test1.Axe;

/**
 * @author keyuan.dky
 * @date 2018/09/02
 */
public class SteelAxe implements Axe {
    public String test;
    static {
        System.out.println("SteelAxe static test");
    }

    @Override
    public String chop() {
        return "stellaxe chop is so quickly";
    }
}
