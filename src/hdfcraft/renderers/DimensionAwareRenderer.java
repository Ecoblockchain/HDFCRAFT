/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdfcraft.renderers;

import hdfcraft.Dimension;

/**
 *
 * @author pepijn
 */
public interface DimensionAwareRenderer extends LayerRenderer {
    void setDimension(Dimension dimension);
}