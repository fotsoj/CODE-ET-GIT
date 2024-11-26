public class GestionnaireNotes {

    /**
     * Affiche note et moyennes
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {

        /**
         * Affichage des notes
         */
        afficherNote(nomEtudiant,note);
        

        /**
         * Calcul de la somme des notes
         */
        sommeNote(note);

        /**
         * Affichage de la moyenne
         */
        afficheMoyenne(moyenne);
    }

    /**
     * Methode pour afficher la note 
     * @param nomEtudiant qui donne le nom de l'étudiant
     * @param note qui donne la note de l'étudiant 
     */
    public static void afficherNote(String nomEtudiant, int note){
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Methode pour calculer la somme
     * @param note qui donne la note de l'étudiant 
     */
    public static void sommeNote(int note){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
    }

    /**
     * Methode pour afficher la moyenne
     * @param somme qui donne la somme totale de toutes les notes
     */
    public static void afficheMoyenne(int somme){
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
