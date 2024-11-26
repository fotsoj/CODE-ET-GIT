public class FactureManager {

    /**
     *Calcul le total d'une facture
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
   switch (typeProduit){
            case "Alimentaire";
            reduction5(total);
            break;

            case "Electronique";
            reduction10(total);
            break;

            case "Luxe";
            reduction15(total);
            break;

        }

        // Reduction sur le total
        if (total > 1000) {
            reductionTotal(total);// Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }

        /**
         * Methode pour la reduction de 5%
         */
        public static void reduction5(total) {
            total -= total * 0.05; // Réduction de 5%
        }
        
        /**
         * Methode pour la reduction de 10%
         */
        public static void reduction10(total) {
            total -= total * 0.1; // Réduction de 10%
        }
        
        /**
         * Methode pour la reduction de 15%
         */
         public static void reduction15(total) {
            total -= total * 0.15; // Réduction de 15%
        }

        /**
         * Methode pour la reduction du total
         */
        public static void reduction15(total) {
        total -= total * 0.05; 
        }
}
