public class StockManager {

    /**
     * gere le stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        /**
         * Ajout au stock
         */
        switch(typeoOperation){
            case "ajout";
            ajout(produit,stock);
            break;

            case "retrait";
            retrait(produit,stock);
            break;

            default:  System.out.println("opérationinconnue.");
            break;
        
        }
    }

        /**
         * Methode pour ajouter un produit dans le stock
         * @param donne le nom du produit
         * @param stock, quantité de stock après l'ajout
         */
    public static void ajout(String produit, double stock){
        stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * Methode pour retirer un produit dans le stock
     * @param produit, donne le nom du produit
     * @param stock, quantité de stock après le retrait
     */
    public static void retrait(String produit, double stock){
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }

}

   