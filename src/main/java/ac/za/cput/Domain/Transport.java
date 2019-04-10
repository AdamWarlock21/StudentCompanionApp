package ac.za.cput.Domain;

public class Transport {

    private String transDestination, transPickUp;


    private Transport(){}

    private Transport(Builder builder){
        this.transDestination = builder.transDestination;
        this.transPickUp = builder.transPickUp;
    }

    public String getTransDestination(){return transDestination;}
    public String getTransPickUp(){ return transPickUp;}

    public static class Builder{
        private String transDestination, transPickUp;

        public Builder transDestination(String transDestination) {
            this.transDestination = transDestination;
            return this;
        }

        public Builder transPickUp(String transPickUp) {
            this.transPickUp = transPickUp;
            return this;
        }

        public Transport build() {return new Transport( this);}

        }

        @Override
    public String toString(){
        return "Transport:" +
                "Transport Pick Up ='" + transPickUp +'\''+
                "Transport Destination = '" + transDestination + '\''
                + "";
    }
}
