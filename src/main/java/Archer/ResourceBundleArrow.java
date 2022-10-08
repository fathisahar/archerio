/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
/**
 *
 * @author jessi
 */
public class ResourceBundleArrow extends ResourceBundle {
    Arrow arrow;
    Bow bow;

    public ResourceBundleArrow(Arrow arrow, Bow bow) {
        this.arrow = arrow;
        this.bow=bow;
    }
    
    public Object getMyObject(String key) {
        return this.handleGetObject(key);
    }
    
    @Override
    public Object handleGetObject(String key) {
        if (key.equals("arrow")) return arrow;
        if (key.equals("bow")) return bow;
        if (key.equals("cancelKey")) return "Cancel";
         return null;
    }

     public Enumeration<String> getKeys() {
         return Collections.enumeration(keySet());
     }

     // Overrides handleKeySet() so that the getKeys() implementation
     // can rely on the keySet() value.
    @Override
     protected Set<String> handleKeySet() {
         return new HashSet<>(Arrays.asList("arrow","bow", "cancelKey"));
     }
 }