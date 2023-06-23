public class Shop implements Comparable<Shop> {
    private String product;
    private double value;

    public Shop(String product, double value) {
        this.product = product;
        this.value = value;
    }

    public String getProduct() {
        return product;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getProduct() + " - " + this.getValue();
    }

    //  @Override
    //  public int compareTo(Shop otherShop) {
    //      if(this.getValue() < otherShop.value){
    //          return -1;
    //     } else if (this.getValue() > otherShop.value){
    //         return 1;
    //      } else {
    //          return 0;
    //       }
    //   }

    @Override
    public int compareTo(Shop otherShop) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherShop.value));
    }
}
