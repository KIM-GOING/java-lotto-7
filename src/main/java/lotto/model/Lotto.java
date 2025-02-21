package lotto.model;

import lotto.view.InputMoney;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    // 로또 구입 개수 연산
    public int setPurchaseLotto() {
        InputMoney tmpMoney = new InputMoney();

        int money = tmpMoney.getMoney();
        int lotto = money % 1000;

        return lotto;
    }
}
