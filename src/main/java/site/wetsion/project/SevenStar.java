package site.wetsion.project;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 七星彩
 */
public class SevenStar {

    public static void main(String[] args) {
        List<Integer> redArea = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            redArea.add(RandomUtils.nextInt(0, 10));
        }
        Integer blueArea = RandomUtils.nextInt(0, 15);
        System.out.println("红色球：" + redArea);
        System.out.println("蓝色球：" + blueArea);
    }
}
