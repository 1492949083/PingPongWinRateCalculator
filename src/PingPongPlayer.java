public class PingPongPlayer {
    String name;
    double hit_rate;
    double out_of_bounds_probability;


    public PingPongPlayer(String name, double hit_rate, double out_of_bounds_probability) {
        this.name = name;
        this.hit_rate = hit_rate;
        this.out_of_bounds_probability = out_of_bounds_probability;
    }

    //出手
    public boolean hit() {
        if (Math.random() < hit_rate) {
            return Math.random() < out_of_bounds_probability;
        }else {
            return false;
        }
    }

}
