package lotto.model;

import lotto.view.InputMoney;

public class LottoCount {

    // 로또 구입 개수 연산
    public int setPurchaseLotto() {
        InputMoney tmpMoney = new InputMoney();

        int money = tmpMoney.getMoney();
        int lotto = money % 1000;

        return lotto;
    }
}
