package site.wetsion.project;

import lombok.Getter;
import org.apache.commons.lang3.RandomUtils;

import java.util.*;
import java.util.function.Function;

/**
 * 超级大乐透
 */
public class SuperLottery {

    @Getter
    private LinkedList<Integer> front;
    @Getter
    private LinkedList<Integer> back;

    public SuperLottery() {
        prepare();
    }

    private void prepare() {
        this.front = new LinkedList<>();
        for (int i = 1; i <= 35; i++) {
            this.front.add(i);
        }
        this.back = new LinkedList<>();
        for (int i = 1; i <= 12; i++) {
            this.back.add(i);
        }
    }

    public Integer frontPoll() {
        int length = this.front.size();
        int index = RandomUtils.nextInt(0, length);
        return this.front.remove(index);
    }
    public Integer backPoll() {
        int length = this.back.size();
        int index = RandomUtils.nextInt(0, length);
        return this.back.remove(index);
    }

    public static void main(String[] args) {
        SuperLottery superLottery = new SuperLottery();
        List<Integer> targetFront = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer num = superLottery.frontPoll();
            targetFront.add(num);
        }
        targetFront.sort(Comparator.comparing(Function.identity()));
        System.out.println("前区号码：" + targetFront);
        List<Integer> targetBack = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Integer num = superLottery.backPoll();
            targetBack.add(num);
        }
        targetBack.sort(Comparator.comparing(Function.identity()));;
        System.out.println("后区号码：" + targetBack);
        System.out.println(superLottery.getFront());
        System.out.println(superLottery.getBack());
    }
}
