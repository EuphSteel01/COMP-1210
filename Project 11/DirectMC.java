import java.text.DecimalFormat;

/** DirectMC is derived from MarketingCampaign.
 *
 * @author Jess Banister
 * @version 3/27/21
 */
public class DirectMC extends MarketingCampaign {
   private double costPerMailPiece;
   private int numberOfMailPieces;
   
   
   /** Sets the base cost.
    *
    */
   public static final double BASE_COST = 1000;
   
   /** This is the constructor for DirectMC.
    *
    * @param nameIn name in
    * @param revenueIn revenue in 
    * @param costPerMailPieceIn cost per mail
    * @param numberOfMailPiecesIn number of mail
    */
   public DirectMC(String nameIn, double revenueIn, 
      double costPerMailPieceIn, int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
   /** The method getCostPerMailPiece returns the price per piece of mail.
    * 
    * @return returns costPerMailPiece
    */ 
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
   
   /** The method setCostPerMailPiece sets costPerMailPiece.
    *
    * @param costPerMailPieceIn cost per piece
    */
   public void setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }
   
   /** This method getNumberOfMailPieces returns 
    * the nummber of pieces of mail.
    *
    * @return returns
    */
   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }
   
   /** The method setNumberOfMailPieces sets 
    * the number of mail pieces.
    *
    * @param numberOfMailPiecesIn number of mail
    */
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) {
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
   /** The method campaignCost returns the cost of the campaign.
    *
    * @return returns campaignCost
    */
   public double campaignCost() {
      return (BASE_COST + (costPerMailPiece * numberOfMailPieces));
   }
   
   /** The method toString outputs all 
    * of the information in a string.
    *
    * @return returns string
    */
   public String toString() {
      DecimalFormat mv = new DecimalFormat("$#,##0.00");
      DecimalFormat roi = new DecimalFormat("0.##%");
      double total = (costPerMailPiece * numberOfMailPieces);
      String string = super.toString() + "\n   Base Cost: " 
         + mv.format(BASE_COST) + "\n   Mail Cost: "
         + mv.format(total) + " = " 
         + mv.format(getCostPerMailPiece()) 
         + " per mail piece" + " * " + getNumberOfMailPieces() 
         + " mail pieces";
      return string;
   }
}