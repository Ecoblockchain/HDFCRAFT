/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hdfcraft;

/**
 *
 * @author pepijn
 */
public interface BitLayerRenderer extends LayerRenderer {
    int getPixelColour(int x, int y, int underlyingColour, boolean value);
}