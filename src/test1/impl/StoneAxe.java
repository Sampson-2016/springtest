package test1.impl;

import test1.Axe;

/**
 * @author keyuan.dky
 * @date 2018/09/02
 */
public class StoneAxe implements Axe {

    @Override
    public String chop() {
        return "stoneaxe is so slowly ! ";
    }
}
