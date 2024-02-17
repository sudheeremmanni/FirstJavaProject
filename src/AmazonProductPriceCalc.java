public class AmazonProductPriceCalc {
    Double finalPrice ;
    public Double productPriceCalc(AmazonProductSelectionProcess sel){
        Double finalPrice = (sel.productQty * sel.productPrice);
                return finalPrice;
    }
}
