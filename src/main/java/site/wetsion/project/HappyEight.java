package site.wetsion.project;

import lombok.Getter;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * 快乐8
 */
public class HappyEight {

    @Getter
    private LinkedList<Integer> balls;

    public HappyEight() {
        this.balls = new LinkedList<>();
        for (int i = 1; i <= 80; i++) {
            this.balls.add(i);
        }
    }

    public Integer poll() {
        return this.balls.remove(RandomUtils.nextInt(0, this.balls.size()));
    }

    public static void main(String[] args) {
        HappyEight happyEight = new HappyEight();
        List<Integer> tickets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tickets.add(happyEight.poll());
        }
        tickets.sort(Comparator.comparing(Function.identity()));
        System.out.println("投注号码：" + tickets);
    }
}
