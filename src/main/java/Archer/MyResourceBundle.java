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

public class MyResourceBundle extends ResourceBundle {
    Game game;

    public MyResourceBundle(Game game) {
        this.game = game;
    }
    
    public Object getMyObject(String key) {
        return this.handleGetObject(key);
    }
    
    @Override
    public Object handleGetObject(String key) {
        if (key.equals("game")) return game;
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
         return new HashSet<>(Arrays.asList("game", "cancelKey"));
     }
 }