package practice;

public abstract class Card implements Transportation{

    private boolean pay;
    public int kmPerPrice;


    public Card(boolean pay, int kmPerPrice) {
        this.pay = pay;
        this.kmPerPrice = kmPerPrice;
    }

    public final boolean isPay() {
        return pay;
    }

    public final void setPay(boolean pay) {
        this.pay = pay;
    }

    public final int money(int distance) {
        return distance*kmPerPrice;
    }


    @Override
    public abstract void time();

    @Override
    public void in() {
        System.out.println(this.getClass().getSimpleName()+"에 탑승하신 고객님 안녕하세요.");

    }

    @Override
    public void out() {
        System.out.println("안녕히가세요.");

    }

}
