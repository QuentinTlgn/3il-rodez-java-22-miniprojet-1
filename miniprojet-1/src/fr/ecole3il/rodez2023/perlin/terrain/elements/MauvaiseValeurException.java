package fr.ecole3il.rodez2023.perlin.terrain.elements;

/**
 * La classe MauvaiseValeurException est une sous-classe de IllegalArgumentException.
 * Elle est utilisée pour représenter une exception levée lorsqu'une valeur invalide est rencontrée.
 */
public class MauvaiseValeurException extends IllegalArgumentException {

    /**
     * Constructeur pour créer une MauvaiseValeurException avec un message d'erreur spécifique.
     * 
     * @param message Le message d'erreur décrivant la raison de l'exception.
     */
    public MauvaiseValeurException(String message) {
        super(message);
    }
}