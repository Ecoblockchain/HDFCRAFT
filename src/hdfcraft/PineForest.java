/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hdfcraft;

import java.util.Random;


/**
 *
 * @author pepijn
 */
public class PineForest extends TreeLayer<PineForest> {
    private PineForest() {
        super("Pine", "a pine forest", 41, 'n');
    }

    @Override
    public TreeType pickTree(Random random) {
        return PINE_TREE;
    }
    
    public static final PineForest INSTANCE = new PineForest();

    private static final PineTree PINE_TREE = new PineTree();
    private static final long serialVersionUID = 2011060301L;
}