public class PingPong {
    //重复比赛次数
    int repeat = 10000000;
    PingPongPlayer first;
    int winsA = 0;
    int winsB = 0;

    PingPongPlayer playerA = new PingPongPlayer("马龙", 0.862, 0.076);
    PingPongPlayer playerB = new PingPongPlayer("樊振东", 0.857, 0.083);

    public void round() {
        while (true) {
            if (first == playerA) {
                if (!playerA.hit()) {
                    winsB++;
                    break;
                } else {
                    if (!playerB.hit()) {
                        winsA++;
                        first = playerB;//交换先手
                        break;
                    }
                }
            } else {
                if (!playerB.hit()) {
                    winsA++;
                    break;
                } else {
                    if (!playerA.hit()) {
                        winsB++;
                        first = playerA;//交换先手
                        break;
                    }
                }
            }
        }
    }

    public void start() {
        //随机先手
        PingPongPlayer first = Math.random() > 0.5 ? playerA : playerB;
        for (int i = 0; i < repeat; i++) {
            round();
        }
        System.out.println("马龙获胜概率：" + ((double) winsA / repeat)*100 + "%");
        System.out.println("樊振东获胜概率：" + ((double) winsB / repeat)*100 + "%");
    }
}
