package site.wetsion.project;

import lombok.Getter;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * 双色球
 */
public class DoubleColorBall {

    @Getter
    private final LinkedList<Integer> red;
    @Getter
    private final LinkedList<Integer> blue;

    public DoubleColorBall() {
        this.red = new LinkedList<>();
        this.blue = new LinkedList<>();
        for (int i = 1; i <= 33; i++) {
            this.red.add(i);
        }
        for (int i = 1; i <= 16; i++) {
            this.blue.add(i);
        }
    }

    public Integer pollRed() {
        return this.red.remove(RandomUtils.nextInt(0, this.red.size()));
    }

    public Integer pollBlue() {
        return this.blue.remove(RandomUtils.nextInt(0, this.blue.size()));
    }

    public static void main(String[] args) {
        DoubleColorBall doubleColorBall = new DoubleColorBall();
        List<Integer> redArea = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            redArea.add(doubleColorBall.pollRed());
        }
        redArea.sort(Comparator.comparing(Function.identity()));
        Integer blueArea = doubleColorBall.pollBlue();
        System.out.println("红色球：" + redArea);
        System.out.println("蓝色球：" + blueArea);
    }
}
