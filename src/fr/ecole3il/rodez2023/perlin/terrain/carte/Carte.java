/**
 * La classe Carte représente une carte générée avec des terrains.
 */
package fr.ecole3il.rodez2023.perlin.terrain.carte;

import java.util.Scanner;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

public class Carte {

    private String nom;
    private int largeur;
    private int hauteur;
    private Terrain[][] terrains;

    /**
     * Constructeur pour créer une carte avec un nom, une largeur, une hauteur et un générateur de carte.
     * 
     * @param nom              Le nom de la carte.
     * @param largeur          La largeur de la carte.
     * @param hauteur          La hauteur de la carte.
     * @param generateurCarte  Le générateur de carte utilisé pour générer les terrains de la carte.
     */
    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.terrains = generateurCarte.genererCarte(largeur, hauteur);
    }

    /**
     * Constructeur pour créer une carte à partir d'une chaîne de données.
     * 
     * @param donneesCarte  La chaîne de données contenant les informations de la carte.
     */
    public Carte(String donneesCarte) {
        Scanner scanner = new Scanner(donneesCarte);
        initialiserCarte(scanner);
        scanner.close();
    }

    /**
     * Méthode privée pour initialiser les données de la carte à partir d'un scanner.
     * 
     * @param scanner  Le scanner contenant les données de la carte.
     */
    private void initialiserCarte(Scanner scanner) {
        this.nom = scanner.nextLine();
        this.largeur = scanner.nextInt();
        this.hauteur = scanner.nextInt();
        scanner.nextLine();

        this.terrains = new Terrain[largeur][hauteur];

        for (int y = 0; y < hauteur; y++) {
            for (int x = 0; x < largeur; x++) {
                double altitude = scanner.nextDouble();
                double hydrometrie = scanner.nextDouble();
                double temperature = scanner.nextDouble();
                terrains[x][y] = new Terrain(altitude, hydrometrie, temperature);
                scanner.nextLine();
            }
        }
    }

    /**
     * Méthode pour obtenir le nom de la carte.
     * 
     * @return Le nom de la carte.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Méthode pour obtenir la largeur de la carte.
     * 
     * @return La largeur de la carte.
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Méthode pour obtenir la hauteur de la carte.
     * 
     * @return La hauteur de la carte.
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Méthode pour obtenir le terrain à la position spécifiée.
     * 
     * @param x La coordonnée x du terrain.
     * @param y La coordonnée y du terrain.
     * @return Le terrain à la position spécifiée.
     * @throws TerrainInexistant Si la position spécifiée est en dehors des limites de la carte.
     */
    public Terrain getTerrain(int x, int y) throws TerrainInexistant {
        if (x < 0 || x >= largeur || y < 0 || y >= hauteur) {
            throw new TerrainInexistant("Terrain inexistant à la position (" + x + ", " + y + ")");
        }
        return terrains[x][y];
    }
}
