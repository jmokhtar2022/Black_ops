/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import Entity.Jeu;
import Controller.JeuService;
import config.MaConnexion;
/**
 *
 * @author jmokh
 */
public class Test_jeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MaConnexion m = MaConnexion.getInstance();
         Jeu j1 = new Jeu(999,"Valorant","est un jeu de tir à la première personne gratuit développé et publié par Riot Games, pour Microsoft Windows. D’abord teasé sous le nom de code Project A en octobre 2019, le jeu a commencé une période de bêta fermée avec un accès limité le 7 avril 2020, suivie d’une sortie officielle le 2 juin 2020. Le développement du jeu a commencé en 2014. Valorant s’inspire de la série de jeux de tir tactiques Counter-Strike, empruntant plusieurs mécanismes tels que le menu d’achat, les motifs de pulvérisation et l’imprécision lors des déplacements.","https://playvalorant.com/ar-ae/",4);
         //Jeu j2 = new Jeu(999,"cs go ","om aziz")
         JeuService js1 = new JeuService();
        //js1.ajouterJeu(j1);
         //js1.updateJeu(j1);
        js1.deletejeu(j1);
         System.out.println(js1.afficherjeux());
    }
    
}
