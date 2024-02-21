package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;

/**
 * La classe VisualiseurTerrainEnonce est une implémentation concrète de la classe abstraite VisualiseurTerrain.
 * Elle utilise un DetermineurTerrainEnonce pour visualiser le terrain.
 */
public class VisualiseurTerrainEnonce extends VisualiseurTerrain {

    /**
     * Constructeur pour créer un VisualiseurTerrainEnonce avec une carte donnée.
     * Utilise un DetermineurTerrainEnonce pour la visualisation.
     * 
     * @param c La carte à visualiser.
     */
    public VisualiseurTerrainEnonce(Carte c) {
        super(new DetermineurTerrainEnonce(), c);
    }
}
